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
 * Details about syntax and type errors. The error details apply to the entire expression, unless the object includes:   *  &#x60;line&#x60; and &#x60;column&#x60;  *  &#x60;expression&#x60;
 */
@ApiModel(description = "Details about syntax and type errors. The error details apply to the entire expression, unless the object includes:   *  `line` and `column`  *  `expression`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class JiraExpressionValidationError {
  public static final String SERIALIZED_NAME_LINE = "line";
  @SerializedName(SERIALIZED_NAME_LINE)
  private Integer line;

  public static final String SERIALIZED_NAME_COLUMN = "column";
  @SerializedName(SERIALIZED_NAME_COLUMN)
  private Integer column;

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  /**
   * The error type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SYNTAX("syntax"),
    
    TYPE("type"),
    
    OTHER("other");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;


  public JiraExpressionValidationError line(Integer line) {
    
    this.line = line;
    return this;
  }

   /**
   * The text line in which the error occurred.
   * @return line
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The text line in which the error occurred.")

  public Integer getLine() {
    return line;
  }


  public void setLine(Integer line) {
    this.line = line;
  }


  public JiraExpressionValidationError column(Integer column) {
    
    this.column = column;
    return this;
  }

   /**
   * The text column in which the error occurred.
   * @return column
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The text column in which the error occurred.")

  public Integer getColumn() {
    return column;
  }


  public void setColumn(Integer column) {
    this.column = column;
  }


  public JiraExpressionValidationError expression(String expression) {
    
    this.expression = expression;
    return this;
  }

   /**
   * The part of the expression in which the error occurred.
   * @return expression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The part of the expression in which the error occurred.")

  public String getExpression() {
    return expression;
  }


  public void setExpression(String expression) {
    this.expression = expression;
  }


  public JiraExpressionValidationError message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Details about the error.
   * @return message
  **/
  @ApiModelProperty(example = "!, -, typeof, (, IDENTIFIER, null, true, false, NUMBER, STRING, new, [ or { expected, > encountered.", required = true, value = "Details about the error.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public JiraExpressionValidationError type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The error type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The error type.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionValidationError jiraExpressionValidationError = (JiraExpressionValidationError) o;
    return Objects.equals(this.line, jiraExpressionValidationError.line) &&
        Objects.equals(this.column, jiraExpressionValidationError.column) &&
        Objects.equals(this.expression, jiraExpressionValidationError.expression) &&
        Objects.equals(this.message, jiraExpressionValidationError.message) &&
        Objects.equals(this.type, jiraExpressionValidationError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line, column, expression, message, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionValidationError {\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

