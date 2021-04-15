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

/**
 * The ID of an issue type scheme.
 */
@ApiModel(description = "The ID of an issue type scheme.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class IssueTypeSchemeID {
  public static final String SERIALIZED_NAME_ISSUE_TYPE_SCHEME_ID = "issueTypeSchemeId";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_SCHEME_ID)
  private String issueTypeSchemeId;


   /**
   * The ID of the issue type scheme.
   * @return issueTypeSchemeId
  **/
  @ApiModelProperty(required = true, value = "The ID of the issue type scheme.")

  public String getIssueTypeSchemeId() {
    return issueTypeSchemeId;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeSchemeID issueTypeSchemeID = (IssueTypeSchemeID) o;
    return Objects.equals(this.issueTypeSchemeId, issueTypeSchemeID.issueTypeSchemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeSchemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeID {\n");
    sb.append("    issueTypeSchemeId: ").append(toIndentedString(issueTypeSchemeId)).append("\n");
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

