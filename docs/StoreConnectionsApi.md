# StoreConnectionsApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createStore**](StoreConnectionsApi.md#createStore) | **POST** /v1/stores | Create a store connection |
| [**disconnectStore**](StoreConnectionsApi.md#disconnectStore) | **DELETE** /v1/stores/{store_id} | Disconnect a store |
| [**getStore**](StoreConnectionsApi.md#getStore) | **GET** /v1/stores/{store_id} | Get a store connection |
| [**getSyncJobErrors**](StoreConnectionsApi.md#getSyncJobErrors) | **GET** /v1/stores/{store_id}/sync-jobs/{job_id}/errors | Get sync job errors |
| [**listStores**](StoreConnectionsApi.md#listStores) | **GET** /v1/stores | List store connections |
| [**listSyncJobs**](StoreConnectionsApi.md#listSyncJobs) | **GET** /v1/stores/{store_id}/sync-jobs | List sync jobs |
| [**triggerSync**](StoreConnectionsApi.md#triggerSync) | **POST** /v1/stores/{store_id}/sync | Trigger product sync |
| [**updateStore**](StoreConnectionsApi.md#updateStore) | **PUT** /v1/stores/{store_id} | Update a store connection |


<a id="createStore"></a>
# **createStore**
> CreateStore201Response createStore(createStoreRequest)

Create a store connection

Connect an e-commerce store (WooCommerce, PrestaShop, Shopify, or product feed). After creation, trigger a sync to import products.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.StoreConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StoreConnectionsApi apiInstance = new StoreConnectionsApi(defaultClient);
    CreateStoreRequest createStoreRequest = new CreateStoreRequest(); // CreateStoreRequest | 
    try {
      CreateStore201Response result = apiInstance.createStore(createStoreRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoreConnectionsApi#createStore");
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
| **createStoreRequest** | [**CreateStoreRequest**](CreateStoreRequest.md)|  | |

### Return type

[**CreateStore201Response**](CreateStore201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Store connection created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="disconnectStore"></a>
# **disconnectStore**
> DisconnectStore200Response disconnectStore(storeId)

Disconnect a store

Disconnect a store and deactivate its products. Products are retained but marked inactive.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.StoreConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StoreConnectionsApi apiInstance = new StoreConnectionsApi(defaultClient);
    String storeId = "storeId_example"; // String | 
    try {
      DisconnectStore200Response result = apiInstance.disconnectStore(storeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoreConnectionsApi#disconnectStore");
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
| **storeId** | **String**|  | |

### Return type

[**DisconnectStore200Response**](DisconnectStore200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Store disconnected |  -  |
| **404** | Resource not found |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getStore"></a>
# **getStore**
> CreateStore201Response getStore(storeId)

Get a store connection

Get details of a specific store connection including sync status and product count.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.StoreConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StoreConnectionsApi apiInstance = new StoreConnectionsApi(defaultClient);
    String storeId = "storeId_example"; // String | 
    try {
      CreateStore201Response result = apiInstance.getStore(storeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoreConnectionsApi#getStore");
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
| **storeId** | **String**|  | |

### Return type

[**CreateStore201Response**](CreateStore201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Store connection details |  -  |
| **404** | Resource not found |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getSyncJobErrors"></a>
# **getSyncJobErrors**
> GetSyncJobErrors200Response getSyncJobErrors(storeId, jobId, page, perPage)

Get sync job errors

Get error details for a sync job.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.StoreConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StoreConnectionsApi apiInstance = new StoreConnectionsApi(defaultClient);
    String storeId = "storeId_example"; // String | 
    String jobId = "jobId_example"; // String | 
    Integer page = 1; // Integer | 
    Integer perPage = 50; // Integer | 
    try {
      GetSyncJobErrors200Response result = apiInstance.getSyncJobErrors(storeId, jobId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoreConnectionsApi#getSyncJobErrors");
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
| **storeId** | **String**|  | |
| **jobId** | **String**|  | |
| **page** | **Integer**|  | [optional] [default to 1] |
| **perPage** | **Integer**|  | [optional] [default to 50] |

### Return type

[**GetSyncJobErrors200Response**](GetSyncJobErrors200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sync job errors |  -  |
| **404** | Resource not found |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listStores"></a>
# **listStores**
> ListStores200Response listStores(status)

List store connections

List all store connections for the authenticated account. Optionally filter by status.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.StoreConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StoreConnectionsApi apiInstance = new StoreConnectionsApi(defaultClient);
    String status = "active"; // String | Filter by connection status
    try {
      ListStores200Response result = apiInstance.listStores(status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoreConnectionsApi#listStores");
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
| **status** | **String**| Filter by connection status | [optional] [enum: active, disconnected, pending, error] |

### Return type

[**ListStores200Response**](ListStores200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of store connections |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listSyncJobs"></a>
# **listSyncJobs**
> ListSyncJobs200Response listSyncJobs(storeId, page, perPage)

List sync jobs

List sync job history for a store.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.StoreConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StoreConnectionsApi apiInstance = new StoreConnectionsApi(defaultClient);
    String storeId = "storeId_example"; // String | 
    Integer page = 1; // Integer | 
    Integer perPage = 20; // Integer | 
    try {
      ListSyncJobs200Response result = apiInstance.listSyncJobs(storeId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoreConnectionsApi#listSyncJobs");
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
| **storeId** | **String**|  | |
| **page** | **Integer**|  | [optional] [default to 1] |
| **perPage** | **Integer**|  | [optional] [default to 20] |

### Return type

[**ListSyncJobs200Response**](ListSyncJobs200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of sync jobs |  -  |
| **404** | Resource not found |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="triggerSync"></a>
# **triggerSync**
> SyncResponse triggerSync(storeId, idempotencyKey)

Trigger product sync

Trigger a manual product sync for a store. Supports idempotency via the Idempotency-Key header (5 minute TTL).

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.StoreConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StoreConnectionsApi apiInstance = new StoreConnectionsApi(defaultClient);
    String storeId = "storeId_example"; // String | 
    String idempotencyKey = "idempotencyKey_example"; // String | Idempotency key to prevent duplicate syncs (5 min TTL)
    try {
      SyncResponse result = apiInstance.triggerSync(storeId, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoreConnectionsApi#triggerSync");
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
| **storeId** | **String**|  | |
| **idempotencyKey** | **String**| Idempotency key to prevent duplicate syncs (5 min TTL) | [optional] |

### Return type

[**SyncResponse**](SyncResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sync scheduled |  -  |
| **400** | Bad request |  -  |
| **404** | Resource not found |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="updateStore"></a>
# **updateStore**
> CreateStore201Response updateStore(storeId, updateStoreRequest)

Update a store connection

Update store settings such as name, sync interval, or credentials.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.StoreConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StoreConnectionsApi apiInstance = new StoreConnectionsApi(defaultClient);
    String storeId = "storeId_example"; // String | 
    UpdateStoreRequest updateStoreRequest = new UpdateStoreRequest(); // UpdateStoreRequest | 
    try {
      CreateStore201Response result = apiInstance.updateStore(storeId, updateStoreRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoreConnectionsApi#updateStore");
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
| **storeId** | **String**|  | |
| **updateStoreRequest** | [**UpdateStoreRequest**](UpdateStoreRequest.md)|  | |

### Return type

[**CreateStore201Response**](CreateStore201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Store connection updated |  -  |
| **404** | Resource not found |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

