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
import java.net.URI;
import org.openapitools.client.model.PagedListUserDetailsApplicationUser;

/**
 * Group
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class Group {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private PagedListUserDetailsApplicationUser users = null;

  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;


  public Group name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of group.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of group.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * The URL for these group details.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for these group details.")

  public URI getSelf() {
    return self;
  }




   /**
   * A paginated list of the users that are members of the group. A maximum of 50 users is returned in the list, to access additional users append &#x60;[start-index:end-index]&#x60; to the expand request. For example, to access the next 50 users, use&#x60;?expand&#x3D;users[51:100]&#x60;.
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A paginated list of the users that are members of the group. A maximum of 50 users is returned in the list, to access additional users append `[start-index:end-index]` to the expand request. For example, to access the next 50 users, use`?expand=users[51:100]`.")

  public PagedListUserDetailsApplicationUser getUsers() {
    return users;
  }




   /**
   * Expand options that include additional group details in the response.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expand options that include additional group details in the response.")

  public String getExpand() {
    return expand;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.name, group.name) &&
        Objects.equals(this.self, group.self) &&
        Objects.equals(this.users, group.users) &&
        Objects.equals(this.expand, group.expand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, self, users, expand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
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

