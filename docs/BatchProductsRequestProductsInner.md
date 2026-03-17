

# BatchProductsRequestProductsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalId** | **String** |  |  |
|**title** | **String** |  |  |
|**productUrl** | **URI** |  |  |
|**sku** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**priceCurrent** | **BigDecimal** |  |  [optional] |
|**priceOriginal** | **BigDecimal** |  |  [optional] |
|**currency** | **String** |  |  [optional] |
|**stockStatus** | [**StockStatusEnum**](#StockStatusEnum) |  |  [optional] |
|**stockQuantity** | **Integer** |  |  [optional] |
|**imageUrl** | **String** |  |  [optional] |
|**additionalImages** | **List&lt;String&gt;** |  |  [optional] |
|**categories** | **List&lt;String&gt;** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**variants** | **List&lt;Object&gt;** |  |  [optional] |



## Enum: StockStatusEnum

| Name | Value |
|---- | -----|
| IN_STOCK | &quot;in_stock&quot; |
| OUT_OF_STOCK | &quot;out_of_stock&quot; |
| ON_BACKORDER | &quot;on_backorder&quot; |
| PREORDER | &quot;preorder&quot; |



