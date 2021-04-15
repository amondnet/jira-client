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
import org.openapitools.client.model.Comment;
import org.openapitools.client.model.IssueLinkType;
import org.openapitools.client.model.LinkedIssue;

/**
 * LinkIssueRequestJsonBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class LinkIssueRequestJsonBean {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private IssueLinkType type;

  public static final String SERIALIZED_NAME_INWARD_ISSUE = "inwardIssue";
  @SerializedName(SERIALIZED_NAME_INWARD_ISSUE)
  private LinkedIssue inwardIssue;

  public static final String SERIALIZED_NAME_OUTWARD_ISSUE = "outwardIssue";
  @SerializedName(SERIALIZED_NAME_OUTWARD_ISSUE)
  private LinkedIssue outwardIssue;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private Comment comment;


  public LinkIssueRequestJsonBean type(IssueLinkType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public IssueLinkType getType() {
    return type;
  }


  public void setType(IssueLinkType type) {
    this.type = type;
  }


  public LinkIssueRequestJsonBean inwardIssue(LinkedIssue inwardIssue) {
    
    this.inwardIssue = inwardIssue;
    return this;
  }

   /**
   * Get inwardIssue
   * @return inwardIssue
  **/
  @ApiModelProperty(required = true, value = "")

  public LinkedIssue getInwardIssue() {
    return inwardIssue;
  }


  public void setInwardIssue(LinkedIssue inwardIssue) {
    this.inwardIssue = inwardIssue;
  }


  public LinkIssueRequestJsonBean outwardIssue(LinkedIssue outwardIssue) {
    
    this.outwardIssue = outwardIssue;
    return this;
  }

   /**
   * Get outwardIssue
   * @return outwardIssue
  **/
  @ApiModelProperty(required = true, value = "")

  public LinkedIssue getOutwardIssue() {
    return outwardIssue;
  }


  public void setOutwardIssue(LinkedIssue outwardIssue) {
    this.outwardIssue = outwardIssue;
  }


  public LinkIssueRequestJsonBean comment(Comment comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Comment getComment() {
    return comment;
  }


  public void setComment(Comment comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkIssueRequestJsonBean linkIssueRequestJsonBean = (LinkIssueRequestJsonBean) o;
    return Objects.equals(this.type, linkIssueRequestJsonBean.type) &&
        Objects.equals(this.inwardIssue, linkIssueRequestJsonBean.inwardIssue) &&
        Objects.equals(this.outwardIssue, linkIssueRequestJsonBean.outwardIssue) &&
        Objects.equals(this.comment, linkIssueRequestJsonBean.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, inwardIssue, outwardIssue, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkIssueRequestJsonBean {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inwardIssue: ").append(toIndentedString(inwardIssue)).append("\n");
    sb.append("    outwardIssue: ").append(toIndentedString(outwardIssue)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

