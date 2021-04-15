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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.GroupName;
import org.openapitools.client.model.UserDetails;

/**
 * Details of the users and groups to receive the notification.
 */
@ApiModel(description = "Details of the users and groups to receive the notification.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class NotificationRecipients extends HashMap<String, Object> {
  public static final String SERIALIZED_NAME_REPORTER = "reporter";
  @SerializedName(SERIALIZED_NAME_REPORTER)
  private Boolean reporter;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private Boolean assignee;

  public static final String SERIALIZED_NAME_WATCHERS = "watchers";
  @SerializedName(SERIALIZED_NAME_WATCHERS)
  private Boolean watchers;

  public static final String SERIALIZED_NAME_VOTERS = "voters";
  @SerializedName(SERIALIZED_NAME_VOTERS)
  private Boolean voters;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<UserDetails> users = null;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<GroupName> groups = null;


  public NotificationRecipients reporter(Boolean reporter) {
    
    this.reporter = reporter;
    return this;
  }

   /**
   * Whether the notification should be sent to the issue&#39;s reporter.
   * @return reporter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the notification should be sent to the issue's reporter.")

  public Boolean getReporter() {
    return reporter;
  }


  public void setReporter(Boolean reporter) {
    this.reporter = reporter;
  }


  public NotificationRecipients assignee(Boolean assignee) {
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Whether the notification should be sent to the issue&#39;s assignees.
   * @return assignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the notification should be sent to the issue's assignees.")

  public Boolean getAssignee() {
    return assignee;
  }


  public void setAssignee(Boolean assignee) {
    this.assignee = assignee;
  }


  public NotificationRecipients watchers(Boolean watchers) {
    
    this.watchers = watchers;
    return this;
  }

   /**
   * Whether the notification should be sent to the issue&#39;s watchers.
   * @return watchers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the notification should be sent to the issue's watchers.")

  public Boolean getWatchers() {
    return watchers;
  }


  public void setWatchers(Boolean watchers) {
    this.watchers = watchers;
  }


  public NotificationRecipients voters(Boolean voters) {
    
    this.voters = voters;
    return this;
  }

   /**
   * Whether the notification should be sent to the issue&#39;s voters.
   * @return voters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the notification should be sent to the issue's voters.")

  public Boolean getVoters() {
    return voters;
  }


  public void setVoters(Boolean voters) {
    this.voters = voters;
  }


  public NotificationRecipients users(List<UserDetails> users) {
    
    this.users = users;
    return this;
  }

  public NotificationRecipients addUsersItem(UserDetails usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<UserDetails>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of users to receive the notification.
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of users to receive the notification.")

  public List<UserDetails> getUsers() {
    return users;
  }


  public void setUsers(List<UserDetails> users) {
    this.users = users;
  }


  public NotificationRecipients groups(List<GroupName> groups) {
    
    this.groups = groups;
    return this;
  }

  public NotificationRecipients addGroupsItem(GroupName groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<GroupName>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * List of groups to receive the notification.
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of groups to receive the notification.")

  public List<GroupName> getGroups() {
    return groups;
  }


  public void setGroups(List<GroupName> groups) {
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
    NotificationRecipients notificationRecipients = (NotificationRecipients) o;
    return Objects.equals(this.reporter, notificationRecipients.reporter) &&
        Objects.equals(this.assignee, notificationRecipients.assignee) &&
        Objects.equals(this.watchers, notificationRecipients.watchers) &&
        Objects.equals(this.voters, notificationRecipients.voters) &&
        Objects.equals(this.users, notificationRecipients.users) &&
        Objects.equals(this.groups, notificationRecipients.groups) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reporter, assignee, watchers, voters, users, groups, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRecipients {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
    sb.append("    voters: ").append(toIndentedString(voters)).append("\n");
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

