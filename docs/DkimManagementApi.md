# DkimManagementApi

All URIs are relative to *https://api.mailodds.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDkimDnsRecord**](DkimManagementApi.md#getDkimDnsRecord) | **GET** /v1/sending-domains/{domain_id}/dkim/dns-record | Get DKIM DNS record |
| [**rotateDkim**](DkimManagementApi.md#rotateDkim) | **POST** /v1/sending-domains/{domain_id}/dkim/rotate | Rotate DKIM keys |


<a id="getDkimDnsRecord"></a>
# **getDkimDnsRecord**
> getDkimDnsRecord(domainId)

Get DKIM DNS record

Retrieve the current DKIM DNS record and selector for a sending domain.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.DkimManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DkimManagementApi apiInstance = new DkimManagementApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      apiInstance.getDkimDnsRecord(domainId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DkimManagementApi#getDkimDnsRecord");
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
| **domainId** | **String**|  | |

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
| **200** | Get DKIM DNS record |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="rotateDkim"></a>
# **rotateDkim**
> rotateDkim(domainId)

Rotate DKIM keys

Generate a new DKIM key pair and rotate the selector for a sending domain.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.DkimManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DkimManagementApi apiInstance = new DkimManagementApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      apiInstance.rotateDkim(domainId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DkimManagementApi#rotateDkim");
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
| **domainId** | **String**|  | |

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
| **200** | Rotate DKIM keys |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

