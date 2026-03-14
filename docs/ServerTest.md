

# ServerTest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Test UUID |  [optional] |
|**domain** | **String** | Tested domain |  [optional] |
|**status** | **String** | Test status |  [optional] |
|**mxRecords** | [**List&lt;ServerTestMxRecordsInner&gt;**](ServerTestMxRecordsInner.md) |  |  [optional] |
|**smtpCheck** | [**ServerTestSmtpCheck**](ServerTestSmtpCheck.md) |  |  [optional] |
|**dnsChecks** | [**ServerTestDnsChecks**](ServerTestDnsChecks.md) |  |  [optional] |
|**score** | **Integer** | Overall server configuration score (0-100) |  [optional] |
|**recommendations** | **List&lt;String&gt;** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |



