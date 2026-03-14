# ContentClassificationApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**classifyContent**](ContentClassificationApi.md#classifyContent) | **POST** /v1/content-check | Classify email content |


<a id="classifyContent"></a>
# **classifyContent**
> ClassifyContent200Response classifyContent(classifyContentRequest)

Classify email content

Run LLM-powered content analysis on email content. Detects spam signals, compliance issues, and content quality. Provide either subject+html_body or raw content text.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ContentClassificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContentClassificationApi apiInstance = new ContentClassificationApi(defaultClient);
    ClassifyContentRequest classifyContentRequest = new ClassifyContentRequest(); // ClassifyContentRequest | 
    try {
      ClassifyContent200Response result = apiInstance.classifyContent(classifyContentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentClassificationApi#classifyContent");
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
| **classifyContentRequest** | [**ClassifyContentRequest**](ClassifyContentRequest.md)|  | |

### Return type

[**ClassifyContent200Response**](ClassifyContent200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Content classification result |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

