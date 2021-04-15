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
import com.atlassian.jira.rest.client.model.WorkflowTransitionRules;
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
 * Details about a workflow configuration update request.
 */
@ApiModel(description = "Details about a workflow configuration update request.")
@JsonPropertyOrder({
  WorkflowTransitionRulesUpdate.JSON_PROPERTY_WORKFLOWS
})
@JsonTypeName("WorkflowTransitionRulesUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class WorkflowTransitionRulesUpdate {
  public static final String JSON_PROPERTY_WORKFLOWS = "workflows";
  private List<WorkflowTransitionRules> workflows = new ArrayList<>();


  public WorkflowTransitionRulesUpdate workflows(List<WorkflowTransitionRules> workflows) {
    
    this.workflows = workflows;
    return this;
  }

  public WorkflowTransitionRulesUpdate addWorkflowsItem(WorkflowTransitionRules workflowsItem) {
    this.workflows.add(workflowsItem);
    return this;
  }

   /**
   * The list of workflows with transition rules to update.
   * @return workflows
  **/
  @ApiModelProperty(required = true, value = "The list of workflows with transition rules to update.")
  @JsonProperty(JSON_PROPERTY_WORKFLOWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<WorkflowTransitionRules> getWorkflows() {
    return workflows;
  }


  public void setWorkflows(List<WorkflowTransitionRules> workflows) {
    this.workflows = workflows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTransitionRulesUpdate workflowTransitionRulesUpdate = (WorkflowTransitionRulesUpdate) o;
    return Objects.equals(this.workflows, workflowTransitionRulesUpdate.workflows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTransitionRulesUpdate {\n");
    sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
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

