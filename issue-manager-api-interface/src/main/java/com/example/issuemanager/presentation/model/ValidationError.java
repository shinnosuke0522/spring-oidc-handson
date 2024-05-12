package com.example.issuemanager.presentation.model;

import java.net.URI;
import java.util.Objects;
import com.example.issuemanager.presentation.model.ValidationErrorErrorsInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ValidationError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-12T03:11:22.970089+09:00[Asia/Tokyo]", comments = "Generator version: 7.5.0")
public class ValidationError {

  @Valid
  private List<@Valid ValidationErrorErrorsInner> errors = new ArrayList<>();

  public ValidationError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ValidationError(List<@Valid ValidationErrorErrorsInner> errors) {
    this.errors = errors;
  }

  public ValidationError errors(List<@Valid ValidationErrorErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public ValidationError addErrorsItem(ValidationErrorErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @NotNull @Valid 
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errors")
  public List<@Valid ValidationErrorErrorsInner> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ValidationErrorErrorsInner> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationError validationError = (ValidationError) o;
    return Objects.equals(this.errors, validationError.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationError {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

