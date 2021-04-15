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
import com.atlassian.jira.rest.client.model.Scope;
import com.atlassian.jira.rest.client.model.ScreenableTab;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A screen with tab details.
 */
@ApiModel(description = "A screen with tab details.")
@JsonPropertyOrder({
  ScreenWithTab.JSON_PROPERTY_ID,
  ScreenWithTab.JSON_PROPERTY_NAME,
  ScreenWithTab.JSON_PROPERTY_DESCRIPTION,
  ScreenWithTab.JSON_PROPERTY_SCOPE,
  ScreenWithTab.JSON_PROPERTY_TAB
})
@JsonTypeName("ScreenWithTab")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class ScreenWithTab {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private Scope scope = null;

  public static final String JSON_PROPERTY_TAB = "tab";
  private ScreenableTab tab = null;


   /**
   * The ID of the screen.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the screen.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }




   /**
   * The name of the screen.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the screen.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }




   /**
   * The description of the screen.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the screen.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }




  public ScreenWithTab scope(Scope scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the screen.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The scope of the screen.")
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Scope getScope() {
    return scope;
  }


  public void setScope(Scope scope) {
    this.scope = scope;
  }


  public ScreenWithTab tab(ScreenableTab tab) {
    
    this.tab = tab;
    return this;
  }

   /**
   * The tab for the screen
   * @return tab
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tab for the screen")
  @JsonProperty(JSON_PROPERTY_TAB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScreenableTab getTab() {
    return tab;
  }


  public void setTab(ScreenableTab tab) {
    this.tab = tab;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenWithTab screenWithTab = (ScreenWithTab) o;
    return Objects.equals(this.id, screenWithTab.id) &&
        Objects.equals(this.name, screenWithTab.name) &&
        Objects.equals(this.description, screenWithTab.description) &&
        Objects.equals(this.scope, screenWithTab.scope) &&
        Objects.equals(this.tab, screenWithTab.tab);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, scope, tab);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenWithTab {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tab: ").append(toIndentedString(tab)).append("\n");
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

