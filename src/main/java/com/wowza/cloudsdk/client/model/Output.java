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
import com.wowza.cloudsdk.client.model.OutputStreamTarget;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
public class Output {
  @SerializedName("aspect_ratio_height")
  private Integer aspectRatioHeight = null;

  @SerializedName("aspect_ratio_width")
  private Integer aspectRatioWidth = null;

  @SerializedName("bitrate_audio")
  private Integer bitrateAudio = null;

  @SerializedName("bitrate_video")
  private Integer bitrateVideo = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  /**
   * Reduce the frame rate of the transcoded output rendition. The default, &lt;strong&gt;0&lt;/strong&gt;, uses the encoded stream&#39;s frame rate without reduction.
   */
  @JsonAdapter(FramerateReductionEnum.Adapter.class)
  public enum FramerateReductionEnum {
    _0("0"),
    
    _1_2("1/2"),
    
    _1_4("1/4"),
    
    _1_25("1/25"),
    
    _1_30("1/30"),
    
    _1_50("1/50"),
    
    _1_60("1/60");

    private String value;

    FramerateReductionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FramerateReductionEnum fromValue(String text) {
      for (FramerateReductionEnum b : FramerateReductionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FramerateReductionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FramerateReductionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FramerateReductionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FramerateReductionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("framerate_reduction")
  private FramerateReductionEnum framerateReduction = null;

  /**
   * The encoding method. Specify &lt;strong&gt;main&lt;/strong&gt; for desktop streaming, &lt;strong&gt;baseline&lt;/strong&gt; for playback on mobile devices, or &lt;strong&gt;high&lt;/strong&gt; for HD playback. The default is &lt;strong&gt;high&lt;/strong&gt;.
   */
  @JsonAdapter(H264ProfileEnum.Adapter.class)
  public enum H264ProfileEnum {
    MAIN("main"),
    
    BASELINE("baseline"),
    
    HIGH("high");

    private String value;

    H264ProfileEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static H264ProfileEnum fromValue(String text) {
      for (H264ProfileEnum b : H264ProfileEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<H264ProfileEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final H264ProfileEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public H264ProfileEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return H264ProfileEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("h264_profile")
  private H264ProfileEnum h264Profile = null;

  @SerializedName("id")
  private String id = null;

  /**
   * The interval used to define the compression applied to a group of frames. The default, &lt;strong&gt;follow_source&lt;/strong&gt;, uses the keyframe interval of the source video.
   */
  @JsonAdapter(KeyframesEnum.Adapter.class)
  public enum KeyframesEnum {
    FOLLOW_SOURCE("follow_source"),
    
    _25("25"),
    
    _30("30"),
    
    _50("50"),
    
    _60("60"),
    
    _100("100"),
    
    _120("120");

    private String value;

    KeyframesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyframesEnum fromValue(String text) {
      for (KeyframesEnum b : KeyframesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<KeyframesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyframesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyframesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KeyframesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("keyframes")
  private KeyframesEnum keyframes = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("output_stream_targets")
  private List<OutputStreamTarget> outputStreamTargets = null;

  @SerializedName("passthrough_audio")
  private Boolean passthroughAudio = null;

  @SerializedName("passthrough_video")
  private Boolean passthroughVideo = null;

  /**
   * The contents of the stream. The default is both audio and video (&lt;strong&gt;audiovideo&lt;/strong&gt;).
   */
  @JsonAdapter(StreamFormatEnum.Adapter.class)
  public enum StreamFormatEnum {
    AUDIOVIDEO("audiovideo"),
    
    VIDEOONLY("videoonly"),
    
    AUDIOONLY("audioonly");

    private String value;

    StreamFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StreamFormatEnum fromValue(String text) {
      for (StreamFormatEnum b : StreamFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StreamFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StreamFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StreamFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StreamFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("stream_format")
  private StreamFormatEnum streamFormat = null;

  @SerializedName("transcoder_id")
  private String transcoderId = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public Output aspectRatioHeight(Integer aspectRatioHeight) {
    this.aspectRatioHeight = aspectRatioHeight;
    return this;
  }

   /**
   * The height, in pixels, of the output rendition. Should correspond to a widescreen or standard aspect ratio and be divisible by 8. The default is &lt;strong&gt;1080&lt;/strong&gt;.
   * @return aspectRatioHeight
  **/
  @ApiModelProperty(example = "", value = "The height, in pixels, of the output rendition. Should correspond to a widescreen or standard aspect ratio and be divisible by 8. The default is <strong>1080</strong>.")
  public Integer getAspectRatioHeight() {
    return aspectRatioHeight;
  }

  public void setAspectRatioHeight(Integer aspectRatioHeight) {
    this.aspectRatioHeight = aspectRatioHeight;
  }

  public Output aspectRatioWidth(Integer aspectRatioWidth) {
    this.aspectRatioWidth = aspectRatioWidth;
    return this;
  }

   /**
   * The width, in pixels, of the output rendition. Should correspond to a widescreen or standard aspect ratio and be divisible by 8. The default is &lt;strong&gt;1980&lt;/strong&gt;.
   * @return aspectRatioWidth
  **/
  @ApiModelProperty(example = "", value = "The width, in pixels, of the output rendition. Should correspond to a widescreen or standard aspect ratio and be divisible by 8. The default is <strong>1980</strong>.")
  public Integer getAspectRatioWidth() {
    return aspectRatioWidth;
  }

  public void setAspectRatioWidth(Integer aspectRatioWidth) {
    this.aspectRatioWidth = aspectRatioWidth;
  }

  public Output bitrateAudio(Integer bitrateAudio) {
    this.bitrateAudio = bitrateAudio;
    return this;
  }

   /**
   * The audio bitrate, in kilobits per second (Kbps). Must be between &lt;strong&gt;0&lt;/strong&gt; (for passthrough audio) and &lt;strong&gt;1000&lt;/strong&gt;. The default is &lt;strong&gt;128&lt;/strong&gt;.
   * @return bitrateAudio
  **/
  @ApiModelProperty(example = "", value = "The audio bitrate, in kilobits per second (Kbps). Must be between <strong>0</strong> (for passthrough audio) and <strong>1000</strong>. The default is <strong>128</strong>.")
  public Integer getBitrateAudio() {
    return bitrateAudio;
  }

  public void setBitrateAudio(Integer bitrateAudio) {
    this.bitrateAudio = bitrateAudio;
  }

  public Output bitrateVideo(Integer bitrateVideo) {
    this.bitrateVideo = bitrateVideo;
    return this;
  }

   /**
   * The video bitrate, in kilobits per second (Kbps). Must be between &lt;strong&gt;0&lt;/strong&gt; (for passthrough video) and &lt;strong&gt;10240&lt;/strong&gt;. The default is &lt;strong&gt;4000&lt;/strong&gt;.
   * @return bitrateVideo
  **/
  @ApiModelProperty(example = "", value = "The video bitrate, in kilobits per second (Kbps). Must be between <strong>0</strong> (for passthrough video) and <strong>10240</strong>. The default is <strong>4000</strong>.")
  public Integer getBitrateVideo() {
    return bitrateVideo;
  }

  public void setBitrateVideo(Integer bitrateVideo) {
    this.bitrateVideo = bitrateVideo;
  }

  public Output createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time that the output rendition was created.
   * @return createdAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the output rendition was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Output framerateReduction(FramerateReductionEnum framerateReduction) {
    this.framerateReduction = framerateReduction;
    return this;
  }

   /**
   * Reduce the frame rate of the transcoded output rendition. The default, &lt;strong&gt;0&lt;/strong&gt;, uses the encoded stream&#39;s frame rate without reduction.
   * @return framerateReduction
  **/
  @ApiModelProperty(example = "", value = "Reduce the frame rate of the transcoded output rendition. The default, <strong>0</strong>, uses the encoded stream's frame rate without reduction.")
  public FramerateReductionEnum getFramerateReduction() {
    return framerateReduction;
  }

  public void setFramerateReduction(FramerateReductionEnum framerateReduction) {
    this.framerateReduction = framerateReduction;
  }

  public Output h264Profile(H264ProfileEnum h264Profile) {
    this.h264Profile = h264Profile;
    return this;
  }

   /**
   * The encoding method. Specify &lt;strong&gt;main&lt;/strong&gt; for desktop streaming, &lt;strong&gt;baseline&lt;/strong&gt; for playback on mobile devices, or &lt;strong&gt;high&lt;/strong&gt; for HD playback. The default is &lt;strong&gt;high&lt;/strong&gt;.
   * @return h264Profile
  **/
  @ApiModelProperty(example = "", value = "The encoding method. Specify <strong>main</strong> for desktop streaming, <strong>baseline</strong> for playback on mobile devices, or <strong>high</strong> for HD playback. The default is <strong>high</strong>.")
  public H264ProfileEnum getH264Profile() {
    return h264Profile;
  }

  public void setH264Profile(H264ProfileEnum h264Profile) {
    this.h264Profile = h264Profile;
  }

  public Output id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique alphanumeric string that identifies the output rendition.
   * @return id
  **/
  @ApiModelProperty(example = "", value = "The unique alphanumeric string that identifies the output rendition.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Output keyframes(KeyframesEnum keyframes) {
    this.keyframes = keyframes;
    return this;
  }

   /**
   * The interval used to define the compression applied to a group of frames. The default, &lt;strong&gt;follow_source&lt;/strong&gt;, uses the keyframe interval of the source video.
   * @return keyframes
  **/
  @ApiModelProperty(example = "", value = "The interval used to define the compression applied to a group of frames. The default, <strong>follow_source</strong>, uses the keyframe interval of the source video.")
  public KeyframesEnum getKeyframes() {
    return keyframes;
  }

  public void setKeyframes(KeyframesEnum keyframes) {
    this.keyframes = keyframes;
  }

  public Output name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A descriptive name for the output (generated, not writable).
   * @return name
  **/
  @ApiModelProperty(example = "", value = "A descriptive name for the output (generated, not writable).")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Output outputStreamTargets(List<OutputStreamTarget> outputStreamTargets) {
    this.outputStreamTargets = outputStreamTargets;
    return this;
  }

  public Output addOutputStreamTargetsItem(OutputStreamTarget outputStreamTargetsItem) {
    if (this.outputStreamTargets == null) {
      this.outputStreamTargets = new ArrayList<OutputStreamTarget>();
    }
    this.outputStreamTargets.add(outputStreamTargetsItem);
    return this;
  }

   /**
   * Get outputStreamTargets
   * @return outputStreamTargets
  **/
  @ApiModelProperty(value = "")
  public List<OutputStreamTarget> getOutputStreamTargets() {
    return outputStreamTargets;
  }

  public void setOutputStreamTargets(List<OutputStreamTarget> outputStreamTargets) {
    this.outputStreamTargets = outputStreamTargets;
  }

  public Output passthroughAudio(Boolean passthroughAudio) {
    this.passthroughAudio = passthroughAudio;
    return this;
  }

   /**
   * If &lt;strong&gt;true&lt;/strong&gt;, sends the audio track to the target without transcoding. The default is &lt;strong&gt;false&lt;/strong&gt;.
   * @return passthroughAudio
  **/
  @ApiModelProperty(value = "If <strong>true</strong>, sends the audio track to the target without transcoding. The default is <strong>false</strong>.")
  public Boolean isPassthroughAudio() {
    return passthroughAudio;
  }

  public void setPassthroughAudio(Boolean passthroughAudio) {
    this.passthroughAudio = passthroughAudio;
  }

  public Output passthroughVideo(Boolean passthroughVideo) {
    this.passthroughVideo = passthroughVideo;
    return this;
  }

   /**
   * If &lt;strong&gt;true&lt;/strong&gt;, sends the video track to the target without transcoding. The default is &lt;strong&gt;false&lt;/strong&gt;.
   * @return passthroughVideo
  **/
  @ApiModelProperty(value = "If <strong>true</strong>, sends the video track to the target without transcoding. The default is <strong>false</strong>.")
  public Boolean isPassthroughVideo() {
    return passthroughVideo;
  }

  public void setPassthroughVideo(Boolean passthroughVideo) {
    this.passthroughVideo = passthroughVideo;
  }

  public Output streamFormat(StreamFormatEnum streamFormat) {
    this.streamFormat = streamFormat;
    return this;
  }

   /**
   * The contents of the stream. The default is both audio and video (&lt;strong&gt;audiovideo&lt;/strong&gt;).
   * @return streamFormat
  **/
  @ApiModelProperty(example = "", value = "The contents of the stream. The default is both audio and video (<strong>audiovideo</strong>).")
  public StreamFormatEnum getStreamFormat() {
    return streamFormat;
  }

  public void setStreamFormat(StreamFormatEnum streamFormat) {
    this.streamFormat = streamFormat;
  }

  public Output transcoderId(String transcoderId) {
    this.transcoderId = transcoderId;
    return this;
  }

   /**
   * The unique alphanumeric string that identifies the transcoder.
   * @return transcoderId
  **/
  @ApiModelProperty(example = "", value = "The unique alphanumeric string that identifies the transcoder.")
  public String getTranscoderId() {
    return transcoderId;
  }

  public void setTranscoderId(String transcoderId) {
    this.transcoderId = transcoderId;
  }

  public Output updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time that the output rendition was updated.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the output rendition was updated.")
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
    Output output = (Output) o;
    return Objects.equals(this.aspectRatioHeight, output.aspectRatioHeight) &&
        Objects.equals(this.aspectRatioWidth, output.aspectRatioWidth) &&
        Objects.equals(this.bitrateAudio, output.bitrateAudio) &&
        Objects.equals(this.bitrateVideo, output.bitrateVideo) &&
        Objects.equals(this.createdAt, output.createdAt) &&
        Objects.equals(this.framerateReduction, output.framerateReduction) &&
        Objects.equals(this.h264Profile, output.h264Profile) &&
        Objects.equals(this.id, output.id) &&
        Objects.equals(this.keyframes, output.keyframes) &&
        Objects.equals(this.name, output.name) &&
        Objects.equals(this.outputStreamTargets, output.outputStreamTargets) &&
        Objects.equals(this.passthroughAudio, output.passthroughAudio) &&
        Objects.equals(this.passthroughVideo, output.passthroughVideo) &&
        Objects.equals(this.streamFormat, output.streamFormat) &&
        Objects.equals(this.transcoderId, output.transcoderId) &&
        Objects.equals(this.updatedAt, output.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspectRatioHeight, aspectRatioWidth, bitrateAudio, bitrateVideo, createdAt, framerateReduction, h264Profile, id, keyframes, name, outputStreamTargets, passthroughAudio, passthroughVideo, streamFormat, transcoderId, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Output {\n");
    
    sb.append("    aspectRatioHeight: ").append(toIndentedString(aspectRatioHeight)).append("\n");
    sb.append("    aspectRatioWidth: ").append(toIndentedString(aspectRatioWidth)).append("\n");
    sb.append("    bitrateAudio: ").append(toIndentedString(bitrateAudio)).append("\n");
    sb.append("    bitrateVideo: ").append(toIndentedString(bitrateVideo)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    framerateReduction: ").append(toIndentedString(framerateReduction)).append("\n");
    sb.append("    h264Profile: ").append(toIndentedString(h264Profile)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyframes: ").append(toIndentedString(keyframes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outputStreamTargets: ").append(toIndentedString(outputStreamTargets)).append("\n");
    sb.append("    passthroughAudio: ").append(toIndentedString(passthroughAudio)).append("\n");
    sb.append("    passthroughVideo: ").append(toIndentedString(passthroughVideo)).append("\n");
    sb.append("    streamFormat: ").append(toIndentedString(streamFormat)).append("\n");
    sb.append("    transcoderId: ").append(toIndentedString(transcoderId)).append("\n");
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

