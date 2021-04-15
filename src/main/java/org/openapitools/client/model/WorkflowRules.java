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
import org.openapitools.client.model.WorkflowConditionBean;
import org.openapitools.client.model.WorkflowTransitionRule;

/**
 * A collection of transition rules.
 */
@ApiModel(description = "A collection of transition rules.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class WorkflowRules {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<WorkflowTransitionRule> conditions = new ArrayList<WorkflowTransitionRule>();

  public static final String SERIALIZED_NAME_CONDITIONS_TREE = "conditionsTree";
  @SerializedName(SERIALIZED_NAME_CONDITIONS_TREE)
  private WorkflowConditionBean conditionsTree;

  public static final String SERIALIZED_NAME_VALIDATORS = "validators";
  @SerializedName(SERIALIZED_NAME_VALIDATORS)
  private List<WorkflowTransitionRule> validators = new ArrayList<WorkflowTransitionRule>();

  public static final String SERIALIZED_NAME_POST_FUNCTIONS = "postFunctions";
  @SerializedName(SERIALIZED_NAME_POST_FUNCTIONS)
  private List<WorkflowTransitionRule> postFunctions = new ArrayList<WorkflowTransitionRule>();


  public WorkflowRules conditions(List<WorkflowTransitionRule> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public WorkflowRules addConditionsItem(WorkflowTransitionRule conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The workflow conditions.
   * @return conditions
  **/
  @ApiModelProperty(required = true, value = "The workflow conditions.")

  public List<WorkflowTransitionRule> getConditions() {
    return conditions;
  }


  public void setConditions(List<WorkflowTransitionRule> conditions) {
    this.conditions = conditions;
  }


  public WorkflowRules conditionsTree(WorkflowConditionBean conditionsTree) {
    
    this.conditionsTree = conditionsTree;
    return this;
  }

   /**
   * Get conditionsTree
   * @return conditionsTree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowConditionBean getConditionsTree() {
    return conditionsTree;
  }


  public void setConditionsTree(WorkflowConditionBean conditionsTree) {
    this.conditionsTree = conditionsTree;
  }


  public WorkflowRules validators(List<WorkflowTransitionRule> validators) {
    
    this.validators = validators;
    return this;
  }

  public WorkflowRules addValidatorsItem(WorkflowTransitionRule validatorsItem) {
    this.validators.add(validatorsItem);
    return this;
  }

   /**
   * The workflow validators.
   * @return validators
  **/
  @ApiModelProperty(required = true, value = "The workflow validators.")

  public List<WorkflowTransitionRule> getValidators() {
    return validators;
  }


  public void setValidators(List<WorkflowTransitionRule> validators) {
    this.validators = validators;
  }


  public WorkflowRules postFunctions(List<WorkflowTransitionRule> postFunctions) {
    
    this.postFunctions = postFunctions;
    return this;
  }

  public WorkflowRules addPostFunctionsItem(WorkflowTransitionRule postFunctionsItem) {
    this.postFunctions.add(postFunctionsItem);
    return this;
  }

   /**
   * The workflow post functions.
   * @return postFunctions
  **/
  @ApiModelProperty(required = true, value = "The workflow post functions.")

  public List<WorkflowTransitionRule> getPostFunctions() {
    return postFunctions;
  }


  public void setPostFunctions(List<WorkflowTransitionRule> postFunctions) {
    this.postFunctions = postFunctions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowRules workflowRules = (WorkflowRules) o;
    return Objects.equals(this.conditions, workflowRules.conditions) &&
        Objects.equals(this.conditionsTree, workflowRules.conditionsTree) &&
        Objects.equals(this.validators, workflowRules.validators) &&
        Objects.equals(this.postFunctions, workflowRules.postFunctions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, conditionsTree, validators, postFunctions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRules {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    conditionsTree: ").append(toIndentedString(conditionsTree)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
    sb.append("    postFunctions: ").append(toIndentedString(postFunctions)).append("\n");
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

