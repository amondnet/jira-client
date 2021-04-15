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
import com.atlassian.jira.rest.client.model.FilterSubscriptionsList;
import com.atlassian.jira.rest.client.model.SharePermission;
import com.atlassian.jira.rest.client.model.User;
import com.atlassian.jira.rest.client.model.UserList;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Details about a filter.
 */
@ApiModel(description = "Details about a filter.")
@JsonPropertyOrder({
  Filter.JSON_PROPERTY_SELF,
  Filter.JSON_PROPERTY_ID,
  Filter.JSON_PROPERTY_NAME,
  Filter.JSON_PROPERTY_DESCRIPTION,
  Filter.JSON_PROPERTY_OWNER,
  Filter.JSON_PROPERTY_JQL,
  Filter.JSON_PROPERTY_VIEW_URL,
  Filter.JSON_PROPERTY_SEARCH_URL,
  Filter.JSON_PROPERTY_FAVOURITE,
  Filter.JSON_PROPERTY_FAVOURITED_COUNT,
  Filter.JSON_PROPERTY_SHARE_PERMISSIONS,
  Filter.JSON_PROPERTY_SHARED_USERS,
  Filter.JSON_PROPERTY_SUBSCRIPTIONS
})
@JsonTypeName("Filter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class Filter {
  public static final String JSON_PROPERTY_SELF = "self";
  private URI self;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private User owner = null;

  public static final String JSON_PROPERTY_JQL = "jql";
  private String jql;

  public static final String JSON_PROPERTY_VIEW_URL = "viewUrl";
  private URI viewUrl;

  public static final String JSON_PROPERTY_SEARCH_URL = "searchUrl";
  private URI searchUrl;

  public static final String JSON_PROPERTY_FAVOURITE = "favourite";
  private Boolean favourite;

  public static final String JSON_PROPERTY_FAVOURITED_COUNT = "favouritedCount";
  private Long favouritedCount;

  public static final String JSON_PROPERTY_SHARE_PERMISSIONS = "sharePermissions";
  private List<SharePermission> sharePermissions = null;

  public static final String JSON_PROPERTY_SHARED_USERS = "sharedUsers";
  private UserList sharedUsers = null;

  public static final String JSON_PROPERTY_SUBSCRIPTIONS = "subscriptions";
  private FilterSubscriptionsList subscriptions = null;


   /**
   * The URL of the filter.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the filter.")
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getSelf() {
    return self;
  }




   /**
   * The unique identifier for the filter.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier for the filter.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public Filter name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the filter. Must be unique.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the filter. Must be unique.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Filter description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the filter.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of the filter.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * The user who owns the filter. This is defaulted to the creator of the filter, however Jira administrators can change the owner of a shared filter in the admin settings.
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user who owns the filter. This is defaulted to the creator of the filter, however Jira administrators can change the owner of a shared filter in the admin settings.")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getOwner() {
    return owner;
  }




  public Filter jql(String jql) {
    
    this.jql = jql;
    return this;
  }

   /**
   * The JQL query for the filter. For example, *project &#x3D; SSP AND issuetype &#x3D; Bug*.
   * @return jql
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The JQL query for the filter. For example, *project = SSP AND issuetype = Bug*.")
  @JsonProperty(JSON_PROPERTY_JQL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJql() {
    return jql;
  }


  public void setJql(String jql) {
    this.jql = jql;
  }


   /**
   * A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter&#x3D;10100*.
   * @return viewUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter=10100*.")
  @JsonProperty(JSON_PROPERTY_VIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getViewUrl() {
    return viewUrl;
  }




   /**
   * A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter&#39;s JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql&#x3D;project+%3D+SSP+AND+issuetype+%3D+Bug*.
   * @return searchUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter's JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql=project+%3D+SSP+AND+issuetype+%3D+Bug*.")
  @JsonProperty(JSON_PROPERTY_SEARCH_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getSearchUrl() {
    return searchUrl;
  }




  public Filter favourite(Boolean favourite) {
    
    this.favourite = favourite;
    return this;
  }

   /**
   * Whether the filter is selected as a favorite.
   * @return favourite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the filter is selected as a favorite.")
  @JsonProperty(JSON_PROPERTY_FAVOURITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFavourite() {
    return favourite;
  }


  public void setFavourite(Boolean favourite) {
    this.favourite = favourite;
  }


   /**
   * The count of how many users have selected this filter as a favorite, including the filter owner.
   * @return favouritedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of how many users have selected this filter as a favorite, including the filter owner.")
  @JsonProperty(JSON_PROPERTY_FAVOURITED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFavouritedCount() {
    return favouritedCount;
  }




  public Filter sharePermissions(List<SharePermission> sharePermissions) {
    
    this.sharePermissions = sharePermissions;
    return this;
  }

  public Filter addSharePermissionsItem(SharePermission sharePermissionsItem) {
    if (this.sharePermissions == null) {
      this.sharePermissions = new ArrayList<>();
    }
    this.sharePermissions.add(sharePermissionsItem);
    return this;
  }

   /**
   * The groups and projects that the filter is shared with.
   * @return sharePermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The groups and projects that the filter is shared with.")
  @JsonProperty(JSON_PROPERTY_SHARE_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SharePermission> getSharePermissions() {
    return sharePermissions;
  }


  public void setSharePermissions(List<SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
  }


   /**
   * A paginated list of the users that the filter is shared with. This includes users that are members of the groups or can browse the projects that the filter is shared with.
   * @return sharedUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A paginated list of the users that the filter is shared with. This includes users that are members of the groups or can browse the projects that the filter is shared with.")
  @JsonProperty(JSON_PROPERTY_SHARED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserList getSharedUsers() {
    return sharedUsers;
  }




   /**
   * A paginated list of the users that are subscribed to the filter.
   * @return subscriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A paginated list of the users that are subscribed to the filter.")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FilterSubscriptionsList getSubscriptions() {
    return subscriptions;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter filter = (Filter) o;
    return Objects.equals(this.self, filter.self) &&
        Objects.equals(this.id, filter.id) &&
        Objects.equals(this.name, filter.name) &&
        Objects.equals(this.description, filter.description) &&
        Objects.equals(this.owner, filter.owner) &&
        Objects.equals(this.jql, filter.jql) &&
        Objects.equals(this.viewUrl, filter.viewUrl) &&
        Objects.equals(this.searchUrl, filter.searchUrl) &&
        Objects.equals(this.favourite, filter.favourite) &&
        Objects.equals(this.favouritedCount, filter.favouritedCount) &&
        Objects.equals(this.sharePermissions, filter.sharePermissions) &&
        Objects.equals(this.sharedUsers, filter.sharedUsers) &&
        Objects.equals(this.subscriptions, filter.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, name, description, owner, jql, viewUrl, searchUrl, favourite, favouritedCount, sharePermissions, sharedUsers, subscriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    jql: ").append(toIndentedString(jql)).append("\n");
    sb.append("    viewUrl: ").append(toIndentedString(viewUrl)).append("\n");
    sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    favouritedCount: ").append(toIndentedString(favouritedCount)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
    sb.append("    sharedUsers: ").append(toIndentedString(sharedUsers)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
