

# ValidateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | Email address to validate |  |
|**depth** | [**DepthEnum**](#DepthEnum) | Validation depth. &#39;standard&#39; skips SMTP verification. |  [optional] |
|**policyId** | **Integer** | Optional policy ID to use instead of default policy |  [optional] |



## Enum: DepthEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| ENHANCED | &quot;enhanced&quot; |



