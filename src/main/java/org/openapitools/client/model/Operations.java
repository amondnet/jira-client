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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.LinkGroup;

/**
 * Details of the operations that can be performed on the issue.
 */
@ApiModel(description = "Details of the operations that can be performed on the issue.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class Operations extends HashMap<String, Object> {
  public static final String SERIALIZED_NAME_LINK_GROUPS = "linkGroups";
  @SerializedName(SERIALIZED_NAME_LINK_GROUPS)
  private List<LinkGroup> linkGroups = null;


   /**
   * Details of the link groups defining issue operations.
   * @return linkGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the link groups defining issue operations.")

  public List<LinkGroup> getLinkGroups() {
    return linkGroups;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operations operations = (Operations) o;
    return Objects.equals(this.linkGroups, operations.linkGroups) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkGroups, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operations {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    linkGroups: ").append(toIndentedString(linkGroups)).append("\n");
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

