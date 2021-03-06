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
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Details of an avatar.
 */
@ApiModel(description = "Details of an avatar.")
@JsonPropertyOrder({
  Avatar.JSON_PROPERTY_ID,
  Avatar.JSON_PROPERTY_OWNER,
  Avatar.JSON_PROPERTY_IS_SYSTEM_AVATAR,
  Avatar.JSON_PROPERTY_IS_SELECTED,
  Avatar.JSON_PROPERTY_IS_DELETABLE,
  Avatar.JSON_PROPERTY_FILE_NAME,
  Avatar.JSON_PROPERTY_URLS
})
@JsonTypeName("Avatar")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class Avatar {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_IS_SYSTEM_AVATAR = "isSystemAvatar";
  private Boolean isSystemAvatar;

  public static final String JSON_PROPERTY_IS_SELECTED = "isSelected";
  private Boolean isSelected;

  public static final String JSON_PROPERTY_IS_DELETABLE = "isDeletable";
  private Boolean isDeletable;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_URLS = "urls";
  private Map<String, URI> urls = null;


  public Avatar id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the avatar.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the avatar.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


   /**
   * The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the account ID for a user.
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the account ID for a user.")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwner() {
    return owner;
  }




   /**
   * Whether the avatar is a system avatar.
   * @return isSystemAvatar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the avatar is a system avatar.")
  @JsonProperty(JSON_PROPERTY_IS_SYSTEM_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSystemAvatar() {
    return isSystemAvatar;
  }




   /**
   * Whether the avatar is used in Jira. For example, shown as a project&#39;s avatar.
   * @return isSelected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the avatar is used in Jira. For example, shown as a project's avatar.")
  @JsonProperty(JSON_PROPERTY_IS_SELECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSelected() {
    return isSelected;
  }




   /**
   * Whether the avatar can be deleted.
   * @return isDeletable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the avatar can be deleted.")
  @JsonProperty(JSON_PROPERTY_IS_DELETABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDeletable() {
    return isDeletable;
  }




   /**
   * The file name of the avatar icon. Returned for system avatars.
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The file name of the avatar icon. Returned for system avatars.")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }




   /**
   * The list of avatar icon URLs.
   * @return urls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of avatar icon URLs.")
  @JsonProperty(JSON_PROPERTY_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, URI> getUrls() {
    return urls;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Avatar avatar = (Avatar) o;
    return Objects.equals(this.id, avatar.id) &&
        Objects.equals(this.owner, avatar.owner) &&
        Objects.equals(this.isSystemAvatar, avatar.isSystemAvatar) &&
        Objects.equals(this.isSelected, avatar.isSelected) &&
        Objects.equals(this.isDeletable, avatar.isDeletable) &&
        Objects.equals(this.fileName, avatar.fileName) &&
        Objects.equals(this.urls, avatar.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, isSystemAvatar, isSelected, isDeletable, fileName, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Avatar {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    isSystemAvatar: ").append(toIndentedString(isSystemAvatar)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
    sb.append("    isDeletable: ").append(toIndentedString(isDeletable)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

