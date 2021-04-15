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
import org.openapitools.client.model.EntityProperty;
import org.openapitools.client.model.UserDetails;
import org.openapitools.client.model.Visibility;
import org.threeten.bp.OffsetDateTime;

/**
 * A comment.
 */
@ApiModel(description = "A comment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class Comment extends HashMap<String, Object> {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private UserDetails author = null;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private Object body = null;

  public static final String SERIALIZED_NAME_RENDERED_BODY = "renderedBody";
  @SerializedName(SERIALIZED_NAME_RENDERED_BODY)
  private String renderedBody;

  public static final String SERIALIZED_NAME_UPDATE_AUTHOR = "updateAuthor";
  @SerializedName(SERIALIZED_NAME_UPDATE_AUTHOR)
  private UserDetails updateAuthor = null;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private Visibility visibility = null;

  public static final String SERIALIZED_NAME_JSD_PUBLIC = "jsdPublic";
  @SerializedName(SERIALIZED_NAME_JSD_PUBLIC)
  private Boolean jsdPublic;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<EntityProperty> properties = null;


   /**
   * The URL of the comment.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the comment.")

  public String getSelf() {
    return self;
  }




   /**
   * The ID of the comment.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the comment.")

  public String getId() {
    return id;
  }




   /**
   * The ID of the user who created the comment.
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the user who created the comment.")

  public UserDetails getAuthor() {
    return author;
  }




  public Comment body(Object body) {
    
    this.body = body;
    return this;
  }

   /**
   * The comment text in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/).
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The comment text in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/).")

  public Object getBody() {
    return body;
  }


  public void setBody(Object body) {
    this.body = body;
  }


   /**
   * The rendered version of the comment.
   * @return renderedBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rendered version of the comment.")

  public String getRenderedBody() {
    return renderedBody;
  }




   /**
   * The ID of the user who updated the comment last.
   * @return updateAuthor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the user who updated the comment last.")

  public UserDetails getUpdateAuthor() {
    return updateAuthor;
  }




   /**
   * The date and time at which the comment was created.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time at which the comment was created.")

  public OffsetDateTime getCreated() {
    return created;
  }




   /**
   * The date and time at which the comment was updated last.
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time at which the comment was updated last.")

  public OffsetDateTime getUpdated() {
    return updated;
  }




  public Comment visibility(Visibility visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * The group or role to which this comment is visible. Optional on create and update.
   * @return visibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The group or role to which this comment is visible. Optional on create and update.")

  public Visibility getVisibility() {
    return visibility;
  }


  public void setVisibility(Visibility visibility) {
    this.visibility = visibility;
  }


   /**
   * Whether the comment is visible in Jira Service Desk. Defaults to true when comments are created in the Jira Cloud Platform. This includes when the site doesn&#39;t use Jira Service Desk or the project isn&#39;t a Jira Service Desk project and, therefore, there is no Jira Service Desk for the issue to be visible on. To create a comment with its visibility in Jira Service Desk set to false, use the Jira Service Desk REST API [Create request comment](https://developer.atlassian.com/cloud/jira/service-desk/rest/#api-rest-servicedeskapi-request-issueIdOrKey-comment-post) operation.
   * @return jsdPublic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the comment is visible in Jira Service Desk. Defaults to true when comments are created in the Jira Cloud Platform. This includes when the site doesn't use Jira Service Desk or the project isn't a Jira Service Desk project and, therefore, there is no Jira Service Desk for the issue to be visible on. To create a comment with its visibility in Jira Service Desk set to false, use the Jira Service Desk REST API [Create request comment](https://developer.atlassian.com/cloud/jira/service-desk/rest/#api-rest-servicedeskapi-request-issueIdOrKey-comment-post) operation.")

  public Boolean getJsdPublic() {
    return jsdPublic;
  }




  public Comment properties(List<EntityProperty> properties) {
    
    this.properties = properties;
    return this;
  }

  public Comment addPropertiesItem(EntityProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<EntityProperty>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * A list of comment properties. Optional on create and update.
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of comment properties. Optional on create and update.")

  public List<EntityProperty> getProperties() {
    return properties;
  }


  public void setProperties(List<EntityProperty> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.self, comment.self) &&
        Objects.equals(this.id, comment.id) &&
        Objects.equals(this.author, comment.author) &&
        Objects.equals(this.body, comment.body) &&
        Objects.equals(this.renderedBody, comment.renderedBody) &&
        Objects.equals(this.updateAuthor, comment.updateAuthor) &&
        Objects.equals(this.created, comment.created) &&
        Objects.equals(this.updated, comment.updated) &&
        Objects.equals(this.visibility, comment.visibility) &&
        Objects.equals(this.jsdPublic, comment.jsdPublic) &&
        Objects.equals(this.properties, comment.properties) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, author, body, renderedBody, updateAuthor, created, updated, visibility, jsdPublic, properties, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    renderedBody: ").append(toIndentedString(renderedBody)).append("\n");
    sb.append("    updateAuthor: ").append(toIndentedString(updateAuthor)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    jsdPublic: ").append(toIndentedString(jsdPublic)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

