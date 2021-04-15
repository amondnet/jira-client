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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Details about the default workflow.
 */
@ApiModel(description = "Details about the default workflow.")
@JsonPropertyOrder({
  DefaultWorkflow.JSON_PROPERTY_WORKFLOW,
  DefaultWorkflow.JSON_PROPERTY_UPDATE_DRAFT_IF_NEEDED
})
@JsonTypeName("DefaultWorkflow")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class DefaultWorkflow {
  public static final String JSON_PROPERTY_WORKFLOW = "workflow";
  private String workflow;

  public static final String JSON_PROPERTY_UPDATE_DRAFT_IF_NEEDED = "updateDraftIfNeeded";
  private Boolean updateDraftIfNeeded;


  public DefaultWorkflow workflow(String workflow) {
    
    this.workflow = workflow;
    return this;
  }

   /**
   * The name of the workflow to set as the default workflow.
   * @return workflow
  **/
  @ApiModelProperty(required = true, value = "The name of the workflow to set as the default workflow.")
  @JsonProperty(JSON_PROPERTY_WORKFLOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWorkflow() {
    return workflow;
  }


  public void setWorkflow(String workflow) {
    this.workflow = workflow;
  }


  public DefaultWorkflow updateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    
    this.updateDraftIfNeeded = updateDraftIfNeeded;
    return this;
  }

   /**
   * Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to &#x60;false&#x60;.
   * @return updateDraftIfNeeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to `false`.")
  @JsonProperty(JSON_PROPERTY_UPDATE_DRAFT_IF_NEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUpdateDraftIfNeeded() {
    return updateDraftIfNeeded;
  }


  public void setUpdateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultWorkflow defaultWorkflow = (DefaultWorkflow) o;
    return Objects.equals(this.workflow, defaultWorkflow.workflow) &&
        Objects.equals(this.updateDraftIfNeeded, defaultWorkflow.updateDraftIfNeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflow, updateDraftIfNeeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultWorkflow {\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
    sb.append("    updateDraftIfNeeded: ").append(toIndentedString(updateDraftIfNeeded)).append("\n");
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

