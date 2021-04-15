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
import com.atlassian.jira.rest.client.model.CustomFieldContextDefaultValue;
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
 * Default values to update.
 */
@ApiModel(description = "Default values to update.")
@JsonPropertyOrder({
  CustomFieldContextDefaultValueUpdate.JSON_PROPERTY_DEFAULT_VALUES
})
@JsonTypeName("CustomFieldContextDefaultValueUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class CustomFieldContextDefaultValueUpdate {
  public static final String JSON_PROPERTY_DEFAULT_VALUES = "defaultValues";
  private List<CustomFieldContextDefaultValue> defaultValues = null;


  public CustomFieldContextDefaultValueUpdate defaultValues(List<CustomFieldContextDefaultValue> defaultValues) {
    
    this.defaultValues = defaultValues;
    return this;
  }

  public CustomFieldContextDefaultValueUpdate addDefaultValuesItem(CustomFieldContextDefaultValue defaultValuesItem) {
    if (this.defaultValues == null) {
      this.defaultValues = new ArrayList<>();
    }
    this.defaultValues.add(defaultValuesItem);
    return this;
  }

   /**
   * Get defaultValues
   * @return defaultValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CustomFieldContextDefaultValue> getDefaultValues() {
    return defaultValues;
  }


  public void setDefaultValues(List<CustomFieldContextDefaultValue> defaultValues) {
    this.defaultValues = defaultValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueUpdate customFieldContextDefaultValueUpdate = (CustomFieldContextDefaultValueUpdate) o;
    return Objects.equals(this.defaultValues, customFieldContextDefaultValueUpdate.defaultValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueUpdate {\n");
    sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
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

