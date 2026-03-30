# TemplateVersionsApi

All URIs are relative to *https://api.mailodds.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**canaryTemplateVersion**](TemplateVersionsApi.md#canaryTemplateVersion) | **POST** /v1/campaigns/{campaign_id}/template-versions/{version_id}/canary | Start canary deployment |
| [**createTemplateVersion**](TemplateVersionsApi.md#createTemplateVersion) | **POST** /v1/campaigns/{campaign_id}/template-versions | Create a template version |
| [**getTemplateVersion**](TemplateVersionsApi.md#getTemplateVersion) | **GET** /v1/campaigns/{campaign_id}/template-versions/{version_id} | Get a template version |
| [**listTemplateVersions**](TemplateVersionsApi.md#listTemplateVersions) | **GET** /v1/campaigns/{campaign_id}/template-versions | List template versions |
| [**promoteTemplateVersion**](TemplateVersionsApi.md#promoteTemplateVersion) | **POST** /v1/campaigns/{campaign_id}/template-versions/{version_id}/promote | Promote a template version |
| [**rollbackTemplateVersion**](TemplateVersionsApi.md#rollbackTemplateVersion) | **POST** /v1/campaigns/{campaign_id}/template-versions/rollback | Rollback template version |
| [**updateTemplateVersion**](TemplateVersionsApi.md#updateTemplateVersion) | **PUT** /v1/campaigns/{campaign_id}/template-versions/{version_id} | Update a template version |


<a id="canaryTemplateVersion"></a>
# **canaryTemplateVersion**
> canaryTemplateVersion(campaignId, versionId)

Start canary deployment

Start a canary deployment for a template version with a specified traffic percentage.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.TemplateVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TemplateVersionsApi apiInstance = new TemplateVersionsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | 
    String versionId = "versionId_example"; // String | 
    try {
      apiInstance.canaryTemplateVersion(campaignId, versionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#canaryTemplateVersion");
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
| **campaignId** | **String**|  | |
| **versionId** | **String**|  | |

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
| **200** | Start canary deployment |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="createTemplateVersion"></a>
# **createTemplateVersion**
> createTemplateVersion(campaignId)

Create a template version

Create a new template version for a campaign.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.TemplateVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TemplateVersionsApi apiInstance = new TemplateVersionsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | 
    try {
      apiInstance.createTemplateVersion(campaignId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#createTemplateVersion");
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
| **campaignId** | **String**|  | |

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
| **201** | Create a template version |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getTemplateVersion"></a>
# **getTemplateVersion**
> getTemplateVersion(campaignId, versionId)

Get a template version

Retrieve a specific template version by ID.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.TemplateVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TemplateVersionsApi apiInstance = new TemplateVersionsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | 
    String versionId = "versionId_example"; // String | 
    try {
      apiInstance.getTemplateVersion(campaignId, versionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#getTemplateVersion");
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
| **campaignId** | **String**|  | |
| **versionId** | **String**|  | |

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
| **200** | Get a template version |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listTemplateVersions"></a>
# **listTemplateVersions**
> listTemplateVersions(campaignId)

List template versions

List all template versions for a campaign.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.TemplateVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TemplateVersionsApi apiInstance = new TemplateVersionsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | 
    try {
      apiInstance.listTemplateVersions(campaignId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#listTemplateVersions");
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
| **campaignId** | **String**|  | |

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
| **200** | List template versions |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="promoteTemplateVersion"></a>
# **promoteTemplateVersion**
> promoteTemplateVersion(campaignId, versionId)

Promote a template version

Promote a template version to active for the campaign.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.TemplateVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TemplateVersionsApi apiInstance = new TemplateVersionsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | 
    String versionId = "versionId_example"; // String | 
    try {
      apiInstance.promoteTemplateVersion(campaignId, versionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#promoteTemplateVersion");
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
| **campaignId** | **String**|  | |
| **versionId** | **String**|  | |

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
| **200** | Promote a template version |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="rollbackTemplateVersion"></a>
# **rollbackTemplateVersion**
> rollbackTemplateVersion(campaignId)

Rollback template version

Rollback the canary deployment and revert to the previous active version.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.TemplateVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TemplateVersionsApi apiInstance = new TemplateVersionsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | 
    try {
      apiInstance.rollbackTemplateVersion(campaignId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#rollbackTemplateVersion");
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
| **campaignId** | **String**|  | |

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
| **200** | Rollback template version |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="updateTemplateVersion"></a>
# **updateTemplateVersion**
> updateTemplateVersion(campaignId, versionId)

Update a template version

Update an existing template version.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.TemplateVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TemplateVersionsApi apiInstance = new TemplateVersionsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | 
    String versionId = "versionId_example"; // String | 
    try {
      apiInstance.updateTemplateVersion(campaignId, versionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#updateTemplateVersion");
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
| **campaignId** | **String**|  | |
| **versionId** | **String**|  | |

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
| **200** | Update a template version |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

