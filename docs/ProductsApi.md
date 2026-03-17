# ProductsApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchProducts**](ProductsApi.md#batchProducts) | **POST** /v1/stores/{store_id}/products/batch | Batch push products |
| [**bulkUpdateProducts**](ProductsApi.md#bulkUpdateProducts) | **PATCH** /v1/store-products/bulk | Bulk update products |
| [**getProduct**](ProductsApi.md#getProduct) | **GET** /v1/store-products/{product_id} | Get a product |
| [**queryProducts**](ProductsApi.md#queryProducts) | **GET** /v1/store-products | Query products |


<a id="batchProducts"></a>
# **batchProducts**
> BatchProductsResponse batchProducts(storeId, batchProductsRequest)

Batch push products

Push up to 100 products to a custom platform store. Creates new products or updates existing ones matched by external_id. Only available for stores with platform&#x3D;custom.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String storeId = "storeId_example"; // String | Store connection UUID
    BatchProductsRequest batchProductsRequest = new BatchProductsRequest(); // BatchProductsRequest | 
    try {
      BatchProductsResponse result = apiInstance.batchProducts(storeId, batchProductsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#batchProducts");
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
| **storeId** | **String**| Store connection UUID | |
| **batchProductsRequest** | [**BatchProductsRequest**](BatchProductsRequest.md)|  | |

### Return type

[**BatchProductsResponse**](BatchProductsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch results |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="bulkUpdateProducts"></a>
# **bulkUpdateProducts**
> BulkUpdateProducts200Response bulkUpdateProducts(bulkUpdateProductsRequest)

Bulk update products

Bulk update product visibility. Maximum 500 products per request.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    BulkUpdateProductsRequest bulkUpdateProductsRequest = new BulkUpdateProductsRequest(); // BulkUpdateProductsRequest | 
    try {
      BulkUpdateProducts200Response result = apiInstance.bulkUpdateProducts(bulkUpdateProductsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#bulkUpdateProducts");
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
| **bulkUpdateProductsRequest** | [**BulkUpdateProductsRequest**](BulkUpdateProductsRequest.md)|  | |

### Return type

[**BulkUpdateProducts200Response**](BulkUpdateProducts200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bulk update result |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getProduct"></a>
# **getProduct**
> GetProduct200Response getProduct(productId)

Get a product

Get detailed information about a specific product.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productId = "productId_example"; // String | Product UUID
    try {
      GetProduct200Response result = apiInstance.getProduct(productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getProduct");
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
| **productId** | **String**| Product UUID | |

### Return type

[**GetProduct200Response**](GetProduct200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Product details |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="queryProducts"></a>
# **queryProducts**
> QueryProducts200Response queryProducts(storeId, category, stockStatus, onSale, search, facets, groupBySku, page, perPage)

Query products

Search and filter products across all connected stores. Supports faceted search and cross-store SKU deduplication for unified inventory views.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String storeId = "storeId_example"; // String | Filter by store connection UUID
    String category = "category_example"; // String | Filter by category name
    String stockStatus = "in_stock"; // String | Filter by stock status
    Boolean onSale = true; // Boolean | Filter to products currently on sale
    String search = "search_example"; // String | Search by title or SKU
    Boolean facets = false; // Boolean | Include facet aggregations (categories, price ranges, stores)
    Boolean groupBySku = false; // Boolean | Merge products with same SKU across stores into unified entries
    Integer page = 1; // Integer | 
    Integer perPage = 20; // Integer | 
    try {
      QueryProducts200Response result = apiInstance.queryProducts(storeId, category, stockStatus, onSale, search, facets, groupBySku, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#queryProducts");
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
| **storeId** | **String**| Filter by store connection UUID | [optional] |
| **category** | **String**| Filter by category name | [optional] |
| **stockStatus** | **String**| Filter by stock status | [optional] [enum: in_stock, out_of_stock, on_backorder, preorder] |
| **onSale** | **Boolean**| Filter to products currently on sale | [optional] |
| **search** | **String**| Search by title or SKU | [optional] |
| **facets** | **Boolean**| Include facet aggregations (categories, price ranges, stores) | [optional] [default to false] |
| **groupBySku** | **Boolean**| Merge products with same SKU across stores into unified entries | [optional] [default to false] |
| **page** | **Integer**|  | [optional] [default to 1] |
| **perPage** | **Integer**|  | [optional] [default to 20] |

### Return type

[**QueryProducts200Response**](QueryProducts200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Product query results |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

