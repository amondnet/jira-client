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
 * The classic workflow identifiers.
 */
@ApiModel(description = "The classic workflow identifiers.")
@JsonPropertyOrder({
  WorkflowID.JSON_PROPERTY_NAME,
  WorkflowID.JSON_PROPERTY_ENTITY_ID
})
@JsonTypeName("WorkflowID")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class WorkflowID {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;


  public WorkflowID name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the workflow.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the workflow.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkflowID entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * The entity ID of the workflow.
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The entity ID of the workflow.")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowID workflowID = (WorkflowID) o;
    return Objects.equals(this.name, workflowID.name) &&
        Objects.equals(this.entityId, workflowID.entityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, entityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowID {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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

