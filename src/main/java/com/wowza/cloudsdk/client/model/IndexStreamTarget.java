/*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 *
 * OpenAPI spec version: v1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wowza.cloudsdk.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
public class IndexStreamTarget {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * &lt;strong&gt;WowzaStreamTarget&lt;/strong&gt; is a Wowza CDN target. &lt;strong&gt;CustomStreamTarget&lt;/strong&gt; (the default) is an external, third-party destination, and &lt;strong&gt;UltraLowLatencyStreamTarget&lt;/strong&gt; is an ultra low latency stream target. &lt;!--and &lt;strong&gt;FacebookStreamTarget&lt;/strong&gt; (a Facebook Live target).--&gt;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    WOWZASTREAMTARGET("WowzaStreamTarget"),
    
    CUSTOMSTREAMTARGET("CustomStreamTarget"),
    
    ULTRALOWLATENCYSTREAMTARGET("UltraLowLatencyStreamTarget");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public IndexStreamTarget createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time that the stream target was created.
   * @return createdAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the stream target was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public IndexStreamTarget id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique alphanumeric string that identifies the stream target.
   * @return id
  **/
  @ApiModelProperty(example = "", value = "The unique alphanumeric string that identifies the stream target.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IndexStreamTarget name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A descriptive name for the stream target. Maximum 255 characters.
   * @return name
  **/
  @ApiModelProperty(example = "", value = "A descriptive name for the stream target. Maximum 255 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IndexStreamTarget type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * &lt;strong&gt;WowzaStreamTarget&lt;/strong&gt; is a Wowza CDN target. &lt;strong&gt;CustomStreamTarget&lt;/strong&gt; (the default) is an external, third-party destination, and &lt;strong&gt;UltraLowLatencyStreamTarget&lt;/strong&gt; is an ultra low latency stream target. &lt;!--and &lt;strong&gt;FacebookStreamTarget&lt;/strong&gt; (a Facebook Live target).--&gt;
   * @return type
  **/
  @ApiModelProperty(example = "", value = "<strong>WowzaStreamTarget</strong> is a Wowza CDN target. <strong>CustomStreamTarget</strong> (the default) is an external, third-party destination, and <strong>UltraLowLatencyStreamTarget</strong> is an ultra low latency stream target. <!--and <strong>FacebookStreamTarget</strong> (a Facebook Live target).-->")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public IndexStreamTarget updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time that the stream target was updated.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the stream target was updated.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexStreamTarget indexStreamTarget = (IndexStreamTarget) o;
    return Objects.equals(this.createdAt, indexStreamTarget.createdAt) &&
        Objects.equals(this.id, indexStreamTarget.id) &&
        Objects.equals(this.name, indexStreamTarget.name) &&
        Objects.equals(this.type, indexStreamTarget.type) &&
        Objects.equals(this.updatedAt, indexStreamTarget.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, name, type, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexStreamTarget {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

