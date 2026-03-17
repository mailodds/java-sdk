

# TrackEventRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Type of commerce event |  |
|**email** | **String** | Email address associated with the event |  |
|**properties** | **Object** | Event-specific data (e.g., order_id, value, product_url) |  [optional] |
|**occurredAt** | **OffsetDateTime** | When the event occurred (defaults to now) |  [optional] |
|**idempotencyKey** | **String** | Unique key to prevent duplicate events (5 min TTL) |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| PURCHASE | &quot;purchase&quot; |
| CART_ABANDON | &quot;cart_abandon&quot; |
| BROWSE | &quot;browse&quot; |
| WISHLIST | &quot;wishlist&quot; |
| REVIEW | &quot;review&quot; |
| SHADOW_DNS_DWELL | &quot;shadow_dns_dwell&quot; |
| CSS_PROBE | &quot;css_probe&quot; |
| IDENTITY_STITCH | &quot;identity_stitch&quot; |



