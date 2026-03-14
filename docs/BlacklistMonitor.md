

# BlacklistMonitor


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Monitor UUID |  [optional] |
|**target** | **String** | IP address or domain being monitored |  [optional] |
|**targetType** | [**TargetTypeEnum**](#TargetTypeEnum) |  |  [optional] |
|**status** | **String** | Current status (clean, listed) |  [optional] |
|**listedCount** | **Integer** | Number of blacklists currently listing this target |  [optional] |
|**lastCheckedAt** | **OffsetDateTime** |  |  [optional] |
|**latestCheck** | [**BlacklistMonitorLatestCheck**](BlacklistMonitorLatestCheck.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |



## Enum: TargetTypeEnum

| Name | Value |
|---- | -----|
| IP | &quot;ip&quot; |
| DOMAIN | &quot;domain&quot; |



