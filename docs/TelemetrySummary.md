

# TelemetrySummary

Validation metrics for building dashboards and monitoring.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | **String** |  |  [optional] |
|**window** | [**WindowEnum**](#WindowEnum) |  |  [optional] |
|**generatedAt** | **OffsetDateTime** |  |  [optional] |
|**timezone** | **String** |  |  [optional] |
|**totals** | [**TelemetrySummaryTotals**](TelemetrySummaryTotals.md) |  |  [optional] |
|**rates** | [**TelemetrySummaryRates**](TelemetrySummaryRates.md) |  |  [optional] |
|**topReasons** | [**List&lt;TelemetrySummaryTopReasonsInner&gt;**](TelemetrySummaryTopReasonsInner.md) | Top rejection/status reasons |  [optional] |
|**topDomains** | [**List&lt;TelemetrySummaryTopDomainsInner&gt;**](TelemetrySummaryTopDomainsInner.md) | Top domains by volume |  [optional] |



## Enum: WindowEnum

| Name | Value |
|---- | -----|
| _1H | &quot;1h&quot; |
| _24H | &quot;24h&quot; |
| _30D | &quot;30d&quot; |



