# PipelineSimulationApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**simulatePipeline**](PipelineSimulationApi.md#simulatePipeline) | **POST** /v1/simulate | Simulate sending pipeline |


<a id="simulatePipeline"></a>
# **simulatePipeline**
> simulatePipeline()

Simulate sending pipeline

Dry-run the sending or receiving pipeline to preview what would happen without side effects.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.PipelineSimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PipelineSimulationApi apiInstance = new PipelineSimulationApi(defaultClient);
    try {
      apiInstance.simulatePipeline();
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineSimulationApi#simulatePipeline");
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
| **200** | Simulate sending pipeline |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

