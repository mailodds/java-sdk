# EmailSendingApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deliverBatch**](EmailSendingApi.md#deliverBatch) | **POST** /v1/deliver/batch | Send to multiple recipients (max 100) |
| [**deliverEmail**](EmailSendingApi.md#deliverEmail) | **POST** /v1/deliver | Send a single email |


<a id="deliverBatch"></a>
# **deliverBatch**
> BatchDeliverResponse deliverBatch(batchDeliverRequest)

Send to multiple recipients (max 100)

Send a single message to up to 100 recipients. Shares the same message body across all recipients. Each recipient is processed independently.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EmailSendingApi apiInstance = new EmailSendingApi(defaultClient);
    BatchDeliverRequest batchDeliverRequest = new BatchDeliverRequest(); // BatchDeliverRequest | 
    try {
      BatchDeliverResponse result = apiInstance.deliverBatch(batchDeliverRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailSendingApi#deliverBatch");
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
| **batchDeliverRequest** | [**BatchDeliverRequest**](BatchDeliverRequest.md)|  | |

### Return type

[**BatchDeliverResponse**](BatchDeliverResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Batch accepted for delivery |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

<a id="deliverEmail"></a>
# **deliverEmail**
> DeliverResponse deliverEmail(deliverRequest)

Send a single email

Send a transactional email through the safety pipeline. Validates recipients, checks domain ownership, and queues for delivery. Requires a verified sending domain.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EmailSendingApi apiInstance = new EmailSendingApi(defaultClient);
    DeliverRequest deliverRequest = new DeliverRequest(); // DeliverRequest | 
    try {
      DeliverResponse result = apiInstance.deliverEmail(deliverRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailSendingApi#deliverEmail");
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
| **deliverRequest** | [**DeliverRequest**](DeliverRequest.md)|  | |

### Return type

[**DeliverResponse**](DeliverResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Email accepted for delivery |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

