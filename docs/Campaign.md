

# Campaign


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Campaign UUID |  |
|**accountId** | **Integer** |  |  [optional] |
|**name** | **String** | Campaign name |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**domainId** | **String** | Sending domain UUID |  |
|**subject** | **String** |  |  [optional] |
|**fromAddress** | **String** | Sender email address |  |
|**replyTo** | **String** |  |  [optional] |
|**htmlBody** | **String** |  |  [optional] |
|**textBody** | **String** |  |  [optional] |
|**htmlBodyDark** | **String** |  |  [optional] |
|**textBodyDark** | **String** |  |  [optional] |
|**campaignType** | **String** |  |  [optional] |
|**autoDetectSchema** | **Boolean** |  |  [optional] |
|**promoAnnotations** | **Object** |  |  [optional] |
|**throwawayPolicy** | **String** |  |  [optional] |
|**scheduledAt** | **OffsetDateTime** |  |  [optional] |
|**startedAt** | **OffsetDateTime** |  |  [optional] |
|**completedAt** | **OffsetDateTime** |  |  [optional] |
|**recipientCount** | **Integer** |  |  [optional] |
|**isAbTest** | **Boolean** |  |  [optional] |
|**winningVariantId** | **String** |  |  [optional] |
|**abTestConfig** | **Object** |  |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**stats** | [**CampaignStats**](CampaignStats.md) |  |  [optional] |
|**openRate** | **BigDecimal** |  |  [optional] |
|**clickRate** | **BigDecimal** |  |  [optional] |
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



