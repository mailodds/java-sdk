

# PolicyRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Rule type determines how condition is evaluated |  |
|**condition** | **Object** | Condition depends on rule type. status_override: {status}, domain_filter: {domain_mode, domains}, check_requirement: {check, required}, sub_status_override: {sub_status} |  |
|**action** | [**PolicyRuleAction**](PolicyRuleAction.md) |  |  |
|**sequence** | **Integer** |  |  [optional] |
|**isEnabled** | **Boolean** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STATUS_OVERRIDE | &quot;status_override&quot; |
| DOMAIN_FILTER | &quot;domain_filter&quot; |
| CHECK_REQUIREMENT | &quot;check_requirement&quot; |
| SUB_STATUS_OVERRIDE | &quot;sub_status_override&quot; |



