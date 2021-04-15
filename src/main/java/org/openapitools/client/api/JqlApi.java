/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.AutoCompleteSuggestions;
import org.openapitools.client.model.ConvertedJQLQueries;
import org.openapitools.client.model.ErrorCollection;
import org.openapitools.client.model.JQLPersonalDataMigrationRequest;
import org.openapitools.client.model.JQLReferenceData;
import org.openapitools.client.model.JqlQueriesToParse;
import org.openapitools.client.model.ParsedJqlQueries;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JqlApi {
    private ApiClient localVarApiClient;

    public JqlApi() {
        this(Configuration.getDefaultApiClient());
    }

    public JqlApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getAutoComplete
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAutoCompleteCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/api/3/jql/autocompletedata";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAutoCompleteValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAutoCompleteCall(_callback);
        return localVarCall;

    }

    /**
     * Get field reference data
     * Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * @return JQLReferenceData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public JQLReferenceData getAutoComplete() throws ApiException {
        ApiResponse<JQLReferenceData> localVarResp = getAutoCompleteWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get field reference data
     * Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * @return ApiResponse&lt;JQLReferenceData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<JQLReferenceData> getAutoCompleteWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAutoCompleteValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<JQLReferenceData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get field reference data (asynchronously)
     * Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAutoCompleteAsync(final ApiCallback<JQLReferenceData> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAutoCompleteValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<JQLReferenceData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFieldAutoCompleteForQueryString
     * @param fieldName The name of the field. (optional)
     * @param fieldValue The partial field item name entered by the user. (optional)
     * @param predicateName The name of the [ CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*. (optional)
     * @param predicateValue The partial predicate item name entered by the user. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if an invalid combination of parameters is passed. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFieldAutoCompleteForQueryStringCall(String fieldName, String fieldValue, String predicateName, String predicateValue, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/api/3/jql/autocompletedata/suggestions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fieldName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldName", fieldName));
        }

        if (fieldValue != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldValue", fieldValue));
        }

        if (predicateName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("predicateName", predicateName));
        }

        if (predicateValue != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("predicateValue", predicateValue));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getFieldAutoCompleteForQueryStringValidateBeforeCall(String fieldName, String fieldValue, String predicateName, String predicateValue, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getFieldAutoCompleteForQueryStringCall(fieldName, fieldValue, predicateName, predicateValue, _callback);
        return localVarCall;

    }

    /**
     * Get field auto complete suggestions
     * Returns the JQL search auto complete suggestions for a field.  Suggestions can be obtained by providing:   *  &#x60;fieldName&#x60; to get a list of all values for the field.  *  &#x60;fieldName&#x60; and &#x60;fieldValue&#x60; to get a list of values containing the text in &#x60;fieldValue&#x60;.  *  &#x60;fieldName&#x60; and &#x60;predicateName&#x60; to get a list of all predicate values for the field.  *  &#x60;fieldName&#x60;, &#x60;predicateName&#x60;, and &#x60;predicateValue&#x60; to get a list of predicate values containing the text in &#x60;predicateValue&#x60;.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * @param fieldName The name of the field. (optional)
     * @param fieldValue The partial field item name entered by the user. (optional)
     * @param predicateName The name of the [ CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*. (optional)
     * @param predicateValue The partial predicate item name entered by the user. (optional)
     * @return AutoCompleteSuggestions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if an invalid combination of parameters is passed. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public AutoCompleteSuggestions getFieldAutoCompleteForQueryString(String fieldName, String fieldValue, String predicateName, String predicateValue) throws ApiException {
        ApiResponse<AutoCompleteSuggestions> localVarResp = getFieldAutoCompleteForQueryStringWithHttpInfo(fieldName, fieldValue, predicateName, predicateValue);
        return localVarResp.getData();
    }

    /**
     * Get field auto complete suggestions
     * Returns the JQL search auto complete suggestions for a field.  Suggestions can be obtained by providing:   *  &#x60;fieldName&#x60; to get a list of all values for the field.  *  &#x60;fieldName&#x60; and &#x60;fieldValue&#x60; to get a list of values containing the text in &#x60;fieldValue&#x60;.  *  &#x60;fieldName&#x60; and &#x60;predicateName&#x60; to get a list of all predicate values for the field.  *  &#x60;fieldName&#x60;, &#x60;predicateName&#x60;, and &#x60;predicateValue&#x60; to get a list of predicate values containing the text in &#x60;predicateValue&#x60;.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * @param fieldName The name of the field. (optional)
     * @param fieldValue The partial field item name entered by the user. (optional)
     * @param predicateName The name of the [ CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*. (optional)
     * @param predicateValue The partial predicate item name entered by the user. (optional)
     * @return ApiResponse&lt;AutoCompleteSuggestions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if an invalid combination of parameters is passed. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AutoCompleteSuggestions> getFieldAutoCompleteForQueryStringWithHttpInfo(String fieldName, String fieldValue, String predicateName, String predicateValue) throws ApiException {
        okhttp3.Call localVarCall = getFieldAutoCompleteForQueryStringValidateBeforeCall(fieldName, fieldValue, predicateName, predicateValue, null);
        Type localVarReturnType = new TypeToken<AutoCompleteSuggestions>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get field auto complete suggestions (asynchronously)
     * Returns the JQL search auto complete suggestions for a field.  Suggestions can be obtained by providing:   *  &#x60;fieldName&#x60; to get a list of all values for the field.  *  &#x60;fieldName&#x60; and &#x60;fieldValue&#x60; to get a list of values containing the text in &#x60;fieldValue&#x60;.  *  &#x60;fieldName&#x60; and &#x60;predicateName&#x60; to get a list of all predicate values for the field.  *  &#x60;fieldName&#x60;, &#x60;predicateName&#x60;, and &#x60;predicateValue&#x60; to get a list of predicate values containing the text in &#x60;predicateValue&#x60;.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * @param fieldName The name of the field. (optional)
     * @param fieldValue The partial field item name entered by the user. (optional)
     * @param predicateName The name of the [ CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*. (optional)
     * @param predicateValue The partial predicate item name entered by the user. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if an invalid combination of parameters is passed. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFieldAutoCompleteForQueryStringAsync(String fieldName, String fieldValue, String predicateName, String predicateValue, final ApiCallback<AutoCompleteSuggestions> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFieldAutoCompleteForQueryStringValidateBeforeCall(fieldName, fieldValue, predicateName, predicateValue, _callback);
        Type localVarReturnType = new TypeToken<AutoCompleteSuggestions>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for migrateQueries
     * @param jqLPersonalDataMigrationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. Note that the JQL queries are returned in the same order that they were passed. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if at least one of the queries cannot be converted. For example, the JQL has invalid operators or invalid keywords, or the users in the query cannot be found. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call migrateQueriesCall(JQLPersonalDataMigrationRequest jqLPersonalDataMigrationRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = jqLPersonalDataMigrationRequest;

        // create path and map variables
        String localVarPath = "/rest/api/3/jql/pdcleaner";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call migrateQueriesValidateBeforeCall(JQLPersonalDataMigrationRequest jqLPersonalDataMigrationRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'jqLPersonalDataMigrationRequest' is set
        if (jqLPersonalDataMigrationRequest == null) {
            throw new ApiException("Missing the required parameter 'jqLPersonalDataMigrationRequest' when calling migrateQueries(Async)");
        }
        

        okhttp3.Call localVarCall = migrateQueriesCall(jqLPersonalDataMigrationRequest, _callback);
        return localVarCall;

    }

    /**
     * Convert user identifiers to account IDs in JQL queries
     * Converts one or more JQL queries with user identifiers (username or user key) to equivalent JQL queries with account IDs.  You may wish to use this operation if your system stores JQL queries and you want to make them GDPR-compliant. For more information about GDPR-related changes, see the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/).  **[Permissions](#permissions) required:** Permission to access Jira.
     * @param jqLPersonalDataMigrationRequest  (required)
     * @return ConvertedJQLQueries
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. Note that the JQL queries are returned in the same order that they were passed. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if at least one of the queries cannot be converted. For example, the JQL has invalid operators or invalid keywords, or the users in the query cannot be found. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public ConvertedJQLQueries migrateQueries(JQLPersonalDataMigrationRequest jqLPersonalDataMigrationRequest) throws ApiException {
        ApiResponse<ConvertedJQLQueries> localVarResp = migrateQueriesWithHttpInfo(jqLPersonalDataMigrationRequest);
        return localVarResp.getData();
    }

    /**
     * Convert user identifiers to account IDs in JQL queries
     * Converts one or more JQL queries with user identifiers (username or user key) to equivalent JQL queries with account IDs.  You may wish to use this operation if your system stores JQL queries and you want to make them GDPR-compliant. For more information about GDPR-related changes, see the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/).  **[Permissions](#permissions) required:** Permission to access Jira.
     * @param jqLPersonalDataMigrationRequest  (required)
     * @return ApiResponse&lt;ConvertedJQLQueries&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. Note that the JQL queries are returned in the same order that they were passed. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if at least one of the queries cannot be converted. For example, the JQL has invalid operators or invalid keywords, or the users in the query cannot be found. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ConvertedJQLQueries> migrateQueriesWithHttpInfo(JQLPersonalDataMigrationRequest jqLPersonalDataMigrationRequest) throws ApiException {
        okhttp3.Call localVarCall = migrateQueriesValidateBeforeCall(jqLPersonalDataMigrationRequest, null);
        Type localVarReturnType = new TypeToken<ConvertedJQLQueries>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Convert user identifiers to account IDs in JQL queries (asynchronously)
     * Converts one or more JQL queries with user identifiers (username or user key) to equivalent JQL queries with account IDs.  You may wish to use this operation if your system stores JQL queries and you want to make them GDPR-compliant. For more information about GDPR-related changes, see the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/).  **[Permissions](#permissions) required:** Permission to access Jira.
     * @param jqLPersonalDataMigrationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. Note that the JQL queries are returned in the same order that they were passed. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if at least one of the queries cannot be converted. For example, the JQL has invalid operators or invalid keywords, or the users in the query cannot be found. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call migrateQueriesAsync(JQLPersonalDataMigrationRequest jqLPersonalDataMigrationRequest, final ApiCallback<ConvertedJQLQueries> _callback) throws ApiException {

        okhttp3.Call localVarCall = migrateQueriesValidateBeforeCall(jqLPersonalDataMigrationRequest, _callback);
        Type localVarReturnType = new TypeToken<ConvertedJQLQueries>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for parseJqlQueries
     * @param jqlQueriesToParse  (required)
     * @param validation How to validate the JQL query and treat the validation results. Validation options include:   *  &#x60;strict&#x60; Returns all errors. If validation fails, the query structure is not returned.  *  &#x60;warn&#x60; Returns all errors. If validation fails but the JQL query is correctly formed, the query structure is returned.  *  &#x60;none&#x60; No validation is performed. If JQL query is correctly formed, the query structure is returned. (optional, default to strict)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call parseJqlQueriesCall(JqlQueriesToParse jqlQueriesToParse, String validation, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = jqlQueriesToParse;

        // create path and map variables
        String localVarPath = "/rest/api/3/jql/parse";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (validation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("validation", validation));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call parseJqlQueriesValidateBeforeCall(JqlQueriesToParse jqlQueriesToParse, String validation, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'jqlQueriesToParse' is set
        if (jqlQueriesToParse == null) {
            throw new ApiException("Missing the required parameter 'jqlQueriesToParse' when calling parseJqlQueries(Async)");
        }
        

        okhttp3.Call localVarCall = parseJqlQueriesCall(jqlQueriesToParse, validation, _callback);
        return localVarCall;

    }

    /**
     * Parse JQL query
     * Parses and validates JQL queries.  Validation is performed in context of the current user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * @param jqlQueriesToParse  (required)
     * @param validation How to validate the JQL query and treat the validation results. Validation options include:   *  &#x60;strict&#x60; Returns all errors. If validation fails, the query structure is not returned.  *  &#x60;warn&#x60; Returns all errors. If validation fails but the JQL query is correctly formed, the query structure is returned.  *  &#x60;none&#x60; No validation is performed. If JQL query is correctly formed, the query structure is returned. (optional, default to strict)
     * @return ParsedJqlQueries
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public ParsedJqlQueries parseJqlQueries(JqlQueriesToParse jqlQueriesToParse, String validation) throws ApiException {
        ApiResponse<ParsedJqlQueries> localVarResp = parseJqlQueriesWithHttpInfo(jqlQueriesToParse, validation);
        return localVarResp.getData();
    }

    /**
     * Parse JQL query
     * Parses and validates JQL queries.  Validation is performed in context of the current user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * @param jqlQueriesToParse  (required)
     * @param validation How to validate the JQL query and treat the validation results. Validation options include:   *  &#x60;strict&#x60; Returns all errors. If validation fails, the query structure is not returned.  *  &#x60;warn&#x60; Returns all errors. If validation fails but the JQL query is correctly formed, the query structure is returned.  *  &#x60;none&#x60; No validation is performed. If JQL query is correctly formed, the query structure is returned. (optional, default to strict)
     * @return ApiResponse&lt;ParsedJqlQueries&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ParsedJqlQueries> parseJqlQueriesWithHttpInfo(JqlQueriesToParse jqlQueriesToParse, String validation) throws ApiException {
        okhttp3.Call localVarCall = parseJqlQueriesValidateBeforeCall(jqlQueriesToParse, validation, null);
        Type localVarReturnType = new TypeToken<ParsedJqlQueries>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Parse JQL query (asynchronously)
     * Parses and validates JQL queries.  Validation is performed in context of the current user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * @param jqlQueriesToParse  (required)
     * @param validation How to validate the JQL query and treat the validation results. Validation options include:   *  &#x60;strict&#x60; Returns all errors. If validation fails, the query structure is not returned.  *  &#x60;warn&#x60; Returns all errors. If validation fails but the JQL query is correctly formed, the query structure is returned.  *  &#x60;none&#x60; No validation is performed. If JQL query is correctly formed, the query structure is returned. (optional, default to strict)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call parseJqlQueriesAsync(JqlQueriesToParse jqlQueriesToParse, String validation, final ApiCallback<ParsedJqlQueries> _callback) throws ApiException {

        okhttp3.Call localVarCall = parseJqlQueriesValidateBeforeCall(jqlQueriesToParse, validation, _callback);
        Type localVarReturnType = new TypeToken<ParsedJqlQueries>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
