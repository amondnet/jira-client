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
import java.util.List;
import org.openapitools.client.model.AvatarUrlsBean;
import org.openapitools.client.model.IssueTypeIssueCreateMetadata;

/**
 * Details of the issue creation metadata for a project.
 */
@ApiModel(description = "Details of the issue creation metadata for a project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class ProjectIssueCreateMetadata {
  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AVATAR_URLS = "avatarUrls";
  @SerializedName(SERIALIZED_NAME_AVATAR_URLS)
  private AvatarUrlsBean avatarUrls = null;

  public static final String SERIALIZED_NAME_ISSUETYPES = "issuetypes";
  @SerializedName(SERIALIZED_NAME_ISSUETYPES)
  private List<IssueTypeIssueCreateMetadata> issuetypes = null;


   /**
   * Expand options that include additional project issue create metadata details in the response.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expand options that include additional project issue create metadata details in the response.")

  public String getExpand() {
    return expand;
  }




   /**
   * The URL of the project.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the project.")

  public String getSelf() {
    return self;
  }




   /**
   * The ID of the project.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project.")

  public String getId() {
    return id;
  }




   /**
   * The key of the project.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the project.")

  public String getKey() {
    return key;
  }




   /**
   * The name of the project.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the project.")

  public String getName() {
    return name;
  }




   /**
   * List of the project&#39;s avatars, returning the avatar size and associated URL.
   * @return avatarUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the project's avatars, returning the avatar size and associated URL.")

  public AvatarUrlsBean getAvatarUrls() {
    return avatarUrls;
  }




   /**
   * List of the issue types supported by the project.
   * @return issuetypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the issue types supported by the project.")

  public List<IssueTypeIssueCreateMetadata> getIssuetypes() {
    return issuetypes;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectIssueCreateMetadata projectIssueCreateMetadata = (ProjectIssueCreateMetadata) o;
    return Objects.equals(this.expand, projectIssueCreateMetadata.expand) &&
        Objects.equals(this.self, projectIssueCreateMetadata.self) &&
        Objects.equals(this.id, projectIssueCreateMetadata.id) &&
        Objects.equals(this.key, projectIssueCreateMetadata.key) &&
        Objects.equals(this.name, projectIssueCreateMetadata.name) &&
        Objects.equals(this.avatarUrls, projectIssueCreateMetadata.avatarUrls) &&
        Objects.equals(this.issuetypes, projectIssueCreateMetadata.issuetypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, self, id, key, name, avatarUrls, issuetypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIssueCreateMetadata {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    issuetypes: ").append(toIndentedString(issuetypes)).append("\n");
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
