

# StoreProduct


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Product UUID |  [optional] |
|**storeId** | **String** | Store connection UUID |  [optional] |
|**externalId** | **String** | Product ID in the source store |  [optional] |
|**sku** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**priceCurrent** | **BigDecimal** | Current price |  [optional] |
|**priceOriginal** | **BigDecimal** | Original price (before discount) |  [optional] |
|**currency** | **String** |  |  [optional] |
|**saleStart** | **OffsetDateTime** |  |  [optional] |
|**saleEnd** | **OffsetDateTime** |  |  [optional] |
|**stockStatus** | [**StockStatusEnum**](#StockStatusEnum) |  |  [optional] |
|**stockQuantity** | **Integer** |  |  [optional] |
|**imageUrl** | **String** |  |  [optional] |
|**additionalImages** | **List&lt;String&gt;** |  |  [optional] |
|**categories** | **List&lt;String&gt;** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**productUrl** | **URI** |  |  [optional] |
|**variants** | **List&lt;Object&gt;** |  |  [optional] |
|**isActive** | **Boolean** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StockStatusEnum

| Name | Value |
|---- | -----|
| IN_STOCK | &quot;in_stock&quot; |
| OUT_OF_STOCK | &quot;out_of_stock&quot; |
| ON_BACKORDER | &quot;on_backorder&quot; |
| PREORDER | &quot;preorder&quot; |



