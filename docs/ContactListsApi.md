# ContactListsApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addContact**](ContactListsApi.md#addContact) | **POST** /v1/contact-lists/{list_id}/contacts | Add contact to list |
| [**appendToContactList**](ContactListsApi.md#appendToContactList) | **POST** /v1/contact-lists/{list_id}/append | Append to contact list |
| [**createContactList**](ContactListsApi.md#createContactList) | **POST** /v1/contact-lists | Create contact list |
| [**deleteContact**](ContactListsApi.md#deleteContact) | **DELETE** /v1/contact-lists/{list_id}/contacts/{contact_id} | Delete contact |
| [**deleteContactList**](ContactListsApi.md#deleteContactList) | **DELETE** /v1/contact-lists/{list_id} | Delete a contact list |
| [**exportContactList**](ContactListsApi.md#exportContactList) | **GET** /v1/contact-lists/{list_id}/export | Export contact list |
| [**getInactiveContactsReport**](ContactListsApi.md#getInactiveContactsReport) | **GET** /v1/contacts/inactive-report | Get inactive contacts report |
| [**importContactList**](ContactListsApi.md#importContactList) | **POST** /v1/contact-lists/{list_id}/import | Import contacts from CSV |
| [**listContactLists**](ContactListsApi.md#listContactLists) | **GET** /v1/contact-lists | List contact lists |
| [**queryContactList**](ContactListsApi.md#queryContactList) | **POST** /v1/contact-lists/{list_id}/query | Query contact list |
| [**updateContact**](ContactListsApi.md#updateContact) | **PATCH** /v1/contact-lists/{list_id}/contacts/{contact_id} | Update contact |


<a id="addContact"></a>
# **addContact**
> AddContact201Response addContact(listId, addContactRequest)

Add contact to list

Add a single contact to a contact list.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ContactListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContactListsApi apiInstance = new ContactListsApi(defaultClient);
    String listId = "listId_example"; // String | Contact list ID
    AddContactRequest addContactRequest = new AddContactRequest(); // AddContactRequest | 
    try {
      AddContact201Response result = apiInstance.addContact(listId, addContactRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactListsApi#addContact");
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
| **listId** | **String**| Contact list ID | |
| **addContactRequest** | [**AddContactRequest**](AddContactRequest.md)|  | |

### Return type

[**AddContact201Response**](AddContact201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Contact added |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="appendToContactList"></a>
# **appendToContactList**
> AppendToContactList200Response appendToContactList(listId, appendToContactListRequest)

Append to contact list

Append validated emails from additional jobs to an existing contact list. Duplicates are automatically skipped.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ContactListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContactListsApi apiInstance = new ContactListsApi(defaultClient);
    String listId = "listId_example"; // String | Contact list UUID
    AppendToContactListRequest appendToContactListRequest = new AppendToContactListRequest(); // AppendToContactListRequest | 
    try {
      AppendToContactList200Response result = apiInstance.appendToContactList(listId, appendToContactListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactListsApi#appendToContactList");
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
| **listId** | **String**| Contact list UUID | |
| **appendToContactListRequest** | [**AppendToContactListRequest**](AppendToContactListRequest.md)|  | |

### Return type

[**AppendToContactList200Response**](AppendToContactList200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Append result |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="createContactList"></a>
# **createContactList**
> CreateContactList201Response createContactList(createContactListRequest)

Create contact list

Create a new contact list from one or more completed validation jobs. Only accepted (valid) emails are included.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ContactListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContactListsApi apiInstance = new ContactListsApi(defaultClient);
    CreateContactListRequest createContactListRequest = new CreateContactListRequest(); // CreateContactListRequest | 
    try {
      CreateContactList201Response result = apiInstance.createContactList(createContactListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactListsApi#createContactList");
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
| **createContactListRequest** | [**CreateContactListRequest**](CreateContactListRequest.md)|  | |

### Return type

[**CreateContactList201Response**](CreateContactList201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Contact list created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

<a id="deleteContact"></a>
# **deleteContact**
> DeletePolicyRule200Response deleteContact(listId, contactId)

Delete contact

Remove a single contact from a contact list.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ContactListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContactListsApi apiInstance = new ContactListsApi(defaultClient);
    String listId = "listId_example"; // String | Contact list ID
    String contactId = "contactId_example"; // String | Contact ID
    try {
      DeletePolicyRule200Response result = apiInstance.deleteContact(listId, contactId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactListsApi#deleteContact");
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
| **listId** | **String**| Contact list ID | |
| **contactId** | **String**| Contact ID | |

### Return type

[**DeletePolicyRule200Response**](DeletePolicyRule200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contact deleted |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="deleteContactList"></a>
# **deleteContactList**
> DeletePolicyRule200Response deleteContactList(listId)

Delete a contact list

Permanently delete a contact list and all its entries.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ContactListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContactListsApi apiInstance = new ContactListsApi(defaultClient);
    String listId = "listId_example"; // String | Contact list UUID
    try {
      DeletePolicyRule200Response result = apiInstance.deleteContactList(listId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactListsApi#deleteContactList");
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
| **listId** | **String**| Contact list UUID | |

### Return type

[**DeletePolicyRule200Response**](DeletePolicyRule200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contact list deleted |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="exportContactList"></a>
# **exportContactList**
> String exportContactList(listId)

Export contact list

Export a contact list as CSV.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ContactListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContactListsApi apiInstance = new ContactListsApi(defaultClient);
    String listId = "listId_example"; // String | Contact list ID
    try {
      String result = apiInstance.exportContactList(listId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactListsApi#exportContactList");
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
| **listId** | **String**| Contact list ID | |

### Return type

**String**

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CSV export |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="getInactiveContactsReport"></a>
# **getInactiveContactsReport**
> GetInactiveContactsReport200Response getInactiveContactsReport(days)

Get inactive contacts report

Get a report of contacts across all lists with no engagement activity (opens, clicks) in the specified period.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ContactListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContactListsApi apiInstance = new ContactListsApi(defaultClient);
    Integer days = 90; // Integer | Inactivity threshold in days
    try {
      GetInactiveContactsReport200Response result = apiInstance.getInactiveContactsReport(days);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactListsApi#getInactiveContactsReport");
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
| **days** | **Integer**| Inactivity threshold in days | [optional] [default to 90] |

### Return type

[**GetInactiveContactsReport200Response**](GetInactiveContactsReport200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inactive contacts report |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

<a id="importContactList"></a>
# **importContactList**
> ImportContactList200Response importContactList(listId, _file, columnMapping, consentSource, tags)

Import contacts from CSV

Import contacts into a list from a CSV file (max 10MB).

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ContactListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContactListsApi apiInstance = new ContactListsApi(defaultClient);
    String listId = "listId_example"; // String | Contact list ID
    File _file = new File("/path/to/file"); // File | CSV file (max 10MB)
    String columnMapping = "columnMapping_example"; // String | JSON mapping of CSV columns to contact fields
    String consentSource = "consentSource_example"; // String | Source of consent for imported contacts
    String tags = "tags_example"; // String | JSON array of tags to apply
    try {
      ImportContactList200Response result = apiInstance.importContactList(listId, _file, columnMapping, consentSource, tags);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactListsApi#importContactList");
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
| **listId** | **String**| Contact list ID | |
| **_file** | **File**| CSV file (max 10MB) | |
| **columnMapping** | **String**| JSON mapping of CSV columns to contact fields | [optional] |
| **consentSource** | **String**| Source of consent for imported contacts | [optional] |
| **tags** | **String**| JSON array of tags to apply | [optional] |

### Return type

[**ImportContactList200Response**](ImportContactList200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Import results |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="listContactLists"></a>
# **listContactLists**
> ListContactLists200Response listContactLists(page, perPage)

List contact lists

List contact lists for the authenticated account. Contact lists are built from validated email jobs.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ContactListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContactListsApi apiInstance = new ContactListsApi(defaultClient);
    Integer page = 1; // Integer | 
    Integer perPage = 20; // Integer | 
    try {
      ListContactLists200Response result = apiInstance.listContactLists(page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactListsApi#listContactLists");
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

### Return type

[**ListContactLists200Response**](ListContactLists200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of contact lists |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **403** | Forbidden - Insufficient permissions or no credits |  -  |

<a id="queryContactList"></a>
# **queryContactList**
> QueryContactList200Response queryContactList(listId, queryContactListRequest)

Query contact list

Query contact list entries with structured filters. Supports filtering by validation status, domain, and other attributes.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ContactListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContactListsApi apiInstance = new ContactListsApi(defaultClient);
    String listId = "listId_example"; // String | Contact list UUID
    QueryContactListRequest queryContactListRequest = new QueryContactListRequest(); // QueryContactListRequest | 
    try {
      QueryContactList200Response result = apiInstance.queryContactList(listId, queryContactListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactListsApi#queryContactList");
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
| **listId** | **String**| Contact list UUID | |
| **queryContactListRequest** | [**QueryContactListRequest**](QueryContactListRequest.md)|  | |

### Return type

[**QueryContactList200Response**](QueryContactList200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query results |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

<a id="updateContact"></a>
# **updateContact**
> AddContact201Response updateContact(listId, contactId, updateContactRequest)

Update contact

Update a single contact in a contact list.

### Example
```java
// Import classes:
import com.mailodds.ApiClient;
import com.mailodds.ApiException;
import com.mailodds.Configuration;
import com.mailodds.auth.*;
import com.mailodds.models.*;
import com.mailodds.api.ContactListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailodds.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContactListsApi apiInstance = new ContactListsApi(defaultClient);
    String listId = "listId_example"; // String | Contact list ID
    String contactId = "contactId_example"; // String | Contact ID
    UpdateContactRequest updateContactRequest = new UpdateContactRequest(); // UpdateContactRequest | 
    try {
      AddContact201Response result = apiInstance.updateContact(listId, contactId, updateContactRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactListsApi#updateContact");
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
| **listId** | **String**| Contact list ID | |
| **contactId** | **String**| Contact ID | |
| **updateContactRequest** | [**UpdateContactRequest**](UpdateContactRequest.md)|  | |

### Return type

[**AddContact201Response**](AddContact201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contact updated |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid or missing API key |  -  |
| **404** | Resource not found |  -  |

