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
 * Default value for a single select custom field.
 */
@ApiModel(description = "Default value for a single select custom field.")
@JsonPropertyOrder({
  CustomFieldContextDefaultValueSingleOption.JSON_PROPERTY_CONTEXT_ID,
  CustomFieldContextDefaultValueSingleOption.JSON_PROPERTY_OPTION_ID,
  CustomFieldContextDefaultValueSingleOption.JSON_PROPERTY_TYPE
})
@JsonTypeName("CustomFieldContextDefaultValueSingleOption")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class CustomFieldContextDefaultValueSingleOption {
  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_OPTION_ID = "optionId";
  private String optionId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;


  public CustomFieldContextDefaultValueSingleOption contextId(String contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * The ID of the context.
   * @return contextId
  **/
  @ApiModelProperty(required = true, value = "The ID of the context.")
  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContextId() {
    return contextId;
  }


  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  public CustomFieldContextDefaultValueSingleOption optionId(String optionId) {
    
    this.optionId = optionId;
    return this;
  }

   /**
   * The ID of the default option.
   * @return optionId
  **/
  @ApiModelProperty(required = true, value = "The ID of the default option.")
  @JsonProperty(JSON_PROPERTY_OPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOptionId() {
    return optionId;
  }


  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }


  public CustomFieldContextDefaultValueSingleOption type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueSingleOption customFieldContextDefaultValueSingleOption = (CustomFieldContextDefaultValueSingleOption) o;
    return Objects.equals(this.contextId, customFieldContextDefaultValueSingleOption.contextId) &&
        Objects.equals(this.optionId, customFieldContextDefaultValueSingleOption.optionId) &&
        Objects.equals(this.type, customFieldContextDefaultValueSingleOption.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, optionId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueSingleOption {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
