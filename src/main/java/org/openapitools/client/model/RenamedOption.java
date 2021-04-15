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
import org.openapitools.client.model.RenamedCascadingOption;

/**
 * Details of a custom field option to rename.
 */
@ApiModel(description = "Details of a custom field option to rename.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class RenamedOption {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_NEW_VALUE = "newValue";
  @SerializedName(SERIALIZED_NAME_NEW_VALUE)
  private String newValue;

  public static final String SERIALIZED_NAME_CASCADING_OPTIONS = "cascadingOptions";
  @SerializedName(SERIALIZED_NAME_CASCADING_OPTIONS)
  private List<RenamedCascadingOption> cascadingOptions = null;


  public RenamedOption value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The current option value.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The current option value.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public RenamedOption newValue(String newValue) {
    
    this.newValue = newValue;
    return this;
  }

   /**
   * The new value of the option.
   * @return newValue
  **/
  @ApiModelProperty(required = true, value = "The new value of the option.")

  public String getNewValue() {
    return newValue;
  }


  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }


  public RenamedOption cascadingOptions(List<RenamedCascadingOption> cascadingOptions) {
    
    this.cascadingOptions = cascadingOptions;
    return this;
  }

  public RenamedOption addCascadingOptionsItem(RenamedCascadingOption cascadingOptionsItem) {
    if (this.cascadingOptions == null) {
      this.cascadingOptions = new ArrayList<RenamedCascadingOption>();
    }
    this.cascadingOptions.add(cascadingOptionsItem);
    return this;
  }

   /**
   * The new values for the cascading options of this option. Only used for Select List (cascading) fields.
   * @return cascadingOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The new values for the cascading options of this option. Only used for Select List (cascading) fields.")

  public List<RenamedCascadingOption> getCascadingOptions() {
    return cascadingOptions;
  }


  public void setCascadingOptions(List<RenamedCascadingOption> cascadingOptions) {
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
    RenamedOption renamedOption = (RenamedOption) o;
    return Objects.equals(this.value, renamedOption.value) &&
        Objects.equals(this.newValue, renamedOption.newValue) &&
        Objects.equals(this.cascadingOptions, renamedOption.cascadingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, newValue, cascadingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenamedOption {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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
