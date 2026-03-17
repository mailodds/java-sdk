

# ValidationResponseSuppressionMatch

Present only when email matched a suppression list entry. Null otherwise.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) |  |  [optional] |
|**matchValue** | **String** |  |  [optional] |
|**reason** | **String** |  |  [optional] |



## Enum: MatchTypeEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;email&quot; |
| DOMAIN | &quot;domain&quot; |



