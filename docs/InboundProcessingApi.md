# InboundProcessingApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**correctInboundMessage**](InboundProcessingApi.md#correctInboundMessage) | **PATCH** /v1/inbound-messages/{message_id}/correction | Correct inbound message classification |
| [**getBounceStats**](InboundProcessingApi.md#getBounceStats) | **GET** /v1/bounce-stats | Get bounce statistics |
| [**getBounceStatsSummary**](InboundProcessingApi.md#getBounceStatsSummary) | **GET** /v1/bounce-stats/summary | Get bounce statistics summary |
| [**getComplaintAssessment**](InboundProcessingApi.md#getComplaintAssessment) | **GET** /v1/complaint-assessment | Get complaint assessment |
| [**getInboundMessage**](InboundProcessingApi.md#getInboundMessage) | **GET** /v1/inbound-messages/{message_id} | Get inbound message |
| [**listInboundMessages**](InboundProcessingApi.md#listInboundMessages) | **GET** /v1/inbound-messages | List inbound messages |


<a id="correctInboundMessage"></a>
# **correctInboundMessage**
> GetInboundMessage200Response correctInboundMessage(messageId, correctInboundMessageRequest)

Correct inbound message classification

Submit a human correction for an inbound message classification. Requires Pro+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.InboundProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InboundProcessingApi apiInstance = new InboundProcessingApi(defaultClient);
    String messageId = "messageId_example"; // String | Message ID
    CorrectInboundMessageRequest correctInboundMessageRequest = new CorrectInboundMessageRequest(); // CorrectInboundMessageRequest | 
    try {
      GetInboundMessage200Response result = apiInstance.correctInboundMessage(messageId, correctInboundMessageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundProcessingApi#correctInboundMessage");
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
| **messageId** | **String**| Message ID | |
| **correctInboundMessageRequest** | [**CorrectInboundMessageRequest**](CorrectInboundMessageRequest.md)|  | |

### Return type

[**GetInboundMessage200Response**](GetInboundMessage200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Message updated with correction |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **404** | Resource not found |  -  |

<a id="getBounceStats"></a>
# **getBounceStats**
> GetBounceStats200Response getBounceStats(domainId, period, groupBy)

Get bounce statistics

Get bounce and complaint statistics grouped by time period. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.InboundProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InboundProcessingApi apiInstance = new InboundProcessingApi(defaultClient);
    String domainId = "domainId_example"; // String | Filter by sending domain ID
    String period = "24h"; // String | Time period
    String groupBy = "day"; // String | Grouping interval
    try {
      GetBounceStats200Response result = apiInstance.getBounceStats(domainId, period, groupBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundProcessingApi#getBounceStats");
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
| **domainId** | **String**| Filter by sending domain ID | [optional] |
| **period** | **String**| Time period | [optional] [default to 7d] [enum: 24h, 7d, 30d, 90d] |
| **groupBy** | **String**| Grouping interval | [optional] [default to day] [enum: day, week, campaign] |

### Return type

[**GetBounceStats200Response**](GetBounceStats200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bounce statistics |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

<a id="getBounceStatsSummary"></a>
# **getBounceStatsSummary**
> GetBounceStatsSummary200Response getBounceStatsSummary(domainId, period)

Get bounce statistics summary

Get aggregated bounce and complaint statistics. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.InboundProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InboundProcessingApi apiInstance = new InboundProcessingApi(defaultClient);
    String domainId = "domainId_example"; // String | Filter by sending domain ID
    String period = "24h"; // String | Time period
    try {
      GetBounceStatsSummary200Response result = apiInstance.getBounceStatsSummary(domainId, period);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundProcessingApi#getBounceStatsSummary");
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
| **domainId** | **String**| Filter by sending domain ID | [optional] |
| **period** | **String**| Time period | [optional] [default to 30d] [enum: 24h, 7d, 30d] |

### Return type

[**GetBounceStatsSummary200Response**](GetBounceStatsSummary200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bounce statistics summary |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

<a id="getComplaintAssessment"></a>
# **getComplaintAssessment**
> GetComplaintAssessment200Response getComplaintAssessment(domainId, period)

Get complaint assessment

Assess complaint risk based on recent inbound data. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.InboundProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InboundProcessingApi apiInstance = new InboundProcessingApi(defaultClient);
    String domainId = "domainId_example"; // String | Filter by sending domain ID
    String period = "24h"; // String | Time period
    try {
      GetComplaintAssessment200Response result = apiInstance.getComplaintAssessment(domainId, period);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundProcessingApi#getComplaintAssessment");
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
| **domainId** | **String**| Filter by sending domain ID | [optional] |
| **period** | **String**| Time period | [optional] [default to 30d] [enum: 24h, 7d, 30d] |

### Return type

[**GetComplaintAssessment200Response**](GetComplaintAssessment200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Complaint assessment |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

<a id="getInboundMessage"></a>
# **getInboundMessage**
> GetInboundMessage200Response getInboundMessage(messageId)

Get inbound message

Get a single inbound message with full body content. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.InboundProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InboundProcessingApi apiInstance = new InboundProcessingApi(defaultClient);
    String messageId = "messageId_example"; // String | Message ID
    try {
      GetInboundMessage200Response result = apiInstance.getInboundMessage(messageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundProcessingApi#getInboundMessage");
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
| **messageId** | **String**| Message ID | |

### Return type

[**GetInboundMessage200Response**](GetInboundMessage200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inbound message details |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **404** | Resource not found |  -  |

<a id="listInboundMessages"></a>
# **listInboundMessages**
> ListInboundMessages200Response listInboundMessages(category, domainId, since, until, isRead, recipient, search, page, perPage)

List inbound messages

List inbound messages (bounces, complaints, replies, OOO). Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.InboundProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InboundProcessingApi apiInstance = new InboundProcessingApi(defaultClient);
    String category = "hard_bounce"; // String | Filter by category
    String domainId = "domainId_example"; // String | Filter by sending domain ID
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Start date (ISO 8601)
    OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | End date (ISO 8601)
    Boolean isRead = true; // Boolean | Filter by read status
    String recipient = "recipient_example"; // String | Filter by original recipient
    String search = "search_example"; // String | Search in subject and body
    Integer page = 1; // Integer | 
    Integer perPage = 50; // Integer | 
    try {
      ListInboundMessages200Response result = apiInstance.listInboundMessages(category, domainId, since, until, isRead, recipient, search, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundProcessingApi#listInboundMessages");
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
| **category** | **String**| Filter by category | [optional] [enum: hard_bounce, soft_bounce, complaint, reply, out_of_office, autoresponder, challenge, unknown] |
| **domainId** | **String**| Filter by sending domain ID | [optional] |
| **since** | **OffsetDateTime**| Start date (ISO 8601) | [optional] |
| **until** | **OffsetDateTime**| End date (ISO 8601) | [optional] |
| **isRead** | **Boolean**| Filter by read status | [optional] |
| **recipient** | **String**| Filter by original recipient | [optional] |
| **search** | **String**| Search in subject and body | [optional] |
| **page** | **Integer**|  | [optional] [default to 1] |
| **perPage** | **Integer**|  | [optional] [default to 50] |

### Return type

[**ListInboundMessages200Response**](ListInboundMessages200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of inbound messages |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

