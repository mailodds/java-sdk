

# ValidationResult

Individual result from a bulk validation job

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**subStatus** | **String** | Detailed reason. Omitted when none. |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) |  |  |
|**domain** | **String** | Email domain |  |
|**mxHost** | **String** | Primary MX hostname. Omitted when not resolved. |  [optional] |
|**checks** | **Map&lt;String, Object&gt;** | Detailed check results (JSONB). Omitted when not available. |  [optional] |
|**suppression** | [**ValidationResultSuppression**](ValidationResultSuppression.md) |  |  [optional] |
|**processedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VALID | &quot;valid&quot; |
| INVALID | &quot;invalid&quot; |
| CATCH_ALL | &quot;catch_all&quot; |
| DO_NOT_MAIL | &quot;do_not_mail&quot; |
| UNKNOWN | &quot;unknown&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| ACCEPT | &quot;accept&quot; |
| ACCEPT_WITH_CAUTION | &quot;accept_with_caution&quot; |
| REJECT | &quot;reject&quot; |
| RETRY_LATER | &quot;retry_later&quot; |



