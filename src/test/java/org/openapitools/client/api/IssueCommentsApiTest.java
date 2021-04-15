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
import org.openapitools.client.model.Comment;
import org.openapitools.client.model.IssueCommentListRequestBean;
import org.openapitools.client.model.PageBeanComment;
import org.openapitools.client.model.PageOfComments;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueCommentsApi
 */
@Ignore
public class IssueCommentsApiTest {

    private final IssueCommentsApi api = new IssueCommentsApi();

    
    /**
     * Add comment
     *
     * Adds a comment to an issue.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Add comments* [ project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCommentTest() throws ApiException {
        String issueIdOrKey = null;
        Map<String, Object> requestBody = null;
        String expand = null;
        Comment response = api.addComment(issueIdOrKey, requestBody, expand);

        // TODO: test validations
    }
    
    /**
     * Delete comment
     *
     * Deletes a comment.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Delete all comments*[ project permission](https://confluence.atlassian.com/x/yodKLg) to delete any comment or *Delete own comments* to delete comment created by the user,  *  If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCommentTest() throws ApiException {
        String issueIdOrKey = null;
        String id = null;
        api.deleteComment(issueIdOrKey, id);

        // TODO: test validations
    }
    
    /**
     * Get comment
     *
     * Returns a comment.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentTest() throws ApiException {
        String issueIdOrKey = null;
        String id = null;
        String expand = null;
        Comment response = api.getComment(issueIdOrKey, id, expand);

        // TODO: test validations
    }
    
    /**
     * Get comments
     *
     * Returns all comments for an issue.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Comments are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is role visibility is restricted to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentsTest() throws ApiException {
        String issueIdOrKey = null;
        Long startAt = null;
        Integer maxResults = null;
        String orderBy = null;
        String expand = null;
        PageOfComments response = api.getComments(issueIdOrKey, startAt, maxResults, orderBy, expand);

        // TODO: test validations
    }
    
    /**
     * Get comments by IDs
     *
     * Returns a [paginated](#pagination) list of just the comments for a list of comments specified by comment IDs.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Comments are returned where the user:   *  has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentsByIdsTest() throws ApiException {
        IssueCommentListRequestBean issueCommentListRequestBean = null;
        String expand = null;
        PageBeanComment response = api.getCommentsByIds(issueCommentListRequestBean, expand);

        // TODO: test validations
    }
    
    /**
     * Update comment
     *
     * Updates a comment.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all comments*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any comment or *Edit own comments* to update comment created by the user.  *  If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCommentTest() throws ApiException {
        String issueIdOrKey = null;
        String id = null;
        Map<String, Object> requestBody = null;
        String expand = null;
        Comment response = api.updateComment(issueIdOrKey, id, requestBody, expand);

        // TODO: test validations
    }
    
}
