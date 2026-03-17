

# CreateStoreRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**platform** | [**PlatformEnum**](#PlatformEnum) | E-commerce platform |  |
|**storeName** | **String** | Display name for the store |  |
|**storeUrl** | **URI** | Store base URL |  |
|**authMethod** | [**AuthMethodEnum**](#AuthMethodEnum) | Authentication method |  |
|**settings** | **Object** | Platform-specific settings (e.g., API keys, feed URL) |  [optional] |



## Enum: PlatformEnum

| Name | Value |
|---- | -----|
| WOOCOMMERCE | &quot;woocommerce&quot; |
| PRESTASHOP | &quot;prestashop&quot; |
| SHOPIFY | &quot;shopify&quot; |
| FEED | &quot;feed&quot; |
| CUSTOM | &quot;custom&quot; |



## Enum: AuthMethodEnum

| Name | Value |
|---- | -----|
| PLUGIN_HANDSHAKE | &quot;plugin_handshake&quot; |
| API_KEY | &quot;api_key&quot; |
| OAUTH | &quot;oauth&quot; |
| FEED_URL | &quot;feed_url&quot; |



