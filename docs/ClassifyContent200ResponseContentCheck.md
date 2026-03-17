

# ClassifyContent200ResponseContentCheck


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Overall content status |  [optional] |
|**flag** | **Boolean** | Whether the content is flagged |  [optional] |
|**reason** | **String** | Human-readable reason for the status |  [optional] |
|**priority** | **Integer** | Priority level (1&#x3D;lowest, 5&#x3D;highest) |  [optional] |
|**suggestions** | **List&lt;String&gt;** | Improvement suggestions |  [optional] |
|**durationMs** | **Integer** | Classification duration in milliseconds |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CLEAN | &quot;clean&quot; |
| WARNING | &quot;warning&quot; |
| RISKY | &quot;risky&quot; |



