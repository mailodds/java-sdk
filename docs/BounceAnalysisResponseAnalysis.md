

# BounceAnalysisResponseAnalysis


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Analysis UUID |  [optional] |
|**domainId** | **String** |  |  [optional] |
|**period** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**totalBounces** | **Integer** |  |  [optional] |
|**hardBounces** | **Integer** |  |  [optional] |
|**softBounces** | **Integer** |  |  [optional] |
|**categories** | [**BounceAnalysisResponseAnalysisCategories**](BounceAnalysisResponseAnalysisCategories.md) |  |  [optional] |
|**topDomains** | [**List&lt;BounceAnalysisResponseAnalysisTopDomainsInner&gt;**](BounceAnalysisResponseAnalysisTopDomainsInner.md) | Top bouncing recipient domains |  [optional] |
|**recommendations** | **List&lt;String&gt;** | Actionable recommendations to reduce bounces |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROCESSING | &quot;processing&quot; |
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |



