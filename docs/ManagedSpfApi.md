# ManagedSpfApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createManagedSpf**](ManagedSpfApi.md#createManagedSpf) | **POST** /v1/sending-domains/{domain_id}/managed-spf | Create managed SPF record |
| [**getManagedSpf**](ManagedSpfApi.md#getManagedSpf) | **GET** /v1/sending-domains/{domain_id}/managed-spf | Get managed SPF record |
| [**refreshManagedSpf**](ManagedSpfApi.md#refreshManagedSpf) | **POST** /v1/sending-domains/{domain_id}/managed-spf/refresh | Refresh managed SPF record |
| [**updateManagedSpf**](ManagedSpfApi.md#updateManagedSpf) | **PUT** /v1/sending-domains/{domain_id}/managed-spf | Update managed SPF settings |


<a id="createManagedSpf"></a>
# **createManagedSpf**
> createManagedSpf(domainId)

Create managed SPF record

Create a managed SPF record for a sending domain.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ManagedSpfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManagedSpfApi apiInstance = new ManagedSpfApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      apiInstance.createManagedSpf(domainId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedSpfApi#createManagedSpf");
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
| **201** | Create managed SPF record |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getManagedSpf"></a>
# **getManagedSpf**
> getManagedSpf(domainId)

Get managed SPF record

Retrieve the managed SPF record for a sending domain.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ManagedSpfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManagedSpfApi apiInstance = new ManagedSpfApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      apiInstance.getManagedSpf(domainId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedSpfApi#getManagedSpf");
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
| **200** | Get managed SPF record |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="refreshManagedSpf"></a>
# **refreshManagedSpf**
> refreshManagedSpf(domainId)

Refresh managed SPF record

Re-resolve DNS and refresh the managed SPF record for a sending domain.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ManagedSpfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManagedSpfApi apiInstance = new ManagedSpfApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      apiInstance.refreshManagedSpf(domainId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedSpfApi#refreshManagedSpf");
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
| **200** | Refresh managed SPF record |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="updateManagedSpf"></a>
# **updateManagedSpf**
> updateManagedSpf(domainId)

Update managed SPF settings

Update managed SPF settings such as enabling or disabling for a sending domain.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ManagedSpfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManagedSpfApi apiInstance = new ManagedSpfApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      apiInstance.updateManagedSpf(domainId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedSpfApi#updateManagedSpf");
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
| **200** | Update managed SPF settings |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

