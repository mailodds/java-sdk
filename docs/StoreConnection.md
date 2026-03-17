

# StoreConnection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Store connection UUID |  [optional] |
|**accountId** | **Integer** |  |  [optional] |
|**platform** | [**PlatformEnum**](#PlatformEnum) | E-commerce platform |  [optional] |
|**storeName** | **String** |  |  [optional] |
|**storeUrl** | **URI** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**authMethod** | [**AuthMethodEnum**](#AuthMethodEnum) |  |  [optional] |
|**productCount** | **Integer** | Number of active products |  [optional] |
|**lastSyncedAt** | **OffsetDateTime** |  |  [optional] |
|**lastError** | **String** | Last sync error message |  [optional] |
|**syncIntervalSeconds** | **Integer** | Auto-sync interval in seconds |  [optional] |
|**settings** | **Object** | Platform-specific settings |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: PlatformEnum

| Name | Value |
|---- | -----|
| WOOCOMMERCE | &quot;woocommerce&quot; |
| PRESTASHOP | &quot;prestashop&quot; |
| SHOPIFY | &quot;shopify&quot; |
| FEED | &quot;feed&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| CONNECTED | &quot;connected&quot; |
| ACTIVE | &quot;active&quot; |
| SYNCING | &quot;syncing&quot; |
| ERROR | &quot;error&quot; |
| DISCONNECTED | &quot;disconnected&quot; |



## Enum: AuthMethodEnum

| Name | Value |
|---- | -----|
| PLUGIN_HANDSHAKE | &quot;plugin_handshake&quot; |
| API_KEY | &quot;api_key&quot; |
| OAUTH | &quot;oauth&quot; |
| FEED_URL | &quot;feed_url&quot; |



