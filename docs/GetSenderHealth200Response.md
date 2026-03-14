

# GetSenderHealth200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | **String** |  |  [optional] |
|**requestId** | **String** | Unique request identifier |  [optional] |
|**score** | **Integer** | Overall sender health score (0-100) |  [optional] |
|**grade** | [**GradeEnum**](#GradeEnum) | Letter grade based on score |  [optional] |
|**period** | **String** |  |  [optional] |
|**components** | [**GetSenderHealth200ResponseComponents**](GetSenderHealth200ResponseComponents.md) |  |  [optional] |
|**volume** | [**GetSenderHealth200ResponseVolume**](GetSenderHealth200ResponseVolume.md) |  |  [optional] |



## Enum: GradeEnum

| Name | Value |
|---- | -----|
| A_ | &quot;A+&quot; |
| A | &quot;A&quot; |
| B | &quot;B&quot; |
| C | &quot;C&quot; |
| D | &quot;D&quot; |
| F | &quot;F&quot; |



