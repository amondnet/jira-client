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
import com.atlassian.jira.rest.client.model.FieldMetadata;
import com.atlassian.jira.rest.client.model.Scope;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Details of the issue creation metadata for an issue type.
 */
@ApiModel(description = "Details of the issue creation metadata for an issue type.")
@JsonPropertyOrder({
  IssueTypeIssueCreateMetadata.JSON_PROPERTY_SELF,
  IssueTypeIssueCreateMetadata.JSON_PROPERTY_ID,
  IssueTypeIssueCreateMetadata.JSON_PROPERTY_DESCRIPTION,
  IssueTypeIssueCreateMetadata.JSON_PROPERTY_ICON_URL,
  IssueTypeIssueCreateMetadata.JSON_PROPERTY_NAME,
  IssueTypeIssueCreateMetadata.JSON_PROPERTY_SUBTASK,
  IssueTypeIssueCreateMetadata.JSON_PROPERTY_AVATAR_ID,
  IssueTypeIssueCreateMetadata.JSON_PROPERTY_ENTITY_ID,
  IssueTypeIssueCreateMetadata.JSON_PROPERTY_HIERARCHY_LEVEL,
  IssueTypeIssueCreateMetadata.JSON_PROPERTY_SCOPE,
  IssueTypeIssueCreateMetadata.JSON_PROPERTY_EXPAND,
  IssueTypeIssueCreateMetadata.JSON_PROPERTY_FIELDS
})
@JsonTypeName("IssueTypeIssueCreateMetadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class IssueTypeIssueCreateMetadata {
  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ICON_URL = "iconUrl";
  private String iconUrl;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUBTASK = "subtask";
  private Boolean subtask;

  public static final String JSON_PROPERTY_AVATAR_ID = "avatarId";
  private Long avatarId;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private UUID entityId;

  public static final String JSON_PROPERTY_HIERARCHY_LEVEL = "hierarchyLevel";
  private Integer hierarchyLevel;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private Scope scope = null;

  public static final String JSON_PROPERTY_EXPAND = "expand";
  private String expand;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private Map<String, FieldMetadata> fields = null;


   /**
   * The URL of these issue type details.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of these issue type details.")
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSelf() {
    return self;
  }




   /**
   * The ID of the issue type.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the issue type.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * The description of the issue type.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the issue type.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }




   /**
   * The URL of the issue type&#39;s avatar.
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the issue type's avatar.")
  @JsonProperty(JSON_PROPERTY_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIconUrl() {
    return iconUrl;
  }




   /**
   * The name of the issue type.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the issue type.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }




   /**
   * Whether this issue type is used to create subtasks.
   * @return subtask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this issue type is used to create subtasks.")
  @JsonProperty(JSON_PROPERTY_SUBTASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSubtask() {
    return subtask;
  }




   /**
   * The ID of the issue type&#39;s avatar.
   * @return avatarId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the issue type's avatar.")
  @JsonProperty(JSON_PROPERTY_AVATAR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAvatarId() {
    return avatarId;
  }




   /**
   * Unique ID for next-gen projects.
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID for next-gen projects.")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getEntityId() {
    return entityId;
  }




   /**
   * Hierarchy level of the issue type.
   * @return hierarchyLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hierarchy level of the issue type.")
  @JsonProperty(JSON_PROPERTY_HIERARCHY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHierarchyLevel() {
    return hierarchyLevel;
  }




   /**
   * Details of the next-gen projects the issue type is available in.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the next-gen projects the issue type is available in.")
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Scope getScope() {
    return scope;
  }




   /**
   * Expand options that include additional issue type metadata details in the response.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expand options that include additional issue type metadata details in the response.")
  @JsonProperty(JSON_PROPERTY_EXPAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpand() {
    return expand;
  }




   /**
   * List of the fields available when creating an issue for the issue type.
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the fields available when creating an issue for the issue type.")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, FieldMetadata> getFields() {
    return fields;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeIssueCreateMetadata issueTypeIssueCreateMetadata = (IssueTypeIssueCreateMetadata) o;
    return Objects.equals(this.self, issueTypeIssueCreateMetadata.self) &&
        Objects.equals(this.id, issueTypeIssueCreateMetadata.id) &&
        Objects.equals(this.description, issueTypeIssueCreateMetadata.description) &&
        Objects.equals(this.iconUrl, issueTypeIssueCreateMetadata.iconUrl) &&
        Objects.equals(this.name, issueTypeIssueCreateMetadata.name) &&
        Objects.equals(this.subtask, issueTypeIssueCreateMetadata.subtask) &&
        Objects.equals(this.avatarId, issueTypeIssueCreateMetadata.avatarId) &&
        Objects.equals(this.entityId, issueTypeIssueCreateMetadata.entityId) &&
        Objects.equals(this.hierarchyLevel, issueTypeIssueCreateMetadata.hierarchyLevel) &&
        Objects.equals(this.scope, issueTypeIssueCreateMetadata.scope) &&
        Objects.equals(this.expand, issueTypeIssueCreateMetadata.expand) &&
        Objects.equals(this.fields, issueTypeIssueCreateMetadata.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, description, iconUrl, name, subtask, avatarId, entityId, hierarchyLevel, scope, expand, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeIssueCreateMetadata {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subtask: ").append(toIndentedString(subtask)).append("\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    hierarchyLevel: ").append(toIndentedString(hierarchyLevel)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

