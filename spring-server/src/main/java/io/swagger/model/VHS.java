package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CollectingItem;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VHS
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-14T13:12:07.606Z")

public class VHS extends CollectingItem  {
  @JsonProperty("movieTitle")
  private String movieTitle = null;

  @JsonProperty("director")
  private String director = null;

  public VHS movieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
    return this;
  }

  /**
   * Get movieTitle
   * @return movieTitle
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getMovieTitle() {
    return movieTitle;
  }

  public void setMovieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
  }

  public VHS director(String director) {
    this.director = director;
    return this;
  }

  /**
   * Get director
   * @return director
  **/
  @ApiModelProperty(value = "")


  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VHS VHS = (VHS) o;
    return Objects.equals(this.movieTitle, VHS.movieTitle) &&
        Objects.equals(this.director, VHS.director) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieTitle, director, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VHS {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    movieTitle: ").append(toIndentedString(movieTitle)).append("\n");
    sb.append("    director: ").append(toIndentedString(director)).append("\n");
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

