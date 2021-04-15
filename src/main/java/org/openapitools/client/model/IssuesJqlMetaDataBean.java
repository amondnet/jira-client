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

/**
 * The description of the page of issues loaded by the provided JQL query.
 */
@ApiModel(description = "The description of the page of issues loaded by the provided JQL query.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class IssuesJqlMetaDataBean {
  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private Long startAt;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount;

  public static final String SERIALIZED_NAME_VALIDATION_WARNINGS = "validationWarnings";
  @SerializedName(SERIALIZED_NAME_VALIDATION_WARNINGS)
  private List<String> validationWarnings = null;


  public IssuesJqlMetaDataBean startAt(Long startAt) {
    
    this.startAt = startAt;
    return this;
  }

   /**
   * The index of the first issue.
   * @return startAt
  **/
  @ApiModelProperty(required = true, value = "The index of the first issue.")

  public Long getStartAt() {
    return startAt;
  }


  public void setStartAt(Long startAt) {
    this.startAt = startAt;
  }


  public IssuesJqlMetaDataBean maxResults(Integer maxResults) {
    
    this.maxResults = maxResults;
    return this;
  }

   /**
   * The maximum number of issues that could be loaded in this evaluation.
   * @return maxResults
  **/
  @ApiModelProperty(required = true, value = "The maximum number of issues that could be loaded in this evaluation.")

  public Integer getMaxResults() {
    return maxResults;
  }


  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  public IssuesJqlMetaDataBean count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The number of issues that were loaded in this evaluation.
   * @return count
  **/
  @ApiModelProperty(required = true, value = "The number of issues that were loaded in this evaluation.")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public IssuesJqlMetaDataBean totalCount(Long totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of issues the JQL returned.
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "The total number of issues the JQL returned.")

  public Long getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  public IssuesJqlMetaDataBean validationWarnings(List<String> validationWarnings) {
    
    this.validationWarnings = validationWarnings;
    return this;
  }

  public IssuesJqlMetaDataBean addValidationWarningsItem(String validationWarningsItem) {
    if (this.validationWarnings == null) {
      this.validationWarnings = new ArrayList<String>();
    }
    this.validationWarnings.add(validationWarningsItem);
    return this;
  }

   /**
   * Any warnings related to the JQL query. Present only if the validation mode was set to &#x60;warn&#x60;.
   * @return validationWarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Any warnings related to the JQL query. Present only if the validation mode was set to `warn`.")

  public List<String> getValidationWarnings() {
    return validationWarnings;
  }


  public void setValidationWarnings(List<String> validationWarnings) {
    this.validationWarnings = validationWarnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuesJqlMetaDataBean issuesJqlMetaDataBean = (IssuesJqlMetaDataBean) o;
    return Objects.equals(this.startAt, issuesJqlMetaDataBean.startAt) &&
        Objects.equals(this.maxResults, issuesJqlMetaDataBean.maxResults) &&
        Objects.equals(this.count, issuesJqlMetaDataBean.count) &&
        Objects.equals(this.totalCount, issuesJqlMetaDataBean.totalCount) &&
        Objects.equals(this.validationWarnings, issuesJqlMetaDataBean.validationWarnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, maxResults, count, totalCount, validationWarnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesJqlMetaDataBean {\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    validationWarnings: ").append(toIndentedString(validationWarnings)).append("\n");
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

