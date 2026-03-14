

# Campaign


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Campaign UUID |  |
|**name** | **String** | Campaign name |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**listId** | **String** | Target subscriber list UUID |  |
|**domainId** | **String** | Sending domain UUID |  |
|**fromEmail** | **String** |  |  |
|**fromName** | **String** |  |  [optional] |
|**replyTo** | **String** |  |  [optional] |
|**scheduledAt** | **OffsetDateTime** |  |  [optional] |
|**sentAt** | **OffsetDateTime** |  |  [optional] |
|**cancelledAt** | **OffsetDateTime** |  |  [optional] |
|**variantCount** | **Integer** | Number of A/B variants |  [optional] |
|**stats** | [**CampaignStats**](CampaignStats.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;draft&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| SENDING | &quot;sending&quot; |
| SENT | &quot;sent&quot; |
| CANCELLED | &quot;cancelled&quot; |



