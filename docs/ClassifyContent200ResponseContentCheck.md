

# ClassifyContent200ResponseContentCheck


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**score** | **BigDecimal** | Overall content quality score (0-100) |  [optional] |
|**verdict** | [**VerdictEnum**](#VerdictEnum) | Overall verdict |  [optional] |
|**categories** | [**List&lt;ClassifyContent200ResponseContentCheckCategoriesInner&gt;**](ClassifyContent200ResponseContentCheckCategoriesInner.md) |  |  [optional] |
|**suggestions** | **List&lt;String&gt;** | Improvement suggestions |  [optional] |



## Enum: VerdictEnum

| Name | Value |
|---- | -----|
| CLEAN | &quot;clean&quot; |
| WARNING | &quot;warning&quot; |
| RISKY | &quot;risky&quot; |



