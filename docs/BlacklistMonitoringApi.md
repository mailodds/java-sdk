# BlacklistMonitoringApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBlacklistMonitor**](BlacklistMonitoringApi.md#addBlacklistMonitor) | **POST** /v1/blacklist-monitors | Add blacklist monitor |
| [**getBlacklistHistory**](BlacklistMonitoringApi.md#getBlacklistHistory) | **GET** /v1/blacklist-monitors/{monitor_id}/history | Get blacklist check history |
| [**listBlacklistMonitors**](BlacklistMonitoringApi.md#listBlacklistMonitors) | **GET** /v1/blacklist-monitors | List blacklist monitors |
| [**runBlacklistCheck**](BlacklistMonitoringApi.md#runBlacklistCheck) | **POST** /v1/blacklist-monitors/{monitor_id}/check | Run blacklist check |


<a id="addBlacklistMonitor"></a>
# **addBlacklistMonitor**
> AddBlacklistMonitor201Response addBlacklistMonitor(addBlacklistMonitorRequest)

Add blacklist monitor

Add an IP address or domain to monitor against DNS blacklists. An initial check is run immediately.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BlacklistMonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BlacklistMonitoringApi apiInstance = new BlacklistMonitoringApi(defaultClient);
    AddBlacklistMonitorRequest addBlacklistMonitorRequest = new AddBlacklistMonitorRequest(); // AddBlacklistMonitorRequest | 
    try {
      AddBlacklistMonitor201Response result = apiInstance.addBlacklistMonitor(addBlacklistMonitorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlacklistMonitoringApi#addBlacklistMonitor");
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
| **addBlacklistMonitorRequest** | [**AddBlacklistMonitorRequest**](AddBlacklistMonitorRequest.md)|  | |

### Return type

[**AddBlacklistMonitor201Response**](AddBlacklistMonitor201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Monitor created with initial check result |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getBlacklistHistory"></a>
# **getBlacklistHistory**
> GetBlacklistHistory200Response getBlacklistHistory(monitorId, page, perPage)

Get blacklist check history

Get the listing and delisting timeline for a monitored IP or domain.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BlacklistMonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BlacklistMonitoringApi apiInstance = new BlacklistMonitoringApi(defaultClient);
    String monitorId = "monitorId_example"; // String | Monitor UUID
    Integer page = 1; // Integer | 
    Integer perPage = 20; // Integer | 
    try {
      GetBlacklistHistory200Response result = apiInstance.getBlacklistHistory(monitorId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlacklistMonitoringApi#getBlacklistHistory");
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
| **monitorId** | **String**| Monitor UUID | |
| **page** | **Integer**|  | [optional] [default to 1] |
| **perPage** | **Integer**|  | [optional] [default to 20] |

### Return type

[**GetBlacklistHistory200Response**](GetBlacklistHistory200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check history |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="listBlacklistMonitors"></a>
# **listBlacklistMonitors**
> ListBlacklistMonitors200Response listBlacklistMonitors()

List blacklist monitors

List all blacklist monitors for the authenticated account.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BlacklistMonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BlacklistMonitoringApi apiInstance = new BlacklistMonitoringApi(defaultClient);
    try {
      ListBlacklistMonitors200Response result = apiInstance.listBlacklistMonitors();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlacklistMonitoringApi#listBlacklistMonitors");
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

[**ListBlacklistMonitors200Response**](ListBlacklistMonitors200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of monitors |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="runBlacklistCheck"></a>
# **runBlacklistCheck**
> RunBlacklistCheck200Response runBlacklistCheck(monitorId)

Run blacklist check

Run an on-demand DNSBL check for a monitored IP or domain.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BlacklistMonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BlacklistMonitoringApi apiInstance = new BlacklistMonitoringApi(defaultClient);
    String monitorId = "monitorId_example"; // String | Monitor UUID
    try {
      RunBlacklistCheck200Response result = apiInstance.runBlacklistCheck(monitorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlacklistMonitoringApi#runBlacklistCheck");
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
| **monitorId** | **String**| Monitor UUID | |

### Return type

[**RunBlacklistCheck200Response**](RunBlacklistCheck200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check result |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

