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
import com.atlassian.jira.rest.client.model.CustomFieldContextDefaultValueCascadingOption;
import com.atlassian.jira.rest.client.model.CustomFieldContextDefaultValueMultipleOption;
import com.atlassian.jira.rest.client.model.CustomFieldContextDefaultValueSingleOption;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CustomFieldContextDefaultValue
 */
@JsonPropertyOrder({
  CustomFieldContextDefaultValue.JSON_PROPERTY_CONTEXT_ID,
  CustomFieldContextDefaultValue.JSON_PROPERTY_OPTION_ID,
  CustomFieldContextDefaultValue.JSON_PROPERTY_CASCADING_OPTION_ID,
  CustomFieldContextDefaultValue.JSON_PROPERTY_TYPE,
  CustomFieldContextDefaultValue.JSON_PROPERTY_OPTION_IDS
})
@JsonTypeName("CustomFieldContextDefaultValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CustomFieldContextDefaultValueCascadingOption.class, name = "CustomFieldContextDefaultValueCascadingOption"),
  @JsonSubTypes.Type(value = CustomFieldContextDefaultValueMultipleOption.class, name = "CustomFieldContextDefaultValueMultipleOption"),
  @JsonSubTypes.Type(value = CustomFieldContextDefaultValueSingleOption.class, name = "CustomFieldContextDefaultValueSingleOption"),
  @JsonSubTypes.Type(value = CustomFieldContextDefaultValueCascadingOption.class, name = "option.cascading"),
  @JsonSubTypes.Type(value = CustomFieldContextDefaultValueMultipleOption.class, name = "option.multiple"),
  @JsonSubTypes.Type(value = CustomFieldContextDefaultValueSingleOption.class, name = "option.single"),
})

public class CustomFieldContextDefaultValue {
  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_OPTION_ID = "optionId";
  private String optionId;

  public static final String JSON_PROPERTY_CASCADING_OPTION_ID = "cascadingOptionId";
  private String cascadingOptionId;

  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type;

  public static final String JSON_PROPERTY_OPTION_IDS = "optionIds";
  private List<String> optionIds = new ArrayList<>();


  public CustomFieldContextDefaultValue contextId(String contextId) {
    
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


  public CustomFieldContextDefaultValue optionId(String optionId) {
    
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


  public CustomFieldContextDefaultValue cascadingOptionId(String cascadingOptionId) {
    
    this.cascadingOptionId = cascadingOptionId;
    return this;
  }

   /**
   * The ID of the default cascading option.
   * @return cascadingOptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the default cascading option.")
  @JsonProperty(JSON_PROPERTY_CASCADING_OPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCascadingOptionId() {
    return cascadingOptionId;
  }


  public void setCascadingOptionId(String cascadingOptionId) {
    this.cascadingOptionId = cascadingOptionId;
  }


  public CustomFieldContextDefaultValue type(String type) {
    
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


  public CustomFieldContextDefaultValue optionIds(List<String> optionIds) {
    
    this.optionIds = optionIds;
    return this;
  }

  public CustomFieldContextDefaultValue addOptionIdsItem(String optionIdsItem) {
    this.optionIds.add(optionIdsItem);
    return this;
  }

   /**
   * The list of IDs of the default options.
   * @return optionIds
  **/
  @ApiModelProperty(required = true, value = "The list of IDs of the default options.")
  @JsonProperty(JSON_PROPERTY_OPTION_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getOptionIds() {
    return optionIds;
  }


  public void setOptionIds(List<String> optionIds) {
    this.optionIds = optionIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValue customFieldContextDefaultValue = (CustomFieldContextDefaultValue) o;
    return Objects.equals(this.contextId, customFieldContextDefaultValue.contextId) &&
        Objects.equals(this.optionId, customFieldContextDefaultValue.optionId) &&
        Objects.equals(this.cascadingOptionId, customFieldContextDefaultValue.cascadingOptionId) &&
        Objects.equals(this.type, customFieldContextDefaultValue.type) &&
        Objects.equals(this.optionIds, customFieldContextDefaultValue.optionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, optionId, cascadingOptionId, type, optionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValue {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
    sb.append("    cascadingOptionId: ").append(toIndentedString(cascadingOptionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    optionIds: ").append(toIndentedString(optionIds)).append("\n");
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

