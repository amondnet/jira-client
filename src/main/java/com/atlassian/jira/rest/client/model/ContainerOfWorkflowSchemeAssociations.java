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
import com.atlassian.jira.rest.client.model.WorkflowSchemeAssociations;
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
 * A container for a list of workflow schemes together with the projects they are associated with.
 */
@ApiModel(description = "A container for a list of workflow schemes together with the projects they are associated with.")
@JsonPropertyOrder({
  ContainerOfWorkflowSchemeAssociations.JSON_PROPERTY_VALUES
})
@JsonTypeName("ContainerOfWorkflowSchemeAssociations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class ContainerOfWorkflowSchemeAssociations {
  public static final String JSON_PROPERTY_VALUES = "values";
  private List<WorkflowSchemeAssociations> values = new ArrayList<>();


  public ContainerOfWorkflowSchemeAssociations values(List<WorkflowSchemeAssociations> values) {
    
    this.values = values;
    return this;
  }

  public ContainerOfWorkflowSchemeAssociations addValuesItem(WorkflowSchemeAssociations valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * A list of workflow schemes together with projects they are associated with.
   * @return values
  **/
  @ApiModelProperty(required = true, value = "A list of workflow schemes together with projects they are associated with.")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<WorkflowSchemeAssociations> getValues() {
    return values;
  }


  public void setValues(List<WorkflowSchemeAssociations> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerOfWorkflowSchemeAssociations containerOfWorkflowSchemeAssociations = (ContainerOfWorkflowSchemeAssociations) o;
    return Objects.equals(this.values, containerOfWorkflowSchemeAssociations.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerOfWorkflowSchemeAssociations {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
