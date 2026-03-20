# GlobalSuppressionsApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGlobalSuppressionOverride**](GlobalSuppressionsApi.md#addGlobalSuppressionOverride) | **POST** /v1/global-suppressions/overrides | Add global suppression override |
| [**checkGlobalSuppression**](GlobalSuppressionsApi.md#checkGlobalSuppression) | **GET** /v1/global-suppressions/check | Check global suppression |
| [**removeGlobalSuppressionOverride**](GlobalSuppressionsApi.md#removeGlobalSuppressionOverride) | **DELETE** /v1/global-suppressions/overrides | Remove global suppression override |


<a id="addGlobalSuppressionOverride"></a>
# **addGlobalSuppressionOverride**
> addGlobalSuppressionOverride()

Add global suppression override

Add an override to allow sending to a globally suppressed email address.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.GlobalSuppressionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GlobalSuppressionsApi apiInstance = new GlobalSuppressionsApi(defaultClient);
    try {
      apiInstance.addGlobalSuppressionOverride();
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalSuppressionsApi#addGlobalSuppressionOverride");
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
| **201** | Add global suppression override |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="checkGlobalSuppression"></a>
# **checkGlobalSuppression**
> checkGlobalSuppression()

Check global suppression

Check if an email address is globally suppressed.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.GlobalSuppressionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GlobalSuppressionsApi apiInstance = new GlobalSuppressionsApi(defaultClient);
    try {
      apiInstance.checkGlobalSuppression();
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalSuppressionsApi#checkGlobalSuppression");
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
| **200** | Check global suppression |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="removeGlobalSuppressionOverride"></a>
# **removeGlobalSuppressionOverride**
> removeGlobalSuppressionOverride()

Remove global suppression override

Remove an override for a globally suppressed email address.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.GlobalSuppressionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GlobalSuppressionsApi apiInstance = new GlobalSuppressionsApi(defaultClient);
    try {
      apiInstance.removeGlobalSuppressionOverride();
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalSuppressionsApi#removeGlobalSuppressionOverride");
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
| **200** | Remove global suppression override |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

