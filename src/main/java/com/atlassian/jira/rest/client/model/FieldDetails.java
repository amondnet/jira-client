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
import com.atlassian.jira.rest.client.model.Scope;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Details about a field.
 */
@ApiModel(description = "Details about a field.")
@JsonPropertyOrder({
  FieldDetails.JSON_PROPERTY_ID,
  FieldDetails.JSON_PROPERTY_KEY,
  FieldDetails.JSON_PROPERTY_NAME,
  FieldDetails.JSON_PROPERTY_CUSTOM,
  FieldDetails.JSON_PROPERTY_ORDERABLE,
  FieldDetails.JSON_PROPERTY_NAVIGABLE,
  FieldDetails.JSON_PROPERTY_SEARCHABLE,
  FieldDetails.JSON_PROPERTY_CLAUSE_NAMES,
  FieldDetails.JSON_PROPERTY_SCOPE,
  FieldDetails.JSON_PROPERTY_SCHEMA
})
@JsonTypeName("FieldDetails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class FieldDetails {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CUSTOM = "custom";
  private Boolean custom;

  public static final String JSON_PROPERTY_ORDERABLE = "orderable";
  private Boolean orderable;

  public static final String JSON_PROPERTY_NAVIGABLE = "navigable";
  private Boolean navigable;

  public static final String JSON_PROPERTY_SEARCHABLE = "searchable";
  private Boolean searchable;

  public static final String JSON_PROPERTY_CLAUSE_NAMES = "clauseNames";
  private Set<String> clauseNames = null;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private Scope scope = null;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private JsonTypeBean schema = null;


  public FieldDetails id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the field.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the field.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FieldDetails key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of the field.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the field.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public FieldDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the field.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the field.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FieldDetails custom(Boolean custom) {
    
    this.custom = custom;
    return this;
  }

   /**
   * Whether the field is a custom field.
   * @return custom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the field is a custom field.")
  @JsonProperty(JSON_PROPERTY_CUSTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCustom() {
    return custom;
  }


  public void setCustom(Boolean custom) {
    this.custom = custom;
  }


  public FieldDetails orderable(Boolean orderable) {
    
    this.orderable = orderable;
    return this;
  }

   /**
   * Whether the content of the field can be used to order lists.
   * @return orderable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the content of the field can be used to order lists.")
  @JsonProperty(JSON_PROPERTY_ORDERABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOrderable() {
    return orderable;
  }


  public void setOrderable(Boolean orderable) {
    this.orderable = orderable;
  }


  public FieldDetails navigable(Boolean navigable) {
    
    this.navigable = navigable;
    return this;
  }

   /**
   * Whether the field can be used as a column on the issue navigator.
   * @return navigable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the field can be used as a column on the issue navigator.")
  @JsonProperty(JSON_PROPERTY_NAVIGABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNavigable() {
    return navigable;
  }


  public void setNavigable(Boolean navigable) {
    this.navigable = navigable;
  }


  public FieldDetails searchable(Boolean searchable) {
    
    this.searchable = searchable;
    return this;
  }

   /**
   * Whether the content of the field can be searched.
   * @return searchable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the content of the field can be searched.")
  @JsonProperty(JSON_PROPERTY_SEARCHABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSearchable() {
    return searchable;
  }


  public void setSearchable(Boolean searchable) {
    this.searchable = searchable;
  }


  public FieldDetails clauseNames(Set<String> clauseNames) {
    
    this.clauseNames = clauseNames;
    return this;
  }

  public FieldDetails addClauseNamesItem(String clauseNamesItem) {
    if (this.clauseNames == null) {
      this.clauseNames = new LinkedHashSet<>();
    }
    this.clauseNames.add(clauseNamesItem);
    return this;
  }

   /**
   * The names that can be used to reference the field in an advanced search. For more information, see [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ).
   * @return clauseNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The names that can be used to reference the field in an advanced search. For more information, see [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ).")
  @JsonProperty(JSON_PROPERTY_CLAUSE_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getClauseNames() {
    return clauseNames;
  }


  public void setClauseNames(Set<String> clauseNames) {
    this.clauseNames = clauseNames;
  }


  public FieldDetails scope(Scope scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the field.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The scope of the field.")
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Scope getScope() {
    return scope;
  }


  public void setScope(Scope scope) {
    this.scope = scope;
  }


  public FieldDetails schema(JsonTypeBean schema) {
    
    this.schema = schema;
    return this;
  }

   /**
   * The data schema for the field.
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The data schema for the field.")
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonTypeBean getSchema() {
    return schema;
  }


  public void setSchema(JsonTypeBean schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldDetails fieldDetails = (FieldDetails) o;
    return Objects.equals(this.id, fieldDetails.id) &&
        Objects.equals(this.key, fieldDetails.key) &&
        Objects.equals(this.name, fieldDetails.name) &&
        Objects.equals(this.custom, fieldDetails.custom) &&
        Objects.equals(this.orderable, fieldDetails.orderable) &&
        Objects.equals(this.navigable, fieldDetails.navigable) &&
        Objects.equals(this.searchable, fieldDetails.searchable) &&
        Objects.equals(this.clauseNames, fieldDetails.clauseNames) &&
        Objects.equals(this.scope, fieldDetails.scope) &&
        Objects.equals(this.schema, fieldDetails.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, name, custom, orderable, navigable, searchable, clauseNames, scope, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    orderable: ").append(toIndentedString(orderable)).append("\n");
    sb.append("    navigable: ").append(toIndentedString(navigable)).append("\n");
    sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
    sb.append("    clauseNames: ").append(toIndentedString(clauseNames)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
