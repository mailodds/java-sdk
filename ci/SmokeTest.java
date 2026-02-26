package ci;

// SDK smoke test -- validates build-from-source and API integration using the SDK client.
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.api.BulkValidationApi;
import com.mailodds.api.EmailSendingApi;
import com.mailodds.api.EmailValidationApi;
import com.mailodds.api.SendingDomainsApi;
import com.mailodds.api.SubscriberListsApi;
import com.mailodds.api.SuppressionListsApi;
import com.mailodds.api.SystemApi;
import com.mailodds.api.ValidationPoliciesApi;
import com.mailodds.model.AddSuppressionRequest;
import com.mailodds.model.AddSuppressionRequestEntriesInner;
import com.mailodds.model.AddSuppressionResponse;
import com.mailodds.model.CheckSuppressionRequest;
import com.mailodds.model.CreateJobRequest;
import com.mailodds.model.CreateList201Response;
import com.mailodds.model.CreateListRequest;
import com.mailodds.model.CreatePolicyFromPresetRequest;
import com.mailodds.model.CreateSendingDomain201Response;
import com.mailodds.model.CreateSendingDomainRequest;
import com.mailodds.model.DeleteJob200Response;
import com.mailodds.model.DeletePolicy200Response;
import com.mailodds.model.DeletePolicyRule200Response;
import com.mailodds.model.GetLists200Response;
import com.mailodds.model.HealthCheck200Response;
import com.mailodds.model.JobResponse;
import com.mailodds.model.ListSendingDomains200Response;
import com.mailodds.model.PolicyListResponse;
import com.mailodds.model.PolicyPresetsResponse;
import com.mailodds.model.PolicyResponse;
import com.mailodds.model.RemoveSuppression200Response;
import com.mailodds.model.RemoveSuppressionRequest;
import com.mailodds.model.SubscribeRequest;
import com.mailodds.model.SuppressionCheckResponse;
import com.mailodds.model.SuppressionStatsResponse;
import com.mailodds.model.TelemetrySummary;
import com.mailodds.model.UnsubscribeSubscriber200Response;
import com.mailodds.model.ValidateRequest;
import com.mailodds.model.ValidationResponse;

import java.util.Arrays;

public class SmokeTest {
    static int passed = 0, failed = 0;

    static void check(String label, String expected, String actual) {
        if ((expected == null && actual == null) || (expected != null && expected.equals(actual))) {
            passed++;
        } else {
            failed++;
            System.out.printf("  FAIL: %s expected=%s got=%s%n", label, expected, actual);
        }
    }

    static void checkBool(String label, boolean expected, Boolean actual) {
        if (actual != null && expected == actual) {
            passed++;
        } else {
            failed++;
            System.out.printf("  FAIL: %s expected=%s got=%s%n", label, expected, actual);
        }
    }

    public static void main(String[] args) throws Exception {
        String apiKey = System.getenv("MAILODDS_TEST_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            System.out.println("ERROR: MAILODDS_TEST_KEY not set");
            System.exit(1);
        }

        String ts = String.valueOf(System.currentTimeMillis() / 1000);

        ApiClient client = new ApiClient();
        client.setBasePath("https://api.mailodds.com");
        client.setBearerToken(apiKey);

        // ---------------------------------------------------------------
        // 1. Email Validation
        // ---------------------------------------------------------------
        EmailValidationApi api = new EmailValidationApi(client);

        String[][] cases = {
            {"test@deliverable.mailodds.com", "valid", "accept", null},
            {"test@invalid.mailodds.com", "invalid", "reject", "smtp_rejected"},
            {"test@risky.mailodds.com", "catch_all", "accept_with_caution", "catch_all_detected"},
            {"test@disposable.mailodds.com", "do_not_mail", "reject", "disposable"},
            {"test@role.mailodds.com", "do_not_mail", "reject", "role_account"},
            {"test@timeout.mailodds.com", "unknown", "retry_later", "smtp_unreachable"},
            {"test@freeprovider.mailodds.com", "valid", "accept", null},
        };

        // [free_provider, disposable, role_account, mx_found]
        boolean[][] boolCases = {
            {false, false, false, true},  // deliverable
            {false, false, false, true},  // invalid
            {false, false, false, true},  // risky
            {false, true, false, true},   // disposable
            {false, false, true, true},   // role
            {false, false, false, true},  // timeout
            {true, false, false, true},   // freeprovider
        };

        for (int i = 0; i < cases.length; i++) {
            String domain = cases[i][0].split("@")[1].split("\\.")[0];
            try {
                ValidateRequest req = new ValidateRequest().email(cases[i][0]);
                ValidationResponse resp = api.validateEmail(req);
                check(domain + ".status", cases[i][1], resp.getStatus().getValue());
                check(domain + ".action", cases[i][2], resp.getAction().getValue());
                check(domain + ".sub_status", cases[i][3], resp.getSubStatus() != null ? resp.getSubStatus().getValue() : null);
                checkBool(domain + ".free_provider", boolCases[i][0], resp.getFreeProvider());
                checkBool(domain + ".disposable", boolCases[i][1], resp.getDisposable());
                checkBool(domain + ".role_account", boolCases[i][2], resp.getRoleAccount());
                checkBool(domain + ".mx_found", boolCases[i][3], resp.getMxFound());
                check(domain + ".depth", "enhanced", resp.getDepth().getValue());
                if (resp.getProcessedAt() == null) {
                    failed++;
                    System.out.printf("  FAIL: %s.processed_at is empty%n", domain);
                } else {
                    passed++;
                }
            } catch (Exception e) {
                failed++;
                System.out.printf("  FAIL: %s error: %s%n", domain, e.getMessage());
            }
        }

        // Error handling: 401 with bad key
        try {
            ApiClient badClient = new ApiClient();
            badClient.setBasePath("https://api.mailodds.com");
            badClient.setBearerToken("invalid_key");
            EmailValidationApi badApi = new EmailValidationApi(badClient);
            badApi.validateEmail(new ValidateRequest().email("test@deliverable.mailodds.com"));
            failed++;
            System.out.println("  FAIL: error.401 no exception raised");
        } catch (ApiException e) {
            check("error.401", "401", String.valueOf(e.getCode()));
        }

        // Error handling: 400/422 with missing email
        try {
            api.validateEmail(new ValidateRequest().email(""));
            failed++;
            System.out.println("  FAIL: error.400 no exception raised");
        } catch (ApiException e) {
            if (e.getCode() == 400 || e.getCode() == 422) { passed++; }
            else { failed++; System.out.printf("  FAIL: error.400 expected=400|422 got=%d%n", e.getCode()); }
        }

        // ---------------------------------------------------------------
        // 2. Bulk Validation
        // ---------------------------------------------------------------
        BulkValidationApi bulkApi = new BulkValidationApi(client);
        String jobId = null;
        try {
            CreateJobRequest jobReq = new CreateJobRequest();
            jobReq.setEmails(Arrays.asList("test@deliverable.mailodds.com"));
            JobResponse jobResp = bulkApi.createJob(jobReq);
            jobId = jobResp.getJob().getId();
            check("bulk.create.id_prefix", "true",
                jobId != null && jobId.startsWith("job_") ? "true" : "false");
            check("bulk.create.status", "pending",
                jobResp.getJob().getStatus() != null ? jobResp.getJob().getStatus().getValue() : null);

            // Get job
            JobResponse getResp = bulkApi.getJob(jobId);
            check("bulk.get.id", jobId, getResp.getJob().getId());
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: bulk.create error: %s%n", e.getMessage());
        } finally {
            // Delete job
            if (jobId != null) {
                try {
                    DeleteJob200Response delResp = bulkApi.deleteJob(jobId);
                    checkBool("bulk.delete.deleted", true, delResp.getDeleted());
                } catch (Exception e) {
                    failed++;
                    System.out.printf("  FAIL: bulk.delete error: %s%n", e.getMessage());
                }
            }
        }

        // ---------------------------------------------------------------
        // 3. Suppression Lists
        // ---------------------------------------------------------------
        String suppTestEmail = "smoketest-" + ts + "@example.com";
        try {
            SuppressionListsApi suppApi = new SuppressionListsApi(client);

            // Add
            AddSuppressionRequestEntriesInner entry = new AddSuppressionRequestEntriesInner();
            entry.setType(AddSuppressionRequestEntriesInner.TypeEnum.EMAIL);
            entry.setValue(suppTestEmail);
            entry.setReason("smoke test");
            AddSuppressionRequest addReq = new AddSuppressionRequest();
            addReq.setEntries(Arrays.asList(entry));
            AddSuppressionResponse addResp = suppApi.addSuppression(addReq);
            check("suppression.add.added", "1", String.valueOf(addResp.getAdded()));

            // Check
            CheckSuppressionRequest checkReq = new CheckSuppressionRequest();
            checkReq.setEmail(suppTestEmail);
            SuppressionCheckResponse checkResp = suppApi.checkSuppression(checkReq);
            checkBool("suppression.check.suppressed", true, checkResp.getSuppressed());

            // Stats
            SuppressionStatsResponse statsResp = suppApi.getSuppressionStats();
            check("suppression.stats.not_null", "true",
                statsResp.getTotal() != null ? "true" : "false");

            // Remove
            RemoveSuppressionRequest removeReq = new RemoveSuppressionRequest();
            removeReq.setEntries(Arrays.asList(suppTestEmail));
            RemoveSuppression200Response removeResp = suppApi.removeSuppression(removeReq);
            check("suppression.remove.removed_gte_1", "true",
                removeResp.getRemoved() != null && removeResp.getRemoved() >= 1 ? "true" : "false");
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: suppression error: %s%n", e.getMessage());
        }

        // ---------------------------------------------------------------
        // 4. Validation Policies
        // ---------------------------------------------------------------
        // Cleanup leftover smoke policies (free plan allows only 1)
        try {
            ValidationPoliciesApi cleanupPolApi = new ValidationPoliciesApi(client);
            PolicyListResponse existingPolicies = cleanupPolApi.listPolicies(null);
            if (existingPolicies.getPolicies() != null) {
                for (var p : existingPolicies.getPolicies()) {
                    if (p.getName() != null && p.getName().startsWith("smoke")) {
                        try { cleanupPolApi.deletePolicy(p.getId()); } catch (Exception ignored) {}
                    }
                }
            }
        } catch (Exception ignored) {}

        Integer policyId = null;
        try {
            ValidationPoliciesApi polApi = new ValidationPoliciesApi(client);

            // Presets
            PolicyPresetsResponse presetsResp = polApi.getPolicyPresets();
            check("policy.presets.not_empty", "true",
                presetsResp.getPresets() != null && presetsResp.getPresets().size() > 0 ? "true" : "false");

            // Create from preset
            CreatePolicyFromPresetRequest presetReq = new CreatePolicyFromPresetRequest();
            presetReq.setPresetId(CreatePolicyFromPresetRequest.PresetIdEnum.STRICT);
            presetReq.setName("smoke-test-" + ts);
            PolicyResponse polResp = polApi.createPolicyFromPreset(presetReq);
            policyId = polResp.getPolicy().getId();
            check("policy.create.id_not_null", "true",
                policyId != null ? "true" : "false");
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: policy error: %s%n", e.getMessage());
        } finally {
            if (policyId != null) {
                try {
                    ValidationPoliciesApi polApi = new ValidationPoliciesApi(client);
                    DeletePolicy200Response delPolResp = polApi.deletePolicy(policyId);
                    checkBool("policy.delete.deleted", true, delPolResp.getDeleted());
                } catch (Exception e) {
                    failed++;
                    System.out.printf("  FAIL: policy.delete error: %s%n", e.getMessage());
                }
            }
        }

        // ---------------------------------------------------------------
        // 5. System (Health + Telemetry)
        // ---------------------------------------------------------------
        try {
            // Health check (no auth required)
            ApiClient noAuthClient = new ApiClient();
            noAuthClient.setBasePath("https://api.mailodds.com");
            SystemApi noAuthSysApi = new SystemApi(noAuthClient);
            HealthCheck200Response healthResp = noAuthSysApi.healthCheck();
            check("system.health.status", "healthy", healthResp.getStatus());
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: system.health error: %s%n", e.getMessage());
        }

        try {
            // Telemetry (requires auth)
            SystemApi sysApi = new SystemApi(client);
            TelemetrySummary telResp = sysApi.getTelemetrySummary(null);
            check("system.telemetry.not_null", "true",
                telResp != null ? "true" : "false");
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: system.telemetry error: %s%n", e.getMessage());
        }

        // ---------------------------------------------------------------
        // 6. Sending Domains
        // ---------------------------------------------------------------
        String domainId = null;
        try {
            SendingDomainsApi domApi = new SendingDomainsApi(client);

            // List
            ListSendingDomains200Response listDomsResp = domApi.listSendingDomains();
            check("sending_domains.list.not_null", "true",
                listDomsResp.getDomains() != null ? "true" : "false");

            // Create
            CreateSendingDomainRequest domReq = new CreateSendingDomainRequest();
            domReq.setDomain("smoke-" + ts + ".example.com");
            CreateSendingDomain201Response createDomResp = domApi.createSendingDomain(domReq);
            domainId = createDomResp.getDomain().getId();
            check("sending_domains.create.id_not_null", "true",
                domainId != null ? "true" : "false");
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: sending_domains error: %s%n", e.getMessage());
        } finally {
            if (domainId != null) {
                try {
                    SendingDomainsApi domApi = new SendingDomainsApi(client);
                    DeletePolicyRule200Response delDomResp = domApi.deleteSendingDomain(domainId);
                    checkBool("sending_domains.delete.deleted", true, delDomResp.getDeleted());
                } catch (Exception e) {
                    failed++;
                    System.out.printf("  FAIL: sending_domains.delete error: %s%n", e.getMessage());
                }
            }
        }

        // ---------------------------------------------------------------
        // 7. Subscriber Lists
        // ---------------------------------------------------------------
        String listId = null;
        try {
            SubscriberListsApi listsApi = new SubscriberListsApi(client);

            // Create list
            CreateListRequest listReq = new CreateListRequest();
            listReq.setName("smoke-test-" + ts);
            CreateList201Response createListResp = listsApi.createList(listReq);
            listId = createListResp.getList().getId();
            check("subscriber_lists.create.id_not_null", "true",
                listId != null ? "true" : "false");

            // Get lists
            GetLists200Response getListsResp = listsApi.getLists(null, null);
            check("subscriber_lists.list.not_empty", "true",
                getListsResp.getLists() != null && getListsResp.getLists().size() > 0 ? "true" : "false");

            // Subscribe
            SubscribeRequest subReq = new SubscribeRequest();
            subReq.setEmail("smoketest-" + ts + "@example.com");
            UnsubscribeSubscriber200Response subResp = listsApi.subscribe(listId, subReq);
            check("subscriber_lists.subscribe.subscriber_not_null", "true",
                subResp.getSubscriber() != null ? "true" : "false");
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: subscriber_lists error: %s%n", e.getMessage());
        } finally {
            if (listId != null) {
                try {
                    SubscriberListsApi listsApi = new SubscriberListsApi(client);
                    DeletePolicyRule200Response delListResp = listsApi.deleteList(listId);
                    checkBool("subscriber_lists.delete.deleted", true, delListResp.getDeleted());
                } catch (Exception e) {
                    failed++;
                    System.out.printf("  FAIL: subscriber_lists.delete error: %s%n", e.getMessage());
                }
            }
        }

        // ---------------------------------------------------------------
        // 8. Email Sending (import-only, no live send)
        // ---------------------------------------------------------------
        EmailSendingApi sendingApi = new EmailSendingApi(client);
        check("sending.class_exists", "true", sendingApi != null ? "true" : "false");

        // ---------------------------------------------------------------
        // Results
        // ---------------------------------------------------------------
        int total = passed + failed;
        String result = failed == 0 ? "PASS" : "FAIL";
        System.out.printf("%n%s: Java SDK (%d/%d)%n", result, passed, total);
        if (failed > 0) System.exit(1);
    }
}
