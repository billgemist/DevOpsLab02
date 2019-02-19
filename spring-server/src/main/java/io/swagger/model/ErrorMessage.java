package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-14T13:12:07.606Z")

public class ErrorMessage   {
  @JsonProperty("longMessage")
  private String longMessage = null;

  @JsonProperty("shortMessage")
  private String shortMessage = null;

  public ErrorMessage longMessage(String longMessage) {
    this.longMessage = longMessage;
    return this;
  }

  /**
   * Get longMessage
   * @return longMessage
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getLongMessage() {
    return longMessage;
  }

  public void setLongMessage(String longMessage) {
    this.longMessage = longMessage;
  }

  public ErrorMessage shortMessage(String shortMessage) {
    this.shortMessage = shortMessage;
    return this;
  }

  /**
   * Get shortMessage
   * @return shortMessage
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getShortMessage() {
    return shortMessage;
  }

  public void setShortMessage(String shortMessage) {
    this.shortMessage = shortMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorMessage errorMessage = (ErrorMessage) o;
    return Objects.equals(this.longMessage, errorMessage.longMessage) &&
        Objects.equals(this.shortMessage, errorMessage.shortMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longMessage, shortMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorMessage {\n");
    
    sb.append("    longMessage: ").append(toIndentedString(longMessage)).append("\n");
    sb.append("    shortMessage: ").append(toIndentedString(shortMessage)).append("\n");
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

