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
import org.openapitools.client.model.ChangedWorklogs;
import org.openapitools.client.model.PageOfWorklogs;
import org.openapitools.client.model.Worklog;
import org.openapitools.client.model.WorklogIdsRequestBean;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueWorklogsApi
 */
@Ignore
public class IssueWorklogsApiTest {

    private final IssueWorklogsApi api = new IssueWorklogsApi();

    
    /**
     * Add worklog
     *
     * Adds a worklog to an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Work on issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addWorklogTest() throws ApiException {
        String issueIdOrKey = null;
        Map<String, Object> requestBody = null;
        Boolean notifyUsers = null;
        String adjustEstimate = null;
        String newEstimate = null;
        String reduceBy = null;
        String expand = null;
        Boolean overrideEditableFlag = null;
        Worklog response = api.addWorklog(issueIdOrKey, requestBody, notifyUsers, adjustEstimate, newEstimate, reduceBy, expand, overrideEditableFlag);

        // TODO: test validations
    }
    
    /**
     * Delete worklog
     *
     * Deletes a worklog from an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Delete all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to delete any worklog or *Delete own worklogs* to delete worklogs created by the user,  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWorklogTest() throws ApiException {
        String issueIdOrKey = null;
        String id = null;
        Boolean notifyUsers = null;
        String adjustEstimate = null;
        String newEstimate = null;
        String increaseBy = null;
        Boolean overrideEditableFlag = null;
        api.deleteWorklog(issueIdOrKey, id, notifyUsers, adjustEstimate, newEstimate, increaseBy, overrideEditableFlag);

        // TODO: test validations
    }
    
    /**
     * Get IDs of deleted worklogs
     *
     * Returns a list of IDs and delete timestamps for worklogs deleted after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, &#x60;until&#x60; indicates the timestamp of the youngest item on the page. Also, &#x60;nextPage&#x60; provides the URL for the next page of worklogs. The &#x60;lastPage&#x60; parameter is set to true on the last page of worklogs.  This resource does not return worklogs deleted during the minute preceding the request.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdsOfWorklogsDeletedSinceTest() throws ApiException {
        Long since = null;
        ChangedWorklogs response = api.getIdsOfWorklogsDeletedSince(since);

        // TODO: test validations
    }
    
    /**
     * Get IDs of updated worklogs
     *
     * Returns a list of IDs and update timestamps for worklogs updated after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, &#x60;until&#x60; indicates the timestamp of the youngest item on the page. Also, &#x60;nextPage&#x60; provides the URL for the next page of worklogs. The &#x60;lastPage&#x60; parameter is set to true on the last page of worklogs.  This resource does not return worklogs updated during the minute preceding the request.  **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdsOfWorklogsModifiedSinceTest() throws ApiException {
        Long since = null;
        String expand = null;
        ChangedWorklogs response = api.getIdsOfWorklogsModifiedSince(since, expand);

        // TODO: test validations
    }
    
    /**
     * Get issue worklogs
     *
     * Returns worklogs for an issue, starting from the oldest worklog or from the worklog started on or after a date and time.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Workloads are only returned where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssueWorklogTest() throws ApiException {
        String issueIdOrKey = null;
        Long startAt = null;
        Integer maxResults = null;
        Long startedAfter = null;
        String expand = null;
        PageOfWorklogs response = api.getIssueWorklog(issueIdOrKey, startAt, maxResults, startedAfter, expand);

        // TODO: test validations
    }
    
    /**
     * Get worklog
     *
     * Returns a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorklogTest() throws ApiException {
        String issueIdOrKey = null;
        String id = null;
        String expand = null;
        Worklog response = api.getWorklog(issueIdOrKey, id, expand);

        // TODO: test validations
    }
    
    /**
     * Get worklogs
     *
     * Returns worklog details for a list of worklog IDs.  The returned list of worklogs is limited to 1000 items.  **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorklogsForIdsTest() throws ApiException {
        WorklogIdsRequestBean worklogIdsRequestBean = null;
        String expand = null;
        List<Worklog> response = api.getWorklogsForIds(worklogIdsRequestBean, expand);

        // TODO: test validations
    }
    
    /**
     * Update worklog
     *
     * Updates a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any worklog or *Edit own worklogs* to update worklogs created by the user.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWorklogTest() throws ApiException {
        String issueIdOrKey = null;
        String id = null;
        Map<String, Object> requestBody = null;
        Boolean notifyUsers = null;
        String adjustEstimate = null;
        String newEstimate = null;
        String expand = null;
        Boolean overrideEditableFlag = null;
        Worklog response = api.updateWorklog(issueIdOrKey, id, requestBody, notifyUsers, adjustEstimate, newEstimate, expand, overrideEditableFlag);

        // TODO: test validations
    }
    
}
