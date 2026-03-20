# IspFblGuidesApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIspFblGuide**](IspFblGuidesApi.md#getIspFblGuide) | **GET** /v1/isp-fbl/guides/{isp_id} | Get ISP FBL guide |
| [**listIspFblGuides**](IspFblGuidesApi.md#listIspFblGuides) | **GET** /v1/isp-fbl/guides | List ISP FBL guides |


<a id="getIspFblGuide"></a>
# **getIspFblGuide**
> getIspFblGuide(ispId)

Get ISP FBL guide

Retrieve a specific ISP feedback loop setup guide.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.IspFblGuidesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    IspFblGuidesApi apiInstance = new IspFblGuidesApi(defaultClient);
    String ispId = "ispId_example"; // String | 
    try {
      apiInstance.getIspFblGuide(ispId);
    } catch (ApiException e) {
      System.err.println("Exception when calling IspFblGuidesApi#getIspFblGuide");
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
| **ispId** | **String**|  | |

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
| **200** | Get ISP FBL guide |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listIspFblGuides"></a>
# **listIspFblGuides**
> listIspFblGuides()

List ISP FBL guides

List all ISP feedback loop setup guides.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.IspFblGuidesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    IspFblGuidesApi apiInstance = new IspFblGuidesApi(defaultClient);
    try {
      apiInstance.listIspFblGuides();
    } catch (ApiException e) {
      System.err.println("Exception when calling IspFblGuidesApi#listIspFblGuides");
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
| **200** | List ISP FBL guides |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

