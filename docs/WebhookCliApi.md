# WebhookCliApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhookCliSession**](WebhookCliApi.md#createWebhookCliSession) | **POST** /v1/webhook-cli/sessions | Create CLI forwarding session |
| [**deleteWebhookCliSession**](WebhookCliApi.md#deleteWebhookCliSession) | **DELETE** /v1/webhook-cli/sessions/{session_id} | Close CLI session |
| [**listWebhookDeliveries**](WebhookCliApi.md#listWebhookDeliveries) | **GET** /v1/webhook-cli/deliveries | List recent webhook deliveries |
| [**replayWebhookDelivery**](WebhookCliApi.md#replayWebhookDelivery) | **POST** /v1/webhook-cli/deliveries/{delivery_id}/replay | Replay webhook delivery |


<a id="createWebhookCliSession"></a>
# **createWebhookCliSession**
> CreateWebhookCliSession201Response createWebhookCliSession(createWebhookCliSessionRequest)

Create CLI forwarding session

Register a new session for receiving webhook events via SSE.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.WebhookCliApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    WebhookCliApi apiInstance = new WebhookCliApi(defaultClient);
    CreateWebhookCliSessionRequest createWebhookCliSessionRequest = new CreateWebhookCliSessionRequest(); // CreateWebhookCliSessionRequest | 
    try {
      CreateWebhookCliSession201Response result = apiInstance.createWebhookCliSession(createWebhookCliSessionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookCliApi#createWebhookCliSession");
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
| **createWebhookCliSessionRequest** | [**CreateWebhookCliSessionRequest**](CreateWebhookCliSessionRequest.md)|  | [optional] |

### Return type

[**CreateWebhookCliSession201Response**](CreateWebhookCliSession201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Session created |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="deleteWebhookCliSession"></a>
# **deleteWebhookCliSession**
> DeleteWebhookCliSession200Response deleteWebhookCliSession(sessionId)

Close CLI session

Close a webhook CLI forwarding session.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.WebhookCliApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    WebhookCliApi apiInstance = new WebhookCliApi(defaultClient);
    String sessionId = "sessionId_example"; // String | Session ID
    try {
      DeleteWebhookCliSession200Response result = apiInstance.deleteWebhookCliSession(sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookCliApi#deleteWebhookCliSession");
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
| **sessionId** | **String**| Session ID | |

### Return type

[**DeleteWebhookCliSession200Response**](DeleteWebhookCliSession200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Session closed |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="listWebhookDeliveries"></a>
# **listWebhookDeliveries**
> ListWebhookDeliveries200Response listWebhookDeliveries(limit)

List recent webhook deliveries

List recent webhook deliveries for replay.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.WebhookCliApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    WebhookCliApi apiInstance = new WebhookCliApi(defaultClient);
    Integer limit = 50; // Integer | Maximum deliveries to return
    try {
      ListWebhookDeliveries200Response result = apiInstance.listWebhookDeliveries(limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookCliApi#listWebhookDeliveries");
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
| **limit** | **Integer**| Maximum deliveries to return | [optional] [default to 50] |

### Return type

[**ListWebhookDeliveries200Response**](ListWebhookDeliveries200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of recent webhook deliveries |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="replayWebhookDelivery"></a>
# **replayWebhookDelivery**
> ReplayWebhookDelivery200Response replayWebhookDelivery(deliveryId)

Replay webhook delivery

Replay a historical webhook delivery to active CLI sessions.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.WebhookCliApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    WebhookCliApi apiInstance = new WebhookCliApi(defaultClient);
    Integer deliveryId = 56; // Integer | Delivery ID
    try {
      ReplayWebhookDelivery200Response result = apiInstance.replayWebhookDelivery(deliveryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookCliApi#replayWebhookDelivery");
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
| **deliveryId** | **Integer**| Delivery ID | |

### Return type

[**ReplayWebhookDelivery200Response**](ReplayWebhookDelivery200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delivery replayed |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

