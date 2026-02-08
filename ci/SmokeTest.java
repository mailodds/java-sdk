package ci;

// SDK smoke test -- validates build-from-source and API integration using the SDK client.
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.api.EmailValidationApi;
import com.mailodds.model.ValidateRequest;
import com.mailodds.model.ValidationResponse;

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

    public static void main(String[] args) throws Exception {
        String apiKey = System.getenv("MAILODDS_TEST_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            System.out.println("ERROR: MAILODDS_TEST_KEY not set");
            System.exit(1);
        }

        ApiClient client = new ApiClient();
        client.setBasePath("https://api.mailodds.com");
        client.setBearerToken(apiKey);
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

        for (String[] c : cases) {
            String domain = c[0].split("@")[1].split("\\.")[0];
            try {
                ValidateRequest req = new ValidateRequest().email(c[0]);
                ValidationResponse resp = api.validateEmail(req);
                check(domain + ".status", c[1], resp.getStatus().getValue());
                check(domain + ".action", c[2], resp.getAction().getValue());
                check(domain + ".sub_status", c[3], resp.getSubStatus());
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

        int total = passed + failed;
        String result = failed == 0 ? "PASS" : "FAIL";
        System.out.printf("%n%s: Java SDK (%d/%d)%n", result, passed, total);
        if (failed > 0) System.exit(1);
    }
}
