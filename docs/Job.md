

# Job


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**totalCount** | **Integer** |  |  [optional] |
|**processedCount** | **Integer** |  |  [optional] |
|**progressPercent** | **Integer** |  |  [optional] |
|**summary** | [**JobSummary**](JobSummary.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**completedAt** | **OffsetDateTime** |  |  [optional] |
|**metadata** | **Object** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| PROCESSING | &quot;processing&quot; |
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |
| CANCELLED | &quot;cancelled&quot; |



