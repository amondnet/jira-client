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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.Icon;
import org.openapitools.client.model.Status;

/**
 * The linked item.
 */
@ApiModel(description = "The linked item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class RemoteObject extends HashMap<String, Object> {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private Icon icon = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Status status = null;


  public RemoteObject url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL of the item.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The URL of the item.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public RemoteObject title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the item.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "The title of the item.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public RemoteObject summary(String summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * The summary details of the item.
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The summary details of the item.")

  public String getSummary() {
    return summary;
  }


  public void setSummary(String summary) {
    this.summary = summary;
  }


  public RemoteObject icon(Icon icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * Details of the icon for the item. If no icon is defined, the default link icon is used in Jira.
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the icon for the item. If no icon is defined, the default link icon is used in Jira.")

  public Icon getIcon() {
    return icon;
  }


  public void setIcon(Icon icon) {
    this.icon = icon;
  }


  public RemoteObject status(Status status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the item.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the item.")

  public Status getStatus() {
    return status;
  }


  public void setStatus(Status status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteObject remoteObject = (RemoteObject) o;
    return Objects.equals(this.url, remoteObject.url) &&
        Objects.equals(this.title, remoteObject.title) &&
        Objects.equals(this.summary, remoteObject.summary) &&
        Objects.equals(this.icon, remoteObject.icon) &&
        Objects.equals(this.status, remoteObject.status) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, title, summary, icon, status, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteObject {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

