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
import com.atlassian.jira.rest.client.model.FieldConfigurationScheme;
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
 * Project list with assigned field configuration schema.
 */
@ApiModel(description = "Project list with assigned field configuration schema.")
@JsonPropertyOrder({
  FieldConfigurationSchemeProjects.JSON_PROPERTY_FIELD_CONFIGURATION_SCHEME,
  FieldConfigurationSchemeProjects.JSON_PROPERTY_PROJECT_IDS
})
@JsonTypeName("FieldConfigurationSchemeProjects")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class FieldConfigurationSchemeProjects {
  public static final String JSON_PROPERTY_FIELD_CONFIGURATION_SCHEME = "fieldConfigurationScheme";
  private FieldConfigurationScheme fieldConfigurationScheme;

  public static final String JSON_PROPERTY_PROJECT_IDS = "projectIds";
  private List<String> projectIds = new ArrayList<>();


  public FieldConfigurationSchemeProjects fieldConfigurationScheme(FieldConfigurationScheme fieldConfigurationScheme) {
    
    this.fieldConfigurationScheme = fieldConfigurationScheme;
    return this;
  }

   /**
   * Get fieldConfigurationScheme
   * @return fieldConfigurationScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIELD_CONFIGURATION_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FieldConfigurationScheme getFieldConfigurationScheme() {
    return fieldConfigurationScheme;
  }


  public void setFieldConfigurationScheme(FieldConfigurationScheme fieldConfigurationScheme) {
    this.fieldConfigurationScheme = fieldConfigurationScheme;
  }


  public FieldConfigurationSchemeProjects projectIds(List<String> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public FieldConfigurationSchemeProjects addProjectIdsItem(String projectIdsItem) {
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * The IDs of projects using the field configuration scheme.
   * @return projectIds
  **/
  @ApiModelProperty(required = true, value = "The IDs of projects using the field configuration scheme.")
  @JsonProperty(JSON_PROPERTY_PROJECT_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldConfigurationSchemeProjects fieldConfigurationSchemeProjects = (FieldConfigurationSchemeProjects) o;
    return Objects.equals(this.fieldConfigurationScheme, fieldConfigurationSchemeProjects.fieldConfigurationScheme) &&
        Objects.equals(this.projectIds, fieldConfigurationSchemeProjects.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldConfigurationScheme, projectIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfigurationSchemeProjects {\n");
    sb.append("    fieldConfigurationScheme: ").append(toIndentedString(fieldConfigurationScheme)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
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

