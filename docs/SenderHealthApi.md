# SenderHealthApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSenderHealth**](SenderHealthApi.md#getSenderHealth) | **GET** /v1/sender-health | Get sender health score |
| [**getSenderHealthTrend**](SenderHealthApi.md#getSenderHealthTrend) | **GET** /v1/sender-health/trend | Get sender health trend |


<a id="getSenderHealth"></a>
# **getSenderHealth**
> GetSenderHealth200Response getSenderHealth(period)

Get sender health score

Get an aggregate sender health score (0-100) across all sending domains. Factors in delivery rate, bounce rate, complaint rate, and authentication status.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SenderHealthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SenderHealthApi apiInstance = new SenderHealthApi(defaultClient);
    String period = "7d"; // String | Time period for health calculation
    try {
      GetSenderHealth200Response result = apiInstance.getSenderHealth(period);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderHealthApi#getSenderHealth");
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
| **period** | **String**| Time period for health calculation | [optional] [default to 30d] [enum: 7d, 30d, 90d] |

### Return type

[**GetSenderHealth200Response**](GetSenderHealth200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sender health score |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

<a id="getSenderHealthTrend"></a>
# **getSenderHealthTrend**
> GetSenderHealthTrend200Response getSenderHealthTrend(period)

Get sender health trend

Get historical sender health scores over time for trend analysis. Returns daily data points for the requested period.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SenderHealthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SenderHealthApi apiInstance = new SenderHealthApi(defaultClient);
    String period = "7d"; // String | Time period for trend data
    try {
      GetSenderHealthTrend200Response result = apiInstance.getSenderHealthTrend(period);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderHealthApi#getSenderHealthTrend");
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
| **period** | **String**| Time period for trend data | [optional] [default to 30d] [enum: 7d, 30d, 90d] |

### Return type

[**GetSenderHealthTrend200Response**](GetSenderHealthTrend200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sender health trend |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

