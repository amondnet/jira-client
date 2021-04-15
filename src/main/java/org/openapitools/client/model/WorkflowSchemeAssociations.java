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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.WorkflowScheme;

/**
 * A workflow scheme along with a list of projects that use it.
 */
@ApiModel(description = "A workflow scheme along with a list of projects that use it.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class WorkflowSchemeAssociations {
  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private List<String> projectIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_WORKFLOW_SCHEME = "workflowScheme";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_SCHEME)
  private WorkflowScheme workflowScheme = null;


  public WorkflowSchemeAssociations projectIds(List<String> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public WorkflowSchemeAssociations addProjectIdsItem(String projectIdsItem) {
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * The list of projects that use the workflow scheme.
   * @return projectIds
  **/
  @ApiModelProperty(required = true, value = "The list of projects that use the workflow scheme.")

  public List<String> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }


  public WorkflowSchemeAssociations workflowScheme(WorkflowScheme workflowScheme) {
    
    this.workflowScheme = workflowScheme;
    return this;
  }

   /**
   * The workflow scheme.
   * @return workflowScheme
  **/
  @ApiModelProperty(required = true, value = "The workflow scheme.")

  public WorkflowScheme getWorkflowScheme() {
    return workflowScheme;
  }


  public void setWorkflowScheme(WorkflowScheme workflowScheme) {
    this.workflowScheme = workflowScheme;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSchemeAssociations workflowSchemeAssociations = (WorkflowSchemeAssociations) o;
    return Objects.equals(this.projectIds, workflowSchemeAssociations.projectIds) &&
        Objects.equals(this.workflowScheme, workflowSchemeAssociations.workflowScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectIds, workflowScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSchemeAssociations {\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    workflowScheme: ").append(toIndentedString(workflowScheme)).append("\n");
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

