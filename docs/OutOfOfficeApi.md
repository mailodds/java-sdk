# OutOfOfficeApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchCheckOoo**](OutOfOfficeApi.md#batchCheckOoo) | **POST** /v1/out-of-office/batch-check | Batch check OOO status |
| [**deleteOooContact**](OutOfOfficeApi.md#deleteOooContact) | **DELETE** /v1/out-of-office/{email} | Delete OOO contact |
| [**getOooStatus**](OutOfOfficeApi.md#getOooStatus) | **GET** /v1/out-of-office/{email}/status | Get OOO status for email |
| [**listOooContacts**](OutOfOfficeApi.md#listOooContacts) | **GET** /v1/out-of-office | List out-of-office contacts |
| [**updateOooContact**](OutOfOfficeApi.md#updateOooContact) | **PATCH** /v1/out-of-office/{email} | Update OOO contact |


<a id="batchCheckOoo"></a>
# **batchCheckOoo**
> BatchCheckOoo200Response batchCheckOoo(batchCheckOooRequest)

Batch check OOO status

Check OOO status for up to 1000 email addresses at once. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.OutOfOfficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OutOfOfficeApi apiInstance = new OutOfOfficeApi(defaultClient);
    BatchCheckOooRequest batchCheckOooRequest = new BatchCheckOooRequest(); // BatchCheckOooRequest | 
    try {
      BatchCheckOoo200Response result = apiInstance.batchCheckOoo(batchCheckOooRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutOfOfficeApi#batchCheckOoo");
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
| **batchCheckOooRequest** | [**BatchCheckOooRequest**](BatchCheckOooRequest.md)|  | |

### Return type

[**BatchCheckOoo200Response**](BatchCheckOoo200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch OOO check results |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="deleteOooContact"></a>
# **deleteOooContact**
> DeleteOooContact200Response deleteOooContact(email)

Delete OOO contact

Clear out-of-office status for an email address. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.OutOfOfficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OutOfOfficeApi apiInstance = new OutOfOfficeApi(defaultClient);
    String email = "email_example"; // String | 
    try {
      DeleteOooContact200Response result = apiInstance.deleteOooContact(email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutOfOfficeApi#deleteOooContact");
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

[**DeleteOooContact200Response**](DeleteOooContact200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OOO status cleared |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **404** | Resource not found |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getOooStatus"></a>
# **getOooStatus**
> GetOooStatus200Response getOooStatus(email)

Get OOO status for email

Check if a specific email address is currently out-of-office. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.OutOfOfficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OutOfOfficeApi apiInstance = new OutOfOfficeApi(defaultClient);
    String email = "email_example"; // String | 
    try {
      GetOooStatus200Response result = apiInstance.getOooStatus(email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutOfOfficeApi#getOooStatus");
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

[**GetOooStatus200Response**](GetOooStatus200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OOO status |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listOooContacts"></a>
# **listOooContacts**
> ListOooContacts200Response listOooContacts(activeOnly, page, perPage)

List out-of-office contacts

List contacts detected as out-of-office. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.OutOfOfficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OutOfOfficeApi apiInstance = new OutOfOfficeApi(defaultClient);
    Boolean activeOnly = true; // Boolean | Only return currently active OOO contacts
    Integer page = 1; // Integer | 
    Integer perPage = 100; // Integer | 
    try {
      ListOooContacts200Response result = apiInstance.listOooContacts(activeOnly, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutOfOfficeApi#listOooContacts");
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
| **activeOnly** | **Boolean**| Only return currently active OOO contacts | [optional] [default to true] |
| **page** | **Integer**|  | [optional] [default to 1] |
| **perPage** | **Integer**|  | [optional] [default to 100] |

### Return type

[**ListOooContacts200Response**](ListOooContacts200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of OOO contacts |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="updateOooContact"></a>
# **updateOooContact**
> Object updateOooContact(email, updateOooContactRequest)

Update OOO contact

Manually set or clear out-of-office status for an email. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.OutOfOfficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OutOfOfficeApi apiInstance = new OutOfOfficeApi(defaultClient);
    String email = "email_example"; // String | 
    UpdateOooContactRequest updateOooContactRequest = new UpdateOooContactRequest(); // UpdateOooContactRequest | 
    try {
      Object result = apiInstance.updateOooContact(email, updateOooContactRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutOfOfficeApi#updateOooContact");
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
| **updateOooContactRequest** | [**UpdateOooContactRequest**](UpdateOooContactRequest.md)|  | |

### Return type

**Object**

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OOO contact updated |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

