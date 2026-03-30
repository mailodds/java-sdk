# ConfigurationSetsApi

All URIs are relative to *https://api.mailodds.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConfigurationSet**](ConfigurationSetsApi.md#createConfigurationSet) | **POST** /v1/configuration-sets | Create a configuration set |
| [**deleteConfigurationSet**](ConfigurationSetsApi.md#deleteConfigurationSet) | **DELETE** /v1/configuration-sets/{name} | Delete a configuration set |
| [**getConfigurationSet**](ConfigurationSetsApi.md#getConfigurationSet) | **GET** /v1/configuration-sets/{name} | Get a configuration set |
| [**getConfigurationSetMetrics**](ConfigurationSetsApi.md#getConfigurationSetMetrics) | **GET** /v1/configuration-sets/{name}/metrics | Get configuration set metrics |
| [**listConfigurationSets**](ConfigurationSetsApi.md#listConfigurationSets) | **GET** /v1/configuration-sets | List configuration sets |
| [**updateConfigurationSet**](ConfigurationSetsApi.md#updateConfigurationSet) | **PUT** /v1/configuration-sets/{name} | Update a configuration set |


<a id="createConfigurationSet"></a>
# **createConfigurationSet**
> createConfigurationSet()

Create a configuration set

Create a new configuration set for grouping sending behavior.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ConfigurationSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConfigurationSetsApi apiInstance = new ConfigurationSetsApi(defaultClient);
    try {
      apiInstance.createConfigurationSet();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationSetsApi#createConfigurationSet");
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
| **201** | Create a configuration set |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="deleteConfigurationSet"></a>
# **deleteConfigurationSet**
> deleteConfigurationSet(name)

Delete a configuration set

Delete a configuration set by name.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ConfigurationSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConfigurationSetsApi apiInstance = new ConfigurationSetsApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      apiInstance.deleteConfigurationSet(name);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationSetsApi#deleteConfigurationSet");
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
| **name** | **String**|  | |

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
| **200** | Delete a configuration set |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getConfigurationSet"></a>
# **getConfigurationSet**
> getConfigurationSet(name)

Get a configuration set

Retrieve a configuration set by name.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ConfigurationSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConfigurationSetsApi apiInstance = new ConfigurationSetsApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      apiInstance.getConfigurationSet(name);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationSetsApi#getConfigurationSet");
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
| **name** | **String**|  | |

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
| **200** | Get a configuration set |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getConfigurationSetMetrics"></a>
# **getConfigurationSetMetrics**
> getConfigurationSetMetrics(name)

Get configuration set metrics

Retrieve sending metrics for a configuration set.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ConfigurationSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConfigurationSetsApi apiInstance = new ConfigurationSetsApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      apiInstance.getConfigurationSetMetrics(name);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationSetsApi#getConfigurationSetMetrics");
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
| **name** | **String**|  | |

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
| **200** | Get configuration set metrics |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listConfigurationSets"></a>
# **listConfigurationSets**
> listConfigurationSets()

List configuration sets

List all configuration sets for the account.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ConfigurationSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConfigurationSetsApi apiInstance = new ConfigurationSetsApi(defaultClient);
    try {
      apiInstance.listConfigurationSets();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationSetsApi#listConfigurationSets");
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
| **200** | List configuration sets |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="updateConfigurationSet"></a>
# **updateConfigurationSet**
> updateConfigurationSet(name)

Update a configuration set

Update an existing configuration set by name.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ConfigurationSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConfigurationSetsApi apiInstance = new ConfigurationSetsApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      apiInstance.updateConfigurationSet(name);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationSetsApi#updateConfigurationSet");
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
| **name** | **String**|  | |

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
| **200** | Update a configuration set |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

