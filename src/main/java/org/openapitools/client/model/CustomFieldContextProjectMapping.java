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
 * Details of context to project associations.
 */
@ApiModel(description = "Details of context to project associations.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class CustomFieldContextProjectMapping {
  public static final String SERIALIZED_NAME_CONTEXT_ID = "contextId";
  @SerializedName(SERIALIZED_NAME_CONTEXT_ID)
  private String contextId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_IS_GLOBAL_CONTEXT = "isGlobalContext";
  @SerializedName(SERIALIZED_NAME_IS_GLOBAL_CONTEXT)
  private Boolean isGlobalContext;


   /**
   * The ID of the context.
   * @return contextId
  **/
  @ApiModelProperty(required = true, value = "The ID of the context.")

  public String getContextId() {
    return contextId;
  }




   /**
   * The ID of the project.
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project.")

  public String getProjectId() {
    return projectId;
  }




   /**
   * Whether context is global.
   * @return isGlobalContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether context is global.")

  public Boolean getIsGlobalContext() {
    return isGlobalContext;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextProjectMapping customFieldContextProjectMapping = (CustomFieldContextProjectMapping) o;
    return Objects.equals(this.contextId, customFieldContextProjectMapping.contextId) &&
        Objects.equals(this.projectId, customFieldContextProjectMapping.projectId) &&
        Objects.equals(this.isGlobalContext, customFieldContextProjectMapping.isGlobalContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, projectId, isGlobalContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextProjectMapping {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    isGlobalContext: ").append(toIndentedString(isGlobalContext)).append("\n");
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

