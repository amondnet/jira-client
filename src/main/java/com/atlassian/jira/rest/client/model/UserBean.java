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
import com.atlassian.jira.rest.client.model.UserBeanAvatarUrls;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UserBean
 */
@JsonPropertyOrder({
  UserBean.JSON_PROPERTY_KEY,
  UserBean.JSON_PROPERTY_SELF,
  UserBean.JSON_PROPERTY_NAME,
  UserBean.JSON_PROPERTY_DISPLAY_NAME,
  UserBean.JSON_PROPERTY_ACTIVE,
  UserBean.JSON_PROPERTY_ACCOUNT_ID,
  UserBean.JSON_PROPERTY_AVATAR_URLS
})
@JsonTypeName("UserBean")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class UserBean {
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_SELF = "self";
  private URI self;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_AVATAR_URLS = "avatarUrls";
  private UserBeanAvatarUrls avatarUrls = null;


  public UserBean key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * This property is deprecated in favor of &#x60;accountId&#x60; because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The key of the user.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The key of the user.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public UserBean self(URI self) {
    
    this.self = self;
    return this;
  }

   /**
   * The URL of the user.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the user.")
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getSelf() {
    return self;
  }


  public void setSelf(URI self) {
    this.self = self;
  }


  public UserBean name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * This property is deprecated in favor of &#x60;accountId&#x60; because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The username of the user.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The username of the user.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserBean displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public UserBean active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Whether the user is active.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the user is active.")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public UserBean accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public UserBean avatarUrls(UserBeanAvatarUrls avatarUrls) {
    
    this.avatarUrls = avatarUrls;
    return this;
  }

   /**
   * The avatars of the user.
   * @return avatarUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The avatars of the user.")
  @JsonProperty(JSON_PROPERTY_AVATAR_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserBeanAvatarUrls getAvatarUrls() {
    return avatarUrls;
  }


  public void setAvatarUrls(UserBeanAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBean userBean = (UserBean) o;
    return Objects.equals(this.key, userBean.key) &&
        Objects.equals(this.self, userBean.self) &&
        Objects.equals(this.name, userBean.name) &&
        Objects.equals(this.displayName, userBean.displayName) &&
        Objects.equals(this.active, userBean.active) &&
        Objects.equals(this.accountId, userBean.accountId) &&
        Objects.equals(this.avatarUrls, userBean.avatarUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, self, name, displayName, active, accountId, avatarUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBean {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
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
