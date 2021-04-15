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
import com.atlassian.jira.rest.client.model.WebhookDetails;
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
 * Details of webhooks to register.
 */
@ApiModel(description = "Details of webhooks to register.")
@JsonPropertyOrder({
  WebhookRegistrationDetails.JSON_PROPERTY_WEBHOOKS,
  WebhookRegistrationDetails.JSON_PROPERTY_URL
})
@JsonTypeName("WebhookRegistrationDetails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class WebhookRegistrationDetails {
  public static final String JSON_PROPERTY_WEBHOOKS = "webhooks";
  private List<WebhookDetails> webhooks = new ArrayList<>();

  public static final String JSON_PROPERTY_URL = "url";
  private String url;


  public WebhookRegistrationDetails webhooks(List<WebhookDetails> webhooks) {
    
    this.webhooks = webhooks;
    return this;
  }

  public WebhookRegistrationDetails addWebhooksItem(WebhookDetails webhooksItem) {
    this.webhooks.add(webhooksItem);
    return this;
  }

   /**
   * A list of webhooks.
   * @return webhooks
  **/
  @ApiModelProperty(required = true, value = "A list of webhooks.")
  @JsonProperty(JSON_PROPERTY_WEBHOOKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<WebhookDetails> getWebhooks() {
    return webhooks;
  }


  public void setWebhooks(List<WebhookDetails> webhooks) {
    this.webhooks = webhooks;
  }


  public WebhookRegistrationDetails url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL that specifies where to send the webhooks. This URL must use the same base URL as the Connect app.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The URL that specifies where to send the webhooks. This URL must use the same base URL as the Connect app.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookRegistrationDetails webhookRegistrationDetails = (WebhookRegistrationDetails) o;
    return Objects.equals(this.webhooks, webhookRegistrationDetails.webhooks) &&
        Objects.equals(this.url, webhookRegistrationDetails.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhooks, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookRegistrationDetails {\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

