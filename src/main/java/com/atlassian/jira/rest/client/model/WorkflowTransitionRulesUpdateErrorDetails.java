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
import com.atlassian.jira.rest.client.model.WorkflowId;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Details of any errors encountered while updating workflow transition rules for a workflow.
 */
@ApiModel(description = "Details of any errors encountered while updating workflow transition rules for a workflow.")
@JsonPropertyOrder({
  WorkflowTransitionRulesUpdateErrorDetails.JSON_PROPERTY_WORKFLOW_ID,
  WorkflowTransitionRulesUpdateErrorDetails.JSON_PROPERTY_RULE_UPDATE_ERRORS,
  WorkflowTransitionRulesUpdateErrorDetails.JSON_PROPERTY_UPDATE_ERRORS
})
@JsonTypeName("WorkflowTransitionRulesUpdateErrorDetails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class WorkflowTransitionRulesUpdateErrorDetails {
  public static final String JSON_PROPERTY_WORKFLOW_ID = "workflowId";
  private WorkflowId workflowId;

  public static final String JSON_PROPERTY_RULE_UPDATE_ERRORS = "ruleUpdateErrors";
  private Map<String, Set<String>> ruleUpdateErrors = new HashMap<>();

  public static final String JSON_PROPERTY_UPDATE_ERRORS = "updateErrors";
  private Set<String> updateErrors = new LinkedHashSet<>();


  public WorkflowTransitionRulesUpdateErrorDetails workflowId(WorkflowId workflowId) {
    
    this.workflowId = workflowId;
    return this;
  }

   /**
   * Get workflowId
   * @return workflowId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WORKFLOW_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WorkflowId getWorkflowId() {
    return workflowId;
  }


  public void setWorkflowId(WorkflowId workflowId) {
    this.workflowId = workflowId;
  }


  public WorkflowTransitionRulesUpdateErrorDetails ruleUpdateErrors(Map<String, Set<String>> ruleUpdateErrors) {
    
    this.ruleUpdateErrors = ruleUpdateErrors;
    return this;
  }

  public WorkflowTransitionRulesUpdateErrorDetails putRuleUpdateErrorsItem(String key, Set<String> ruleUpdateErrorsItem) {
    this.ruleUpdateErrors.put(key, ruleUpdateErrorsItem);
    return this;
  }

   /**
   * A list of transition rule update errors, indexed by the transition rule ID. Any transition rule that appears here wasn&#39;t updated.
   * @return ruleUpdateErrors
  **/
  @ApiModelProperty(required = true, value = "A list of transition rule update errors, indexed by the transition rule ID. Any transition rule that appears here wasn't updated.")
  @JsonProperty(JSON_PROPERTY_RULE_UPDATE_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, Set<String>> getRuleUpdateErrors() {
    return ruleUpdateErrors;
  }


  public void setRuleUpdateErrors(Map<String, Set<String>> ruleUpdateErrors) {
    this.ruleUpdateErrors = ruleUpdateErrors;
  }


  public WorkflowTransitionRulesUpdateErrorDetails updateErrors(Set<String> updateErrors) {
    
    this.updateErrors = updateErrors;
    return this;
  }

  public WorkflowTransitionRulesUpdateErrorDetails addUpdateErrorsItem(String updateErrorsItem) {
    this.updateErrors.add(updateErrorsItem);
    return this;
  }

   /**
   * The list of errors that specify why the workflow update failed. The workflow was not updated if the list contains any entries.
   * @return updateErrors
  **/
  @ApiModelProperty(required = true, value = "The list of errors that specify why the workflow update failed. The workflow was not updated if the list contains any entries.")
  @JsonProperty(JSON_PROPERTY_UPDATE_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getUpdateErrors() {
    return updateErrors;
  }


  public void setUpdateErrors(Set<String> updateErrors) {
    this.updateErrors = updateErrors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTransitionRulesUpdateErrorDetails workflowTransitionRulesUpdateErrorDetails = (WorkflowTransitionRulesUpdateErrorDetails) o;
    return Objects.equals(this.workflowId, workflowTransitionRulesUpdateErrorDetails.workflowId) &&
        Objects.equals(this.ruleUpdateErrors, workflowTransitionRulesUpdateErrorDetails.ruleUpdateErrors) &&
        Objects.equals(this.updateErrors, workflowTransitionRulesUpdateErrorDetails.updateErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowId, ruleUpdateErrors, updateErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTransitionRulesUpdateErrorDetails {\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    ruleUpdateErrors: ").append(toIndentedString(ruleUpdateErrors)).append("\n");
    sb.append("    updateErrors: ").append(toIndentedString(updateErrors)).append("\n");
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

