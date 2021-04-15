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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Details of project permissions and associated issues and projects to look up.
 */
@ApiModel(description = "Details of project permissions and associated issues and projects to look up.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class BulkProjectPermissions {
  public static final String SERIALIZED_NAME_ISSUES = "issues";
  @SerializedName(SERIALIZED_NAME_ISSUES)
  private Set<Long> issues = null;

  public static final String SERIALIZED_NAME_PROJECTS = "projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private Set<Long> projects = null;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private Set<String> permissions = new LinkedHashSet<String>();


  public BulkProjectPermissions issues(Set<Long> issues) {
    
    this.issues = issues;
    return this;
  }

  public BulkProjectPermissions addIssuesItem(Long issuesItem) {
    if (this.issues == null) {
      this.issues = new LinkedHashSet<Long>();
    }
    this.issues.add(issuesItem);
    return this;
  }

   /**
   * List of issue IDs.
   * @return issues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of issue IDs.")

  public Set<Long> getIssues() {
    return issues;
  }


  public void setIssues(Set<Long> issues) {
    this.issues = issues;
  }


  public BulkProjectPermissions projects(Set<Long> projects) {
    
    this.projects = projects;
    return this;
  }

  public BulkProjectPermissions addProjectsItem(Long projectsItem) {
    if (this.projects == null) {
      this.projects = new LinkedHashSet<Long>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * List of project IDs.
   * @return projects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of project IDs.")

  public Set<Long> getProjects() {
    return projects;
  }


  public void setProjects(Set<Long> projects) {
    this.projects = projects;
  }


  public BulkProjectPermissions permissions(Set<String> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public BulkProjectPermissions addPermissionsItem(String permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * List of project permissions.
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "List of project permissions.")

  public Set<String> getPermissions() {
    return permissions;
  }


  public void setPermissions(Set<String> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkProjectPermissions bulkProjectPermissions = (BulkProjectPermissions) o;
    return Objects.equals(this.issues, bulkProjectPermissions.issues) &&
        Objects.equals(this.projects, bulkProjectPermissions.projects) &&
        Objects.equals(this.permissions, bulkProjectPermissions.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issues, projects, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkProjectPermissions {\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

