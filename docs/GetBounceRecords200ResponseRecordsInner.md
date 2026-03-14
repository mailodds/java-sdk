

# GetBounceRecords200ResponseRecordsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**bounceType** | [**BounceTypeEnum**](#BounceTypeEnum) |  |  [optional] |
|**smtpCode** | **Integer** |  |  [optional] |
|**enhancedStatus** | **String** |  |  [optional] |
|**diagnostic** | **String** |  |  [optional] |
|**mxHost** | **String** |  |  [optional] |
|**bouncedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: BounceTypeEnum

| Name | Value |
|---- | -----|
| HARD | &quot;hard&quot; |
| SOFT | &quot;soft&quot; |



