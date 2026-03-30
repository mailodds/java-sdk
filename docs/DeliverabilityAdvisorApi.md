# DeliverabilityAdvisorApi

All URIs are relative to *https://api.mailodds.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dismissDeliverabilityRecommendation**](DeliverabilityAdvisorApi.md#dismissDeliverabilityRecommendation) | **POST** /v1/deliverability/recommendations/{recommendation_id}/dismiss | Dismiss a deliverability recommendation |
| [**getDeliverabilityRecommendations**](DeliverabilityAdvisorApi.md#getDeliverabilityRecommendations) | **GET** /v1/deliverability/recommendations | Get deliverability recommendations |


<a id="dismissDeliverabilityRecommendation"></a>
# **dismissDeliverabilityRecommendation**
> dismissDeliverabilityRecommendation(recommendationId)

Dismiss a deliverability recommendation

Dismiss a deliverability recommendation so it no longer appears.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.DeliverabilityAdvisorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeliverabilityAdvisorApi apiInstance = new DeliverabilityAdvisorApi(defaultClient);
    String recommendationId = "recommendationId_example"; // String | 
    try {
      apiInstance.dismissDeliverabilityRecommendation(recommendationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityAdvisorApi#dismissDeliverabilityRecommendation");
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
| **recommendationId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dismiss a deliverability recommendation |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getDeliverabilityRecommendations"></a>
# **getDeliverabilityRecommendations**
> getDeliverabilityRecommendations()

Get deliverability recommendations

Retrieve actionable deliverability recommendations for the account.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.DeliverabilityAdvisorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeliverabilityAdvisorApi apiInstance = new DeliverabilityAdvisorApi(defaultClient);
    try {
      apiInstance.getDeliverabilityRecommendations();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityAdvisorApi#getDeliverabilityRecommendations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get deliverability recommendations |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

