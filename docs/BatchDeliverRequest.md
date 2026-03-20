

# BatchDeliverRequest

Same fields as DeliverRequest but 'to' accepts up to 100 recipients.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**to** | **List&lt;String&gt;** | List of recipient email addresses (max 100) |  |
|**from** | **String** |  |  |
|**subject** | **String** |  |  |
|**html** | **String** |  |  [optional] |
|**text** | **String** |  |  [optional] |
|**domainId** | **String** | Sending domain UUID. Optional -- auto-resolved from the from address, or falls back to primary domain. |  [optional] |
|**replyTo** | **String** |  |  [optional] |
|**headers** | **Object** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**campaignType** | **String** |  |  [optional] |
|**structuredData** | [**BatchDeliverRequestStructuredData**](BatchDeliverRequestStructuredData.md) |  |  [optional] |
|**options** | **Object** |  |  [optional] |



