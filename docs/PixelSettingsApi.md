# PixelSettingsApi

All URIs are relative to *https://api.mailodds.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPixelSettings**](PixelSettingsApi.md#getPixelSettings) | **GET** /v1/pixel-settings | Get pixel settings |
| [**updatePixelSettings**](PixelSettingsApi.md#updatePixelSettings) | **PATCH** /v1/pixel-settings | Update pixel settings |


<a id="getPixelSettings"></a>
# **getPixelSettings**
> GetPixelSettings200Response getPixelSettings()

Get pixel settings

Get the web pixel tracking configuration.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.PixelSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PixelSettingsApi apiInstance = new PixelSettingsApi(defaultClient);
    try {
      GetPixelSettings200Response result = apiInstance.getPixelSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PixelSettingsApi#getPixelSettings");
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

[**GetPixelSettings200Response**](GetPixelSettings200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pixel settings |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="updatePixelSettings"></a>
# **updatePixelSettings**
> GetPixelSettings200Response updatePixelSettings(updatePixelSettingsRequest)

Update pixel settings

Update the web pixel subscribe list configuration.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.PixelSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PixelSettingsApi apiInstance = new PixelSettingsApi(defaultClient);
    UpdatePixelSettingsRequest updatePixelSettingsRequest = new UpdatePixelSettingsRequest(); // UpdatePixelSettingsRequest | 
    try {
      GetPixelSettings200Response result = apiInstance.updatePixelSettings(updatePixelSettingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PixelSettingsApi#updatePixelSettings");
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
| **updatePixelSettingsRequest** | [**UpdatePixelSettingsRequest**](UpdatePixelSettingsRequest.md)|  | |

### Return type

[**GetPixelSettings200Response**](GetPixelSettings200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pixel settings updated |  -  |
| **404** | Resource not found |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

