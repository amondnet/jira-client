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

/**
 * Details of a field configuration.
 */
@ApiModel(description = "Details of a field configuration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class FieldConfiguration {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;


  public FieldConfiguration id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the field configuration.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the field configuration.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public FieldConfiguration name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the field configuration.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the field configuration.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FieldConfiguration description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the field configuration.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the field configuration.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public FieldConfiguration isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Whether the field configuration is the default.
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the field configuration is the default.")

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldConfiguration fieldConfiguration = (FieldConfiguration) o;
    return Objects.equals(this.id, fieldConfiguration.id) &&
        Objects.equals(this.name, fieldConfiguration.name) &&
        Objects.equals(this.description, fieldConfiguration.description) &&
        Objects.equals(this.isDefault, fieldConfiguration.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, isDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfiguration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

