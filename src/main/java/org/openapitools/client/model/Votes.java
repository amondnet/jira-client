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
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.User;

/**
 * The details of votes on an issue.
 */
@ApiModel(description = "The details of votes on an issue.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:02:29.270017+09:00[Asia/Seoul]")
public class Votes {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_VOTES = "votes";
  @SerializedName(SERIALIZED_NAME_VOTES)
  private Long votes;

  public static final String SERIALIZED_NAME_HAS_VOTED = "hasVoted";
  @SerializedName(SERIALIZED_NAME_HAS_VOTED)
  private Boolean hasVoted;

  public static final String SERIALIZED_NAME_VOTERS = "voters";
  @SerializedName(SERIALIZED_NAME_VOTERS)
  private List<User> voters = null;


   /**
   * The URL of these issue vote details.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of these issue vote details.")

  public URI getSelf() {
    return self;
  }




   /**
   * The number of votes on the issue.
   * @return votes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of votes on the issue.")

  public Long getVotes() {
    return votes;
  }




   /**
   * Whether the user making this request has voted on the issue.
   * @return hasVoted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the user making this request has voted on the issue.")

  public Boolean getHasVoted() {
    return hasVoted;
  }




   /**
   * List of the users who have voted on this issue. An empty list is returned when the calling user doesn&#39;t have the *View voters and watchers* project permission.
   * @return voters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the users who have voted on this issue. An empty list is returned when the calling user doesn't have the *View voters and watchers* project permission.")

  public List<User> getVoters() {
    return voters;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Votes votes = (Votes) o;
    return Objects.equals(this.self, votes.self) &&
        Objects.equals(this.votes, votes.votes) &&
        Objects.equals(this.hasVoted, votes.hasVoted) &&
        Objects.equals(this.voters, votes.voters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, votes, hasVoted, voters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Votes {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
    sb.append("    hasVoted: ").append(toIndentedString(hasVoted)).append("\n");
    sb.append("    voters: ").append(toIndentedString(voters)).append("\n");
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

