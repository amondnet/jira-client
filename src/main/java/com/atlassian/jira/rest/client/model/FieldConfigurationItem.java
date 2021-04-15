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
 * A field within a field configuration.
 */
@ApiModel(description = "A field within a field configuration.")
@JsonPropertyOrder({
  FieldConfigurationItem.JSON_PROPERTY_ID,
  FieldConfigurationItem.JSON_PROPERTY_DESCRIPTION,
  FieldConfigurationItem.JSON_PROPERTY_IS_HIDDEN,
  FieldConfigurationItem.JSON_PROPERTY_IS_REQUIRED
})
@JsonTypeName("FieldConfigurationItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class FieldConfigurationItem {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_IS_HIDDEN = "isHidden";
  private Boolean isHidden;

  public static final String JSON_PROPERTY_IS_REQUIRED = "isRequired";
  private Boolean isRequired;


  public FieldConfigurationItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the field within the field configuration.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the field within the field configuration.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FieldConfigurationItem description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the field within the field configuration.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the field within the field configuration.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public FieldConfigurationItem isHidden(Boolean isHidden) {
    
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Whether the field is hidden in the field configuration.
   * @return isHidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the field is hidden in the field configuration.")
  @JsonProperty(JSON_PROPERTY_IS_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsHidden() {
    return isHidden;
  }


  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }


  public FieldConfigurationItem isRequired(Boolean isRequired) {
    
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Whether the field is required in the field configuration.
   * @return isRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the field is required in the field configuration.")
  @JsonProperty(JSON_PROPERTY_IS_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRequired() {
    return isRequired;
  }


  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldConfigurationItem fieldConfigurationItem = (FieldConfigurationItem) o;
    return Objects.equals(this.id, fieldConfigurationItem.id) &&
        Objects.equals(this.description, fieldConfigurationItem.description) &&
        Objects.equals(this.isHidden, fieldConfigurationItem.isHidden) &&
        Objects.equals(this.isRequired, fieldConfigurationItem.isRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, isHidden, isRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfigurationItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
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

