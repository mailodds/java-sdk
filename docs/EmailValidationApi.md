# EmailValidationApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**validateBatch**](EmailValidationApi.md#validateBatch) | **POST** /v1/validate/batch | Validate multiple emails (sync) |
| [**validateEmail**](EmailValidationApi.md#validateEmail) | **POST** /v1/validate | Validate single email |


<a id="validateBatch"></a>
# **validateBatch**
> ValidateBatch200Response validateBatch(validateBatchRequest)

Validate multiple emails (sync)

Validate up to 100 email addresses synchronously. For larger lists, use the bulk jobs API.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.EmailValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EmailValidationApi apiInstance = new EmailValidationApi(defaultClient);
    ValidateBatchRequest validateBatchRequest = new ValidateBatchRequest(); // ValidateBatchRequest | 
    try {
      ValidateBatch200Response result = apiInstance.validateBatch(validateBatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailValidationApi#validateBatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **validateBatchRequest** | [**ValidateBatchRequest**](ValidateBatchRequest.md)|  | |

### Return type

[**ValidateBatch200Response**](ValidateBatch200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch validation results |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="validateEmail"></a>
# **validateEmail**
> ValidationResponse validateEmail(validateRequest)

Validate single email

Validate a single email address. Returns detailed validation results including status, sub-status, and recommended action.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.EmailValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EmailValidationApi apiInstance = new EmailValidationApi(defaultClient);
    ValidateRequest validateRequest = new ValidateRequest(); // ValidateRequest | 
    try {
      ValidationResponse result = apiInstance.validateEmail(validateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailValidationApi#validateEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **validateRequest** | [**ValidateRequest**](ValidateRequest.md)|  | |

### Return type

[**ValidationResponse**](ValidationResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Validation result |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

