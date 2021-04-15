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
import com.atlassian.jira.rest.client.model.CustomFieldContextOption;
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
 * A list of custom field options for a context.
 */
@ApiModel(description = "A list of custom field options for a context.")
@JsonPropertyOrder({
  CustomFieldCreatedContextOptionsList.JSON_PROPERTY_OPTIONS
})
@JsonTypeName("CustomFieldCreatedContextOptionsList")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class CustomFieldCreatedContextOptionsList {
  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<CustomFieldContextOption> options = null;


  public CustomFieldCreatedContextOptionsList options(List<CustomFieldContextOption> options) {
    
    this.options = options;
    return this;
  }

  public CustomFieldCreatedContextOptionsList addOptionsItem(CustomFieldContextOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * The created custom field options.
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The created custom field options.")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CustomFieldContextOption> getOptions() {
    return options;
  }


  public void setOptions(List<CustomFieldContextOption> options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldCreatedContextOptionsList customFieldCreatedContextOptionsList = (CustomFieldCreatedContextOptionsList) o;
    return Objects.equals(this.options, customFieldCreatedContextOptionsList.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldCreatedContextOptionsList {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

