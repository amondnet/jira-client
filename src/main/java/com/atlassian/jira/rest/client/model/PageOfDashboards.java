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
import com.atlassian.jira.rest.client.model.Dashboard;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A page containing dashboard details.
 */
@ApiModel(description = "A page containing dashboard details.")
@JsonPropertyOrder({
  PageOfDashboards.JSON_PROPERTY_START_AT,
  PageOfDashboards.JSON_PROPERTY_MAX_RESULTS,
  PageOfDashboards.JSON_PROPERTY_TOTAL,
  PageOfDashboards.JSON_PROPERTY_PREV,
  PageOfDashboards.JSON_PROPERTY_NEXT,
  PageOfDashboards.JSON_PROPERTY_DASHBOARDS
})
@JsonTypeName("PageOfDashboards")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class PageOfDashboards {
  public static final String JSON_PROPERTY_START_AT = "startAt";
  private Integer startAt;

  public static final String JSON_PROPERTY_MAX_RESULTS = "maxResults";
  private Integer maxResults;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_PREV = "prev";
  private String prev;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public static final String JSON_PROPERTY_DASHBOARDS = "dashboards";
  private List<Dashboard> dashboards = null;


   /**
   * The index of the first item returned on the page.
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the first item returned on the page.")
  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartAt() {
    return startAt;
  }




   /**
   * The maximum number of results that could be on the page.
   * @return maxResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of results that could be on the page.")
  @JsonProperty(JSON_PROPERTY_MAX_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxResults() {
    return maxResults;
  }




   /**
   * The number of results on the page.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of results on the page.")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotal() {
    return total;
  }




   /**
   * The URL of the previous page of results, if any.
   * @return prev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the previous page of results, if any.")
  @JsonProperty(JSON_PROPERTY_PREV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrev() {
    return prev;
  }




   /**
   * The URL of the next page of results, if any.
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the next page of results, if any.")
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNext() {
    return next;
  }




   /**
   * List of dashboards.
   * @return dashboards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of dashboards.")
  @JsonProperty(JSON_PROPERTY_DASHBOARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Dashboard> getDashboards() {
    return dashboards;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfDashboards pageOfDashboards = (PageOfDashboards) o;
    return Objects.equals(this.startAt, pageOfDashboards.startAt) &&
        Objects.equals(this.maxResults, pageOfDashboards.maxResults) &&
        Objects.equals(this.total, pageOfDashboards.total) &&
        Objects.equals(this.prev, pageOfDashboards.prev) &&
        Objects.equals(this.next, pageOfDashboards.next) &&
        Objects.equals(this.dashboards, pageOfDashboards.dashboards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, maxResults, total, prev, next, dashboards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfDashboards {\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
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

