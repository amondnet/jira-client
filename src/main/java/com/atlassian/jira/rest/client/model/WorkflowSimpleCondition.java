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
 * A workflow transition condition rule.
 */
@ApiModel(description = "A workflow transition condition rule.")
@JsonPropertyOrder({
  WorkflowSimpleCondition.JSON_PROPERTY_TYPE,
  WorkflowSimpleCondition.JSON_PROPERTY_CONFIGURATION,
  WorkflowSimpleCondition.JSON_PROPERTY_NODE_TYPE
})
@JsonTypeName("WorkflowSimpleCondition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class WorkflowSimpleCondition {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  private Object _configuration;

  public static final String JSON_PROPERTY_NODE_TYPE = "nodeType";
  private String nodeType;


  public WorkflowSimpleCondition type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the transition rule.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the transition rule.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public WorkflowSimpleCondition _configuration(Object _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

   /**
   * The configuration of the transition rule. This is currently returned only for some of the rule types. Availability of this property is subject to change.
   * @return _configuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The configuration of the transition rule. This is currently returned only for some of the rule types. Availability of this property is subject to change.")
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getConfiguration() {
    return _configuration;
  }


  public void setConfiguration(Object _configuration) {
    this._configuration = _configuration;
  }


  public WorkflowSimpleCondition nodeType(String nodeType) {
    
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NODE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNodeType() {
    return nodeType;
  }


  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSimpleCondition workflowSimpleCondition = (WorkflowSimpleCondition) o;
    return Objects.equals(this.type, workflowSimpleCondition.type) &&
        Objects.equals(this._configuration, workflowSimpleCondition._configuration) &&
        Objects.equals(this.nodeType, workflowSimpleCondition.nodeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, _configuration, nodeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSimpleCondition {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
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

