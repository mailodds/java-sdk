

# SuppressionCheckResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | **String** |  |  [optional] |
|**requestId** | **String** | Unique request identifier |  [optional] |
|**email** | **String** |  |  [optional] |
|**suppressed** | **Boolean** |  |  [optional] |
|**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) |  |  [optional] |
|**matchValue** | **String** |  |  [optional] |



## Enum: MatchTypeEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;email&quot; |
| DOMAIN | &quot;domain&quot; |



