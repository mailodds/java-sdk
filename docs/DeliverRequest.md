

# DeliverRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**to** | [**List&lt;DeliverRequestToInner&gt;**](DeliverRequestToInner.md) | List of recipient email addresses |  |
|**from** | **String** | Sender email address (must match sending domain) |  |
|**subject** | **String** | Email subject line |  |
|**html** | **String** | HTML email body |  [optional] |
|**text** | **String** | Plain text email body |  [optional] |
|**domainId** | **String** | Sending domain UUID |  |
|**replyTo** | **String** | Reply-to address |  [optional] |
|**headers** | **Object** | Extra email headers |  [optional] |
|**tags** | **List&lt;String&gt;** | Tags for categorization |  [optional] |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Campaign type for JSON-LD auto-generation |  [optional] |
|**structuredData** | [**DeliverRequestStructuredData**](DeliverRequestStructuredData.md) |  |  [optional] |
|**options** | [**DeliverRequestOptions**](DeliverRequestOptions.md) |  |  [optional] |



## Enum: CampaignTypeEnum

| Name | Value |
|---- | -----|
| ORDER_CONFIRMATION | &quot;order_confirmation&quot; |
| SHIPPING_NOTIFICATION | &quot;shipping_notification&quot; |
| SUBSCRIPTION_CONFIRM | &quot;subscription_confirm&quot; |
| REVIEW_REQUEST | &quot;review_request&quot; |
| EVENT_INVITATION | &quot;event_invitation&quot; |
| PROMOTIONAL | &quot;promotional&quot; |
| WELCOME | &quot;welcome&quot; |
| PASSWORD_RESET | &quot;password_reset&quot; |
| APPOINTMENT_REMINDER | &quot;appointment_reminder&quot; |
| TICKET_CONFIRMATION | &quot;ticket_confirmation&quot; |



