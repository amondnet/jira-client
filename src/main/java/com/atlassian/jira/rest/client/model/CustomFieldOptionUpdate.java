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
 * Details of a custom field option for a context.
 */
@ApiModel(description = "Details of a custom field option for a context.")
@JsonPropertyOrder({
  CustomFieldOptionUpdate.JSON_PROPERTY_ID,
  CustomFieldOptionUpdate.JSON_PROPERTY_VALUE,
  CustomFieldOptionUpdate.JSON_PROPERTY_DISABLED
})
@JsonTypeName("CustomFieldOptionUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class CustomFieldOptionUpdate {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;


  public CustomFieldOptionUpdate id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the custom field option.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the custom field option.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CustomFieldOptionUpdate value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the custom field option.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the custom field option.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public CustomFieldOptionUpdate disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Whether the option is disabled.
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the option is disabled.")
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldOptionUpdate customFieldOptionUpdate = (CustomFieldOptionUpdate) o;
    return Objects.equals(this.id, customFieldOptionUpdate.id) &&
        Objects.equals(this.value, customFieldOptionUpdate.value) &&
        Objects.equals(this.disabled, customFieldOptionUpdate.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, disabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldOptionUpdate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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

