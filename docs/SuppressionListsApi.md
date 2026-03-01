# SuppressionListsApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSuppression**](SuppressionListsApi.md#addSuppression) | **POST** /v1/suppression | Add suppression entries |
| [**checkSuppression**](SuppressionListsApi.md#checkSuppression) | **POST** /v1/suppression/check | Check suppression status |
| [**getSuppressionAuditLog**](SuppressionListsApi.md#getSuppressionAuditLog) | **GET** /v1/suppression/audit | Get suppression audit log |
| [**getSuppressionStats**](SuppressionListsApi.md#getSuppressionStats) | **GET** /v1/suppression/stats | Get suppression statistics |
| [**listSuppression**](SuppressionListsApi.md#listSuppression) | **GET** /v1/suppression | List suppression entries |
| [**removeSuppression**](SuppressionListsApi.md#removeSuppression) | **DELETE** /v1/suppression | Remove suppression entries |


<a id="addSuppression"></a>
# **addSuppression**
> AddSuppressionResponse addSuppression(addSuppressionRequest)

Add suppression entries

Add emails or domains to the suppression list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SuppressionListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SuppressionListsApi apiInstance = new SuppressionListsApi(defaultClient);
    AddSuppressionRequest addSuppressionRequest = new AddSuppressionRequest(); // AddSuppressionRequest | 
    try {
      AddSuppressionResponse result = apiInstance.addSuppression(addSuppressionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionListsApi#addSuppression");
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
| **addSuppressionRequest** | [**AddSuppressionRequest**](AddSuppressionRequest.md)|  | |

### Return type

[**AddSuppressionResponse**](AddSuppressionResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entries added |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="checkSuppression"></a>
# **checkSuppression**
> SuppressionCheckResponse checkSuppression(checkSuppressionRequest)

Check suppression status

Check if an email is suppressed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SuppressionListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SuppressionListsApi apiInstance = new SuppressionListsApi(defaultClient);
    CheckSuppressionRequest checkSuppressionRequest = new CheckSuppressionRequest(); // CheckSuppressionRequest | 
    try {
      SuppressionCheckResponse result = apiInstance.checkSuppression(checkSuppressionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionListsApi#checkSuppression");
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
| **checkSuppressionRequest** | [**CheckSuppressionRequest**](CheckSuppressionRequest.md)|  | |

### Return type

[**SuppressionCheckResponse**](SuppressionCheckResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Suppression check result |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getSuppressionAuditLog"></a>
# **getSuppressionAuditLog**
> SuppressionAuditResponse getSuppressionAuditLog(page, limit)

Get suppression audit log

Get a chronological log of suppression list changes (additions, removals).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SuppressionListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SuppressionListsApi apiInstance = new SuppressionListsApi(defaultClient);
    Integer page = 1; // Integer | 
    Integer limit = 20; // Integer | 
    try {
      SuppressionAuditResponse result = apiInstance.getSuppressionAuditLog(page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionListsApi#getSuppressionAuditLog");
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
| **page** | **Integer**|  | [optional] [default to 1] |
| **limit** | **Integer**|  | [optional] [default to 20] |

### Return type

[**SuppressionAuditResponse**](SuppressionAuditResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Audit log entries |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getSuppressionStats"></a>
# **getSuppressionStats**
> SuppressionStatsResponse getSuppressionStats()

Get suppression statistics

Get statistics about the suppression list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SuppressionListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SuppressionListsApi apiInstance = new SuppressionListsApi(defaultClient);
    try {
      SuppressionStatsResponse result = apiInstance.getSuppressionStats();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionListsApi#getSuppressionStats");
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

[**SuppressionStatsResponse**](SuppressionStatsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Suppression statistics |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listSuppression"></a>
# **listSuppression**
> SuppressionListResponse listSuppression(page, perPage, type, search, source)

List suppression entries

List all suppression entries for the account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SuppressionListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SuppressionListsApi apiInstance = new SuppressionListsApi(defaultClient);
    Integer page = 1; // Integer | 
    Integer perPage = 50; // Integer | 
    String type = "email"; // String | 
    String search = "search_example"; // String | 
    String source = "source_example"; // String | Filter by entry source (e.g. api, bounce, complaint)
    try {
      SuppressionListResponse result = apiInstance.listSuppression(page, perPage, type, search, source);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionListsApi#listSuppression");
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
| **page** | **Integer**|  | [optional] [default to 1] |
| **perPage** | **Integer**|  | [optional] [default to 50] |
| **type** | **String**|  | [optional] [enum: email, domain] |
| **search** | **String**|  | [optional] |
| **source** | **String**| Filter by entry source (e.g. api, bounce, complaint) | [optional] |

### Return type

[**SuppressionListResponse**](SuppressionListResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Suppression list |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="removeSuppression"></a>
# **removeSuppression**
> RemoveSuppression200Response removeSuppression(removeSuppressionRequest)

Remove suppression entries

Remove emails or domains from the suppression list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SuppressionListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SuppressionListsApi apiInstance = new SuppressionListsApi(defaultClient);
    RemoveSuppressionRequest removeSuppressionRequest = new RemoveSuppressionRequest(); // RemoveSuppressionRequest | 
    try {
      RemoveSuppression200Response result = apiInstance.removeSuppression(removeSuppressionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionListsApi#removeSuppression");
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
| **removeSuppressionRequest** | [**RemoveSuppressionRequest**](RemoveSuppressionRequest.md)|  | |

### Return type

[**RemoveSuppression200Response**](RemoveSuppression200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entries removed |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

