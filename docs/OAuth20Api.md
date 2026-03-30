# OAuth20Api

All URIs are relative to *https://api.mailodds.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createToken**](OAuth20Api.md#createToken) | **POST** /oauth/token | Create token |
| [**getJwks**](OAuth20Api.md#getJwks) | **GET** /.well-known/jwks.json | Get JSON Web Key Set |
| [**introspectToken**](OAuth20Api.md#introspectToken) | **POST** /oauth/introspect | Introspect token |
| [**oauthRegisterClient**](OAuth20Api.md#oauthRegisterClient) | **POST** /oauth/register | Register OAuth client |
| [**oauthServerMetadata**](OAuth20Api.md#oauthServerMetadata) | **GET** /.well-known/oauth-authorization-server | OAuth server metadata |
| [**revokeToken**](OAuth20Api.md#revokeToken) | **POST** /oauth/revoke | Revoke token |


<a id="createToken"></a>
# **createToken**
> CreateToken200Response createToken(grantType, code, redirectUri, clientId, clientSecret, refreshToken, scope, codeVerifier)

Create token

Exchange an authorization code, client credentials, or refresh token for access and refresh tokens. Authenticate via client_secret_post or client_secret_basic.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.models.*;
import com.mailodds.apis.OAuth20Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");

    OAuth20Api apiInstance = new OAuth20Api(defaultClient);
    String grantType = "authorization_code"; // String | 
    String code = "code_example"; // String | Authorization code (for authorization_code grant)
    String redirectUri = "redirectUri_example"; // String | Must match the original redirect_uri
    String clientId = "clientId_example"; // String | 
    String clientSecret = "clientSecret_example"; // String | 
    String refreshToken = "refreshToken_example"; // String | Refresh token (for refresh_token grant)
    String scope = "scope_example"; // String | Space-separated scopes
    String codeVerifier = "codeVerifier_example"; // String | PKCE code verifier
    try {
      CreateToken200Response result = apiInstance.createToken(grantType, code, redirectUri, clientId, clientSecret, refreshToken, scope, codeVerifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuth20Api#createToken");
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
| **grantType** | **String**|  | [enum: authorization_code, client_credentials, refresh_token] |
| **code** | **String**| Authorization code (for authorization_code grant) | [optional] |
| **redirectUri** | **String**| Must match the original redirect_uri | [optional] |
| **clientId** | **String**|  | [optional] |
| **clientSecret** | **String**|  | [optional] |
| **refreshToken** | **String**| Refresh token (for refresh_token grant) | [optional] |
| **scope** | **String**| Space-separated scopes | [optional] |
| **codeVerifier** | **String**| PKCE code verifier | [optional] |

### Return type

[**CreateToken200Response**](CreateToken200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token response |  -  |
| **400** | Invalid request or grant |  -  |
| **401** | Invalid client credentials |  -  |
| **429** | Rate limited (20 req/min per client) |  -  |

<a id="getJwks"></a>
# **getJwks**
> JwksResponse getJwks()

Get JSON Web Key Set

Public key set for verifying JWT access tokens issued by this server.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.models.*;
import com.mailodds.apis.OAuth20Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");

    OAuth20Api apiInstance = new OAuth20Api(defaultClient);
    try {
      JwksResponse result = apiInstance.getJwks();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuth20Api#getJwks");
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

[**JwksResponse**](JwksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JWKS response |  -  |

<a id="introspectToken"></a>
# **introspectToken**
> IntrospectToken200Response introspectToken(token, tokenTypeHint, clientId, clientSecret)

Introspect token

Introspect a token to determine its active state and metadata (RFC 7662). Requires client authentication.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.models.*;
import com.mailodds.apis.OAuth20Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");

    OAuth20Api apiInstance = new OAuth20Api(defaultClient);
    String token = "token_example"; // String | Token to introspect
    String tokenTypeHint = "access_token"; // String | 
    String clientId = "clientId_example"; // String | 
    String clientSecret = "clientSecret_example"; // String | 
    try {
      IntrospectToken200Response result = apiInstance.introspectToken(token, tokenTypeHint, clientId, clientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuth20Api#introspectToken");
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
| **token** | **String**| Token to introspect | |
| **tokenTypeHint** | **String**|  | [optional] [enum: access_token, refresh_token] |
| **clientId** | **String**|  | [optional] |
| **clientSecret** | **String**|  | [optional] |

### Return type

[**IntrospectToken200Response**](IntrospectToken200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Introspection result |  -  |
| **401** | Invalid client credentials |  -  |
| **400** | Bad request |  -  |

<a id="oauthRegisterClient"></a>
# **oauthRegisterClient**
> OAuthClientRegistration oauthRegisterClient()

Register OAuth client

Dynamic Client Registration (RFC 7591). Allows MCP clients to auto-register without user interaction.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.models.*;
import com.mailodds.apis.OAuth20Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");

    OAuth20Api apiInstance = new OAuth20Api(defaultClient);
    try {
      OAuthClientRegistration result = apiInstance.oauthRegisterClient();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuth20Api#oauthRegisterClient");
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

[**OAuthClientRegistration**](OAuthClientRegistration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Registered client credentials |  -  |

<a id="oauthServerMetadata"></a>
# **oauthServerMetadata**
> OAuthServerMetadata oauthServerMetadata()

OAuth server metadata

OAuth 2.0 Authorization Server Metadata (RFC 8414). Returns server configuration including supported grant types, scopes, and endpoints.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.models.*;
import com.mailodds.apis.OAuth20Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");

    OAuth20Api apiInstance = new OAuth20Api(defaultClient);
    try {
      OAuthServerMetadata result = apiInstance.oauthServerMetadata();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuth20Api#oauthServerMetadata");
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

[**OAuthServerMetadata**](OAuthServerMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Server metadata |  -  |

<a id="revokeToken"></a>
# **revokeToken**
> revokeToken(token, tokenTypeHint, clientId, clientSecret)

Revoke token

Revoke an access or refresh token (RFC 7009). Requires client authentication. Always returns 200 per spec to prevent token scanning.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.models.*;
import com.mailodds.apis.OAuth20Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com");

    OAuth20Api apiInstance = new OAuth20Api(defaultClient);
    String token = "token_example"; // String | Token to revoke
    String tokenTypeHint = "access_token"; // String | 
    String clientId = "clientId_example"; // String | 
    String clientSecret = "clientSecret_example"; // String | 
    try {
      apiInstance.revokeToken(token, tokenTypeHint, clientId, clientSecret);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuth20Api#revokeToken");
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
| **token** | **String**| Token to revoke | |
| **tokenTypeHint** | **String**|  | [optional] [enum: access_token, refresh_token] |
| **clientId** | **String**|  | [optional] |
| **clientSecret** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token revoked (or not found, per RFC 7009) |  -  |
| **401** | Invalid client credentials |  -  |
| **400** | Bad request |  -  |

