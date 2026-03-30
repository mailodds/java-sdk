# SendingDomainsApi

All URIs are relative to *https://api.mailodds.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSendingDomain**](SendingDomainsApi.md#createSendingDomain) | **POST** /v1/sending-domains | Add a sending domain |
| [**deleteSendingDomain**](SendingDomainsApi.md#deleteSendingDomain) | **DELETE** /v1/sending-domains/{domain_id} | Delete a sending domain |
| [**getReplyForwarding**](SendingDomainsApi.md#getReplyForwarding) | **GET** /v1/sending-domains/{domain_id}/reply-forwarding | Get reply forwarding config |
| [**getSendingDomain**](SendingDomainsApi.md#getSendingDomain) | **GET** /v1/sending-domains/{domain_id} | Get a sending domain |
| [**getSendingDomainIdentityScore**](SendingDomainsApi.md#getSendingDomainIdentityScore) | **GET** /v1/sending-domains/{domain_id}/identity-score | Get domain identity score |
| [**getSendingStats**](SendingDomainsApi.md#getSendingStats) | **GET** /v1/sending-stats | Get sending statistics |
| [**listSendingDomains**](SendingDomainsApi.md#listSendingDomains) | **GET** /v1/sending-domains | List sending domains |
| [**setPrimarySendingDomain**](SendingDomainsApi.md#setPrimarySendingDomain) | **POST** /v1/sending-domains/{domain_id}/set-primary | Set primary sending domain |
| [**updateReplyForwarding**](SendingDomainsApi.md#updateReplyForwarding) | **PATCH** /v1/sending-domains/{domain_id}/reply-forwarding | Update reply forwarding config |
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
import com.mailodds.apis.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
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
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

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
import com.mailodds.apis.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
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
| **404** | Resource not found |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getReplyForwarding"></a>
# **getReplyForwarding**
> GetReplyForwarding200Response getReplyForwarding(domainId)

Get reply forwarding config

Get the reply forwarding configuration for a sending domain. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SendingDomainsApi apiInstance = new SendingDomainsApi(defaultClient);
    String domainId = "domainId_example"; // String | Sending domain ID
    try {
      GetReplyForwarding200Response result = apiInstance.getReplyForwarding(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingDomainsApi#getReplyForwarding");
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
| **domainId** | **String**| Sending domain ID | |

### Return type

[**GetReplyForwarding200Response**](GetReplyForwarding200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reply forwarding configuration |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **404** | Resource not found |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

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
import com.mailodds.apis.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
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
| **404** | Resource not found |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

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
import com.mailodds.apis.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
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
| **404** | Resource not found |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

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
import com.mailodds.apis.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
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
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

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
import com.mailodds.apis.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
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
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="setPrimarySendingDomain"></a>
# **setPrimarySendingDomain**
> CreateSendingDomain201Response setPrimarySendingDomain(domainId)

Set primary sending domain

Designate a domain as the primary/default sending domain. When domain_id is omitted from deliver calls, the primary domain is used automatically.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SendingDomainsApi apiInstance = new SendingDomainsApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      CreateSendingDomain201Response result = apiInstance.setPrimarySendingDomain(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingDomainsApi#setPrimarySendingDomain");
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
| **200** | Primary domain set |  -  |
| **404** | Resource not found |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="updateReplyForwarding"></a>
# **updateReplyForwarding**
> GetReplyForwarding200Response updateReplyForwarding(domainId, updateReplyForwardingRequest)

Update reply forwarding config

Configure reply forwarding for a sending domain. Set forward_replies_to to null to disable. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SendingDomainsApi apiInstance = new SendingDomainsApi(defaultClient);
    String domainId = "domainId_example"; // String | Sending domain ID
    UpdateReplyForwardingRequest updateReplyForwardingRequest = new UpdateReplyForwardingRequest(); // UpdateReplyForwardingRequest | 
    try {
      GetReplyForwarding200Response result = apiInstance.updateReplyForwarding(domainId, updateReplyForwardingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingDomainsApi#updateReplyForwarding");
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
| **domainId** | **String**| Sending domain ID | |
| **updateReplyForwardingRequest** | [**UpdateReplyForwardingRequest**](UpdateReplyForwardingRequest.md)|  | |

### Return type

[**GetReplyForwarding200Response**](GetReplyForwarding200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reply forwarding updated |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **404** | Resource not found |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

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
import com.mailodds.apis.SendingDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
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
| **404** | Resource not found |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

