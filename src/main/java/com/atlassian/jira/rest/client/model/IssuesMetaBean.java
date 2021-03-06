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
import com.atlassian.jira.rest.client.model.IssuesJqlMetaDataBean;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Meta data describing the &#x60;issues&#x60; context variable.
 */
@ApiModel(description = "Meta data describing the `issues` context variable.")
@JsonPropertyOrder({
  IssuesMetaBean.JSON_PROPERTY_JQL
})
@JsonTypeName("IssuesMetaBean")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class IssuesMetaBean {
  public static final String JSON_PROPERTY_JQL = "jql";
  private IssuesJqlMetaDataBean jql;


  public IssuesMetaBean jql(IssuesJqlMetaDataBean jql) {
    
    this.jql = jql;
    return this;
  }

   /**
   * Get jql
   * @return jql
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JQL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IssuesJqlMetaDataBean getJql() {
    return jql;
  }


  public void setJql(IssuesJqlMetaDataBean jql) {
    this.jql = jql;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuesMetaBean issuesMetaBean = (IssuesMetaBean) o;
    return Objects.equals(this.jql, issuesMetaBean.jql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jql);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesMetaBean {\n");
    sb.append("    jql: ").append(toIndentedString(jql)).append("\n");
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

