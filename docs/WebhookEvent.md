

# WebhookEvent

Webhook payload delivered to your endpoint. Fields vary by event type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**event** | [**EventEnum**](#EventEnum) | Event type |  |
|**timestamp** | **OffsetDateTime** | When the event occurred |  |
|**job** | [**Job**](Job.md) |  |  [optional] |
|**messageId** | **String** | Message ID (present for message.* and delivery events) |  [optional] |
|**accountId** | **Integer** | Account ID (present for delivery events) |  [optional] |
|**domainId** | **String** | Sending domain UUID (present for delivery events) |  [optional] |
|**to** | **String** | Recipient email (present for delivery events) |  [optional] |
|**status** | **String** | Delivery status (present for delivery events) |  [optional] |
|**smtpCode** | **Integer** | SMTP response code (present for bounced/deferred/failed) |  [optional] |
|**smtpResponse** | **String** | SMTP diagnostic string (present for bounced/deferred/failed) |  [optional] |
|**mxHost** | **String** | MX host that handled delivery |  [optional] |
|**bounceType** | [**BounceTypeEnum**](#BounceTypeEnum) | Bounce classification (present for message.bounced) |  [optional] |
|**enhancedStatusCode** | **String** | Enhanced SMTP status code (e.g., 5.1.1) |  [optional] |
|**attempts** | **Integer** | Number of delivery attempts |  [optional] |
|**isp** | **String** | Receiving ISP name |  [optional] |
|**isMpp** | **Boolean** | Whether the open was from Apple Mail Privacy Protection |  [optional] |
|**ipAddress** | **String** | Client IP (present for message.opened/clicked) |  [optional] |
|**userAgent** | **String** | Client user agent (present for message.opened/clicked) |  [optional] |
|**isBot** | **Boolean** | Whether the event was triggered by a bot (present for message.opened/clicked) |  [optional] |
|**linkUrl** | **String** | Clicked URL (present for message.clicked) |  [optional] |
|**linkIndex** | **Integer** | Position of clicked link in message (present for message.clicked) |  [optional] |



## Enum: EventEnum

| Name | Value |
|---- | -----|
| JOB_COMPLETED | &quot;job.completed&quot; |
| JOB_FAILED | &quot;job.failed&quot; |
| MESSAGE_QUEUED | &quot;message.queued&quot; |
| MESSAGE_DELIVERED | &quot;message.delivered&quot; |
| MESSAGE_BOUNCED | &quot;message.bounced&quot; |
| MESSAGE_DEFERRED | &quot;message.deferred&quot; |
| MESSAGE_FAILED | &quot;message.failed&quot; |
| MESSAGE_OPENED | &quot;message.opened&quot; |
| MESSAGE_CLICKED | &quot;message.clicked&quot; |
| TEST | &quot;test&quot; |



## Enum: BounceTypeEnum

| Name | Value |
|---- | -----|
| HARD | &quot;hard&quot; |
| SOFT | &quot;soft&quot; |



