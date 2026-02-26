

# DeliverResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | **String** |  |  [optional] |
|**requestId** | **String** | Unique request identifier |  [optional] |
|**messageId** | **String** | Unique message identifier |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Delivery status |  [optional] |
|**delivery** | [**DeliverResponseDelivery**](DeliverResponseDelivery.md) |  |  [optional] |
|**validation** | **Object** | Pre-send validation results (when validate_first is true) |  [optional] |
|**contentScan** | **Object** | Content scan results |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |



