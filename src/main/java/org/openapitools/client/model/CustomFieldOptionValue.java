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
 * Value of a custom field option and the values of its cascading options.
 */
@ApiModel(description = "Value of a custom field option and the values of its cascading options.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class CustomFieldOptionValue {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_CASCADING_OPTIONS = "cascadingOptions";
  @SerializedName(SERIALIZED_NAME_CASCADING_OPTIONS)
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
      this.cascadingOptions = new ArrayList<String>();
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

