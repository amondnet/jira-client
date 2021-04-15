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
import org.openapitools.client.model.IssueTypeScreenSchemeMapping;

/**
 * The details of an issue type screen scheme.
 */
@ApiModel(description = "The details of an issue type screen scheme.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class IssueTypeScreenSchemeDetails {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ISSUE_TYPE_MAPPINGS = "issueTypeMappings";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_MAPPINGS)
  private List<IssueTypeScreenSchemeMapping> issueTypeMappings = new ArrayList<IssueTypeScreenSchemeMapping>();


  public IssueTypeScreenSchemeDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the issue type screen scheme. The name must be unique. The maximum length is 255 characters.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the issue type screen scheme. The name must be unique. The maximum length is 255 characters.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IssueTypeScreenSchemeDetails description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the issue type screen scheme. The maximum length is 255 characters.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the issue type screen scheme. The maximum length is 255 characters.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public IssueTypeScreenSchemeDetails issueTypeMappings(List<IssueTypeScreenSchemeMapping> issueTypeMappings) {
    
    this.issueTypeMappings = issueTypeMappings;
    return this;
  }

  public IssueTypeScreenSchemeDetails addIssueTypeMappingsItem(IssueTypeScreenSchemeMapping issueTypeMappingsItem) {
    this.issueTypeMappings.add(issueTypeMappingsItem);
    return this;
  }

   /**
   * The IDs of the screen schemes for the issue type IDs and *default*. A *default* entry is required to create an issue type screen scheme, it defines the mapping for all issue types without a screen scheme.
   * @return issueTypeMappings
  **/
  @ApiModelProperty(required = true, value = "The IDs of the screen schemes for the issue type IDs and *default*. A *default* entry is required to create an issue type screen scheme, it defines the mapping for all issue types without a screen scheme.")

  public List<IssueTypeScreenSchemeMapping> getIssueTypeMappings() {
    return issueTypeMappings;
  }


  public void setIssueTypeMappings(List<IssueTypeScreenSchemeMapping> issueTypeMappings) {
    this.issueTypeMappings = issueTypeMappings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeScreenSchemeDetails issueTypeScreenSchemeDetails = (IssueTypeScreenSchemeDetails) o;
    return Objects.equals(this.name, issueTypeScreenSchemeDetails.name) &&
        Objects.equals(this.description, issueTypeScreenSchemeDetails.description) &&
        Objects.equals(this.issueTypeMappings, issueTypeScreenSchemeDetails.issueTypeMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, issueTypeMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScreenSchemeDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    issueTypeMappings: ").append(toIndentedString(issueTypeMappings)).append("\n");
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
