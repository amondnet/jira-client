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
import com.atlassian.jira.rest.client.model.FoundGroups;
import com.atlassian.jira.rest.client.model.FoundUsers;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * List of users and groups found in a search.
 */
@ApiModel(description = "List of users and groups found in a search.")
@JsonPropertyOrder({
  FoundUsersAndGroups.JSON_PROPERTY_USERS,
  FoundUsersAndGroups.JSON_PROPERTY_GROUPS
})
@JsonTypeName("FoundUsersAndGroups")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class FoundUsersAndGroups {
  public static final String JSON_PROPERTY_USERS = "users";
  private FoundUsers users;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private FoundGroups groups;


  public FoundUsersAndGroups users(FoundUsers users) {
    
    this.users = users;
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FoundUsers getUsers() {
    return users;
  }


  public void setUsers(FoundUsers users) {
    this.users = users;
  }


  public FoundUsersAndGroups groups(FoundGroups groups) {
    
    this.groups = groups;
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FoundGroups getGroups() {
    return groups;
  }


  public void setGroups(FoundGroups groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoundUsersAndGroups foundUsersAndGroups = (FoundUsersAndGroups) o;
    return Objects.equals(this.users, foundUsersAndGroups.users) &&
        Objects.equals(this.groups, foundUsersAndGroups.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoundUsersAndGroups {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
