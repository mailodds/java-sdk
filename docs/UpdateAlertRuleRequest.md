

# UpdateAlertRuleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metric** | **String** |  |  [optional] |
|**threshold** | **BigDecimal** |  |  [optional] |
|**channel** | **String** |  |  [optional] |
|**windowMinutes** | [**WindowMinutesEnum**](#WindowMinutesEnum) |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |



## Enum: WindowMinutesEnum

| Name | Value |
|---- | -----|
| NUMBER_15 | 15 |
| NUMBER_60 | 60 |
| NUMBER_1440 | 1440 |
| NUMBER_2880 | 2880 |



