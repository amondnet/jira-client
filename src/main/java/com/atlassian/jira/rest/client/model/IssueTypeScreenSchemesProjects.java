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


package com.atlassian.jira.rest.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.atlassian.jira.rest.client.model.IssueTypeScreenScheme;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Issue type screen scheme with a list of the projects that use it.
 */
@ApiModel(description = "Issue type screen scheme with a list of the projects that use it.")
@JsonPropertyOrder({
  IssueTypeScreenSchemesProjects.JSON_PROPERTY_ISSUE_TYPE_SCREEN_SCHEME,
  IssueTypeScreenSchemesProjects.JSON_PROPERTY_PROJECT_IDS
})
@JsonTypeName("IssueTypeScreenSchemesProjects")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class IssueTypeScreenSchemesProjects {
  public static final String JSON_PROPERTY_ISSUE_TYPE_SCREEN_SCHEME = "issueTypeScreenScheme";
  private IssueTypeScreenScheme issueTypeScreenScheme = null;

  public static final String JSON_PROPERTY_PROJECT_IDS = "projectIds";
  private List<String> projectIds = new ArrayList<>();


  public IssueTypeScreenSchemesProjects issueTypeScreenScheme(IssueTypeScreenScheme issueTypeScreenScheme) {
    
    this.issueTypeScreenScheme = issueTypeScreenScheme;
    return this;
  }

   /**
   * Details of an issue type screen scheme.
   * @return issueTypeScreenScheme
  **/
  @ApiModelProperty(required = true, value = "Details of an issue type screen scheme.")
  @JsonProperty(JSON_PROPERTY_ISSUE_TYPE_SCREEN_SCHEME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IssueTypeScreenScheme getIssueTypeScreenScheme() {
    return issueTypeScreenScheme;
  }


  public void setIssueTypeScreenScheme(IssueTypeScreenScheme issueTypeScreenScheme) {
    this.issueTypeScreenScheme = issueTypeScreenScheme;
  }


  public IssueTypeScreenSchemesProjects projectIds(List<String> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public IssueTypeScreenSchemesProjects addProjectIdsItem(String projectIdsItem) {
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * The IDs of the projects using the issue type screen scheme.
   * @return projectIds
  **/
  @ApiModelProperty(required = true, value = "The IDs of the projects using the issue type screen scheme.")
  @JsonProperty(JSON_PROPERTY_PROJECT_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeScreenSchemesProjects issueTypeScreenSchemesProjects = (IssueTypeScreenSchemesProjects) o;
    return Objects.equals(this.issueTypeScreenScheme, issueTypeScreenSchemesProjects.issueTypeScreenScheme) &&
        Objects.equals(this.projectIds, issueTypeScreenSchemesProjects.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeScreenScheme, projectIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScreenSchemesProjects {\n");
    sb.append("    issueTypeScreenScheme: ").append(toIndentedString(issueTypeScreenScheme)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

