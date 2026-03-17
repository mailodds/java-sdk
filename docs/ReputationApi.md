# ReputationApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getReputation**](ReputationApi.md#getReputation) | **GET** /v1/reputation | Get account reputation |
| [**getReputationTimeline**](ReputationApi.md#getReputationTimeline) | **GET** /v1/reputation/timeline | Get reputation timeline |


<a id="getReputation"></a>
# **getReputation**
> GetReputation200Response getReputation(period)

Get account reputation

Get the aggregate reputation score and breakdown for the account.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ReputationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ReputationApi apiInstance = new ReputationApi(defaultClient);
    String period = "24h"; // String | Evaluation period
    try {
      GetReputation200Response result = apiInstance.getReputation(period);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReputationApi#getReputation");
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
| **period** | **String**| Evaluation period | [optional] [default to 7d] [enum: 24h, 7d, 30d] |

### Return type

[**GetReputation200Response**](GetReputation200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account reputation |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getReputationTimeline"></a>
# **getReputationTimeline**
> GetReputationTimeline200Response getReputationTimeline(period)

Get reputation timeline

Get reputation metrics over time.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ReputationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ReputationApi apiInstance = new ReputationApi(defaultClient);
    String period = "24h"; // String | Timeline period
    try {
      GetReputationTimeline200Response result = apiInstance.getReputationTimeline(period);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReputationApi#getReputationTimeline");
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
| **period** | **String**| Timeline period | [optional] [default to 30d] [enum: 24h, 7d, 30d] |

### Return type

[**GetReputationTimeline200Response**](GetReputationTimeline200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reputation timeline |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

