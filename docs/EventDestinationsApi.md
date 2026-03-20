# EventDestinationsApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEventDestination**](EventDestinationsApi.md#createEventDestination) | **POST** /v1/event-destinations | Create an event destination |
| [**deleteEventDestination**](EventDestinationsApi.md#deleteEventDestination) | **DELETE** /v1/event-destinations/{destination_id} | Delete an event destination |
| [**getEventDestination**](EventDestinationsApi.md#getEventDestination) | **GET** /v1/event-destinations/{destination_id} | Get an event destination |
| [**listEventDestinationTemplates**](EventDestinationsApi.md#listEventDestinationTemplates) | **GET** /v1/event-destinations/templates | List event destination templates |
| [**listEventDestinations**](EventDestinationsApi.md#listEventDestinations) | **GET** /v1/event-destinations | List event destinations |
| [**listEventSchemas**](EventDestinationsApi.md#listEventSchemas) | **GET** /v1/event-destinations/schemas | List event schemas |
| [**updateEventDestination**](EventDestinationsApi.md#updateEventDestination) | **PUT** /v1/event-destinations/{destination_id} | Update an event destination |


<a id="createEventDestination"></a>
# **createEventDestination**
> createEventDestination()

Create an event destination

Create a new event destination for receiving webhook callbacks.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.EventDestinationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EventDestinationsApi apiInstance = new EventDestinationsApi(defaultClient);
    try {
      apiInstance.createEventDestination();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventDestinationsApi#createEventDestination");
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
| **201** | Create an event destination |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="deleteEventDestination"></a>
# **deleteEventDestination**
> deleteEventDestination(destinationId)

Delete an event destination

Delete an event destination.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.EventDestinationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EventDestinationsApi apiInstance = new EventDestinationsApi(defaultClient);
    Integer destinationId = 56; // Integer | 
    try {
      apiInstance.deleteEventDestination(destinationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventDestinationsApi#deleteEventDestination");
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
| **destinationId** | **Integer**|  | |

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
| **200** | Delete an event destination |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getEventDestination"></a>
# **getEventDestination**
> getEventDestination(destinationId)

Get an event destination

Retrieve a single event destination by ID.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.EventDestinationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EventDestinationsApi apiInstance = new EventDestinationsApi(defaultClient);
    Integer destinationId = 56; // Integer | 
    try {
      apiInstance.getEventDestination(destinationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventDestinationsApi#getEventDestination");
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
| **destinationId** | **Integer**|  | |

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
| **200** | Get an event destination |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listEventDestinationTemplates"></a>
# **listEventDestinationTemplates**
> listEventDestinationTemplates()

List event destination templates

List pre-built payload templates for event destinations.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.EventDestinationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EventDestinationsApi apiInstance = new EventDestinationsApi(defaultClient);
    try {
      apiInstance.listEventDestinationTemplates();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventDestinationsApi#listEventDestinationTemplates");
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
| **200** | List event destination templates |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listEventDestinations"></a>
# **listEventDestinations**
> listEventDestinations()

List event destinations

List all event destinations for the account.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.EventDestinationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EventDestinationsApi apiInstance = new EventDestinationsApi(defaultClient);
    try {
      apiInstance.listEventDestinations();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventDestinationsApi#listEventDestinations");
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
| **200** | List event destinations |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listEventSchemas"></a>
# **listEventSchemas**
> listEventSchemas()

List event schemas

List JSON schemas for each event type.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.EventDestinationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EventDestinationsApi apiInstance = new EventDestinationsApi(defaultClient);
    try {
      apiInstance.listEventSchemas();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventDestinationsApi#listEventSchemas");
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
| **200** | List event schemas |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="updateEventDestination"></a>
# **updateEventDestination**
> updateEventDestination(destinationId)

Update an event destination

Update an existing event destination.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.EventDestinationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EventDestinationsApi apiInstance = new EventDestinationsApi(defaultClient);
    Integer destinationId = 56; // Integer | 
    try {
      apiInstance.updateEventDestination(destinationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventDestinationsApi#updateEventDestination");
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
| **destinationId** | **Integer**|  | |

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
| **200** | Update an event destination |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

