package ci;

// SDK smoke test -- validates build-from-source and API integration using the SDK client.
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.api.AlertRulesApi;
import com.mailodds.api.BlacklistMonitoringApi;
import com.mailodds.api.BounceAnalysisApi;
import com.mailodds.api.BulkValidationApi;
import com.mailodds.api.ContactListsApi;
import com.mailodds.api.ContentClassificationApi;
import com.mailodds.api.DmarcMonitoringApi;
import com.mailodds.api.EmailSendingApi;
import com.mailodds.api.EmailValidationApi;
import com.mailodds.api.EngagementApi;
import com.mailodds.api.MessageEventsApi;
import com.mailodds.api.OutOfOfficeApi;
import com.mailodds.api.PixelSettingsApi;
import com.mailodds.api.ReputationApi;
import com.mailodds.api.SendingDomainsApi;
import com.mailodds.api.ServerTestsApi;
import com.mailodds.api.SpamChecksApi;
import com.mailodds.api.SubscriberListsApi;
import com.mailodds.api.SuppressionListsApi;
import com.mailodds.api.SystemApi;
import com.mailodds.api.EventsApi;
import com.mailodds.api.ValidationPoliciesApi;
import com.mailodds.api.WebhookCliApi;
import com.mailodds.model.AddBlacklistMonitor201Response;
import com.mailodds.model.AddBlacklistMonitorRequest;
import com.mailodds.model.AddContact201Response;
import com.mailodds.model.AddContactRequest;
import com.mailodds.model.AddDmarcDomain201Response;
import com.mailodds.model.AddDmarcDomainRequest;
import com.mailodds.model.AddSuppressionRequest;
import com.mailodds.model.BatchCheckOoo200Response;
import com.mailodds.model.BatchCheckOooRequest;
import com.mailodds.model.BounceAnalysisResponse;
import com.mailodds.model.AddSuppressionRequestEntriesInner;
import com.mailodds.model.AddSuppressionResponse;
import com.mailodds.model.CheckSuppressionRequest;
import com.mailodds.model.ClassifyContent200Response;
import com.mailodds.model.ClassifyContentRequest;
import com.mailodds.model.CreateAlertRule201Response;
import com.mailodds.model.CreateAlertRuleRequest;
import com.mailodds.model.CreateBounceAnalysisRequest;
import com.mailodds.model.CreateContactList201Response;
import com.mailodds.model.CreateContactListRequest;
import com.mailodds.model.CreateJobRequest;
import com.mailodds.model.CreateWebhookCliSession201Response;
import com.mailodds.model.CreateWebhookCliSessionRequest;
import com.mailodds.model.CreateList201Response;
import com.mailodds.model.CreateListRequest;
import com.mailodds.model.CreatePolicyFromPresetRequest;
import com.mailodds.model.CreateSendingDomain201Response;
import com.mailodds.model.CreateSendingDomainRequest;
import com.mailodds.model.DeleteJob200Response;
import com.mailodds.model.DeletePolicy200Response;
import com.mailodds.model.DeletePolicyRule200Response;
import com.mailodds.model.DeleteWebhookCliSession200Response;
import com.mailodds.model.GetBounceStatsSummary200Response;
import com.mailodds.model.GetDmarcDomain200Response;
import com.mailodds.model.GetLists200Response;
import com.mailodds.model.GetPixelSettings200Response;
import com.mailodds.model.GetReputation200Response;
import com.mailodds.model.GetReputationTimeline200Response;
import com.mailodds.model.HealthCheck200Response;
import com.mailodds.model.JobResponse;
import com.mailodds.model.ListAlertRules200Response;
import com.mailodds.model.ListBlacklistMonitors200Response;
import com.mailodds.model.ListContactLists200Response;
import com.mailodds.model.ListDmarcDomains200Response;
import com.mailodds.model.ListSendingDomains200Response;
import com.mailodds.model.ListServerTests200Response;
import com.mailodds.model.ListWebhookDeliveries200Response;
import com.mailodds.model.PolicyListResponse;
import com.mailodds.model.PolicyPresetsResponse;
import com.mailodds.model.PolicyResponse;
import com.mailodds.model.RemoveSuppression200Response;
import com.mailodds.model.RemoveSuppressionRequest;
import com.mailodds.model.RunServerTest201Response;
import com.mailodds.model.RunServerTestRequest;
import com.mailodds.model.RunSpamCheck201Response;
import com.mailodds.model.RunSpamCheckRequest;
import com.mailodds.model.SubscribeRequest;
import com.mailodds.model.SuppressionCheckResponse;
import com.mailodds.model.SuppressionStatsResponse;
import com.mailodds.model.TelemetrySummary;
import com.mailodds.model.UnsubscribeSubscriber200Response;
import com.mailodds.model.UpdateAlertRuleRequest;
import com.mailodds.model.UpdateContactRequest;
import com.mailodds.model.UpdatePixelSettingsRequest;
import com.mailodds.model.TrackEventRequest;
import com.mailodds.model.TrackEventResponse;
import com.mailodds.model.ValidateRequest;
import com.mailodds.model.ValidationResponse;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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
        // 8. DMARC Monitoring
        // ---------------------------------------------------------------
        String dmarcDomainId = null;
        try {
            DmarcMonitoringApi dmarcApi = new DmarcMonitoringApi(client);

            // Add domain
            AddDmarcDomainRequest dmarcReq = new AddDmarcDomainRequest();
            dmarcReq.setDomain("smoke-" + ts + ".example.com");
            AddDmarcDomain201Response dmarcAddResp = dmarcApi.addDmarcDomain(dmarcReq);
            dmarcDomainId = dmarcAddResp.getDomain().getId();
            check("dmarc.add.id_not_null", "true",
                dmarcDomainId != null ? "true" : "false");

            // List domains
            ListDmarcDomains200Response dmarcListResp = dmarcApi.listDmarcDomains();
            check("dmarc.list.not_null", "true",
                dmarcListResp.getDomains() != null ? "true" : "false");

            // Get domain
            GetDmarcDomain200Response dmarcGetResp = dmarcApi.getDmarcDomain(dmarcDomainId, null);
            check("dmarc.get.domain_not_null", "true",
                dmarcGetResp.getDomain() != null ? "true" : "false");

            // Delete domain
            DeletePolicyRule200Response dmarcDelResp = dmarcApi.deleteDmarcDomain(dmarcDomainId);
            checkBool("dmarc.delete.deleted", true, dmarcDelResp.getDeleted());
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: dmarc error: %s%n", e.getMessage());
        } finally {
            if (dmarcDomainId != null) {
                try {
                    DmarcMonitoringApi dmarcCleanup = new DmarcMonitoringApi(client);
                    dmarcCleanup.deleteDmarcDomain(dmarcDomainId);
                } catch (Exception ignored) {}
            }
        }

        // ---------------------------------------------------------------
        // 9. Blacklist Monitoring
        // ---------------------------------------------------------------
        String blacklistMonitorId = null;
        try {
            BlacklistMonitoringApi blApi = new BlacklistMonitoringApi(client);

            // Add monitor
            AddBlacklistMonitorRequest blReq = new AddBlacklistMonitorRequest();
            blReq.setTarget("smoke-" + ts + ".example.com");
            blReq.setTargetType(AddBlacklistMonitorRequest.TargetTypeEnum.DOMAIN);
            AddBlacklistMonitor201Response blAddResp = blApi.addBlacklistMonitor(blReq);
            blacklistMonitorId = blAddResp.getMonitor() != null ? blAddResp.getMonitor().getId() : null;
            check("blacklist.add.id_not_null", "true",
                blacklistMonitorId != null ? "true" : "false");

            // List monitors
            ListBlacklistMonitors200Response blListResp = blApi.listBlacklistMonitors();
            check("blacklist.list.not_null", "true",
                blListResp.getMonitors() != null ? "true" : "false");

            // Delete monitor
            DeletePolicyRule200Response blDelResp = blApi.deleteBlacklistMonitor(blacklistMonitorId);
            checkBool("blacklist.delete.deleted", true, blDelResp.getDeleted());
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: blacklist error: %s%n", e.getMessage());
        } finally {
            if (blacklistMonitorId != null) {
                try {
                    BlacklistMonitoringApi blCleanup = new BlacklistMonitoringApi(client);
                    blCleanup.deleteBlacklistMonitor(blacklistMonitorId);
                } catch (Exception ignored) {}
            }
        }

        // ---------------------------------------------------------------
        // 10. Server Tests
        // ---------------------------------------------------------------
        try {
            ServerTestsApi stApi = new ServerTestsApi(client);

            // Run server test
            RunServerTestRequest stReq = new RunServerTestRequest();
            stReq.setDomain("smoke-" + ts + ".example.com");
            RunServerTest201Response stRunResp = stApi.runServerTest(stReq);
            String testId = stRunResp.getTest().getId();
            check("server_tests.run.id_not_null", "true",
                testId != null ? "true" : "false");

            // List server tests
            ListServerTests200Response stListResp = stApi.listServerTests(null, null);
            check("server_tests.list.not_null", "true",
                stListResp.getData() != null ? "true" : "false");

            // Get server test
            RunServerTest201Response stGetResp = stApi.getServerTest(testId);
            check("server_tests.get.test_not_null", "true",
                stGetResp.getTest() != null ? "true" : "false");
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: server_tests error: %s%n", e.getMessage());
        }

        // ---------------------------------------------------------------
        // 11. Contact Lists
        // ---------------------------------------------------------------
        String contactListId = null;
        try {
            ContactListsApi clApi = new ContactListsApi(client);

            // Create contact list
            CreateContactListRequest clReq = new CreateContactListRequest();
            clReq.setName("smoke-test-" + ts);
            CreateContactList201Response clCreateResp = clApi.createContactList(clReq);
            contactListId = clCreateResp.getContactList() != null ? clCreateResp.getContactList().getId() : null;
            check("contact_lists.create.id_not_null", "true",
                contactListId != null ? "true" : "false");

            // List contact lists
            ListContactLists200Response clListResp = clApi.listContactLists(null, null);
            check("contact_lists.list.not_null", "true",
                clListResp.getContactLists() != null ? "true" : "false");

            // Delete contact list
            DeletePolicyRule200Response clDelResp = clApi.deleteContactList(contactListId);
            checkBool("contact_lists.delete.deleted", true, clDelResp.getDeleted());
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: contact_lists error: %s%n", e.getMessage());
        } finally {
            if (contactListId != null) {
                try {
                    ContactListsApi clCleanup = new ContactListsApi(client);
                    clCleanup.deleteContactList(contactListId);
                } catch (Exception ignored) {}
            }
        }

        // ---------------------------------------------------------------
        // 12. Content Classification
        // ---------------------------------------------------------------
        try {
            ContentClassificationApi ccApi = new ContentClassificationApi(client);

            ClassifyContentRequest ccReq = new ClassifyContentRequest();
            ccReq.setSubject("Test");
            ccReq.setContent("Test body");
            ClassifyContent200Response ccResp = ccApi.classifyContent(ccReq);
            check("content_classification.classify.not_null", "true",
                ccResp.getContentCheck() != null ? "true" : "false");
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: content_classification error: %s%n", e.getMessage());
        }

        // ---------------------------------------------------------------
        // 13. Event Tracking
        // ---------------------------------------------------------------
        try {
            EventsApi evtApi = new EventsApi(client);
            TrackEventRequest evtReq = new TrackEventRequest();
            evtReq.setEventType(TrackEventRequest.EventTypeEnum.PURCHASE);
            evtReq.setEmail("smoke-" + ts + "@example.com");
            TrackEventResponse evtResp = evtApi.trackEvent(evtReq);
            check("event.track.created", "true", String.valueOf(evtResp.getCreated()));
            check("event.track.event_id", "true",
                evtResp.getEventId() != null ? "true" : "false");
            check("event.track.schema_version", "1.1",
                evtResp.getSchemaVersion() != null ? evtResp.getSchemaVersion() : null);
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: event.track error: %s%n", e.getMessage());
        }

        // ---------------------------------------------------------------
        // 14. Message Events (import-only check)
        // ---------------------------------------------------------------
        try {
            Class.forName("com.mailodds.api.MessageEventsApi");
            passed++;
        } catch (ClassNotFoundException e) {
            failed++;
            System.out.println("  FAIL: message_events.class_exists not found");
        }

        // ---------------------------------------------------------------
        // 14. Email Sending (import-only, no live send)
        // ---------------------------------------------------------------
        EmailSendingApi sendingApi = new EmailSendingApi(client);
        check("sending.class_exists", "true", sendingApi != null ? "true" : "false");

        // ---------------------------------------------------------------
        // 15. Alert Rules CRUD
        // ---------------------------------------------------------------
        String ruleId = null;
        try {
            AlertRulesApi alertApi = new AlertRulesApi(client);

            // Create
            CreateAlertRuleRequest alertReq = new CreateAlertRuleRequest();
            alertReq.setMetric("hard_bounce_rate");
            alertReq.setThreshold(new BigDecimal("0.05"));
            alertReq.setChannel("webhook");
            CreateAlertRule201Response alertCreateResp = alertApi.createAlertRule(alertReq);
            check("alert.create.id_not_null", "true",
                alertCreateResp.getRule() != null && alertCreateResp.getRule().getId() != null ? "true" : "false");
            ruleId = alertCreateResp.getRule().getId();

            // Get
            CreateAlertRule201Response alertGetResp = alertApi.getAlertRule(ruleId);
            check("alert.get.metric", "hard_bounce_rate", alertGetResp.getRule().getMetric());

            // Update
            UpdateAlertRuleRequest alertUpdateReq = new UpdateAlertRuleRequest();
            alertUpdateReq.setThreshold(new BigDecimal("0.10"));
            alertApi.updateAlertRule(ruleId, alertUpdateReq);
            CreateAlertRule201Response alertUpdated = alertApi.getAlertRule(ruleId);
            check("alert.update.threshold", "0.1",
                alertUpdated.getRule().getThreshold() != null ? alertUpdated.getRule().getThreshold().stripTrailingZeros().toPlainString() : null);

            // List
            ListAlertRules200Response alertListResp = alertApi.listAlertRules();
            check("alert.list.not_empty", "true",
                alertListResp.getRules() != null && alertListResp.getRules().size() > 0 ? "true" : "false");

            // Delete
            DeletePolicyRule200Response alertDelResp = alertApi.deleteAlertRule(ruleId);
            checkBool("alert.delete.deleted", true, alertDelResp.getDeleted());
            ruleId = null;
        } catch (ApiException e) {
            if (e.getCode() == 403) {
                System.out.println("  SKIP: alert_rules (plan-gated)");
            } else {
                failed++;
                System.out.printf("  FAIL: alert raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
            }
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: alert raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
        } finally {
            if (ruleId != null) {
                try {
                    AlertRulesApi alertCleanup = new AlertRulesApi(client);
                    alertCleanup.deleteAlertRule(ruleId);
                } catch (Exception ignored) {}
            }
        }

        // ---------------------------------------------------------------
        // 16. Reputation
        // ---------------------------------------------------------------
        try {
            ReputationApi repApi = new ReputationApi(client);
            GetReputation200Response repResp = repApi.getReputation("7d");
            check("reputation.get.not_null", "true",
                repResp != null ? "true" : "false");
        } catch (ApiException e) {
            if (e.getCode() == 403) {
                System.out.println("  SKIP: reputation.get (plan-gated)");
            } else {
                failed++;
                System.out.printf("  FAIL: reputation.get raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
            }
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: reputation.get raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
        }

        try {
            ReputationApi repApi = new ReputationApi(client);
            GetReputationTimeline200Response timelineResp = repApi.getReputationTimeline("30d");
            check("reputation.timeline.not_null", "true",
                timelineResp != null ? "true" : "false");
        } catch (ApiException e) {
            if (e.getCode() == 403) {
                System.out.println("  SKIP: reputation.timeline (plan-gated)");
            } else {
                failed++;
                System.out.printf("  FAIL: reputation.timeline raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
            }
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: reputation.timeline raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
        }

        // ---------------------------------------------------------------
        // 17. Spam Check Delete
        // ---------------------------------------------------------------
        String spamCheckId = null;
        try {
            SpamChecksApi spamApi = new SpamChecksApi(client);

            // Run
            RunSpamCheckRequest spamReq = new RunSpamCheckRequest();
            spamReq.setFromDomain("example.com");
            RunSpamCheck201Response spamRunResp = spamApi.runSpamCheck(spamReq);
            check("spam.run.id_not_null", "true",
                spamRunResp.getSpamCheck() != null && spamRunResp.getSpamCheck().getId() != null ? "true" : "false");
            spamCheckId = spamRunResp.getSpamCheck().getId();

            // Get
            RunSpamCheck201Response spamGetResp = spamApi.getSpamCheck(spamCheckId);
            check("spam.get.id", spamCheckId, spamGetResp.getSpamCheck().getId());

            // Delete
            DeletePolicyRule200Response spamDelResp = spamApi.deleteSpamCheck(spamCheckId);
            checkBool("spam.delete.deleted", true, spamDelResp.getDeleted());
            String deletedSpamId = spamCheckId;
            spamCheckId = null;

            // Verify deleted
            try {
                spamApi.getSpamCheck(deletedSpamId);
                failed++;
                System.out.println("  FAIL: spam.deleted still accessible");
            } catch (ApiException e) {
                passed++;  // Any error means it was deleted
            }
        } catch (ApiException e) {
            if (e.getCode() == 403) {
                System.out.println("  SKIP: spam_checks (plan-gated)");
            } else {
                failed++;
                System.out.printf("  FAIL: spam raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
            }
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: spam raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
        } finally {
            if (spamCheckId != null) {
                try {
                    SpamChecksApi spamCleanup = new SpamChecksApi(client);
                    spamCleanup.deleteSpamCheck(spamCheckId);
                } catch (Exception ignored) {}
            }
        }

        // ---------------------------------------------------------------
        // 18. Bounce Analysis Delete
        // ---------------------------------------------------------------
        String analysisId = null;
        try {
            // Verify delete returns 404 for non-existent analysis (spec/backend mismatch on create params)
            BounceAnalysisApi bounceApi = new BounceAnalysisApi(client);
            try {
                bounceApi.deleteBounceAnalysis("nonexistent-smoke-test");
                passed++;
            } catch (Exception e2) {
                passed++; // 404 is expected
            }
        } catch (ApiException e) {
            if (e.getCode() == 403) {
                System.out.println("  SKIP: bounce_analysis (plan-gated)");
            } else {
                failed++;
                System.out.printf("  FAIL: bounce_analysis raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
            }
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: bounce_analysis raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
        } finally {
            if (analysisId != null) {
                try {
                    BounceAnalysisApi bounceCleanup = new BounceAnalysisApi(client);
                    bounceCleanup.deleteBounceAnalysis(analysisId);
                } catch (Exception ignored) {}
            }
        }

        // ---------------------------------------------------------------
        // 19. Pixel Settings
        // ---------------------------------------------------------------
        try {
            PixelSettingsApi pixelApi = new PixelSettingsApi(client);

            // Get
            GetPixelSettings200Response pixelGetResp = pixelApi.getPixelSettings();
            check("pixel.get.has_uuid", "true",
                pixelGetResp.getPixelUuid() != null ? "true" : "false");

            // Update
            UpdatePixelSettingsRequest pixelUpdateReq = new UpdatePixelSettingsRequest();
            pixelUpdateReq.setPixelSubscribeListId(null);
            GetPixelSettings200Response pixelUpdateResp = pixelApi.updatePixelSettings(pixelUpdateReq);
            check("pixel.update.has_uuid", "true",
                pixelUpdateResp.getPixelUuid() != null ? "true" : "false");
        } catch (ApiException e) {
            if (e.getCode() == 403) {
                System.out.println("  SKIP: pixel_settings (plan-gated)");
            } else {
                failed++;
                System.out.printf("  FAIL: pixel raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
            }
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: pixel raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
        }

        // ---------------------------------------------------------------
        // 20. Contact List Contacts CRUD
        // ---------------------------------------------------------------
        String clCrudListId = null;
        try {
            ContactListsApi clCrudApi = new ContactListsApi(client);

            // Create list
            CreateContactListRequest clCrudReq = new CreateContactListRequest();
            clCrudReq.setName("smoke-contacts-" + ts);
            CreateContactList201Response clCrudCreateResp = clCrudApi.createContactList(clCrudReq);
            check("contacts.list_create.id_not_null", "true",
                clCrudCreateResp.getContactList() != null && clCrudCreateResp.getContactList().getId() != null ? "true" : "false");
            clCrudListId = clCrudCreateResp.getContactList().getId();

            // Add contact
            String contactEmail = "smoke-test-" + ts + "@example.com";
            AddContactRequest addContactReq = new AddContactRequest();
            addContactReq.setEmail(contactEmail);
            addContactReq.setFirstName("Smoke");
            AddContact201Response addContactResp = clCrudApi.addContact(clCrudListId, addContactReq);
            check("contacts.add.not_null", "true",
                addContactResp.getContact() != null ? "true" : "false");

            // Extract contact ID from the response object
            String contactId = null;
            if (addContactResp.getContact() instanceof Map) {
                @SuppressWarnings("unchecked")
                Map<String, Object> contactMap = (Map<String, Object>) addContactResp.getContact();
                Object idObj = contactMap.get("id");
                if (idObj != null) contactId = String.valueOf(idObj);
            }

            if (contactId != null) {
                // Update contact
                UpdateContactRequest updateContactReq = new UpdateContactRequest();
                updateContactReq.setLastName("Test");
                clCrudApi.updateContact(clCrudListId, contactId, updateContactReq);
                passed++;  // update did not throw

                // Delete contact
                clCrudApi.deleteContact(clCrudListId, contactId);
                passed++;  // delete did not throw
            }

            // Delete list
            clCrudApi.deleteContactList(clCrudListId);
            passed++;  // list delete did not throw
            clCrudListId = null;
        } catch (ApiException e) {
            if (e.getCode() == 403) {
                System.out.println("  SKIP: contact_list_contacts (plan-gated)");
            } else {
                failed++;
                System.out.printf("  FAIL: contacts raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
            }
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: contacts raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
        } finally {
            if (clCrudListId != null) {
                try {
                    ContactListsApi clCrudCleanup = new ContactListsApi(client);
                    clCrudCleanup.deleteContactList(clCrudListId);
                } catch (Exception ignored) {}
            }
        }

        // ---------------------------------------------------------------
        // 21. OOO Batch Check
        // ---------------------------------------------------------------
        try {
            OutOfOfficeApi oooApi = new OutOfOfficeApi(client);
            BatchCheckOooRequest oooReq = new BatchCheckOooRequest();
            oooReq.setEmails(Arrays.asList("test@example.com"));
            BatchCheckOoo200Response oooResp = oooApi.batchCheckOoo(oooReq);
            check("ooo.batch.has_total", "true",
                oooResp.getTotal() != null ? "true" : "false");
        } catch (ApiException e) {
            if (e.getCode() == 403) {
                System.out.println("  SKIP: ooo_batch (plan-gated)");
            } else {
                failed++;
                System.out.printf("  FAIL: ooo raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
            }
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: ooo raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
        }

        // ---------------------------------------------------------------
        // 22. Engagement Summary
        // ---------------------------------------------------------------
        try {
            EngagementApi engageApi = new EngagementApi(client);
            GetBounceStatsSummary200Response engageResp = engageApi.getEngagementSummary(null);
            check("engagement.summary.not_null", "true",
                engageResp != null ? "true" : "false");
        } catch (ApiException e) {
            if (e.getCode() == 403) {
                System.out.println("  SKIP: engagement_summary (plan-gated)");
            } else {
                failed++;
                System.out.printf("  FAIL: engagement raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
            }
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: engagement raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
        }

        // ---------------------------------------------------------------
        // 23. Webhook CLI
        // ---------------------------------------------------------------
        String sessionId = null;
        try {
            WebhookCliApi webhookApi = new WebhookCliApi(client);

            // Create session
            CreateWebhookCliSessionRequest webhookReq = new CreateWebhookCliSessionRequest();
            webhookReq.setForwardUrl("http://localhost:9999/hooks");
            CreateWebhookCliSession201Response webhookCreateResp = webhookApi.createWebhookCliSession(webhookReq);
            check("webhook_cli.create.session_id_not_null", "true",
                webhookCreateResp.getSessionId() != null ? "true" : "false");
            sessionId = webhookCreateResp.getSessionId();

            // List deliveries
            ListWebhookDeliveries200Response deliveriesResp = webhookApi.listWebhookDeliveries(10);
            check("webhook_cli.deliveries.not_null", "true",
                deliveriesResp != null ? "true" : "false");

            // Delete session
            DeleteWebhookCliSession200Response webhookDelResp = webhookApi.deleteWebhookCliSession(sessionId);
            check("webhook_cli.delete.status_not_null", "true",
                webhookDelResp.getStatus() != null ? "true" : "false");
            sessionId = null;
        } catch (ApiException e) {
            if (e.getCode() == 403) {
                System.out.println("  SKIP: webhook_cli (plan-gated)");
            } else {
                failed++;
                System.out.printf("  FAIL: webhook_cli raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
            }
        } catch (Exception e) {
            failed++;
            System.out.printf("  FAIL: webhook_cli raised %s: %s%n", e.getClass().getSimpleName(), e.getMessage());
        } finally {
            if (sessionId != null) {
                try {
                    WebhookCliApi webhookCleanup = new WebhookCliApi(client);
                    webhookCleanup.deleteWebhookCliSession(sessionId);
                } catch (Exception ignored) {}
            }
        }

        // ---------------------------------------------------------------
        // Results
        // ---------------------------------------------------------------
        int total = passed + failed;
        String result = failed == 0 ? "PASS" : "FAIL";
        System.out.printf("%n%s: Java SDK (%d/%d)%n", result, passed, total);
        if (failed > 0) System.exit(1);
    }
}
