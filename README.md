# MailOdds SDK for Java

Enterprise-ready Java client for the [MailOdds Email Validation API](https://mailodds.com/docs).

## Installation

Maven:

```xml
<dependency>
    <groupId>com.mailodds</groupId>
    <artifactId>mailodds-java</artifactId>
    <version>1.0.0</version>
</dependency>
```

Gradle:

```kotlin
implementation("com.mailodds:mailodds-java:1.0.0")
```

## Quick Start

```java
import com.mailodds.ApiClient;
import com.mailodds.Configuration;
import com.mailodds.auth.HttpBearerAuth;
import com.mailodds.api.EmailValidationApi;
import com.mailodds.model.ValidateRequest;
import com.mailodds.model.ValidationResponse;

ApiClient client = Configuration.getDefaultApiClient();
((HttpBearerAuth) client.getAuthentication("BearerAuth"))
    .setBearerToken("mo_live_your_api_key");

EmailValidationApi api = new EmailValidationApi(client);
ValidateRequest request = new ValidateRequest().email("user@example.com");
ValidationResponse result = api.validateEmail(request);

// Branch on action for decisioning
switch (result.getAction()) {
    case ACCEPT -> System.out.println("Safe to send");
    case ACCEPT_WITH_CAUTION -> System.out.println("Valid but risky -- flag for review");
    case REJECT -> System.out.println("Do not send");
    case RETRY_LATER -> System.out.println("Temporary failure -- retry after backoff");
}
```

## Enterprise Features

This SDK includes enterprise-ready features beyond the generated API client:

### Built-in Retry (429/5xx)

```java
import com.mailodds.enterprise.RetryInterceptor;
import okhttp3.OkHttpClient;

OkHttpClient httpClient = new OkHttpClient.Builder()
    .addInterceptor(new RetryInterceptor(3, 1000))
    .build();

ApiClient client = new ApiClient(httpClient);
EmailValidationApi api = new EmailValidationApi(client);
```

### Typed Errors

```java
import com.mailodds.enterprise.MailOddsError;
import com.mailodds.enterprise.MailOddsError.InsufficientCreditsError;

try {
    ValidationResponse result = api.validateEmail(request);
} catch (ApiException e) {
    MailOddsError error = MailOddsError.fromApiException(e);
    if (error instanceof InsufficientCreditsError ice) {
        System.out.println("Need " + ice.getCreditsNeeded()
            + " credits, have " + ice.getCreditsAvailable());
        System.out.println("Upgrade: " + ice.getUpgradeUrl());
    }
}
```

### Webhook Signature Verification

```java
import com.mailodds.enterprise.WebhookVerifier;

WebhookVerifier verifier = new WebhookVerifier("your_webhook_secret");

String payload = request.getReader().lines()
    .collect(Collectors.joining("\n"));
String signature = request.getHeader("X-MailOdds-Signature");

if (verifier.verify(payload, signature)) {
    Map<String, Object> event = verifier.verifyOrThrow(payload, signature);
    System.out.println("Event: " + event.get("event"));
}
```

## Response Handling

Branch on the `action` field for decisioning:

| Action | Meaning | Recommended |
|--------|---------|-------------|
| `accept` | Safe to send | Add to mailing list |
| `accept_with_caution` | Valid but risky (catch-all, role account) | Flag for review |
| `reject` | Invalid or disposable | Do not send |
| `retry_later` | Temporary failure | Retry after backoff |

## Test Mode

Use an `mo_test_` prefixed API key with test domains for predictable responses without consuming credits.

## API Reference

- Website: https://mailodds.com
- Full documentation: https://mailodds.com/docs
- OpenAPI spec: https://mailodds.com/openapi.yaml
- All SDKs: https://mailodds.com/sdks

## License

MIT
