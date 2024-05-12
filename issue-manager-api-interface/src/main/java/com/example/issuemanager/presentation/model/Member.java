package com.example.issuemanager.presentation.model;

import java.net.URI;
import java.util.Objects;
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
 * Member
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-12T03:11:22.970089+09:00[Asia/Tokyo]", comments = "Generator version: 7.5.0")
public class Member {

  private Optional<UUID> id = Optional.empty();

  private UUID projectId;

  private Optional<UUID> userId = Optional.empty();

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    ADMIN_USER("admin_user"),
    
    REGULAR_USER("regular_user"),
    
    READONLY_USER("readonly_user");

    private String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RoleEnum role;

  public Member() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Member(UUID projectId, RoleEnum role) {
    this.projectId = projectId;
    this.role = role;
  }

  public Member id(UUID id) {
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

  public Member projectId(UUID projectId) {
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

  public Member userId(UUID userId) {
    this.userId = Optional.of(userId);
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @Valid 
  @Schema(name = "user_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public Optional<UUID> getUserId() {
    return userId;
  }

  public void setUserId(Optional<UUID> userId) {
    this.userId = userId;
  }

  public Member role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @NotNull 
  @Schema(name = "role", example = "admin_user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Member member = (Member) o;
    return Objects.equals(this.id, member.id) &&
        Objects.equals(this.projectId, member.projectId) &&
        Objects.equals(this.userId, member.userId) &&
        Objects.equals(this.role, member.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projectId, userId, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Member {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

