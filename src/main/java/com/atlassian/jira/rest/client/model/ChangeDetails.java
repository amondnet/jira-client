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
 * A change item.
 */
@ApiModel(description = "A change item.")
@JsonPropertyOrder({
  ChangeDetails.JSON_PROPERTY_FIELD,
  ChangeDetails.JSON_PROPERTY_FIELDTYPE,
  ChangeDetails.JSON_PROPERTY_FIELD_ID,
  ChangeDetails.JSON_PROPERTY_FROM,
  ChangeDetails.JSON_PROPERTY_FROM_STRING,
  ChangeDetails.JSON_PROPERTY_TO,
  ChangeDetails.JSON_PROPERTY_TO_STRING
})
@JsonTypeName("ChangeDetails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class ChangeDetails {
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_FIELDTYPE = "fieldtype";
  private String fieldtype;

  public static final String JSON_PROPERTY_FIELD_ID = "fieldId";
  private String fieldId;

  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_FROM_STRING = "fromString";
  private String fromString;

  public static final String JSON_PROPERTY_TO = "to";
  private String to;

  public static final String JSON_PROPERTY_TO_STRING = "toString";
  private String toString;


   /**
   * The name of the field changed.
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the field changed.")
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField() {
    return field;
  }




   /**
   * The type of the field changed.
   * @return fieldtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the field changed.")
  @JsonProperty(JSON_PROPERTY_FIELDTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldtype() {
    return fieldtype;
  }




   /**
   * The ID of the field changed.
   * @return fieldId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the field changed.")
  @JsonProperty(JSON_PROPERTY_FIELD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldId() {
    return fieldId;
  }




   /**
   * The details of the original value.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The details of the original value.")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFrom() {
    return from;
  }




   /**
   * The details of the original value as a string.
   * @return fromString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The details of the original value as a string.")
  @JsonProperty(JSON_PROPERTY_FROM_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromString() {
    return fromString;
  }




   /**
   * The details of the new value.
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The details of the new value.")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTo() {
    return to;
  }




   /**
   * The details of the new value as a string.
   * @return toString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The details of the new value as a string.")
  @JsonProperty(JSON_PROPERTY_TO_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToString() {
    return toString;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeDetails changeDetails = (ChangeDetails) o;
    return Objects.equals(this.field, changeDetails.field) &&
        Objects.equals(this.fieldtype, changeDetails.fieldtype) &&
        Objects.equals(this.fieldId, changeDetails.fieldId) &&
        Objects.equals(this.from, changeDetails.from) &&
        Objects.equals(this.fromString, changeDetails.fromString) &&
        Objects.equals(this.to, changeDetails.to) &&
        Objects.equals(this.toString, changeDetails.toString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, fieldtype, fieldId, from, fromString, to, toString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeDetails {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    fieldtype: ").append(toIndentedString(fieldtype)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    fromString: ").append(toIndentedString(fromString)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    toString: ").append(toIndentedString(toString)).append("\n");
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

