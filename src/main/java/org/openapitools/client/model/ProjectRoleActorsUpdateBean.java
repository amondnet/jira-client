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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ProjectRoleActorsUpdateBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class ProjectRoleActorsUpdateBean {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CATEGORISED_ACTORS = "categorisedActors";
  @SerializedName(SERIALIZED_NAME_CATEGORISED_ACTORS)
  private Map<String, List<String>> categorisedActors = null;


   /**
   * The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.")

  public Long getId() {
    return id;
  }




  public ProjectRoleActorsUpdateBean categorisedActors(Map<String, List<String>> categorisedActors) {
    
    this.categorisedActors = categorisedActors;
    return this;
  }

  public ProjectRoleActorsUpdateBean putCategorisedActorsItem(String key, List<String> categorisedActorsItem) {
    if (this.categorisedActors == null) {
      this.categorisedActors = new HashMap<String, List<String>>();
    }
    this.categorisedActors.put(key, categorisedActorsItem);
    return this;
  }

   /**
   * The actors to add to the project role. Add groups using &#x60;atlassian-group-role-actor&#x60; and a list of group names. For example, &#x60;\&quot;atlassian-group-role-actor\&quot;:[\&quot;another\&quot;,\&quot;administrators\&quot;]}&#x60;. Add users using &#x60;atlassian-user-role-actor&#x60; and a list of account IDs. For example, &#x60;\&quot;atlassian-user-role-actor\&quot;:[\&quot;12345678-9abc-def1-2345-6789abcdef12\&quot;, \&quot;abcdef12-3456-789a-bcde-f123456789ab\&quot;]&#x60;.
   * @return categorisedActors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The actors to add to the project role. Add groups using `atlassian-group-role-actor` and a list of group names. For example, `\"atlassian-group-role-actor\":[\"another\",\"administrators\"]}`. Add users using `atlassian-user-role-actor` and a list of account IDs. For example, `\"atlassian-user-role-actor\":[\"12345678-9abc-def1-2345-6789abcdef12\", \"abcdef12-3456-789a-bcde-f123456789ab\"]`.")

  public Map<String, List<String>> getCategorisedActors() {
    return categorisedActors;
  }


  public void setCategorisedActors(Map<String, List<String>> categorisedActors) {
    this.categorisedActors = categorisedActors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRoleActorsUpdateBean projectRoleActorsUpdateBean = (ProjectRoleActorsUpdateBean) o;
    return Objects.equals(this.id, projectRoleActorsUpdateBean.id) &&
        Objects.equals(this.categorisedActors, projectRoleActorsUpdateBean.categorisedActors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, categorisedActors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRoleActorsUpdateBean {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    categorisedActors: ").append(toIndentedString(categorisedActors)).append("\n");
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

