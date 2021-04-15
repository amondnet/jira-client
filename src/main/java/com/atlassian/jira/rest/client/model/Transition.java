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
import com.atlassian.jira.rest.client.model.ScreenID;
import com.atlassian.jira.rest.client.model.WorkflowRules;
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
 * Details of a workflow transition.
 */
@ApiModel(description = "Details of a workflow transition.")
@JsonPropertyOrder({
  Transition.JSON_PROPERTY_ID,
  Transition.JSON_PROPERTY_NAME,
  Transition.JSON_PROPERTY_DESCRIPTION,
  Transition.JSON_PROPERTY_FROM,
  Transition.JSON_PROPERTY_TO,
  Transition.JSON_PROPERTY_TYPE,
  Transition.JSON_PROPERTY_SCREEN,
  Transition.JSON_PROPERTY_RULES
})
@JsonTypeName("Transition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class Transition {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FROM = "from";
  private List<String> from = new ArrayList<>();

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

  public static final String JSON_PROPERTY_SCREEN = "screen";
  private ScreenID screen;

  public static final String JSON_PROPERTY_RULES = "rules";
  private WorkflowRules rules;


  public Transition id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the transition.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the transition.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Transition name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the transition.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the transition.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Transition description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the transition.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the transition.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Transition from(List<String> from) {
    
    this.from = from;
    return this;
  }

  public Transition addFromItem(String fromItem) {
    this.from.add(fromItem);
    return this;
  }

   /**
   * The statuses the transition can start from.
   * @return from
  **/
  @ApiModelProperty(required = true, value = "The statuses the transition can start from.")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getFrom() {
    return from;
  }


  public void setFrom(List<String> from) {
    this.from = from;
  }


  public Transition to(String to) {
    
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


  public Transition type(TypeEnum type) {
    
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


  public Transition screen(ScreenID screen) {
    
    this.screen = screen;
    return this;
  }

   /**
   * Get screen
   * @return screen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCREEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScreenID getScreen() {
    return screen;
  }


  public void setScreen(ScreenID screen) {
    this.screen = screen;
  }


  public Transition rules(WorkflowRules rules) {
    
    this.rules = rules;
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkflowRules getRules() {
    return rules;
  }


  public void setRules(WorkflowRules rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transition transition = (Transition) o;
    return Objects.equals(this.id, transition.id) &&
        Objects.equals(this.name, transition.name) &&
        Objects.equals(this.description, transition.description) &&
        Objects.equals(this.from, transition.from) &&
        Objects.equals(this.to, transition.to) &&
        Objects.equals(this.type, transition.type) &&
        Objects.equals(this.screen, transition.screen) &&
        Objects.equals(this.rules, transition.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, from, to, type, screen, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    screen: ").append(toIndentedString(screen)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

