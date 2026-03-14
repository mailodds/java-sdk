

# GetDmarcRecommendation200ResponseRecommendation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currentPolicy** | **String** | Current DMARC policy (none, quarantine, reject) |  [optional] |
|**recommendedPolicy** | **String** | Recommended DMARC policy |  [optional] |
|**confidence** | **BigDecimal** | Confidence level (0-1) |  [optional] |
|**reasons** | **List&lt;String&gt;** | Reasons for the recommendation |  [optional] |
|**readyToUpgrade** | **Boolean** | Whether it is safe to upgrade |  [optional] |



