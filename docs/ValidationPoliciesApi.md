# ValidationPoliciesApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPolicyRule**](ValidationPoliciesApi.md#addPolicyRule) | **POST** /v1/policies/{policy_id}/rules | Add rule to policy |
| [**createPolicy**](ValidationPoliciesApi.md#createPolicy) | **POST** /v1/policies | Create policy |
| [**createPolicyFromPreset**](ValidationPoliciesApi.md#createPolicyFromPreset) | **POST** /v1/policies/from-preset | Create policy from preset |
| [**deletePolicy**](ValidationPoliciesApi.md#deletePolicy) | **DELETE** /v1/policies/{policy_id} | Delete policy |
| [**deletePolicyRule**](ValidationPoliciesApi.md#deletePolicyRule) | **DELETE** /v1/policies/{policy_id}/rules/{rule_id} | Delete rule |
| [**getPolicy**](ValidationPoliciesApi.md#getPolicy) | **GET** /v1/policies/{policy_id} | Get policy |
| [**getPolicyPresets**](ValidationPoliciesApi.md#getPolicyPresets) | **GET** /v1/policies/presets | Get policy presets |
| [**listPolicies**](ValidationPoliciesApi.md#listPolicies) | **GET** /v1/policies | List policies |
| [**testPolicy**](ValidationPoliciesApi.md#testPolicy) | **POST** /v1/policies/test | Test policy evaluation |
| [**updatePolicy**](ValidationPoliciesApi.md#updatePolicy) | **PUT** /v1/policies/{policy_id} | Update policy |


<a id="addPolicyRule"></a>
# **addPolicyRule**
> AddPolicyRule201Response addPolicyRule(policyId, policyRule)

Add rule to policy

Add a new rule to an existing policy.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ValidationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ValidationPoliciesApi apiInstance = new ValidationPoliciesApi(defaultClient);
    Integer policyId = 56; // Integer | 
    PolicyRule policyRule = new PolicyRule(); // PolicyRule | 
    try {
      AddPolicyRule201Response result = apiInstance.addPolicyRule(policyId, policyRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationPoliciesApi#addPolicyRule");
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
| **policyId** | **Integer**|  | |
| **policyRule** | [**PolicyRule**](PolicyRule.md)|  | |

### Return type

[**AddPolicyRule201Response**](AddPolicyRule201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Rule added |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Rule limit exceeded |  -  |
| **404** | Policy not found |  -  |

<a id="createPolicy"></a>
# **createPolicy**
> PolicyResponse createPolicy(createPolicyRequest)

Create policy

Create a new validation policy with rules.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ValidationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ValidationPoliciesApi apiInstance = new ValidationPoliciesApi(defaultClient);
    CreatePolicyRequest createPolicyRequest = new CreatePolicyRequest(); // CreatePolicyRequest | 
    try {
      PolicyResponse result = apiInstance.createPolicy(createPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationPoliciesApi#createPolicy");
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
| **createPolicyRequest** | [**CreatePolicyRequest**](CreatePolicyRequest.md)|  | |

### Return type

[**PolicyResponse**](PolicyResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Policy created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Plan limit exceeded |  -  |

<a id="createPolicyFromPreset"></a>
# **createPolicyFromPreset**
> PolicyResponse createPolicyFromPreset(createPolicyFromPresetRequest)

Create policy from preset

Create a policy using a preset template.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ValidationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ValidationPoliciesApi apiInstance = new ValidationPoliciesApi(defaultClient);
    CreatePolicyFromPresetRequest createPolicyFromPresetRequest = new CreatePolicyFromPresetRequest(); // CreatePolicyFromPresetRequest | 
    try {
      PolicyResponse result = apiInstance.createPolicyFromPreset(createPolicyFromPresetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationPoliciesApi#createPolicyFromPreset");
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
| **createPolicyFromPresetRequest** | [**CreatePolicyFromPresetRequest**](CreatePolicyFromPresetRequest.md)|  | |

### Return type

[**PolicyResponse**](PolicyResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Policy created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="deletePolicy"></a>
# **deletePolicy**
> DeletePolicy200Response deletePolicy(policyId)

Delete policy

Delete a policy and all its rules.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ValidationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ValidationPoliciesApi apiInstance = new ValidationPoliciesApi(defaultClient);
    Integer policyId = 56; // Integer | 
    try {
      DeletePolicy200Response result = apiInstance.deletePolicy(policyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationPoliciesApi#deletePolicy");
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
| **policyId** | **Integer**|  | |

### Return type

[**DeletePolicy200Response**](DeletePolicy200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Policy deleted |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Policy not found |  -  |

<a id="deletePolicyRule"></a>
# **deletePolicyRule**
> DeletePolicyRule200Response deletePolicyRule(policyId, ruleId)

Delete rule

Delete a rule from a policy.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ValidationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ValidationPoliciesApi apiInstance = new ValidationPoliciesApi(defaultClient);
    Integer policyId = 56; // Integer | 
    Integer ruleId = 56; // Integer | 
    try {
      DeletePolicyRule200Response result = apiInstance.deletePolicyRule(policyId, ruleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationPoliciesApi#deletePolicyRule");
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
| **policyId** | **Integer**|  | |
| **ruleId** | **Integer**|  | |

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
| **200** | Rule deleted |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Policy or rule not found |  -  |

<a id="getPolicy"></a>
# **getPolicy**
> PolicyResponse getPolicy(policyId)

Get policy

Get a single policy with its rules.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ValidationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ValidationPoliciesApi apiInstance = new ValidationPoliciesApi(defaultClient);
    Integer policyId = 56; // Integer | 
    try {
      PolicyResponse result = apiInstance.getPolicy(policyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationPoliciesApi#getPolicy");
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
| **policyId** | **Integer**|  | |

### Return type

[**PolicyResponse**](PolicyResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Policy details |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Policy not found |  -  |

<a id="getPolicyPresets"></a>
# **getPolicyPresets**
> PolicyPresetsResponse getPolicyPresets()

Get policy presets

Get available preset templates for quick policy creation.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ValidationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ValidationPoliciesApi apiInstance = new ValidationPoliciesApi(defaultClient);
    try {
      PolicyPresetsResponse result = apiInstance.getPolicyPresets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationPoliciesApi#getPolicyPresets");
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

[**PolicyPresetsResponse**](PolicyPresetsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available presets |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="listPolicies"></a>
# **listPolicies**
> PolicyListResponse listPolicies(includeRules)

List policies

List all validation policies for your account. Includes plan limits.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ValidationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ValidationPoliciesApi apiInstance = new ValidationPoliciesApi(defaultClient);
    Boolean includeRules = false; // Boolean | Include full rules in response
    try {
      PolicyListResponse result = apiInstance.listPolicies(includeRules);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationPoliciesApi#listPolicies");
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
| **includeRules** | **Boolean**| Include full rules in response | [optional] [default to false] |

### Return type

[**PolicyListResponse**](PolicyListResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of policies |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="testPolicy"></a>
# **testPolicy**
> PolicyTestResponse testPolicy(testPolicyRequest)

Test policy evaluation

Test how a policy would evaluate a validation result without affecting production.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ValidationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ValidationPoliciesApi apiInstance = new ValidationPoliciesApi(defaultClient);
    TestPolicyRequest testPolicyRequest = new TestPolicyRequest(); // TestPolicyRequest | 
    try {
      PolicyTestResponse result = apiInstance.testPolicy(testPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationPoliciesApi#testPolicy");
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
| **testPolicyRequest** | [**TestPolicyRequest**](TestPolicyRequest.md)|  | |

### Return type

[**PolicyTestResponse**](PolicyTestResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Test result |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Policy not found |  -  |

<a id="updatePolicy"></a>
# **updatePolicy**
> PolicyResponse updatePolicy(policyId, updatePolicyRequest)

Update policy

Update a policy&#39;s settings (name, enabled, default).

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ValidationPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ValidationPoliciesApi apiInstance = new ValidationPoliciesApi(defaultClient);
    Integer policyId = 56; // Integer | 
    UpdatePolicyRequest updatePolicyRequest = new UpdatePolicyRequest(); // UpdatePolicyRequest | 
    try {
      PolicyResponse result = apiInstance.updatePolicy(policyId, updatePolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationPoliciesApi#updatePolicy");
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
| **policyId** | **Integer**|  | |
| **updatePolicyRequest** | [**UpdatePolicyRequest**](UpdatePolicyRequest.md)|  | |

### Return type

[**PolicyResponse**](PolicyResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Policy updated |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Policy not found |  -  |

