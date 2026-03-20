# EngagementApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDisengagedContacts**](EngagementApi.md#getDisengagedContacts) | **GET** /v1/engagement/disengaged | List disengaged contacts |
| [**getEngagementScore**](EngagementApi.md#getEngagementScore) | **GET** /v1/engagement/score/{email} | Get engagement score |
| [**getEngagementSummary**](EngagementApi.md#getEngagementSummary) | **GET** /v1/engagement/summary | Get engagement summary |
| [**suppressDisengaged**](EngagementApi.md#suppressDisengaged) | **POST** /v1/engagement/suppress-disengaged | Suppress disengaged contacts |


<a id="getDisengagedContacts"></a>
# **getDisengagedContacts**
> GetDisengagedContacts200Response getDisengagedContacts(inactiveDays, minSends, domainId, page, perPage)

List disengaged contacts

List contacts that have not engaged within the specified period. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.EngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EngagementApi apiInstance = new EngagementApi(defaultClient);
    Integer inactiveDays = 90; // Integer | Days of inactivity
    Integer minSends = 5; // Integer | Minimum emails sent to qualify
    String domainId = "domainId_example"; // String | Filter by sending domain ID
    Integer page = 1; // Integer | 
    Integer perPage = 100; // Integer | 
    try {
      GetDisengagedContacts200Response result = apiInstance.getDisengagedContacts(inactiveDays, minSends, domainId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EngagementApi#getDisengagedContacts");
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
| **inactiveDays** | **Integer**| Days of inactivity | [optional] [default to 90] |
| **minSends** | **Integer**| Minimum emails sent to qualify | [optional] [default to 5] |
| **domainId** | **String**| Filter by sending domain ID | [optional] |
| **page** | **Integer**|  | [optional] [default to 1] |
| **perPage** | **Integer**|  | [optional] [default to 100] |

### Return type

[**GetDisengagedContacts200Response**](GetDisengagedContacts200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of disengaged contacts |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getEngagementScore"></a>
# **getEngagementScore**
> GetEngagementScore200Response getEngagementScore(email)

Get engagement score

Get the engagement score for a specific email address. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.EngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EngagementApi apiInstance = new EngagementApi(defaultClient);
    String email = "email_example"; // String | 
    try {
      GetEngagementScore200Response result = apiInstance.getEngagementScore(email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EngagementApi#getEngagementScore");
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
| **email** | **String**|  | |

### Return type

[**GetEngagementScore200Response**](GetEngagementScore200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Engagement score |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getEngagementSummary"></a>
# **getEngagementSummary**
> GetBounceStatsSummary200Response getEngagementSummary(domainId)

Get engagement summary

Get aggregate engagement metrics across all contacts. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.EngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EngagementApi apiInstance = new EngagementApi(defaultClient);
    String domainId = "domainId_example"; // String | Filter by sending domain ID
    try {
      GetBounceStatsSummary200Response result = apiInstance.getEngagementSummary(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EngagementApi#getEngagementSummary");
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
| **domainId** | **String**| Filter by sending domain ID | [optional] |

### Return type

[**GetBounceStatsSummary200Response**](GetBounceStatsSummary200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Engagement summary |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="suppressDisengaged"></a>
# **suppressDisengaged**
> SuppressDisengaged200Response suppressDisengaged(suppressDisengagedRequest)

Suppress disengaged contacts

Add disengaged contacts to the suppression list. Supports dry_run mode. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.EngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EngagementApi apiInstance = new EngagementApi(defaultClient);
    SuppressDisengagedRequest suppressDisengagedRequest = new SuppressDisengagedRequest(); // SuppressDisengagedRequest | 
    try {
      SuppressDisengaged200Response result = apiInstance.suppressDisengaged(suppressDisengagedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EngagementApi#suppressDisengaged");
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
| **suppressDisengagedRequest** | [**SuppressDisengagedRequest**](SuppressDisengagedRequest.md)|  | |

### Return type

[**SuppressDisengaged200Response**](SuppressDisengaged200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Suppression result or dry-run preview |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

