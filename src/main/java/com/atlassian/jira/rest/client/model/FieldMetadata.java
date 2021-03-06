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
import com.atlassian.jira.rest.client.model.JsonTypeBean;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The metadata describing an issue field.
 */
@ApiModel(description = "The metadata describing an issue field.")
@JsonPropertyOrder({
  FieldMetadata.JSON_PROPERTY_REQUIRED,
  FieldMetadata.JSON_PROPERTY_SCHEMA,
  FieldMetadata.JSON_PROPERTY_NAME,
  FieldMetadata.JSON_PROPERTY_KEY,
  FieldMetadata.JSON_PROPERTY_AUTO_COMPLETE_URL,
  FieldMetadata.JSON_PROPERTY_HAS_DEFAULT_VALUE,
  FieldMetadata.JSON_PROPERTY_OPERATIONS,
  FieldMetadata.JSON_PROPERTY_ALLOWED_VALUES,
  FieldMetadata.JSON_PROPERTY_DEFAULT_VALUE
})
@JsonTypeName("FieldMetadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class FieldMetadata {
  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private JsonTypeBean schema = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_AUTO_COMPLETE_URL = "autoCompleteUrl";
  private String autoCompleteUrl;

  public static final String JSON_PROPERTY_HAS_DEFAULT_VALUE = "hasDefaultValue";
  private Boolean hasDefaultValue;

  public static final String JSON_PROPERTY_OPERATIONS = "operations";
  private List<String> operations = new ArrayList<>();

  public static final String JSON_PROPERTY_ALLOWED_VALUES = "allowedValues";
  private List<Object> allowedValues = null;

  public static final String JSON_PROPERTY_DEFAULT_VALUE = "defaultValue";
  private JsonNullable<Object> defaultValue = JsonNullable.<Object>of(null);


   /**
   * Whether the field is required.
   * @return required
  **/
  @ApiModelProperty(required = true, value = "Whether the field is required.")
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getRequired() {
    return required;
  }




   /**
   * The data type of the field.
   * @return schema
  **/
  @ApiModelProperty(required = true, value = "The data type of the field.")
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JsonTypeBean getSchema() {
    return schema;
  }




   /**
   * The name of the field.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the field.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }




   /**
   * The key of the field.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The key of the field.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKey() {
    return key;
  }




   /**
   * The URL that can be used to automatically complete the field.
   * @return autoCompleteUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL that can be used to automatically complete the field.")
  @JsonProperty(JSON_PROPERTY_AUTO_COMPLETE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAutoCompleteUrl() {
    return autoCompleteUrl;
  }




   /**
   * Whether the field has a default value.
   * @return hasDefaultValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the field has a default value.")
  @JsonProperty(JSON_PROPERTY_HAS_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasDefaultValue() {
    return hasDefaultValue;
  }




   /**
   * The list of operations that can be performed on the field.
   * @return operations
  **/
  @ApiModelProperty(required = true, value = "The list of operations that can be performed on the field.")
  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getOperations() {
    return operations;
  }




   /**
   * The list of values allowed in the field.
   * @return allowedValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of values allowed in the field.")
  @JsonProperty(JSON_PROPERTY_ALLOWED_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getAllowedValues() {
    return allowedValues;
  }




   /**
   * The default value of the field.
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The default value of the field.")
  @JsonIgnore

  public Object getDefaultValue() {
    
    if (defaultValue == null) {
      defaultValue = JsonNullable.<Object>of(null);
    }
    return defaultValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDefaultValue_JsonNullable() {
    return defaultValue;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  private void setDefaultValue_JsonNullable(JsonNullable<Object> defaultValue) {
    this.defaultValue = defaultValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldMetadata fieldMetadata = (FieldMetadata) o;
    return Objects.equals(this.required, fieldMetadata.required) &&
        Objects.equals(this.schema, fieldMetadata.schema) &&
        Objects.equals(this.name, fieldMetadata.name) &&
        Objects.equals(this.key, fieldMetadata.key) &&
        Objects.equals(this.autoCompleteUrl, fieldMetadata.autoCompleteUrl) &&
        Objects.equals(this.hasDefaultValue, fieldMetadata.hasDefaultValue) &&
        Objects.equals(this.operations, fieldMetadata.operations) &&
        Objects.equals(this.allowedValues, fieldMetadata.allowedValues) &&
        Objects.equals(this.defaultValue, fieldMetadata.defaultValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, schema, name, key, autoCompleteUrl, hasDefaultValue, operations, allowedValues, defaultValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldMetadata {\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    autoCompleteUrl: ").append(toIndentedString(autoCompleteUrl)).append("\n");
    sb.append("    hasDefaultValue: ").append(toIndentedString(hasDefaultValue)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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

