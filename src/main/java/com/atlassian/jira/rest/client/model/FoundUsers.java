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
import com.atlassian.jira.rest.client.model.UserPickerUser;
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
 * The list of users found in a search, including header text (Showing X of Y matching users) and total of matched users.
 */
@ApiModel(description = "The list of users found in a search, including header text (Showing X of Y matching users) and total of matched users.")
@JsonPropertyOrder({
  FoundUsers.JSON_PROPERTY_USERS,
  FoundUsers.JSON_PROPERTY_TOTAL,
  FoundUsers.JSON_PROPERTY_HEADER
})
@JsonTypeName("FoundUsers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class FoundUsers {
  public static final String JSON_PROPERTY_USERS = "users";
  private List<UserPickerUser> users = null;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_HEADER = "header";
  private String header;


  public FoundUsers users(List<UserPickerUser> users) {
    
    this.users = users;
    return this;
  }

  public FoundUsers addUsersItem(UserPickerUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
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

  public List<UserPickerUser> getUsers() {
    return users;
  }


  public void setUsers(List<UserPickerUser> users) {
    this.users = users;
  }


  public FoundUsers total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total number of users found in the search.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of users found in the search.")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public FoundUsers header(String header) {
    
    this.header = header;
    return this;
  }

   /**
   * Header text indicating the number of users in the response and the total number of users found in the search.
   * @return header
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Header text indicating the number of users in the response and the total number of users found in the search.")
  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeader() {
    return header;
  }


  public void setHeader(String header) {
    this.header = header;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoundUsers foundUsers = (FoundUsers) o;
    return Objects.equals(this.users, foundUsers.users) &&
        Objects.equals(this.total, foundUsers.total) &&
        Objects.equals(this.header, foundUsers.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, total, header);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoundUsers {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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

