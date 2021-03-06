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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * JiraExpressionsComplexityValueBean
 */
@JsonPropertyOrder({
  JiraExpressionsComplexityValueBean.JSON_PROPERTY_VALUE,
  JiraExpressionsComplexityValueBean.JSON_PROPERTY_LIMIT
})
@JsonTypeName("JiraExpressionsComplexityValueBean")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class JiraExpressionsComplexityValueBean {
  public static final String JSON_PROPERTY_VALUE = "value";
  private Integer value;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;


  public JiraExpressionsComplexityValueBean value(Integer value) {
    
    this.value = value;
    return this;
  }

   /**
   * The complexity value of the current expression.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The complexity value of the current expression.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getValue() {
    return value;
  }


  public void setValue(Integer value) {
    this.value = value;
  }


  public JiraExpressionsComplexityValueBean limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The maximum allowed complexity. The evaluation will fail if this value is exceeded.
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "The maximum allowed complexity. The evaluation will fail if this value is exceeded.")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionsComplexityValueBean jiraExpressionsComplexityValueBean = (JiraExpressionsComplexityValueBean) o;
    return Objects.equals(this.value, jiraExpressionsComplexityValueBean.value) &&
        Objects.equals(this.limit, jiraExpressionsComplexityValueBean.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionsComplexityValueBean {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

