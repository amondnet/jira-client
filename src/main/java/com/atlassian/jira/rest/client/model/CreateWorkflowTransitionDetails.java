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
 * The details of a workflow transition.
 */
@ApiModel(description = "The details of a workflow transition.")
@JsonPropertyOrder({
  CreateWorkflowTransitionDetails.JSON_PROPERTY_NAME,
  CreateWorkflowTransitionDetails.JSON_PROPERTY_DESCRIPTION,
  CreateWorkflowTransitionDetails.JSON_PROPERTY_FROM,
  CreateWorkflowTransitionDetails.JSON_PROPERTY_TO,
  CreateWorkflowTransitionDetails.JSON_PROPERTY_TYPE
})
@JsonTypeName("CreateWorkflowTransitionDetails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class CreateWorkflowTransitionDetails {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FROM = "from";
  private List<String> from = null;

  public static final String JSON_PROPERTY_TO = "to";
  private String to;

  /**
   * The type of the transition.
   */
  public enum TypeEnum {
    GLOBAL("global"),
    
    INITIAL("initial"),
    
    DIRECTED("directed");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;


  public CreateWorkflowTransitionDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the transition. The maximum length is 60 characters.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the transition. The maximum length is 60 characters.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateWorkflowTransitionDetails description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the transition. The maximum length is 1000 characters.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the transition. The maximum length is 1000 characters.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateWorkflowTransitionDetails from(List<String> from) {
    
    this.from = from;
    return this;
  }

  public CreateWorkflowTransitionDetails addFromItem(String fromItem) {
    if (this.from == null) {
      this.from = new ArrayList<>();
    }
    this.from.add(fromItem);
    return this;
  }

   /**
   * The statuses the transition can start from.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The statuses the transition can start from.")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFrom() {
    return from;
  }


  public void setFrom(List<String> from) {
    this.from = from;
  }


  public CreateWorkflowTransitionDetails to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The status the transition goes to.
   * @return to
  **/
  @ApiModelProperty(required = true, value = "The status the transition goes to.")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public CreateWorkflowTransitionDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the transition.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the transition.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
    CreateWorkflowTransitionDetails createWorkflowTransitionDetails = (CreateWorkflowTransitionDetails) o;
    return Objects.equals(this.name, createWorkflowTransitionDetails.name) &&
        Objects.equals(this.description, createWorkflowTransitionDetails.description) &&
        Objects.equals(this.from, createWorkflowTransitionDetails.from) &&
        Objects.equals(this.to, createWorkflowTransitionDetails.to) &&
        Objects.equals(this.type, createWorkflowTransitionDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, from, to, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowTransitionDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

