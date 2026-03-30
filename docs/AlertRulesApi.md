# AlertRulesApi

All URIs are relative to *https://api.mailodds.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAlertRule**](AlertRulesApi.md#createAlertRule) | **POST** /v1/alert-rules | Create alert rule |
| [**deleteAlertRule**](AlertRulesApi.md#deleteAlertRule) | **DELETE** /v1/alert-rules/{rule_id} | Delete alert rule |
| [**getAlertRule**](AlertRulesApi.md#getAlertRule) | **GET** /v1/alert-rules/{rule_id} | Get alert rule |
| [**listAlertRules**](AlertRulesApi.md#listAlertRules) | **GET** /v1/alert-rules | List alert rules |
| [**updateAlertRule**](AlertRulesApi.md#updateAlertRule) | **PUT** /v1/alert-rules/{rule_id} | Update alert rule |


<a id="createAlertRule"></a>
# **createAlertRule**
> CreateAlertRule201Response createAlertRule(createAlertRuleRequest)

Create alert rule

Create a new metric threshold alert rule. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.AlertRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AlertRulesApi apiInstance = new AlertRulesApi(defaultClient);
    CreateAlertRuleRequest createAlertRuleRequest = new CreateAlertRuleRequest(); // CreateAlertRuleRequest | 
    try {
      CreateAlertRule201Response result = apiInstance.createAlertRule(createAlertRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertRulesApi#createAlertRule");
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
| **createAlertRuleRequest** | [**CreateAlertRuleRequest**](CreateAlertRuleRequest.md)|  | |

### Return type

[**CreateAlertRule201Response**](CreateAlertRule201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Alert rule created |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="deleteAlertRule"></a>
# **deleteAlertRule**
> DeletePolicyRule200Response deleteAlertRule(ruleId)

Delete alert rule

Delete an alert rule. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.AlertRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AlertRulesApi apiInstance = new AlertRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    try {
      DeletePolicyRule200Response result = apiInstance.deleteAlertRule(ruleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertRulesApi#deleteAlertRule");
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
| **ruleId** | **String**|  | |

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
| **200** | Alert rule deleted |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **404** | Resource not found |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getAlertRule"></a>
# **getAlertRule**
> CreateAlertRule201Response getAlertRule(ruleId)

Get alert rule

Get a single alert rule by ID. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.AlertRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AlertRulesApi apiInstance = new AlertRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    try {
      CreateAlertRule201Response result = apiInstance.getAlertRule(ruleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertRulesApi#getAlertRule");
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
| **ruleId** | **String**|  | |

### Return type

[**CreateAlertRule201Response**](CreateAlertRule201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Alert rule details |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **404** | Resource not found |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listAlertRules"></a>
# **listAlertRules**
> ListAlertRules200Response listAlertRules()

List alert rules

List all configured alert rules. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.AlertRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AlertRulesApi apiInstance = new AlertRulesApi(defaultClient);
    try {
      ListAlertRules200Response result = apiInstance.listAlertRules();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertRulesApi#listAlertRules");
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

[**ListAlertRules200Response**](ListAlertRules200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of alert rules |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="updateAlertRule"></a>
# **updateAlertRule**
> CreateAlertRule201Response updateAlertRule(ruleId, updateAlertRuleRequest)

Update alert rule

Update an existing alert rule. Requires Growth+ plan.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.AlertRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AlertRulesApi apiInstance = new AlertRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    UpdateAlertRuleRequest updateAlertRuleRequest = new UpdateAlertRuleRequest(); // UpdateAlertRuleRequest | 
    try {
      CreateAlertRule201Response result = apiInstance.updateAlertRule(ruleId, updateAlertRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertRulesApi#updateAlertRule");
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
| **ruleId** | **String**|  | |
| **updateAlertRuleRequest** | [**UpdateAlertRuleRequest**](UpdateAlertRuleRequest.md)|  | |

### Return type

[**CreateAlertRule201Response**](CreateAlertRule201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Alert rule updated |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |
| **404** | Resource not found |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

