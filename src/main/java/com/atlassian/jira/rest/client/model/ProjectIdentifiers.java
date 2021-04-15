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
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Identifiers for a project.
 */
@ApiModel(description = "Identifiers for a project.")
@JsonPropertyOrder({
  ProjectIdentifiers.JSON_PROPERTY_SELF,
  ProjectIdentifiers.JSON_PROPERTY_ID,
  ProjectIdentifiers.JSON_PROPERTY_KEY
})
@JsonTypeName("ProjectIdentifiers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class ProjectIdentifiers {
  public static final String JSON_PROPERTY_SELF = "self";
  private URI self;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;


   /**
   * The URL of the created project.
   * @return self
  **/
  @ApiModelProperty(required = true, value = "The URL of the created project.")
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getSelf() {
    return self;
  }




   /**
   * The ID of the created project.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the created project.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getId() {
    return id;
  }




   /**
   * The key of the created project.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The key of the created project.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKey() {
    return key;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectIdentifiers projectIdentifiers = (ProjectIdentifiers) o;
    return Objects.equals(this.self, projectIdentifiers.self) &&
        Objects.equals(this.id, projectIdentifiers.id) &&
        Objects.equals(this.key, projectIdentifiers.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIdentifiers {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

