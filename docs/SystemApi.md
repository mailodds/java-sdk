# SystemApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTelemetrySummary**](SystemApi.md#getTelemetrySummary) | **GET** /v1/telemetry/summary | Get validation telemetry |
| [**healthCheck**](SystemApi.md#healthCheck) | **GET** /health | Health check |


<a id="getTelemetrySummary"></a>
# **getTelemetrySummary**
> TelemetrySummary getTelemetrySummary(window)

Get validation telemetry

Get validation metrics for your account. Useful for building dashboards and monitoring. Supports ETag caching.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SystemApi apiInstance = new SystemApi(defaultClient);
    String window = "1h"; // String | Time window for metrics
    try {
      TelemetrySummary result = apiInstance.getTelemetrySummary(window);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#getTelemetrySummary");
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
| **window** | **String**| Time window for metrics | [optional] [default to 24h] [enum: 1h, 24h, 30d] |

### Return type

[**TelemetrySummary**](TelemetrySummary.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Telemetry summary |  * ETag - Hash of response for caching <br>  * Cache-Control - Caching directive <br>  |
| **304** | Not Modified - use cached response |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="healthCheck"></a>
# **healthCheck**
> HealthCheck200Response healthCheck()

Health check

Check API health status. No authentication required.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.models.*;
import com.mailodds.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      HealthCheck200Response result = apiInstance.healthCheck();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#healthCheck");
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

[**HealthCheck200Response**](HealthCheck200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | API is healthy |  -  |

