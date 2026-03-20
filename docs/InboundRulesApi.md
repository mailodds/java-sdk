# InboundRulesApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInboundRule**](InboundRulesApi.md#createInboundRule) | **POST** /v1/sending-domains/{domain_id}/inbound-rules | Create an inbound rule |
| [**deleteInboundRule**](InboundRulesApi.md#deleteInboundRule) | **DELETE** /v1/sending-domains/{domain_id}/inbound-rules/{rule_id} | Delete an inbound rule |
| [**dryRunInboundRules**](InboundRulesApi.md#dryRunInboundRules) | **POST** /v1/sending-domains/{domain_id}/inbound-rules/dry-run | Dry-run inbound rules |
| [**getInboundRule**](InboundRulesApi.md#getInboundRule) | **GET** /v1/sending-domains/{domain_id}/inbound-rules/{rule_id} | Get an inbound rule |
| [**listInboundRules**](InboundRulesApi.md#listInboundRules) | **GET** /v1/sending-domains/{domain_id}/inbound-rules | List inbound rules |
| [**updateInboundRule**](InboundRulesApi.md#updateInboundRule) | **PUT** /v1/sending-domains/{domain_id}/inbound-rules/{rule_id} | Update an inbound rule |


<a id="createInboundRule"></a>
# **createInboundRule**
> createInboundRule(domainId)

Create an inbound rule

Create an inbound routing rule for a sending domain.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.InboundRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InboundRulesApi apiInstance = new InboundRulesApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      apiInstance.createInboundRule(domainId);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRulesApi#createInboundRule");
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
| **domainId** | **String**|  | |

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
| **201** | Create an inbound rule |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="deleteInboundRule"></a>
# **deleteInboundRule**
> deleteInboundRule(domainId, ruleId)

Delete an inbound rule

Delete an inbound routing rule.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.InboundRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InboundRulesApi apiInstance = new InboundRulesApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    String ruleId = "ruleId_example"; // String | 
    try {
      apiInstance.deleteInboundRule(domainId, ruleId);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRulesApi#deleteInboundRule");
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
| **domainId** | **String**|  | |
| **ruleId** | **String**|  | |

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
| **200** | Delete an inbound rule |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="dryRunInboundRules"></a>
# **dryRunInboundRules**
> dryRunInboundRules(domainId)

Dry-run inbound rules

Evaluate inbound rules against a test message without side effects.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.InboundRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InboundRulesApi apiInstance = new InboundRulesApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      apiInstance.dryRunInboundRules(domainId);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRulesApi#dryRunInboundRules");
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
| **domainId** | **String**|  | |

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
| **200** | Dry-run inbound rules |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getInboundRule"></a>
# **getInboundRule**
> getInboundRule(domainId, ruleId)

Get an inbound rule

Retrieve a specific inbound routing rule by ID.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.InboundRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InboundRulesApi apiInstance = new InboundRulesApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    String ruleId = "ruleId_example"; // String | 
    try {
      apiInstance.getInboundRule(domainId, ruleId);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRulesApi#getInboundRule");
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
| **domainId** | **String**|  | |
| **ruleId** | **String**|  | |

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
| **200** | Get an inbound rule |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listInboundRules"></a>
# **listInboundRules**
> listInboundRules(domainId)

List inbound rules

List all inbound routing rules for a sending domain.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.InboundRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InboundRulesApi apiInstance = new InboundRulesApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    try {
      apiInstance.listInboundRules(domainId);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRulesApi#listInboundRules");
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
| **domainId** | **String**|  | |

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
| **200** | List inbound rules |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="updateInboundRule"></a>
# **updateInboundRule**
> updateInboundRule(domainId, ruleId)

Update an inbound rule

Update an existing inbound routing rule.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.InboundRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InboundRulesApi apiInstance = new InboundRulesApi(defaultClient);
    String domainId = "domainId_example"; // String | 
    String ruleId = "ruleId_example"; // String | 
    try {
      apiInstance.updateInboundRule(domainId, ruleId);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRulesApi#updateInboundRule");
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
| **domainId** | **String**|  | |
| **ruleId** | **String**|  | |

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
| **200** | Update an inbound rule |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

