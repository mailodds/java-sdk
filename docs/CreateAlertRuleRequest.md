

# CreateAlertRuleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metric** | **String** | Metric to monitor (e.g., bounce_rate, complaint_rate) |  |
|**threshold** | **BigDecimal** | Threshold value (0-1, e.g. 0.02 for 2%) |  |
|**channel** | **String** | Notification channel (e.g., webhook) |  |
|**windowMinutes** | [**WindowMinutesEnum**](#WindowMinutesEnum) | Evaluation window in minutes |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |



## Enum: WindowMinutesEnum

| Name | Value |
|---- | -----|
| NUMBER_15 | 15 |
| NUMBER_60 | 60 |
| NUMBER_1440 | 1440 |
| NUMBER_2880 | 2880 |



