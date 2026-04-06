# StorefrontDomainsApi

All URIs are relative to *https://api.mailodds.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createStorefrontDomain**](StorefrontDomainsApi.md#createStorefrontDomain) | **POST** /v1/storefront-domains | Add a custom storefront domain |
| [**deleteStorefrontDomain**](StorefrontDomainsApi.md#deleteStorefrontDomain) | **DELETE** /v1/storefront-domains/{domain_id} | Delete a storefront domain |
| [**getStorefrontDomain**](StorefrontDomainsApi.md#getStorefrontDomain) | **GET** /v1/storefront-domains/{domain_id} | Get storefront domain details |
| [**listStorefrontDomains**](StorefrontDomainsApi.md#listStorefrontDomains) | **GET** /v1/storefront-domains | List storefront domains |
| [**verifyStorefrontDomain**](StorefrontDomainsApi.md#verifyStorefrontDomain) | **POST** /v1/storefront-domains/{domain_id}/verify | Verify storefront domain DNS |


<a id="createStorefrontDomain"></a>
# **createStorefrontDomain**
> createStorefrontDomain(createStorefrontDomainRequest)

Add a custom storefront domain

Register a custom domain (e.g., shop.merchant.com) for a storefront store. If a Cloudflare DNS provider is connected, NS records are auto-configured.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.StorefrontDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontDomainsApi apiInstance = new StorefrontDomainsApi(defaultClient);
    CreateStorefrontDomainRequest createStorefrontDomainRequest = new CreateStorefrontDomainRequest(); // CreateStorefrontDomainRequest | 
    try {
      apiInstance.createStorefrontDomain(createStorefrontDomainRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontDomainsApi#createStorefrontDomain");
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
| **createStorefrontDomainRequest** | [**CreateStorefrontDomainRequest**](CreateStorefrontDomainRequest.md)|  | |

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
| **201** | Add a custom storefront domain |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="deleteStorefrontDomain"></a>
# **deleteStorefrontDomain**
> deleteStorefrontDomain(domainId)

Delete a storefront domain

Remove a custom storefront domain. Cleans up DNS records (if auto-configured), TLS certificates, and edge node config.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.StorefrontDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontDomainsApi apiInstance = new StorefrontDomainsApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      apiInstance.deleteStorefrontDomain(domainId);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontDomainsApi#deleteStorefrontDomain");
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
| **200** | Delete a storefront domain |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getStorefrontDomain"></a>
# **getStorefrontDomain**
> getStorefrontDomain(domainId)

Get storefront domain details

Get a custom domain with status, NS record instructions, and certificate info.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.StorefrontDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontDomainsApi apiInstance = new StorefrontDomainsApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      apiInstance.getStorefrontDomain(domainId);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontDomainsApi#getStorefrontDomain");
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
| **200** | Get storefront domain details |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listStorefrontDomains"></a>
# **listStorefrontDomains**
> listStorefrontDomains()

List storefront domains

List all custom storefront domains for the account.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.StorefrontDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontDomainsApi apiInstance = new StorefrontDomainsApi(defaultClient);
    try {
      apiInstance.listStorefrontDomains();
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontDomainsApi#listStorefrontDomains");
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
| **200** | List storefront domains |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="verifyStorefrontDomain"></a>
# **verifyStorefrontDomain**
> verifyStorefrontDomain(domainId)

Verify storefront domain DNS

Trigger manual DNS verification for a custom domain. Rate limited to 5 per hour per domain.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.StorefrontDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontDomainsApi apiInstance = new StorefrontDomainsApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      apiInstance.verifyStorefrontDomain(domainId);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontDomainsApi#verifyStorefrontDomain");
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
| **200** | Verify storefront domain DNS |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

