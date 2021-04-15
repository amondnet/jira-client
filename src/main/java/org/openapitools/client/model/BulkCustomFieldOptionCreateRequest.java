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
import org.openapitools.client.model.CustomFieldOptionCreate;

/**
 * Details of the options to create for a custom field.
 */
@ApiModel(description = "Details of the options to create for a custom field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class BulkCustomFieldOptionCreateRequest {
  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<CustomFieldOptionCreate> options = null;


  public BulkCustomFieldOptionCreateRequest options(List<CustomFieldOptionCreate> options) {
    
    this.options = options;
    return this;
  }

  public BulkCustomFieldOptionCreateRequest addOptionsItem(CustomFieldOptionCreate optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<CustomFieldOptionCreate>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Details of options to create.
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of options to create.")

  public List<CustomFieldOptionCreate> getOptions() {
    return options;
  }


  public void setOptions(List<CustomFieldOptionCreate> options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkCustomFieldOptionCreateRequest bulkCustomFieldOptionCreateRequest = (BulkCustomFieldOptionCreateRequest) o;
    return Objects.equals(this.options, bulkCustomFieldOptionCreateRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCustomFieldOptionCreateRequest {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
