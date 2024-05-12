package com.example.issuemanager.presentation.model;

import java.net.URI;
import java.util.Objects;
import com.example.issuemanager.presentation.model.IssueTicketStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * IssueTicket
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-12T03:11:22.970089+09:00[Asia/Tokyo]", comments = "Generator version: 7.5.0")
public class IssueTicket {

  private Optional<UUID> id = Optional.empty();

  private UUID projectId;

  /**
   * Gets or Sets priority
   */
  public enum PriorityEnum {
    HIGHEST("highest"),
    
    HIGH("high"),
    
    MEDIUM("medium"),
    
    LOW("low"),
    
    LOWEST("lowest");

    private String value;

    PriorityEnum(String value) {
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
    public static PriorityEnum fromValue(String value) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PriorityEnum priority;

  private String title;

  private String description;

  private IssueTicketStatus status;

  private Optional<UUID> reporterUser = Optional.empty();

  private Optional<UUID> assigneeUser = Optional.empty();

  public IssueTicket() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTicket(UUID projectId, PriorityEnum priority, String title, String description, IssueTicketStatus status) {
    this.projectId = projectId;
    this.priority = priority;
    this.title = title;
    this.description = description;
    this.status = status;
  }

  public IssueTicket id(UUID id) {
    this.id = Optional.of(id);
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Optional<UUID> getId() {
    return id;
  }

  public void setId(Optional<UUID> id) {
    this.id = id;
  }

  public IssueTicket projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
  */
  @NotNull @Valid 
  @Schema(name = "project_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("project_id")
  public UUID getProjectId() {
    return projectId;
  }

  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }

  public IssueTicket priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  */
  @NotNull 
  @Schema(name = "priority", example = "medium", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("priority")
  public PriorityEnum getPriority() {
    return priority;
  }

  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }

  public IssueTicket title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull 
  @Schema(name = "title", example = "sample title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public IssueTicket description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull 
  @Schema(name = "description", example = "hi.\\n this is sample description.\\n", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssueTicket status(IssueTicketStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public IssueTicketStatus getStatus() {
    return status;
  }

  public void setStatus(IssueTicketStatus status) {
    this.status = status;
  }

  public IssueTicket reporterUser(UUID reporterUser) {
    this.reporterUser = Optional.of(reporterUser);
    return this;
  }

  /**
   * Get reporterUser
   * @return reporterUser
  */
  @Valid 
  @Schema(name = "reporter_user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reporter_user")
  public Optional<UUID> getReporterUser() {
    return reporterUser;
  }

  public void setReporterUser(Optional<UUID> reporterUser) {
    this.reporterUser = reporterUser;
  }

  public IssueTicket assigneeUser(UUID assigneeUser) {
    this.assigneeUser = Optional.of(assigneeUser);
    return this;
  }

  /**
   * Get assigneeUser
   * @return assigneeUser
  */
  @Valid 
  @Schema(name = "assignee_user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignee_user")
  public Optional<UUID> getAssigneeUser() {
    return assigneeUser;
  }

  public void setAssigneeUser(Optional<UUID> assigneeUser) {
    this.assigneeUser = assigneeUser;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTicket issueTicket = (IssueTicket) o;
    return Objects.equals(this.id, issueTicket.id) &&
        Objects.equals(this.projectId, issueTicket.projectId) &&
        Objects.equals(this.priority, issueTicket.priority) &&
        Objects.equals(this.title, issueTicket.title) &&
        Objects.equals(this.description, issueTicket.description) &&
        Objects.equals(this.status, issueTicket.status) &&
        Objects.equals(this.reporterUser, issueTicket.reporterUser) &&
        Objects.equals(this.assigneeUser, issueTicket.assigneeUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projectId, priority, title, description, status, reporterUser, assigneeUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTicket {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reporterUser: ").append(toIndentedString(reporterUser)).append("\n");
    sb.append("    assigneeUser: ").append(toIndentedString(assigneeUser)).append("\n");
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

