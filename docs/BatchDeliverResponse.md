

# BatchDeliverResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | **String** |  |  [optional] |
|**requestId** | **String** | Unique request identifier |  [optional] |
|**total** | **Integer** | Total recipients submitted |  [optional] |
|**accepted** | **Integer** | Number of recipients accepted for delivery |  [optional] |
|**rejected** | [**List&lt;BatchDeliverResponseRejectedInner&gt;**](BatchDeliverResponseRejectedInner.md) | Recipients that were rejected (suppressed or failed validation) |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Batch status |  [optional] |
|**delivery** | [**BatchDeliverResponseDelivery**](BatchDeliverResponseDelivery.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |
| ALL_REJECTED | &quot;all_rejected&quot; |



