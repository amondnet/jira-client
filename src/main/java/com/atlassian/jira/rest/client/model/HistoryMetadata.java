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
import com.atlassian.jira.rest.client.model.HistoryMetadataParticipant;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Details of issue history metadata.
 */
@ApiModel(description = "Details of issue history metadata.")
@JsonPropertyOrder({
  HistoryMetadata.JSON_PROPERTY_TYPE,
  HistoryMetadata.JSON_PROPERTY_DESCRIPTION,
  HistoryMetadata.JSON_PROPERTY_DESCRIPTION_KEY,
  HistoryMetadata.JSON_PROPERTY_ACTIVITY_DESCRIPTION,
  HistoryMetadata.JSON_PROPERTY_ACTIVITY_DESCRIPTION_KEY,
  HistoryMetadata.JSON_PROPERTY_EMAIL_DESCRIPTION,
  HistoryMetadata.JSON_PROPERTY_EMAIL_DESCRIPTION_KEY,
  HistoryMetadata.JSON_PROPERTY_ACTOR,
  HistoryMetadata.JSON_PROPERTY_GENERATOR,
  HistoryMetadata.JSON_PROPERTY_CAUSE,
  HistoryMetadata.JSON_PROPERTY_EXTRA_DATA
})
@JsonTypeName("HistoryMetadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class HistoryMetadata extends HashMap<String, Object> {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DESCRIPTION_KEY = "descriptionKey";
  private String descriptionKey;

  public static final String JSON_PROPERTY_ACTIVITY_DESCRIPTION = "activityDescription";
  private String activityDescription;

  public static final String JSON_PROPERTY_ACTIVITY_DESCRIPTION_KEY = "activityDescriptionKey";
  private String activityDescriptionKey;

  public static final String JSON_PROPERTY_EMAIL_DESCRIPTION = "emailDescription";
  private String emailDescription;

  public static final String JSON_PROPERTY_EMAIL_DESCRIPTION_KEY = "emailDescriptionKey";
  private String emailDescriptionKey;

  public static final String JSON_PROPERTY_ACTOR = "actor";
  private HistoryMetadataParticipant actor = null;

  public static final String JSON_PROPERTY_GENERATOR = "generator";
  private HistoryMetadataParticipant generator = null;

  public static final String JSON_PROPERTY_CAUSE = "cause";
  private HistoryMetadataParticipant cause = null;

  public static final String JSON_PROPERTY_EXTRA_DATA = "extraData";
  private Map<String, String> extraData = null;


  public HistoryMetadata type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the history record.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the history record.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public HistoryMetadata description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the history record.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the history record.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public HistoryMetadata descriptionKey(String descriptionKey) {
    
    this.descriptionKey = descriptionKey;
    return this;
  }

   /**
   * The description key of the history record.
   * @return descriptionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description key of the history record.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescriptionKey() {
    return descriptionKey;
  }


  public void setDescriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
  }


  public HistoryMetadata activityDescription(String activityDescription) {
    
    this.activityDescription = activityDescription;
    return this;
  }

   /**
   * The activity described in the history record.
   * @return activityDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The activity described in the history record.")
  @JsonProperty(JSON_PROPERTY_ACTIVITY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActivityDescription() {
    return activityDescription;
  }


  public void setActivityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
  }


  public HistoryMetadata activityDescriptionKey(String activityDescriptionKey) {
    
    this.activityDescriptionKey = activityDescriptionKey;
    return this;
  }

   /**
   * The key of the activity described in the history record.
   * @return activityDescriptionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the activity described in the history record.")
  @JsonProperty(JSON_PROPERTY_ACTIVITY_DESCRIPTION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActivityDescriptionKey() {
    return activityDescriptionKey;
  }


  public void setActivityDescriptionKey(String activityDescriptionKey) {
    this.activityDescriptionKey = activityDescriptionKey;
  }


  public HistoryMetadata emailDescription(String emailDescription) {
    
    this.emailDescription = emailDescription;
    return this;
  }

   /**
   * The description of the email address associated the history record.
   * @return emailDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the email address associated the history record.")
  @JsonProperty(JSON_PROPERTY_EMAIL_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailDescription() {
    return emailDescription;
  }


  public void setEmailDescription(String emailDescription) {
    this.emailDescription = emailDescription;
  }


  public HistoryMetadata emailDescriptionKey(String emailDescriptionKey) {
    
    this.emailDescriptionKey = emailDescriptionKey;
    return this;
  }

   /**
   * The description key of the email address associated the history record.
   * @return emailDescriptionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description key of the email address associated the history record.")
  @JsonProperty(JSON_PROPERTY_EMAIL_DESCRIPTION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailDescriptionKey() {
    return emailDescriptionKey;
  }


  public void setEmailDescriptionKey(String emailDescriptionKey) {
    this.emailDescriptionKey = emailDescriptionKey;
  }


  public HistoryMetadata actor(HistoryMetadataParticipant actor) {
    
    this.actor = actor;
    return this;
  }

   /**
   * Details of the user whose action created the history record.
   * @return actor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the user whose action created the history record.")
  @JsonProperty(JSON_PROPERTY_ACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HistoryMetadataParticipant getActor() {
    return actor;
  }


  public void setActor(HistoryMetadataParticipant actor) {
    this.actor = actor;
  }


  public HistoryMetadata generator(HistoryMetadataParticipant generator) {
    
    this.generator = generator;
    return this;
  }

   /**
   * Details of the system that generated the history record.
   * @return generator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the system that generated the history record.")
  @JsonProperty(JSON_PROPERTY_GENERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HistoryMetadataParticipant getGenerator() {
    return generator;
  }


  public void setGenerator(HistoryMetadataParticipant generator) {
    this.generator = generator;
  }


  public HistoryMetadata cause(HistoryMetadataParticipant cause) {
    
    this.cause = cause;
    return this;
  }

   /**
   * Details of the cause that triggered the creation the history record.
   * @return cause
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the cause that triggered the creation the history record.")
  @JsonProperty(JSON_PROPERTY_CAUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HistoryMetadataParticipant getCause() {
    return cause;
  }


  public void setCause(HistoryMetadataParticipant cause) {
    this.cause = cause;
  }


  public HistoryMetadata extraData(Map<String, String> extraData) {
    
    this.extraData = extraData;
    return this;
  }

  public HistoryMetadata putExtraDataItem(String key, String extraDataItem) {
    if (this.extraData == null) {
      this.extraData = new HashMap<>();
    }
    this.extraData.put(key, extraDataItem);
    return this;
  }

   /**
   * Additional arbitrary information about the history record.
   * @return extraData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional arbitrary information about the history record.")
  @JsonProperty(JSON_PROPERTY_EXTRA_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getExtraData() {
    return extraData;
  }


  public void setExtraData(Map<String, String> extraData) {
    this.extraData = extraData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryMetadata historyMetadata = (HistoryMetadata) o;
    return Objects.equals(this.type, historyMetadata.type) &&
        Objects.equals(this.description, historyMetadata.description) &&
        Objects.equals(this.descriptionKey, historyMetadata.descriptionKey) &&
        Objects.equals(this.activityDescription, historyMetadata.activityDescription) &&
        Objects.equals(this.activityDescriptionKey, historyMetadata.activityDescriptionKey) &&
        Objects.equals(this.emailDescription, historyMetadata.emailDescription) &&
        Objects.equals(this.emailDescriptionKey, historyMetadata.emailDescriptionKey) &&
        Objects.equals(this.actor, historyMetadata.actor) &&
        Objects.equals(this.generator, historyMetadata.generator) &&
        Objects.equals(this.cause, historyMetadata.cause) &&
        Objects.equals(this.extraData, historyMetadata.extraData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, descriptionKey, activityDescription, activityDescriptionKey, emailDescription, emailDescriptionKey, actor, generator, cause, extraData, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryMetadata {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionKey: ").append(toIndentedString(descriptionKey)).append("\n");
    sb.append("    activityDescription: ").append(toIndentedString(activityDescription)).append("\n");
    sb.append("    activityDescriptionKey: ").append(toIndentedString(activityDescriptionKey)).append("\n");
    sb.append("    emailDescription: ").append(toIndentedString(emailDescription)).append("\n");
    sb.append("    emailDescriptionKey: ").append(toIndentedString(emailDescriptionKey)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    generator: ").append(toIndentedString(generator)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
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

