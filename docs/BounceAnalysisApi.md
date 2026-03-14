# BounceAnalysisApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBounceAnalysis**](BounceAnalysisApi.md#createBounceAnalysis) | **POST** /v1/bounce-analyses | Analyze bounce logs |
| [**crossReferenceBounces**](BounceAnalysisApi.md#crossReferenceBounces) | **GET** /v1/bounce-analyses/{analysis_id}/cross-reference | Cross-reference bounces with validation logs |
| [**getBounceAnalysis**](BounceAnalysisApi.md#getBounceAnalysis) | **GET** /v1/bounce-analyses/{analysis_id} | Get bounce analysis |
| [**getBounceRecords**](BounceAnalysisApi.md#getBounceRecords) | **GET** /v1/bounce-analyses/{analysis_id}/records | Get bounce records |


<a id="createBounceAnalysis"></a>
# **createBounceAnalysis**
> BounceAnalysisResponse createBounceAnalysis(createBounceAnalysisRequest)

Analyze bounce logs

Submit bounce log data for analysis. Identifies patterns, categorizes bounce types, and provides remediation recommendations.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BounceAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BounceAnalysisApi apiInstance = new BounceAnalysisApi(defaultClient);
    CreateBounceAnalysisRequest createBounceAnalysisRequest = new CreateBounceAnalysisRequest(); // CreateBounceAnalysisRequest | 
    try {
      BounceAnalysisResponse result = apiInstance.createBounceAnalysis(createBounceAnalysisRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BounceAnalysisApi#createBounceAnalysis");
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
| **createBounceAnalysisRequest** | [**CreateBounceAnalysisRequest**](CreateBounceAnalysisRequest.md)|  | |

### Return type

[**BounceAnalysisResponse**](BounceAnalysisResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Bounce analysis created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="crossReferenceBounces"></a>
# **crossReferenceBounces**
> CrossReferenceBounces200Response crossReferenceBounces(analysisId)

Cross-reference bounces with validation logs

Match bounced emails against your validation history to identify emails that were validated as deliverable but later bounced.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BounceAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BounceAnalysisApi apiInstance = new BounceAnalysisApi(defaultClient);
    String analysisId = "analysisId_example"; // String | Bounce analysis UUID
    try {
      CrossReferenceBounces200Response result = apiInstance.crossReferenceBounces(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BounceAnalysisApi#crossReferenceBounces");
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
| **analysisId** | **String**| Bounce analysis UUID | |

### Return type

[**CrossReferenceBounces200Response**](CrossReferenceBounces200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cross-reference results |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="getBounceAnalysis"></a>
# **getBounceAnalysis**
> BounceAnalysisResponse getBounceAnalysis(analysisId)

Get bounce analysis

Get the results of a bounce analysis including category breakdown, top offenders, and recommendations.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BounceAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BounceAnalysisApi apiInstance = new BounceAnalysisApi(defaultClient);
    String analysisId = "analysisId_example"; // String | Bounce analysis UUID
    try {
      BounceAnalysisResponse result = apiInstance.getBounceAnalysis(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BounceAnalysisApi#getBounceAnalysis");
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
| **analysisId** | **String**| Bounce analysis UUID | |

### Return type

[**BounceAnalysisResponse**](BounceAnalysisResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bounce analysis results |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="getBounceRecords"></a>
# **getBounceRecords**
> GetBounceRecords200Response getBounceRecords(analysisId, page, perPage, type)

Get bounce records

Get individual bounce records from an analysis with pagination.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BounceAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BounceAnalysisApi apiInstance = new BounceAnalysisApi(defaultClient);
    String analysisId = "analysisId_example"; // String | Bounce analysis UUID
    Integer page = 1; // Integer | Page number
    Integer perPage = 50; // Integer | Items per page
    String type = "hard"; // String | Filter by bounce type
    try {
      GetBounceRecords200Response result = apiInstance.getBounceRecords(analysisId, page, perPage, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BounceAnalysisApi#getBounceRecords");
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
| **analysisId** | **String**| Bounce analysis UUID | |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Items per page | [optional] [default to 50] |
| **type** | **String**| Filter by bounce type | [optional] [enum: hard, soft] |

### Return type

[**GetBounceRecords200Response**](GetBounceRecords200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bounce records |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

