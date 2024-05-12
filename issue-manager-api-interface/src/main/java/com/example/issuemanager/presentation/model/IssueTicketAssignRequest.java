package com.example.issuemanager.presentation.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * IssueTicketAssignRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-12T03:11:22.970089+09:00[Asia/Tokyo]", comments = "Generator version: 7.5.0")
public class IssueTicketAssignRequest {

  private UUID assigneeUser;

  public IssueTicketAssignRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTicketAssignRequest(UUID assigneeUser) {
    this.assigneeUser = assigneeUser;
  }

  public IssueTicketAssignRequest assigneeUser(UUID assigneeUser) {
    this.assigneeUser = assigneeUser;
    return this;
  }

  /**
   * Get assigneeUser
   * @return assigneeUser
  */
  @NotNull @Valid 
  @Schema(name = "assignee_user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assignee_user")
  public UUID getAssigneeUser() {
    return assigneeUser;
  }

  public void setAssigneeUser(UUID assigneeUser) {
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
    IssueTicketAssignRequest issueTicketAssignRequest = (IssueTicketAssignRequest) o;
    return Objects.equals(this.assigneeUser, issueTicketAssignRequest.assigneeUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assigneeUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTicketAssignRequest {\n");
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

