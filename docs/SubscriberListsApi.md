# SubscriberListsApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**confirmSubscription**](SubscriberListsApi.md#confirmSubscription) | **GET** /v1/confirm/{token} | Confirm subscription |
| [**createList**](SubscriberListsApi.md#createList) | **POST** /v1/lists | Create a subscriber list |
| [**deleteList**](SubscriberListsApi.md#deleteList) | **DELETE** /v1/lists/{list_id} | Delete a subscriber list |
| [**getList**](SubscriberListsApi.md#getList) | **GET** /v1/lists/{list_id} | Get a subscriber list |
| [**getLists**](SubscriberListsApi.md#getLists) | **GET** /v1/lists | List subscriber lists |
| [**getSubscribers**](SubscriberListsApi.md#getSubscribers) | **GET** /v1/lists/{list_id}/subscribers | List subscribers |
| [**subscribe**](SubscriberListsApi.md#subscribe) | **POST** /v1/subscribe/{list_id} | Subscribe to a list |
| [**unsubscribeSubscriber**](SubscriberListsApi.md#unsubscribeSubscriber) | **DELETE** /v1/lists/{list_id}/subscribers/{subscriber_id} | Unsubscribe a subscriber |


<a id="confirmSubscription"></a>
# **confirmSubscription**
> ConfirmSubscription200Response confirmSubscription(token)

Confirm subscription

Confirm a pending subscription via the token sent in the confirmation email. No authentication required. Redirects to the list&#39;s configured redirect URL if set, otherwise returns JSON. Tokens expire after 72 hours.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.models.*;
import com.mailodds.api.SubscriberListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");

    SubscriberListsApi apiInstance = new SubscriberListsApi(defaultClient);
    String token = "token_example"; // String | Confirmation token from email
    try {
      ConfirmSubscription200Response result = apiInstance.confirmSubscription(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberListsApi#confirmSubscription");
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
| **token** | **String**| Confirmation token from email | |

### Return type

[**ConfirmSubscription200Response**](ConfirmSubscription200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscription confirmed |  -  |
| **302** | Redirect to configured confirmation URL |  -  |
| **400** | Bad request |  -  |
| **404** | Resource not found |  -  |

<a id="createList"></a>
# **createList**
> CreateList201Response createList(createListRequest)

Create a subscriber list

Create a new subscriber list. Use lists to organize subscribers and manage double opt-in confirmation flows.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SubscriberListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SubscriberListsApi apiInstance = new SubscriberListsApi(defaultClient);
    CreateListRequest createListRequest = new CreateListRequest(); // CreateListRequest | 
    try {
      CreateList201Response result = apiInstance.createList(createListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberListsApi#createList");
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
| **createListRequest** | [**CreateListRequest**](CreateListRequest.md)|  | |

### Return type

[**CreateList201Response**](CreateList201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | List created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

<a id="deleteList"></a>
# **deleteList**
> DeletePolicyRule200Response deleteList(listId)

Delete a subscriber list

Soft-delete a subscriber list. Existing subscribers are retained but the list is no longer usable.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SubscriberListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SubscriberListsApi apiInstance = new SubscriberListsApi(defaultClient);
    String listId = "listId_example"; // String | List UUID
    try {
      DeletePolicyRule200Response result = apiInstance.deleteList(listId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberListsApi#deleteList");
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
| **listId** | **String**| List UUID | |

### Return type

[**DeletePolicyRule200Response**](DeletePolicyRule200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List deleted |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="getList"></a>
# **getList**
> CreateList201Response getList(listId)

Get a subscriber list

Get details of a specific subscriber list including subscriber and confirmed counts.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SubscriberListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SubscriberListsApi apiInstance = new SubscriberListsApi(defaultClient);
    String listId = "listId_example"; // String | List UUID
    try {
      CreateList201Response result = apiInstance.getList(listId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberListsApi#getList");
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
| **listId** | **String**| List UUID | |

### Return type

[**CreateList201Response**](CreateList201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscriber list details |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="getLists"></a>
# **getLists**
> GetLists200Response getLists(page, perPage)

List subscriber lists

List all subscriber lists for the authenticated account with pagination.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SubscriberListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SubscriberListsApi apiInstance = new SubscriberListsApi(defaultClient);
    Integer page = 1; // Integer | Page number
    Integer perPage = 25; // Integer | Items per page
    try {
      GetLists200Response result = apiInstance.getLists(page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberListsApi#getLists");
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
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Items per page | [optional] [default to 25] |

### Return type

[**GetLists200Response**](GetLists200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of subscriber lists |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getSubscribers"></a>
# **getSubscribers**
> GetSubscribers200Response getSubscribers(listId, page, perPage, status)

List subscribers

List paginated subscribers for a specific list. Optionally filter by status.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SubscriberListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SubscriberListsApi apiInstance = new SubscriberListsApi(defaultClient);
    String listId = "listId_example"; // String | List UUID
    Integer page = 1; // Integer | Page number
    Integer perPage = 50; // Integer | Items per page
    String status = "pending"; // String | Filter by subscriber status
    try {
      GetSubscribers200Response result = apiInstance.getSubscribers(listId, page, perPage, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberListsApi#getSubscribers");
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
| **listId** | **String**| List UUID | |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Items per page | [optional] [default to 50] |
| **status** | **String**| Filter by subscriber status | [optional] [enum: pending, confirmed, unsubscribed, bounced] |

### Return type

[**GetSubscribers200Response**](GetSubscribers200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of subscribers |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="subscribe"></a>
# **subscribe**
> UnsubscribeSubscriber200Response subscribe(listId, subscribeRequest)

Subscribe to a list

Add a subscriber to a list and initiate the double opt-in confirmation flow. The subscriber receives a confirmation email and must click the link to confirm. Rate limited to 10 requests/min per IP and 1000/hour per account.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SubscriberListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SubscriberListsApi apiInstance = new SubscriberListsApi(defaultClient);
    String listId = "listId_example"; // String | List UUID
    SubscribeRequest subscribeRequest = new SubscribeRequest(); // SubscribeRequest | 
    try {
      UnsubscribeSubscriber200Response result = apiInstance.subscribe(listId, subscribeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberListsApi#subscribe");
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
| **listId** | **String**| List UUID | |
| **subscribeRequest** | [**SubscribeRequest**](SubscribeRequest.md)|  | |

### Return type

[**UnsubscribeSubscriber200Response**](UnsubscribeSubscriber200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Subscriber created (pending confirmation) |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **422** | Invalid email address |  -  |
| **429** | Rate limit exceeded |  -  |

<a id="unsubscribeSubscriber"></a>
# **unsubscribeSubscriber**
> UnsubscribeSubscriber200Response unsubscribeSubscriber(listId, subscriberId)

Unsubscribe a subscriber

Set a subscriber&#39;s status to unsubscribed. The consent record is retained for compliance.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.SubscriberListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SubscriberListsApi apiInstance = new SubscriberListsApi(defaultClient);
    String listId = "listId_example"; // String | List UUID
    String subscriberId = "subscriberId_example"; // String | Subscriber UUID
    try {
      UnsubscribeSubscriber200Response result = apiInstance.unsubscribeSubscriber(listId, subscriberId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberListsApi#unsubscribeSubscriber");
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
| **listId** | **String**| List UUID | |
| **subscriberId** | **String**| Subscriber UUID | |

### Return type

[**UnsubscribeSubscriber200Response**](UnsubscribeSubscriber200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscriber unsubscribed |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

