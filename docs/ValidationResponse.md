

# ValidationResponse

Flat validation response. Conditional fields are omitted (not null) when not applicable.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | **String** |  |  |
|**email** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Validation status |  |
|**action** | [**ActionEnum**](#ActionEnum) | Recommended action |  |
|**subStatus** | [**SubStatusEnum**](#SubStatusEnum) | Detailed status reason. Omitted when none. |  [optional] |
|**domain** | **String** |  |  |
|**mxFound** | **Boolean** | Whether MX records were found for the domain |  |
|**mxHost** | **String** | Primary MX hostname. Omitted when MX not resolved. |  [optional] |
|**smtpCheck** | **Boolean** | Whether SMTP verification passed. Omitted when SMTP not checked. |  [optional] |
|**catchAll** | **Boolean** | Whether domain is catch-all. Omitted when SMTP not checked. |  [optional] |
|**disposable** | **Boolean** | Whether domain is a known disposable email provider |  |
|**roleAccount** | **Boolean** | Whether address is a role account (e.g., info@, admin@) |  |
|**freeProvider** | **Boolean** | Whether domain is a known free email provider (e.g., gmail.com) |  |
|**depth** | [**DepthEnum**](#DepthEnum) | Validation depth used for this check |  |
|**processedAt** | **OffsetDateTime** | ISO 8601 timestamp of validation |  |
|**suggestedEmail** | **String** | Typo correction suggestion. Omitted when no typo detected. |  [optional] |
|**retryAfterMs** | **Integer** | Suggested retry delay in milliseconds. Present only for retry_later action. |  [optional] |
|**suppressionMatch** | [**ValidationResponseSuppressionMatch**](ValidationResponseSuppressionMatch.md) |  |  [optional] |
|**policyApplied** | [**ValidationResponsePolicyApplied**](ValidationResponsePolicyApplied.md) |  |  [optional] |



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



## Enum: SubStatusEnum

| Name | Value |
|---- | -----|
| FORMAT_INVALID | &quot;format_invalid&quot; |
| MX_MISSING | &quot;mx_missing&quot; |
| MX_TIMEOUT | &quot;mx_timeout&quot; |
| SMTP_UNREACHABLE | &quot;smtp_unreachable&quot; |
| SMTP_REJECTED | &quot;smtp_rejected&quot; |
| DISPOSABLE | &quot;disposable&quot; |
| ROLE_ACCOUNT | &quot;role_account&quot; |
| GREYLISTED | &quot;greylisted&quot; |
| CATCH_ALL_DETECTED | &quot;catch_all_detected&quot; |
| SUPPRESSION_MATCH | &quot;suppression_match&quot; |



## Enum: DepthEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| ENHANCED | &quot;enhanced&quot; |



