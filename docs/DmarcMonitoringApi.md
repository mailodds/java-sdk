# DmarcMonitoringApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDmarcDomain**](DmarcMonitoringApi.md#addDmarcDomain) | **POST** /v1/dmarc-domains | Add DMARC domain |
| [**getDmarcDomain**](DmarcMonitoringApi.md#getDmarcDomain) | **GET** /v1/dmarc-domains/{domain_id} | Get DMARC domain |
| [**getDmarcRecommendation**](DmarcMonitoringApi.md#getDmarcRecommendation) | **GET** /v1/dmarc-domains/{domain_id}/recommendation | Get DMARC policy recommendation |
| [**getDmarcSources**](DmarcMonitoringApi.md#getDmarcSources) | **GET** /v1/dmarc-domains/{domain_id}/sources | Get DMARC sending sources |
| [**getDmarcTrend**](DmarcMonitoringApi.md#getDmarcTrend) | **GET** /v1/dmarc-domains/{domain_id}/trend | Get DMARC trend |
| [**listDmarcDomains**](DmarcMonitoringApi.md#listDmarcDomains) | **GET** /v1/dmarc-domains | List DMARC domains |
| [**verifyDmarcDomain**](DmarcMonitoringApi.md#verifyDmarcDomain) | **POST** /v1/dmarc-domains/{domain_id}/verify | Verify DMARC DNS records |


<a id="addDmarcDomain"></a>
# **addDmarcDomain**
> AddDmarcDomain201Response addDmarcDomain(addDmarcDomainRequest)

Add DMARC domain

Add a domain for DMARC monitoring. A unique reporting address is generated for receiving aggregate DMARC reports.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.DmarcMonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DmarcMonitoringApi apiInstance = new DmarcMonitoringApi(defaultClient);
    AddDmarcDomainRequest addDmarcDomainRequest = new AddDmarcDomainRequest(); // AddDmarcDomainRequest | 
    try {
      AddDmarcDomain201Response result = apiInstance.addDmarcDomain(addDmarcDomainRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmarcMonitoringApi#addDmarcDomain");
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
| **addDmarcDomainRequest** | [**AddDmarcDomainRequest**](AddDmarcDomainRequest.md)|  | |

### Return type

[**AddDmarcDomain201Response**](AddDmarcDomain201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Domain added |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getDmarcDomain"></a>
# **getDmarcDomain**
> GetDmarcDomain200Response getDmarcDomain(domainId, days)

Get DMARC domain

Get a single DMARC domain with summary statistics including pass/fail rates.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.DmarcMonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DmarcMonitoringApi apiInstance = new DmarcMonitoringApi(defaultClient);
    String domainId = "domainId_example"; // String | DMARC domain UUID
    Integer days = 30; // Integer | Number of days for summary stats
    try {
      GetDmarcDomain200Response result = apiInstance.getDmarcDomain(domainId, days);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmarcMonitoringApi#getDmarcDomain");
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
| **domainId** | **String**| DMARC domain UUID | |
| **days** | **Integer**| Number of days for summary stats | [optional] [default to 30] |

### Return type

[**GetDmarcDomain200Response**](GetDmarcDomain200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Domain with summary stats |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="getDmarcRecommendation"></a>
# **getDmarcRecommendation**
> GetDmarcRecommendation200Response getDmarcRecommendation(domainId)

Get DMARC policy recommendation

Get a recommendation for upgrading the domain&#39;s DMARC policy based on alignment data.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.DmarcMonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DmarcMonitoringApi apiInstance = new DmarcMonitoringApi(defaultClient);
    String domainId = "domainId_example"; // String | DMARC domain UUID
    try {
      GetDmarcRecommendation200Response result = apiInstance.getDmarcRecommendation(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmarcMonitoringApi#getDmarcRecommendation");
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
| **domainId** | **String**| DMARC domain UUID | |

### Return type

[**GetDmarcRecommendation200Response**](GetDmarcRecommendation200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Policy recommendation |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="getDmarcSources"></a>
# **getDmarcSources**
> GetDmarcSources200Response getDmarcSources(domainId, days, page, perPage)

Get DMARC sending sources

Get sending IPs that have sent email for this domain with their DKIM/SPF alignment status.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.DmarcMonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DmarcMonitoringApi apiInstance = new DmarcMonitoringApi(defaultClient);
    String domainId = "domainId_example"; // String | DMARC domain UUID
    Integer days = 30; // Integer | Number of days to look back
    Integer page = 1; // Integer | 
    Integer perPage = 20; // Integer | 
    try {
      GetDmarcSources200Response result = apiInstance.getDmarcSources(domainId, days, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmarcMonitoringApi#getDmarcSources");
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
| **domainId** | **String**| DMARC domain UUID | |
| **days** | **Integer**| Number of days to look back | [optional] [default to 30] |
| **page** | **Integer**|  | [optional] [default to 1] |
| **perPage** | **Integer**|  | [optional] [default to 20] |

### Return type

[**GetDmarcSources200Response**](GetDmarcSources200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sending sources with alignment status |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="getDmarcTrend"></a>
# **getDmarcTrend**
> GetDmarcTrend200Response getDmarcTrend(domainId, days)

Get DMARC trend

Get daily pass/fail trend data for DMARC authentication over the specified period.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.DmarcMonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DmarcMonitoringApi apiInstance = new DmarcMonitoringApi(defaultClient);
    String domainId = "domainId_example"; // String | DMARC domain UUID
    Integer days = 30; // Integer | Number of days of trend data
    try {
      GetDmarcTrend200Response result = apiInstance.getDmarcTrend(domainId, days);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmarcMonitoringApi#getDmarcTrend");
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
| **domainId** | **String**| DMARC domain UUID | |
| **days** | **Integer**| Number of days of trend data | [optional] [default to 30] |

### Return type

[**GetDmarcTrend200Response**](GetDmarcTrend200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Daily trend data |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="listDmarcDomains"></a>
# **listDmarcDomains**
> ListDmarcDomains200Response listDmarcDomains()

List DMARC domains

List all domains being monitored for DMARC compliance.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.DmarcMonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DmarcMonitoringApi apiInstance = new DmarcMonitoringApi(defaultClient);
    try {
      ListDmarcDomains200Response result = apiInstance.listDmarcDomains();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmarcMonitoringApi#listDmarcDomains");
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

[**ListDmarcDomains200Response**](ListDmarcDomains200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of monitored domains |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="verifyDmarcDomain"></a>
# **verifyDmarcDomain**
> AddDmarcDomain201Response verifyDmarcDomain(domainId)

Verify DMARC DNS records

Check that the domain has the correct DMARC TXT record pointing to the MailOdds reporting address.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.DmarcMonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DmarcMonitoringApi apiInstance = new DmarcMonitoringApi(defaultClient);
    String domainId = "domainId_example"; // String | DMARC domain UUID
    try {
      AddDmarcDomain201Response result = apiInstance.verifyDmarcDomain(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmarcMonitoringApi#verifyDmarcDomain");
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
| **domainId** | **String**| DMARC domain UUID | |

### Return type

[**AddDmarcDomain201Response**](AddDmarcDomain201Response.md)

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

