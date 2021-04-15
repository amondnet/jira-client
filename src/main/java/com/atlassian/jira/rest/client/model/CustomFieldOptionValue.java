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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Value of a custom field option and the values of its cascading options.
 */
@ApiModel(description = "Value of a custom field option and the values of its cascading options.")
@JsonPropertyOrder({
  CustomFieldOptionValue.JSON_PROPERTY_VALUE,
  CustomFieldOptionValue.JSON_PROPERTY_CASCADING_OPTIONS
})
@JsonTypeName("CustomFieldOptionValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class CustomFieldOptionValue {
  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_CASCADING_OPTIONS = "cascadingOptions";
  private List<String> cascadingOptions = null;


  public CustomFieldOptionValue value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the custom field option.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of the custom field option.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public CustomFieldOptionValue cascadingOptions(List<String> cascadingOptions) {
    
    this.cascadingOptions = cascadingOptions;
    return this;
  }

  public CustomFieldOptionValue addCascadingOptionsItem(String cascadingOptionsItem) {
    if (this.cascadingOptions == null) {
      this.cascadingOptions = new ArrayList<>();
    }
    this.cascadingOptions.add(cascadingOptionsItem);
    return this;
  }

   /**
   * The cascading options.
   * @return cascadingOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cascading options.")
  @JsonProperty(JSON_PROPERTY_CASCADING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCascadingOptions() {
    return cascadingOptions;
  }


  public void setCascadingOptions(List<String> cascadingOptions) {
    this.cascadingOptions = cascadingOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldOptionValue customFieldOptionValue = (CustomFieldOptionValue) o;
    return Objects.equals(this.value, customFieldOptionValue.value) &&
        Objects.equals(this.cascadingOptions, customFieldOptionValue.cascadingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, cascadingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldOptionValue {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    cascadingOptions: ").append(toIndentedString(cascadingOptions)).append("\n");
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

