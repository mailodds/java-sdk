

# SendingDomainDnsRecordsNs


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Record type (NS) |  [optional] |
|**host** | **String** | NS record host (mo.yourdomain.com) |  [optional] |
|**targets** | **List&lt;String&gt;** | NS target servers |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Verification status |  [optional] |
|**verifiedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| VERIFIED | &quot;verified&quot; |



