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
import org.openapitools.client.model.Application;
import org.openapitools.client.model.RemoteObject;

/**
 * Details of an issue remote link.
 */
@ApiModel(description = "Details of an issue remote link.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class RemoteIssueLink {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_GLOBAL_ID = "globalId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ID)
  private String globalId;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private Application application = null;

  public static final String SERIALIZED_NAME_RELATIONSHIP = "relationship";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP)
  private String relationship;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private RemoteObject _object = null;


  public RemoteIssueLink id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the link.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the link.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public RemoteIssueLink self(URI self) {
    
    this.self = self;
    return this;
  }

   /**
   * The URL of the link.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the link.")

  public URI getSelf() {
    return self;
  }


  public void setSelf(URI self) {
    this.self = self;
  }


  public RemoteIssueLink globalId(String globalId) {
    
    this.globalId = globalId;
    return this;
  }

   /**
   * The global ID of the link, such as the ID of the item on the remote system.
   * @return globalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The global ID of the link, such as the ID of the item on the remote system.")

  public String getGlobalId() {
    return globalId;
  }


  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }


  public RemoteIssueLink application(Application application) {
    
    this.application = application;
    return this;
  }

   /**
   * Details of the remote application the linked item is in.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the remote application the linked item is in.")

  public Application getApplication() {
    return application;
  }


  public void setApplication(Application application) {
    this.application = application;
  }


  public RemoteIssueLink relationship(String relationship) {
    
    this.relationship = relationship;
    return this;
  }

   /**
   * Description of the relationship between the issue and the linked item.
   * @return relationship
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the relationship between the issue and the linked item.")

  public String getRelationship() {
    return relationship;
  }


  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }


  public RemoteIssueLink _object(RemoteObject _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Details of the item linked to.
   * @return _object
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the item linked to.")

  public RemoteObject getObject() {
    return _object;
  }


  public void setObject(RemoteObject _object) {
    this._object = _object;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteIssueLink remoteIssueLink = (RemoteIssueLink) o;
    return Objects.equals(this.id, remoteIssueLink.id) &&
        Objects.equals(this.self, remoteIssueLink.self) &&
        Objects.equals(this.globalId, remoteIssueLink.globalId) &&
        Objects.equals(this.application, remoteIssueLink.application) &&
        Objects.equals(this.relationship, remoteIssueLink.relationship) &&
        Objects.equals(this._object, remoteIssueLink._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, self, globalId, application, relationship, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteIssueLink {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
