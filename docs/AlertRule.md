

# AlertRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**metric** | **String** | Monitored metric name |  [optional] |
|**threshold** | **BigDecimal** | Alert threshold value (0-1) |  [optional] |
|**channel** | **String** | Notification channel |  [optional] |
|**windowMinutes** | [**WindowMinutesEnum**](#WindowMinutesEnum) | Evaluation window in minutes |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: WindowMinutesEnum

| Name | Value |
|---- | -----|
| NUMBER_15 | 15 |
| NUMBER_60 | 60 |
| NUMBER_1440 | 1440 |
| NUMBER_2880 | 2880 |



