

# CreateJobRequest

Bulk jobs use the account's default validation policy. To use a specific policy, set it as default via the Policies API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emails** | **List&lt;String&gt;** | List of emails to validate |  |
|**dedup** | **Boolean** | Remove duplicate emails |  [optional] |
|**metadata** | **Object** | Custom metadata for the job |  [optional] |
|**webhookUrl** | **URI** | URL for completion webhook. Payloads are signed with HMAC-SHA256 if a webhook secret is configured (see Webhooks section). |  [optional] |
|**idempotencyKey** | **String** | Unique key for idempotent requests |  [optional] |



