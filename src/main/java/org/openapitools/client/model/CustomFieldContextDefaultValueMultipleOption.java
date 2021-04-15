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

/**
 * Default value for a multi-select custom field.
 */
@ApiModel(description = "Default value for a multi-select custom field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class CustomFieldContextDefaultValueMultipleOption {
  public static final String SERIALIZED_NAME_CONTEXT_ID = "contextId";
  @SerializedName(SERIALIZED_NAME_CONTEXT_ID)
  private String contextId;

  public static final String SERIALIZED_NAME_OPTION_IDS = "optionIds";
  @SerializedName(SERIALIZED_NAME_OPTION_IDS)
  private List<String> optionIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public CustomFieldContextDefaultValueMultipleOption contextId(String contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * The ID of the context.
   * @return contextId
  **/
  @ApiModelProperty(required = true, value = "The ID of the context.")

  public String getContextId() {
    return contextId;
  }


  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  public CustomFieldContextDefaultValueMultipleOption optionIds(List<String> optionIds) {
    
    this.optionIds = optionIds;
    return this;
  }

  public CustomFieldContextDefaultValueMultipleOption addOptionIdsItem(String optionIdsItem) {
    this.optionIds.add(optionIdsItem);
    return this;
  }

   /**
   * The list of IDs of the default options.
   * @return optionIds
  **/
  @ApiModelProperty(required = true, value = "The list of IDs of the default options.")

  public List<String> getOptionIds() {
    return optionIds;
  }


  public void setOptionIds(List<String> optionIds) {
    this.optionIds = optionIds;
  }


  public CustomFieldContextDefaultValueMultipleOption type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

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
    CustomFieldContextDefaultValueMultipleOption customFieldContextDefaultValueMultipleOption = (CustomFieldContextDefaultValueMultipleOption) o;
    return Objects.equals(this.contextId, customFieldContextDefaultValueMultipleOption.contextId) &&
        Objects.equals(this.optionIds, customFieldContextDefaultValueMultipleOption.optionIds) &&
        Objects.equals(this.type, customFieldContextDefaultValueMultipleOption.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, optionIds, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueMultipleOption {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    optionIds: ").append(toIndentedString(optionIds)).append("\n");
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
