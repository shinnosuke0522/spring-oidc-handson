package com.example.issuemanager.presentation.model;

import java.net.URI;
import java.util.Objects;
import com.example.issuemanager.presentation.model.Member;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Project
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-12T03:11:22.970089+09:00[Asia/Tokyo]", comments = "Generator version: 7.5.0")
public class Project {

  private Optional<UUID> id = Optional.empty();

  private String name;

  private Boolean isArchived;

  @Valid
  private List<@Valid Member> members = new ArrayList<>();

  public Project() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Project(String name, Boolean isArchived) {
    this.name = name;
    this.isArchived = isArchived;
  }

  public Project id(UUID id) {
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

  public Project name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "sample project", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

  /**
   * Get isArchived
   * @return isArchived
  */
  @NotNull 
  @Schema(name = "is_archived", example = "false", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_archived")
  public Boolean getIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }

  public Project members(List<@Valid Member> members) {
    this.members = members;
    return this;
  }

  public Project addMembersItem(Member membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * Get members
   * @return members
  */
  @Valid 
  @Schema(name = "members", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("members")
  public List<@Valid Member> getMembers() {
    return members;
  }

  public void setMembers(List<@Valid Member> members) {
    this.members = members;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.isArchived, project.isArchived) &&
        Objects.equals(this.members, project.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isArchived, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

