# DefaultApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFeaturesForProject**](DefaultApi.md#getFeaturesForProject) | **GET** /rest/api/3/project/{projectIdOrKey}/features | Get features for project


<a name="getFeaturesForProject"></a>
# **getFeaturesForProject**
> Object getFeaturesForProject(projectIdOrKey)

Get features for project

Returns the list of features for the given project. The project must be a Company-managed project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String projectIdOrKey = "projectIdOrKey_example"; // String | The ID or the key of the project
    try {
      Object result = apiInstance.getFeaturesForProject(projectIdOrKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getFeaturesForProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **String**| The ID or the key of the project |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returned if the request is successful. |  -  |
**400** | Returned if the given project is not a company-managed project or is not a jira software project. |  -  |
**401** | Returned if the authentication credentials are incorrect or missing. |  -  |
**403** | Returned if the user does not have the required permissions. |  -  |
**404** | Returned if there is no project corresponding to the given ID or key. |  -  |

