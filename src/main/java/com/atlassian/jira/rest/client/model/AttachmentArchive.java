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
import com.atlassian.jira.rest.client.model.AttachmentArchiveEntry;
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
 * AttachmentArchive
 */
@JsonPropertyOrder({
  AttachmentArchive.JSON_PROPERTY_MORE_AVAILABLE,
  AttachmentArchive.JSON_PROPERTY_TOTAL_NUMBER_OF_ENTRIES_AVAILABLE,
  AttachmentArchive.JSON_PROPERTY_TOTAL_ENTRY_COUNT,
  AttachmentArchive.JSON_PROPERTY_ENTRIES
})
@JsonTypeName("AttachmentArchive")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class AttachmentArchive {
  public static final String JSON_PROPERTY_MORE_AVAILABLE = "moreAvailable";
  private Boolean moreAvailable;

  public static final String JSON_PROPERTY_TOTAL_NUMBER_OF_ENTRIES_AVAILABLE = "totalNumberOfEntriesAvailable";
  private Integer totalNumberOfEntriesAvailable;

  public static final String JSON_PROPERTY_TOTAL_ENTRY_COUNT = "totalEntryCount";
  private Integer totalEntryCount;

  public static final String JSON_PROPERTY_ENTRIES = "entries";
  private List<AttachmentArchiveEntry> entries = null;


  public AttachmentArchive moreAvailable(Boolean moreAvailable) {
    
    this.moreAvailable = moreAvailable;
    return this;
  }

   /**
   * Get moreAvailable
   * @return moreAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MORE_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMoreAvailable() {
    return moreAvailable;
  }


  public void setMoreAvailable(Boolean moreAvailable) {
    this.moreAvailable = moreAvailable;
  }


  public AttachmentArchive totalNumberOfEntriesAvailable(Integer totalNumberOfEntriesAvailable) {
    
    this.totalNumberOfEntriesAvailable = totalNumberOfEntriesAvailable;
    return this;
  }

   /**
   * Get totalNumberOfEntriesAvailable
   * @return totalNumberOfEntriesAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_ENTRIES_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalNumberOfEntriesAvailable() {
    return totalNumberOfEntriesAvailable;
  }


  public void setTotalNumberOfEntriesAvailable(Integer totalNumberOfEntriesAvailable) {
    this.totalNumberOfEntriesAvailable = totalNumberOfEntriesAvailable;
  }


  public AttachmentArchive totalEntryCount(Integer totalEntryCount) {
    
    this.totalEntryCount = totalEntryCount;
    return this;
  }

   /**
   * Get totalEntryCount
   * @return totalEntryCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_ENTRY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalEntryCount() {
    return totalEntryCount;
  }


  public void setTotalEntryCount(Integer totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
  }


  public AttachmentArchive entries(List<AttachmentArchiveEntry> entries) {
    
    this.entries = entries;
    return this;
  }

  public AttachmentArchive addEntriesItem(AttachmentArchiveEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AttachmentArchiveEntry> getEntries() {
    return entries;
  }


  public void setEntries(List<AttachmentArchiveEntry> entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchive attachmentArchive = (AttachmentArchive) o;
    return Objects.equals(this.moreAvailable, attachmentArchive.moreAvailable) &&
        Objects.equals(this.totalNumberOfEntriesAvailable, attachmentArchive.totalNumberOfEntriesAvailable) &&
        Objects.equals(this.totalEntryCount, attachmentArchive.totalEntryCount) &&
        Objects.equals(this.entries, attachmentArchive.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moreAvailable, totalNumberOfEntriesAvailable, totalEntryCount, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchive {\n");
    sb.append("    moreAvailable: ").append(toIndentedString(moreAvailable)).append("\n");
    sb.append("    totalNumberOfEntriesAvailable: ").append(toIndentedString(totalNumberOfEntriesAvailable)).append("\n");
    sb.append("    totalEntryCount: ").append(toIndentedString(totalEntryCount)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

