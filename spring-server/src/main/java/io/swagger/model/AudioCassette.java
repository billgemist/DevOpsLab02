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
 * AudioCassette
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-14T13:12:07.606Z")

public class AudioCassette extends CollectingItem  {
  @JsonProperty("albumName")
  private String albumName = null;

  @JsonProperty("artist")
  private String artist = null;

  public AudioCassette albumName(String albumName) {
    this.albumName = albumName;
    return this;
  }

  /**
   * Get albumName
   * @return albumName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAlbumName() {
    return albumName;
  }

  public void setAlbumName(String albumName) {
    this.albumName = albumName;
  }

  public AudioCassette artist(String artist) {
    this.artist = artist;
    return this;
  }

  /**
   * Get artist
   * @return artist
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioCassette audioCassette = (AudioCassette) o;
    return Objects.equals(this.albumName, audioCassette.albumName) &&
        Objects.equals(this.artist, audioCassette.artist) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(albumName, artist, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioCassette {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    albumName: ").append(toIndentedString(albumName)).append("\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
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

