package com.example.issuemanager.presentation.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ValidationErrorErrorsInner
 */

@JsonTypeName("ValidationError_errors_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-12T03:11:22.970089+09:00[Asia/Tokyo]", comments = "Generator version: 7.5.0")
public class ValidationErrorErrorsInner {

  private String property;

  private String message;

  public ValidationErrorErrorsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ValidationErrorErrorsInner(String property, String message) {
    this.property = property;
    this.message = message;
  }

  public ValidationErrorErrorsInner property(String property) {
    this.property = property;
    return this;
  }

  /**
   * Get property
   * @return property
  */
  @NotNull 
  @Schema(name = "property", example = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public ValidationErrorErrorsInner message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @NotNull 
  @Schema(name = "message", example = "the length of name should be less than 255", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationErrorErrorsInner validationErrorErrorsInner = (ValidationErrorErrorsInner) o;
    return Objects.equals(this.property, validationErrorErrorsInner.property) &&
        Objects.equals(this.message, validationErrorErrorsInner.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationErrorErrorsInner {\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

