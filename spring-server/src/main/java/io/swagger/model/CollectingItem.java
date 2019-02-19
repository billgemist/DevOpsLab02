package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CollectingItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-14T13:12:07.606Z")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "itemType", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = VHS.class, name = "VHS"),
  @JsonSubTypes.Type(value = Vinyl.class, name = "Vinyl"),
  @JsonSubTypes.Type(value = AudioCassette.class, name = "AudioCassette"),
})

public class CollectingItem   {
  /**
   * Gets or Sets itemType
   */
  public enum ItemTypeEnum {
    AUDIOCASSETTE("AudioCassette"),
    
    VINYL("Vinyl"),
    
    VHS("VHS");

    private String value;

    ItemTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ItemTypeEnum fromValue(String text) {
      for (ItemTypeEnum b : ItemTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("itemType")
  private ItemTypeEnum itemType = null;

  @JsonProperty("imageId")
  private String imageId = null;

  @JsonProperty("maxPrice")
  private Double maxPrice = null;

  public CollectingItem itemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
    return this;
  }

  /**
   * Get itemType
   * @return itemType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public ItemTypeEnum getItemType() {
    return itemType;
  }

  public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }

  public CollectingItem imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Get imageId
   * @return imageId
  **/
  @ApiModelProperty(value = "")


  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public CollectingItem maxPrice(Double maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }

  /**
   * Get maxPrice
   * minimum: 0
   * maximum: 10000
   * @return maxPrice
  **/
  @ApiModelProperty(value = "")

@DecimalMin("0") @DecimalMax("10000") 
  public Double getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(Double maxPrice) {
    this.maxPrice = maxPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectingItem collectingItem = (CollectingItem) o;
    return Objects.equals(this.itemType, collectingItem.itemType) &&
        Objects.equals(this.imageId, collectingItem.imageId) &&
        Objects.equals(this.maxPrice, collectingItem.maxPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemType, imageId, maxPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectingItem {\n");
    
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
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

