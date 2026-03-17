# AgentControlPlaneApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMcpCapabilities**](AgentControlPlaneApi.md#getMcpCapabilities) | **GET** /v1/mcp/capabilities | Get MCP capabilities |


<a id="getMcpCapabilities"></a>
# **getMcpCapabilities**
> McpCapabilities getMcpCapabilities()

Get MCP capabilities

Returns a static capability manifest listing all MCP tools organized by pillar. Used by AI agents for tool discovery and scope-based self-correction.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.models.*;
import com.mailodds.apis.AgentControlPlaneApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");

    AgentControlPlaneApi apiInstance = new AgentControlPlaneApi(defaultClient);
    try {
      McpCapabilities result = apiInstance.getMcpCapabilities();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControlPlaneApi#getMcpCapabilities");
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

[**McpCapabilities**](McpCapabilities.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | MCP capability manifest |  -  |

