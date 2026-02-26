

# Subscriber


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Subscriber UUID |  [optional] |
|**listId** | **String** | List UUID |  [optional] |
|**email** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**consentSourceIp** | **String** | IP address of subscription |  [optional] |
|**consentPageUrl** | **String** | Page URL where form was submitted |  [optional] |
|**consentFormId** | **String** | Form identifier |  [optional] |
|**consentTimestamp** | **OffsetDateTime** |  |  [optional] |
|**confirmedAt** | **OffsetDateTime** |  |  [optional] |
|**unsubscribedAt** | **OffsetDateTime** |  |  [optional] |
|**validationResult** | **Object** | Email validation result |  [optional] |
|**metadata** | **Object** | Custom metadata |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| CONFIRMED | &quot;confirmed&quot; |
| UNSUBSCRIBED | &quot;unsubscribed&quot; |
| BOUNCED | &quot;bounced&quot; |



