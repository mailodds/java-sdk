

# Job


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**name** | **String** | Job name (from metadata or auto-generated) |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**totalCount** | **Integer** |  |  |
|**processedCount** | **Integer** |  |  |
|**summary** | [**JobSummary**](JobSummary.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**startedAt** | **OffsetDateTime** | When processing began. Omitted if not yet started. |  [optional] |
|**completedAt** | **OffsetDateTime** | Omitted if not yet completed. |  [optional] |
|**resultsExpireAt** | **OffsetDateTime** | When job results will be purged |  |
|**metadata** | **Object** | Custom metadata attached at creation |  [optional] |
|**errorMessage** | **String** | Error details. Present only for failed jobs. |  [optional] |
|**requestId** | **String** | Request ID from the job creation request |  [optional] |
|**artifacts** | [**JobArtifacts**](JobArtifacts.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| PROCESSING | &quot;processing&quot; |
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |
| CANCELLED | &quot;cancelled&quot; |



