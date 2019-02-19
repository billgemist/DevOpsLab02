package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ErrorMessage;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MultilingualErrorMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-14T13:12:07.606Z")

public class MultilingualErrorMessage extends HashMap<String, ErrorMessage>  {
  @JsonProperty("defaultLanguage")
  private ErrorMessage defaultLanguage = null;

  public MultilingualErrorMessage defaultLanguage(ErrorMessage defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }

  /**
   * Get defaultLanguage
   * @return defaultLanguage
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ErrorMessage getDefaultLanguage() {
    return defaultLanguage;
  }

  public void setDefaultLanguage(ErrorMessage defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualErrorMessage multilingualErrorMessage = (MultilingualErrorMessage) o;
    return Objects.equals(this.defaultLanguage, multilingualErrorMessage.defaultLanguage) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultLanguage, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualErrorMessage {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

