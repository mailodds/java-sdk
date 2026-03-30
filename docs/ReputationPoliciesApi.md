# ReputationPoliciesApi

All URIs are relative to *https://api.mailodds.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReputationPolicy**](ReputationPoliciesApi.md#createReputationPolicy) | **POST** /v1/reputation-policies | Create a reputation policy |
| [**createReputationPolicyFromPreset**](ReputationPoliciesApi.md#createReputationPolicyFromPreset) | **POST** /v1/reputation-policies/from-preset | Create a reputation policy from preset |
| [**deleteReputationPolicy**](ReputationPoliciesApi.md#deleteReputationPolicy) | **DELETE** /v1/reputation-policies/{policy_id} | Delete a reputation policy |
| [**getReputationPolicy**](ReputationPoliciesApi.md#getReputationPolicy) | **GET** /v1/reputation-policies/{policy_id} | Get a reputation policy |
| [**getReputationPolicyStatus**](ReputationPoliciesApi.md#getReputationPolicyStatus) | **GET** /v1/reputation-policies/{policy_id}/status | Get reputation policy status |
| [**listReputationPolicies**](ReputationPoliciesApi.md#listReputationPolicies) | **GET** /v1/reputation-policies | List reputation policies |
| [**testReputationPolicy**](ReputationPoliciesApi.md#testReputationPolicy) | **POST** /v1/reputation-policies/{policy_id}/test | Test a reputation policy |
| [**updateReputationPolicy**](ReputationPoliciesApi.md#updateReputationPolicy) | **PUT** /v1/reputation-policies/{policy_id} | Update a reputation policy |


<a id="createReputationPolicy"></a>
# **createReputationPolicy**
> createReputationPolicy()

Create a reputation policy

Create a new reputation policy with custom rules and thresholds.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ReputationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ReputationPoliciesApi apiInstance = new ReputationPoliciesApi(defaultClient);
    try {
      apiInstance.createReputationPolicy();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReputationPoliciesApi#createReputationPolicy");
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
| **201** | Create a reputation policy |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="createReputationPolicyFromPreset"></a>
# **createReputationPolicyFromPreset**
> createReputationPolicyFromPreset()

Create a reputation policy from preset

Create a reputation policy from a predefined preset template.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ReputationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ReputationPoliciesApi apiInstance = new ReputationPoliciesApi(defaultClient);
    try {
      apiInstance.createReputationPolicyFromPreset();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReputationPoliciesApi#createReputationPolicyFromPreset");
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
| **201** | Create a reputation policy from preset |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="deleteReputationPolicy"></a>
# **deleteReputationPolicy**
> deleteReputationPolicy(policyId)

Delete a reputation policy

Soft-delete a reputation policy.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ReputationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ReputationPoliciesApi apiInstance = new ReputationPoliciesApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    try {
      apiInstance.deleteReputationPolicy(policyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReputationPoliciesApi#deleteReputationPolicy");
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
| **policyId** | **String**|  | |

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
| **200** | Delete a reputation policy |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getReputationPolicy"></a>
# **getReputationPolicy**
> getReputationPolicy(policyId)

Get a reputation policy

Retrieve a single reputation policy by ID.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ReputationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ReputationPoliciesApi apiInstance = new ReputationPoliciesApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    try {
      apiInstance.getReputationPolicy(policyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReputationPoliciesApi#getReputationPolicy");
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
| **policyId** | **String**|  | |

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
| **200** | Get a reputation policy |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="getReputationPolicyStatus"></a>
# **getReputationPolicyStatus**
> getReputationPolicyStatus(policyId)

Get reputation policy status

Evaluate a policy and return per-domain status results.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ReputationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ReputationPoliciesApi apiInstance = new ReputationPoliciesApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    try {
      apiInstance.getReputationPolicyStatus(policyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReputationPoliciesApi#getReputationPolicyStatus");
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
| **policyId** | **String**|  | |

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
| **200** | Get reputation policy status |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listReputationPolicies"></a>
# **listReputationPolicies**
> listReputationPolicies()

List reputation policies

List all reputation policies for the account.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ReputationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ReputationPoliciesApi apiInstance = new ReputationPoliciesApi(defaultClient);
    try {
      apiInstance.listReputationPolicies();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReputationPoliciesApi#listReputationPolicies");
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
| **200** | List reputation policies |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="testReputationPolicy"></a>
# **testReputationPolicy**
> testReputationPolicy(policyId)

Test a reputation policy

Dry-run evaluation of a reputation policy without applying actions.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ReputationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ReputationPoliciesApi apiInstance = new ReputationPoliciesApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    try {
      apiInstance.testReputationPolicy(policyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReputationPoliciesApi#testReputationPolicy");
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
| **policyId** | **String**|  | |

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
| **200** | Test a reputation policy |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="updateReputationPolicy"></a>
# **updateReputationPolicy**
> updateReputationPolicy(policyId)

Update a reputation policy

Update an existing reputation policy.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.apis.ReputationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ReputationPoliciesApi apiInstance = new ReputationPoliciesApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    try {
      apiInstance.updateReputationPolicy(policyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReputationPoliciesApi#updateReputationPolicy");
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
| **policyId** | **String**|  | |

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
| **200** | Update a reputation policy |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

