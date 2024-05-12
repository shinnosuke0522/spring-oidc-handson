package com.example.issuemanager.presentation.model;

import java.net.URI;
import java.util.Objects;
import com.example.issuemanager.presentation.model.IssueTicketStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * IssueTicketStatusUpdateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-12T03:11:22.970089+09:00[Asia/Tokyo]", comments = "Generator version: 7.5.0")
public class IssueTicketStatusUpdateRequest {

  private IssueTicketStatus status;

  public IssueTicketStatusUpdateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTicketStatusUpdateRequest(IssueTicketStatus status) {
    this.status = status;
  }

  public IssueTicketStatusUpdateRequest status(IssueTicketStatus status) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTicketStatusUpdateRequest issueTicketStatusUpdateRequest = (IssueTicketStatusUpdateRequest) o;
    return Objects.equals(this.status, issueTicketStatusUpdateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTicketStatusUpdateRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

