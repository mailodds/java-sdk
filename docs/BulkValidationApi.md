# BulkValidationApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelJob**](BulkValidationApi.md#cancelJob) | **POST** /v1/jobs/{job_id}/cancel | Cancel a job |
| [**createJob**](BulkValidationApi.md#createJob) | **POST** /v1/jobs | Create bulk validation job (JSON) |
| [**createJobFromS3**](BulkValidationApi.md#createJobFromS3) | **POST** /v1/jobs/upload/s3 | Create job from S3 upload |
| [**createJobUpload**](BulkValidationApi.md#createJobUpload) | **POST** /v1/jobs/upload | Create bulk validation job (file upload) |
| [**deleteJob**](BulkValidationApi.md#deleteJob) | **DELETE** /v1/jobs/{job_id} | Delete a job |
| [**getJob**](BulkValidationApi.md#getJob) | **GET** /v1/jobs/{job_id} | Get job status |
| [**getJobResults**](BulkValidationApi.md#getJobResults) | **GET** /v1/jobs/{job_id}/results | Get job results |
| [**getPresignedUpload**](BulkValidationApi.md#getPresignedUpload) | **POST** /v1/jobs/upload/presigned | Get S3 presigned upload URL |
| [**listJobs**](BulkValidationApi.md#listJobs) | **GET** /v1/jobs | List validation jobs |


<a id="cancelJob"></a>
# **cancelJob**
> JobResponse cancelJob(jobId)

Cancel a job

Cancel a pending or processing job. Partial results are preserved.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BulkValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BulkValidationApi apiInstance = new BulkValidationApi(defaultClient);
    String jobId = "jobId_example"; // String | 
    try {
      JobResponse result = apiInstance.cancelJob(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkValidationApi#cancelJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**|  | |

### Return type

[**JobResponse**](JobResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Job cancelled |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="createJob"></a>
# **createJob**
> JobResponse createJob(createJobRequest)

Create bulk validation job (JSON)

Create a new bulk validation job by submitting a JSON array of emails.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BulkValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BulkValidationApi apiInstance = new BulkValidationApi(defaultClient);
    CreateJobRequest createJobRequest = new CreateJobRequest(); // CreateJobRequest | 
    try {
      JobResponse result = apiInstance.createJob(createJobRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkValidationApi#createJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createJobRequest** | [**CreateJobRequest**](CreateJobRequest.md)|  | |

### Return type

[**JobResponse**](JobResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Job created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="createJobFromS3"></a>
# **createJobFromS3**
> JobResponse createJobFromS3(createJobFromS3Request)

Create job from S3 upload

Create a validation job from a file previously uploaded to S3.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BulkValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BulkValidationApi apiInstance = new BulkValidationApi(defaultClient);
    CreateJobFromS3Request createJobFromS3Request = new CreateJobFromS3Request(); // CreateJobFromS3Request | 
    try {
      JobResponse result = apiInstance.createJobFromS3(createJobFromS3Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkValidationApi#createJobFromS3");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createJobFromS3Request** | [**CreateJobFromS3Request**](CreateJobFromS3Request.md)|  | |

### Return type

[**JobResponse**](JobResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Job created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="createJobUpload"></a>
# **createJobUpload**
> JobResponse createJobUpload(_file, dedup, metadata)

Create bulk validation job (file upload)

Create a new bulk validation job by uploading a CSV, Excel, or TXT file.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BulkValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BulkValidationApi apiInstance = new BulkValidationApi(defaultClient);
    File _file = new File("/path/to/file"); // File | CSV, Excel (.xlsx, .xls), ODS, or TXT file
    Boolean dedup = false; // Boolean | Remove duplicate emails
    String metadata = "metadata_example"; // String | JSON metadata for the job
    try {
      JobResponse result = apiInstance.createJobUpload(_file, dedup, metadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkValidationApi#createJobUpload");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | **File**| CSV, Excel (.xlsx, .xls), ODS, or TXT file | |
| **dedup** | **Boolean**| Remove duplicate emails | [optional] [default to false] |
| **metadata** | **String**| JSON metadata for the job | [optional] |

### Return type

[**JobResponse**](JobResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Job created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

<a id="deleteJob"></a>
# **deleteJob**
> DeleteJob200Response deleteJob(jobId)

Delete a job

Permanently delete a completed or cancelled job and its results.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BulkValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BulkValidationApi apiInstance = new BulkValidationApi(defaultClient);
    String jobId = "jobId_example"; // String | 
    try {
      DeleteJob200Response result = apiInstance.deleteJob(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkValidationApi#deleteJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**|  | |

### Return type

[**DeleteJob200Response**](DeleteJob200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Job deleted |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="getJob"></a>
# **getJob**
> JobResponse getJob(jobId)

Get job status

Get the status and details of a specific validation job.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BulkValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BulkValidationApi apiInstance = new BulkValidationApi(defaultClient);
    String jobId = "jobId_example"; // String | 
    try {
      JobResponse result = apiInstance.getJob(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkValidationApi#getJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**|  | |

### Return type

[**JobResponse**](JobResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Job details |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="getJobResults"></a>
# **getJobResults**
> ResultsResponse getJobResults(jobId, format, filter, page, perPage)

Get job results

Download validation results in JSON, CSV, or NDJSON format.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BulkValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BulkValidationApi apiInstance = new BulkValidationApi(defaultClient);
    String jobId = "jobId_example"; // String | 
    String format = "json"; // String | 
    String filter = "all"; // String | 
    Integer page = 1; // Integer | 
    Integer perPage = 1000; // Integer | 
    try {
      ResultsResponse result = apiInstance.getJobResults(jobId, format, filter, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkValidationApi#getJobResults");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**|  | |
| **format** | **String**|  | [optional] [default to json] [enum: json, csv, ndjson] |
| **filter** | **String**|  | [optional] [enum: all, valid_only, invalid_only] |
| **page** | **Integer**|  | [optional] [default to 1] |
| **perPage** | **Integer**|  | [optional] [default to 1000] |

### Return type

[**ResultsResponse**](ResultsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv, application/x-ndjson

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Validation results |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="getPresignedUpload"></a>
# **getPresignedUpload**
> PresignedUploadResponse getPresignedUpload(getPresignedUploadRequest)

Get S3 presigned upload URL

Get a presigned URL for uploading large files (&gt;10MB) directly to S3.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BulkValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BulkValidationApi apiInstance = new BulkValidationApi(defaultClient);
    GetPresignedUploadRequest getPresignedUploadRequest = new GetPresignedUploadRequest(); // GetPresignedUploadRequest | 
    try {
      PresignedUploadResponse result = apiInstance.getPresignedUpload(getPresignedUploadRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkValidationApi#getPresignedUpload");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getPresignedUploadRequest** | [**GetPresignedUploadRequest**](GetPresignedUploadRequest.md)|  | |

### Return type

[**PresignedUploadResponse**](PresignedUploadResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Presigned upload credentials |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **503** | S3 not configured |  -  |

<a id="listJobs"></a>
# **listJobs**
> JobListResponse listJobs(page, perPage, status)

List validation jobs

List all validation jobs for the authenticated account.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.BulkValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BulkValidationApi apiInstance = new BulkValidationApi(defaultClient);
    Integer page = 1; // Integer | 
    Integer perPage = 20; // Integer | 
    String status = "pending"; // String | 
    try {
      JobListResponse result = apiInstance.listJobs(page, perPage, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkValidationApi#listJobs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**|  | [optional] [default to 1] |
| **perPage** | **Integer**|  | [optional] [default to 20] |
| **status** | **String**|  | [optional] [enum: pending, processing, completed, failed, cancelled] |

### Return type

[**JobListResponse**](JobListResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of jobs |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |

