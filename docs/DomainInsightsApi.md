# DomainInsightsApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDomainHookEffectiveness**](DomainInsightsApi.md#getDomainHookEffectiveness) | **GET** /v1/sending-domains/{domain_id}/insights/hook-effectiveness | Get hook effectiveness metrics |
| [**getDomainInsightsFunnel**](DomainInsightsApi.md#getDomainInsightsFunnel) | **GET** /v1/sending-domains/{domain_id}/insights/funnel | Get domain engagement funnel |
| [**getDomainInsightsTrends**](DomainInsightsApi.md#getDomainInsightsTrends) | **GET** /v1/sending-domains/{domain_id}/insights/trends | Get domain engagement trends |


<a id="getDomainHookEffectiveness"></a>
# **getDomainHookEffectiveness**
> GetDomainHookEffectiveness200Response getDomainHookEffectiveness(domainId, days)

Get hook effectiveness metrics

Get webhook delivery effectiveness metrics for a sending domain. Requires Pro+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.DomainInsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DomainInsightsApi apiInstance = new DomainInsightsApi(defaultClient);
    String domainId = "domainId_example"; // String | Sending domain ID
    Integer days = 30; // Integer | Lookback period in days
    try {
      GetDomainHookEffectiveness200Response result = apiInstance.getDomainHookEffectiveness(domainId, days);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainInsightsApi#getDomainHookEffectiveness");
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
| **domainId** | **String**| Sending domain ID | |
| **days** | **Integer**| Lookback period in days | [optional] [default to 30] |

### Return type

[**GetDomainHookEffectiveness200Response**](GetDomainHookEffectiveness200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Hook effectiveness metrics |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **404** | Resource not found |  -  |

<a id="getDomainInsightsFunnel"></a>
# **getDomainInsightsFunnel**
> GetDomainInsightsFunnel200Response getDomainInsightsFunnel(domainId, days)

Get domain engagement funnel

Get engagement funnel for a sending domain (sent &gt; delivered &gt; opened &gt; clicked &gt; converted). Requires Pro+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.DomainInsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DomainInsightsApi apiInstance = new DomainInsightsApi(defaultClient);
    String domainId = "domainId_example"; // String | Sending domain ID
    Integer days = 30; // Integer | Lookback period in days
    try {
      GetDomainInsightsFunnel200Response result = apiInstance.getDomainInsightsFunnel(domainId, days);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainInsightsApi#getDomainInsightsFunnel");
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
| **domainId** | **String**| Sending domain ID | |
| **days** | **Integer**| Lookback period in days | [optional] [default to 30] |

### Return type

[**GetDomainInsightsFunnel200Response**](GetDomainInsightsFunnel200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Engagement funnel data |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **404** | Resource not found |  -  |

<a id="getDomainInsightsTrends"></a>
# **getDomainInsightsTrends**
> GetDomainInsightsTrends200Response getDomainInsightsTrends(domainId, days)

Get domain engagement trends

Get daily engagement trend data for a sending domain. Requires Pro+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.DomainInsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DomainInsightsApi apiInstance = new DomainInsightsApi(defaultClient);
    String domainId = "domainId_example"; // String | Sending domain ID
    Integer days = 30; // Integer | Lookback period in days
    try {
      GetDomainInsightsTrends200Response result = apiInstance.getDomainInsightsTrends(domainId, days);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainInsightsApi#getDomainInsightsTrends");
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
| **domainId** | **String**| Sending domain ID | |
| **days** | **Integer**| Lookback period in days | [optional] [default to 30] |

### Return type

[**GetDomainInsightsTrends200Response**](GetDomainInsightsTrends200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Engagement trend data |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **404** | Resource not found |  -  |

