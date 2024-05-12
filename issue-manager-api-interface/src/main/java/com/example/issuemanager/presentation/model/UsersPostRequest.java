package com.example.issuemanager.presentation.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UsersPostRequest
 */

@JsonTypeName("_users_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-12T03:11:22.970089+09:00[Asia/Tokyo]", comments = "Generator version: 7.5.0")
public class UsersPostRequest {

  private Optional<UUID> id = Optional.empty();

  private String nickName;

  private String sub;

  public UsersPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UsersPostRequest(String nickName, String sub) {
    this.nickName = nickName;
    this.sub = sub;
  }

  public UsersPostRequest id(UUID id) {
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

  public UsersPostRequest nickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

  /**
   * Get nickName
   * @return nickName
  */
  @NotNull 
  @Schema(name = "nickName", example = "john doe", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nickName")
  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public UsersPostRequest sub(String sub) {
    this.sub = sub;
    return this;
  }

  /**
   * Get sub
   * @return sub
  */
  @NotNull 
  @Schema(name = "sub", example = "T.B.D", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sub")
  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersPostRequest usersPostRequest = (UsersPostRequest) o;
    return Objects.equals(this.id, usersPostRequest.id) &&
        Objects.equals(this.nickName, usersPostRequest.nickName) &&
        Objects.equals(this.sub, usersPostRequest.sub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nickName, sub);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersPostRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
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

