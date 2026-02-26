

# SendingDomain


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Domain UUID |  [optional] |
|**domain** | **String** | Domain name |  [optional] |
|**domainType** | **String** | Domain type (ns_delegated) |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Domain verification status |  [optional] |
|**dkimSelector** | **String** | DKIM selector (e.g. mo1) |  [optional] |
|**dnsRecords** | [**SendingDomainDnsRecords**](SendingDomainDnsRecords.md) |  |  [optional] |
|**bimiSvgUrl** | **String** | BIMI SVG logo URL |  [optional] |
|**bimiVmcUrl** | **String** | BIMI VMC certificate URL |  [optional] |
|**bimiEnabled** | **Boolean** | Whether BIMI is enabled |  [optional] |
|**forwardRepliesTo** | **String** | Reply forwarding address |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING_DNS | &quot;pending_dns&quot; |
| DNS_PARTIAL | &quot;dns_partial&quot; |
| ACTIVE | &quot;active&quot; |
| SUSPENDED | &quot;suspended&quot; |



