# DnsProviderApi

All URIs are relative to *https://api.mailodds.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**connectDnsProvider**](DnsProviderApi.md#connectDnsProvider) | **POST** /v1/account/dns-provider | Connect DNS provider |
| [**disconnectDnsProvider**](DnsProviderApi.md#disconnectDnsProvider) | **DELETE** /v1/account/dns-provider | Disconnect DNS provider |
| [**getDnsProvider**](DnsProviderApi.md#getDnsProvider) | **GET** /v1/account/dns-provider | Get DNS provider status |


<a id="connectDnsProvider"></a>
# **connectDnsProvider**
> connectDnsProvider(connectDnsProviderRequest)

Connect DNS provider

Store a Cloudflare API token on the account for automated DNS configuration. Token is validated, zones are discovered, and write permission is tested before storage.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.DnsProviderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DnsProviderApi apiInstance = new DnsProviderApi(defaultClient);
    ConnectDnsProviderRequest connectDnsProviderRequest = new ConnectDnsProviderRequest(); // ConnectDnsProviderRequest | 
    try {
      apiInstance.connectDnsProvider(connectDnsProviderRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsProviderApi#connectDnsProvider");
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
| **connectDnsProviderRequest** | [**ConnectDnsProviderRequest**](ConnectDnsProviderRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Connect DNS provider |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="disconnectDnsProvider"></a>
# **disconnectDnsProvider**
> disconnectDnsProvider()

Disconnect DNS provider

Remove the stored DNS provider token and clear zone cache.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.DnsProviderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DnsProviderApi apiInstance = new DnsProviderApi(defaultClient);
    try {
      apiInstance.disconnectDnsProvider();
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsProviderApi#disconnectDnsProvider");
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
| **200** | Disconnect DNS provider |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getDnsProvider"></a>
# **getDnsProvider**
> getDnsProvider()

Get DNS provider status

Get the DNS provider connection status. Token is never exposed in the response.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.DnsProviderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DnsProviderApi apiInstance = new DnsProviderApi(defaultClient);
    try {
      apiInstance.getDnsProvider();
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsProviderApi#getDnsProvider");
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
| **200** | Get DNS provider status |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

