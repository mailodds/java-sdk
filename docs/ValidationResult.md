

# ValidationResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**subStatus** | **String** |  |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) |  |  [optional] |
|**processedAt** | **OffsetDateTime** |  |  [optional] |



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



