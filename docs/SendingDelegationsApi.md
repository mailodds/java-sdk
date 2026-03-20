# SendingDelegationsApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDelegation**](SendingDelegationsApi.md#createDelegation) | **POST** /v1/sending-domains/{domain_id}/delegations | Create a sending delegation |
| [**listDelegations**](SendingDelegationsApi.md#listDelegations) | **GET** /v1/sending-domains/{domain_id}/delegations | List sending delegations |
| [**revokeDelegation**](SendingDelegationsApi.md#revokeDelegation) | **DELETE** /v1/sending-domains/{domain_id}/delegations/{delegation_id} | Revoke a sending delegation |


<a id="createDelegation"></a>
# **createDelegation**
> createDelegation(domainId)

Create a sending delegation

Create a sending delegation granting another account permission to send from this domain.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.SendingDelegationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SendingDelegationsApi apiInstance = new SendingDelegationsApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      apiInstance.createDelegation(domainId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingDelegationsApi#createDelegation");
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
| **201** | Create a sending delegation |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listDelegations"></a>
# **listDelegations**
> listDelegations(domainId)

List sending delegations

List all sending delegations for a domain.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.SendingDelegationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SendingDelegationsApi apiInstance = new SendingDelegationsApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      apiInstance.listDelegations(domainId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingDelegationsApi#listDelegations");
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
| **200** | List sending delegations |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="revokeDelegation"></a>
# **revokeDelegation**
> revokeDelegation(domainId, delegationId)

Revoke a sending delegation

Revoke a sending delegation, removing the delegate account permission to send.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.SendingDelegationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SendingDelegationsApi apiInstance = new SendingDelegationsApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    String delegationId = "delegationId_example"; // String | 
    try {
      apiInstance.revokeDelegation(domainId, delegationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingDelegationsApi#revokeDelegation");
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
| **delegationId** | **String**|  | |

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
| **200** | Revoke a sending delegation |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

