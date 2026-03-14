# SpamChecksApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSpamCheck**](SpamChecksApi.md#getSpamCheck) | **GET** /v1/spam-checks/{check_id} | Get spam check |
| [**listSpamChecks**](SpamChecksApi.md#listSpamChecks) | **GET** /v1/spam-checks | List spam checks |
| [**runSpamCheck**](SpamChecksApi.md#runSpamCheck) | **POST** /v1/spam-checks | Run spam check |


<a id="getSpamCheck"></a>
# **getSpamCheck**
> RunSpamCheck201Response getSpamCheck(checkId)

Get spam check

Get the detailed result of a specific spam check. Currently available to beta accounts only.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SpamChecksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SpamChecksApi apiInstance = new SpamChecksApi(defaultClient);
    String checkId = "checkId_example"; // String | Spam check UUID
    try {
      RunSpamCheck201Response result = apiInstance.getSpamCheck(checkId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpamChecksApi#getSpamCheck");
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
| **checkId** | **String**| Spam check UUID | |

### Return type

[**RunSpamCheck201Response**](RunSpamCheck201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Spam check details |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Feature not available - beta access required |  -  |
| **404** | Resource not found |  -  |

<a id="listSpamChecks"></a>
# **listSpamChecks**
> ListSpamChecks200Response listSpamChecks(page, perPage)

List spam checks

List past spam check results with pagination. Currently available to beta accounts only.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SpamChecksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SpamChecksApi apiInstance = new SpamChecksApi(defaultClient);
    Integer page = 1; // Integer | 
    Integer perPage = 20; // Integer | 
    try {
      ListSpamChecks200Response result = apiInstance.listSpamChecks(page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpamChecksApi#listSpamChecks");
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
| **perPage** | **Integer**|  | [optional] [default to 20] |

### Return type

[**ListSpamChecks200Response**](ListSpamChecks200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of spam checks |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Feature not available - beta access required |  -  |

<a id="runSpamCheck"></a>
# **runSpamCheck**
> RunSpamCheck201Response runSpamCheck(runSpamCheckRequest)

Run spam check

Run backend spam checks on email sending parameters. Checks domain reputation, link safety, and subject line quality. Currently available to beta accounts only.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SpamChecksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SpamChecksApi apiInstance = new SpamChecksApi(defaultClient);
    RunSpamCheckRequest runSpamCheckRequest = new RunSpamCheckRequest(); // RunSpamCheckRequest | 
    try {
      RunSpamCheck201Response result = apiInstance.runSpamCheck(runSpamCheckRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpamChecksApi#runSpamCheck");
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
| **runSpamCheckRequest** | [**RunSpamCheckRequest**](RunSpamCheckRequest.md)|  | |

### Return type

[**RunSpamCheck201Response**](RunSpamCheck201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Spam check result |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Feature not available - beta access required |  -  |

