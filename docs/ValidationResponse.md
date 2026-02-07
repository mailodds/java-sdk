

# ValidationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | **String** |  |  [optional] |
|**email** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Validation status |  |
|**subStatus** | **String** | Detailed status reason |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | Recommended action |  |
|**domain** | **String** |  |  [optional] |
|**mxFound** | **Boolean** |  |  [optional] |
|**smtpCheck** | **Boolean** |  |  [optional] |
|**disposable** | **Boolean** |  |  [optional] |
|**roleAccount** | **Boolean** |  |  [optional] |
|**freeProvider** | **Boolean** |  |  [optional] |
|**suppressionMatch** | [**ValidationResponseSuppressionMatch**](ValidationResponseSuppressionMatch.md) |  |  [optional] |



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



