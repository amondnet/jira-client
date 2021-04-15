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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.EntityProperty;
import org.openapitools.client.model.PropertyKeys;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserPropertiesApi
 */
@Ignore
public class UserPropertiesApiTest {

    private final UserPropertiesApi api = new UserPropertiesApi();

    
    /**
     * Delete user property
     *
     * Deletes a property from a user.  Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to delete a property from any user.  *  Access to Jira, to delete a property from the calling user&#39;s record.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserPropertyTest() throws ApiException {
        String propertyKey = null;
        String accountId = null;
        String userKey = null;
        String username = null;
        api.deleteUserProperty(propertyKey, accountId, userKey, username);

        // TODO: test validations
    }
    
    /**
     * Get user property
     *
     * Returns the value of a user&#39;s property. If no property key is provided [Get user property keys](#api-rest-api-3-user-properties-get) is called.  Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to get a property from any user.  *  Access to Jira, to get a property from the calling user&#39;s record.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserPropertyTest() throws ApiException {
        String propertyKey = null;
        String accountId = null;
        String userKey = null;
        String username = null;
        EntityProperty response = api.getUserProperty(propertyKey, accountId, userKey, username);

        // TODO: test validations
    }
    
    /**
     * Get user property keys
     *
     * Returns the keys of all properties for a user.  Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to access the property keys on any user.  *  Access to Jira, to access the calling user&#39;s property keys.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserPropertyKeysTest() throws ApiException {
        String accountId = null;
        String userKey = null;
        String username = null;
        PropertyKeys response = api.getUserPropertyKeys(accountId, userKey, username);

        // TODO: test validations
    }
    
    /**
     * Set user property
     *
     * Sets the value of a user&#39;s property. Use this resource to store custom data against a user.  Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to set a property on any user.  *  Access to Jira, to set a property on the calling user&#39;s record.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setUserPropertyTest() throws ApiException {
        String propertyKey = null;
        Object body = null;
        String accountId = null;
        String userKey = null;
        String username = null;
        Object response = api.setUserProperty(propertyKey, body, accountId, userKey, username);

        // TODO: test validations
    }
    
}
