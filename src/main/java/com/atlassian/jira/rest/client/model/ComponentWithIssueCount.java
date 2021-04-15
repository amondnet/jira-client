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
import com.atlassian.jira.rest.client.model.User;
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
 * Details about a component with a count of the issues it contains.
 */
@ApiModel(description = "Details about a component with a count of the issues it contains.")
@JsonPropertyOrder({
  ComponentWithIssueCount.JSON_PROPERTY_ISSUE_COUNT,
  ComponentWithIssueCount.JSON_PROPERTY_DESCRIPTION,
  ComponentWithIssueCount.JSON_PROPERTY_SELF,
  ComponentWithIssueCount.JSON_PROPERTY_PROJECT,
  ComponentWithIssueCount.JSON_PROPERTY_LEAD,
  ComponentWithIssueCount.JSON_PROPERTY_ASSIGNEE_TYPE,
  ComponentWithIssueCount.JSON_PROPERTY_PROJECT_ID,
  ComponentWithIssueCount.JSON_PROPERTY_ASSIGNEE,
  ComponentWithIssueCount.JSON_PROPERTY_REAL_ASSIGNEE,
  ComponentWithIssueCount.JSON_PROPERTY_IS_ASSIGNEE_TYPE_VALID,
  ComponentWithIssueCount.JSON_PROPERTY_REAL_ASSIGNEE_TYPE,
  ComponentWithIssueCount.JSON_PROPERTY_NAME,
  ComponentWithIssueCount.JSON_PROPERTY_ID
})
@JsonTypeName("ComponentWithIssueCount")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T00:10:50.175246+09:00[Asia/Seoul]")
public class ComponentWithIssueCount {
  public static final String JSON_PROPERTY_ISSUE_COUNT = "issueCount";
  private Long issueCount;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SELF = "self";
  private URI self;

  public static final String JSON_PROPERTY_PROJECT = "project";
  private String project;

  public static final String JSON_PROPERTY_LEAD = "lead";
  private User lead = null;

  /**
   * The nominal user type used to determine the assignee for issues created with this component. See &#x60;realAssigneeType&#x60; for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:   *  &#x60;PROJECT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  &#x60;COMPONENT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the component.  *  &#x60;UNASSIGNED&#x60; an assignee is not set for issues created with this component.  *  &#x60;PROJECT_DEFAULT&#x60; the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
   */
  public enum AssigneeTypeEnum {
    PROJECT_DEFAULT("PROJECT_DEFAULT"),
    
    COMPONENT_LEAD("COMPONENT_LEAD"),
    
    PROJECT_LEAD("PROJECT_LEAD"),
    
    UNASSIGNED("UNASSIGNED");

    private String value;

    AssigneeTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AssigneeTypeEnum fromValue(String value) {
      for (AssigneeTypeEnum b : AssigneeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ASSIGNEE_TYPE = "assigneeType";
  private AssigneeTypeEnum assigneeType;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private Long projectId;

  public static final String JSON_PROPERTY_ASSIGNEE = "assignee";
  private User assignee = null;

  public static final String JSON_PROPERTY_REAL_ASSIGNEE = "realAssignee";
  private User realAssignee = null;

  public static final String JSON_PROPERTY_IS_ASSIGNEE_TYPE_VALID = "isAssigneeTypeValid";
  private Boolean isAssigneeTypeValid;

  /**
   * The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the &#x60;assigneeType&#x60;. For example, &#x60;assigneeType&#x60; is set to &#x60;COMPONENT_LEAD&#x60; but no component lead is set. This property is set to one of the following values:   *  &#x60;PROJECT_LEAD&#x60; when &#x60;assigneeType&#x60; is &#x60;PROJECT_LEAD&#x60; and the project lead has permission to be assigned issues in the project that the component is in.  *  &#x60;COMPONENT_LEAD&#x60; when &#x60;assignee&#x60;Type is &#x60;COMPONENT_LEAD&#x60; and the component lead has permission to be assigned issues in the project that the component is in.  *  &#x60;UNASSIGNED&#x60; when &#x60;assigneeType&#x60; is &#x60;UNASSIGNED&#x60; and Jira is configured to allow unassigned issues.  *  &#x60;PROJECT_DEFAULT&#x60; when none of the preceding cases are true.
   */
  public enum RealAssigneeTypeEnum {
    PROJECT_DEFAULT("PROJECT_DEFAULT"),
    
    COMPONENT_LEAD("COMPONENT_LEAD"),
    
    PROJECT_LEAD("PROJECT_LEAD"),
    
    UNASSIGNED("UNASSIGNED");

    private String value;

    RealAssigneeTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RealAssigneeTypeEnum fromValue(String value) {
      for (RealAssigneeTypeEnum b : RealAssigneeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REAL_ASSIGNEE_TYPE = "realAssigneeType";
  private RealAssigneeTypeEnum realAssigneeType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;


   /**
   * Count of issues for the component.
   * @return issueCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of issues for the component.")
  @JsonProperty(JSON_PROPERTY_ISSUE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIssueCount() {
    return issueCount;
  }




   /**
   * The description for the component.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description for the component.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }




   /**
   * The URL for this count of the issues contained in the component.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for this count of the issues contained in the component.")
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getSelf() {
    return self;
  }




   /**
   * The key of the project to which the component is assigned.
   * @return project
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the project to which the component is assigned.")
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProject() {
    return project;
  }




  public ComponentWithIssueCount lead(User lead) {
    
    this.lead = lead;
    return this;
  }

   /**
   * The user details for the component&#39;s lead user.
   * @return lead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user details for the component's lead user.")
  @JsonProperty(JSON_PROPERTY_LEAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getLead() {
    return lead;
  }


  public void setLead(User lead) {
    this.lead = lead;
  }


   /**
   * The nominal user type used to determine the assignee for issues created with this component. See &#x60;realAssigneeType&#x60; for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:   *  &#x60;PROJECT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  &#x60;COMPONENT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the component.  *  &#x60;UNASSIGNED&#x60; an assignee is not set for issues created with this component.  *  &#x60;PROJECT_DEFAULT&#x60; the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
   * @return assigneeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.")
  @JsonProperty(JSON_PROPERTY_ASSIGNEE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AssigneeTypeEnum getAssigneeType() {
    return assigneeType;
  }




   /**
   * Not used.
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not used.")
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProjectId() {
    return projectId;
  }




  public ComponentWithIssueCount assignee(User assignee) {
    
    this.assignee = assignee;
    return this;
  }

   /**
   * The details of the user associated with &#x60;assigneeType&#x60;, if any. See &#x60;realAssignee&#x60; for details of the user assigned to issues created with this component.
   * @return assignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The details of the user associated with `assigneeType`, if any. See `realAssignee` for details of the user assigned to issues created with this component.")
  @JsonProperty(JSON_PROPERTY_ASSIGNEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getAssignee() {
    return assignee;
  }


  public void setAssignee(User assignee) {
    this.assignee = assignee;
  }


  public ComponentWithIssueCount realAssignee(User realAssignee) {
    
    this.realAssignee = realAssignee;
    return this;
  }

   /**
   * The user assigned to issues created with this component, when &#x60;assigneeType&#x60; does not identify a valid assignee.
   * @return realAssignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user assigned to issues created with this component, when `assigneeType` does not identify a valid assignee.")
  @JsonProperty(JSON_PROPERTY_REAL_ASSIGNEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getRealAssignee() {
    return realAssignee;
  }


  public void setRealAssignee(User realAssignee) {
    this.realAssignee = realAssignee;
  }


   /**
   * Whether a user is associated with &#x60;assigneeType&#x60;. For example, if the &#x60;assigneeType&#x60; is set to &#x60;COMPONENT_LEAD&#x60; but the component lead is not set, then &#x60;false&#x60; is returned.
   * @return isAssigneeTypeValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.")
  @JsonProperty(JSON_PROPERTY_IS_ASSIGNEE_TYPE_VALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAssigneeTypeValid() {
    return isAssigneeTypeValid;
  }




   /**
   * The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the &#x60;assigneeType&#x60;. For example, &#x60;assigneeType&#x60; is set to &#x60;COMPONENT_LEAD&#x60; but no component lead is set. This property is set to one of the following values:   *  &#x60;PROJECT_LEAD&#x60; when &#x60;assigneeType&#x60; is &#x60;PROJECT_LEAD&#x60; and the project lead has permission to be assigned issues in the project that the component is in.  *  &#x60;COMPONENT_LEAD&#x60; when &#x60;assignee&#x60;Type is &#x60;COMPONENT_LEAD&#x60; and the component lead has permission to be assigned issues in the project that the component is in.  *  &#x60;UNASSIGNED&#x60; when &#x60;assigneeType&#x60; is &#x60;UNASSIGNED&#x60; and Jira is configured to allow unassigned issues.  *  &#x60;PROJECT_DEFAULT&#x60; when none of the preceding cases are true.
   * @return realAssigneeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:   *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.  *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.  *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.  *  `PROJECT_DEFAULT` when none of the preceding cases are true.")
  @JsonProperty(JSON_PROPERTY_REAL_ASSIGNEE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RealAssigneeTypeEnum getRealAssigneeType() {
    return realAssigneeType;
  }




   /**
   * The name for the component.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name for the component.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }




   /**
   * The unique identifier for the component.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier for the component.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentWithIssueCount componentWithIssueCount = (ComponentWithIssueCount) o;
    return Objects.equals(this.issueCount, componentWithIssueCount.issueCount) &&
        Objects.equals(this.description, componentWithIssueCount.description) &&
        Objects.equals(this.self, componentWithIssueCount.self) &&
        Objects.equals(this.project, componentWithIssueCount.project) &&
        Objects.equals(this.lead, componentWithIssueCount.lead) &&
        Objects.equals(this.assigneeType, componentWithIssueCount.assigneeType) &&
        Objects.equals(this.projectId, componentWithIssueCount.projectId) &&
        Objects.equals(this.assignee, componentWithIssueCount.assignee) &&
        Objects.equals(this.realAssignee, componentWithIssueCount.realAssignee) &&
        Objects.equals(this.isAssigneeTypeValid, componentWithIssueCount.isAssigneeTypeValid) &&
        Objects.equals(this.realAssigneeType, componentWithIssueCount.realAssigneeType) &&
        Objects.equals(this.name, componentWithIssueCount.name) &&
        Objects.equals(this.id, componentWithIssueCount.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueCount, description, self, project, lead, assigneeType, projectId, assignee, realAssignee, isAssigneeTypeValid, realAssigneeType, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentWithIssueCount {\n");
    sb.append("    issueCount: ").append(toIndentedString(issueCount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    realAssignee: ").append(toIndentedString(realAssignee)).append("\n");
    sb.append("    isAssigneeTypeValid: ").append(toIndentedString(isAssigneeTypeValid)).append("\n");
    sb.append("    realAssigneeType: ").append(toIndentedString(realAssigneeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

