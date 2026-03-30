

# CreateAlertRuleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metric** | **String** | Metric to monitor (e.g., bounce_rate, complaint_rate) |  |
|**threshold** | **BigDecimal** | Threshold value (0-1, e.g. 0.02 for 2%) |  |
|**channel** | **String** | Notification channel (e.g., webhook) |  |
|**windowMinutes** | **Integer** | Evaluation window in minutes (15, 60, 1440, or 2880) |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |



