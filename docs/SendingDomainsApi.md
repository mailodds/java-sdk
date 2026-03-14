# SendingDomainsApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSendingDomain**](SendingDomainsApi.md#createSendingDomain) | **POST** /v1/sending-domains | Add a sending domain |
| [**deleteSendingDomain**](SendingDomainsApi.md#deleteSendingDomain) | **DELETE** /v1/sending-domains/{domain_id} | Delete a sending domain |
| [**getSendingDomain**](SendingDomainsApi.md#getSendingDomain) | **GET** /v1/sending-domains/{domain_id} | Get a sending domain |
| [**getSendingDomainIdentityScore**](SendingDomainsApi.md#getSendingDomainIdentityScore) | **GET** /v1/sending-domains/{domain_id}/identity-score | Get domain identity score |
| [**getSendingStats**](SendingDomainsApi.md#getSendingStats) | **GET** /v1/sending-stats | Get sending statistics |
| [**listSendingDomains**](SendingDomainsApi.md#listSendingDomains) | **GET** /v1/sending-domains | List sending domains |
| [**verifySendingDomain**](SendingDomainsApi.md#verifySendingDomain) | **POST** /v1/sending-domains/{domain_id}/verify | Verify domain DNS records |


<a id="createSendingDomain"></a>
# **createSendingDomain**
> CreateSendingDomain201Response createSendingDomain(createSendingDomainRequest)

Add a sending domain

Register a new sending domain with NS delegation. After adding, configure DNS records and verify.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SendingDomainsApi apiInstance = new SendingDomainsApi(defaultClient);
    CreateSendingDomainRequest createSendingDomainRequest = new CreateSendingDomainRequest(); // CreateSendingDomainRequest | 
    try {
      CreateSendingDomain201Response result = apiInstance.createSendingDomain(createSendingDomainRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingDomainsApi#createSendingDomain");
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
| **createSendingDomainRequest** | [**CreateSendingDomainRequest**](CreateSendingDomainRequest.md)|  | |

### Return type

[**CreateSendingDomain201Response**](CreateSendingDomain201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Domain created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

<a id="deleteSendingDomain"></a>
# **deleteSendingDomain**
> DeletePolicyRule200Response deleteSendingDomain(domainId)

Delete a sending domain

Permanently remove a sending domain from the account.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SendingDomainsApi apiInstance = new SendingDomainsApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      DeletePolicyRule200Response result = apiInstance.deleteSendingDomain(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingDomainsApi#deleteSendingDomain");
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

[**DeletePolicyRule200Response**](DeletePolicyRule200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Domain deleted |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="getSendingDomain"></a>
# **getSendingDomain**
> CreateSendingDomain201Response getSendingDomain(domainId)

Get a sending domain

Get details of a specific sending domain including DNS verification status.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SendingDomainsApi apiInstance = new SendingDomainsApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      CreateSendingDomain201Response result = apiInstance.getSendingDomain(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingDomainsApi#getSendingDomain");
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

[**CreateSendingDomain201Response**](CreateSendingDomain201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Domain details |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="getSendingDomainIdentityScore"></a>
# **getSendingDomainIdentityScore**
> GetSendingDomainIdentityScore200Response getSendingDomainIdentityScore(domainId)

Get domain identity score

Get a composite DNS health score for the sending domain, checking DKIM, SPF, DMARC, MX, and return path configuration.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SendingDomainsApi apiInstance = new SendingDomainsApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      GetSendingDomainIdentityScore200Response result = apiInstance.getSendingDomainIdentityScore(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingDomainsApi#getSendingDomainIdentityScore");
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

[**GetSendingDomainIdentityScore200Response**](GetSendingDomainIdentityScore200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Identity score |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="getSendingStats"></a>
# **getSendingStats**
> GetSendingStats200Response getSendingStats(period, domainId)

Get sending statistics

Get aggregate sending statistics across all domains for the account, including delivery rates, open rates, and click rates.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SendingDomainsApi apiInstance = new SendingDomainsApi(defaultClient);
    String period = "7d"; // String | Time period
    String domainId = "domainId_example"; // String | Filter by domain
    try {
      GetSendingStats200Response result = apiInstance.getSendingStats(period, domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingDomainsApi#getSendingStats");
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
| **period** | **String**| Time period | [optional] [default to 7d] [enum: 7d, 30d, 90d] |
| **domainId** | **String**| Filter by domain | [optional] |

### Return type

[**GetSendingStats200Response**](GetSendingStats200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sending statistics |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

<a id="listSendingDomains"></a>
# **listSendingDomains**
> ListSendingDomains200Response listSendingDomains()

List sending domains

List all sending domains for the authenticated account.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SendingDomainsApi apiInstance = new SendingDomainsApi(defaultClient);
    try {
      ListSendingDomains200Response result = apiInstance.listSendingDomains();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingDomainsApi#listSendingDomains");
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

[**ListSendingDomains200Response**](ListSendingDomains200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of sending domains |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

<a id="verifySendingDomain"></a>
# **verifySendingDomain**
> CreateSendingDomain201Response verifySendingDomain(domainId)

Verify domain DNS records

Check and verify all DNS records (DKIM, SPF, DMARC, MX, return path) for the sending domain.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SendingDomainsApi apiInstance = new SendingDomainsApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      CreateSendingDomain201Response result = apiInstance.verifySendingDomain(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingDomainsApi#verifySendingDomain");
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

[**CreateSendingDomain201Response**](CreateSendingDomain201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Verification result |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

