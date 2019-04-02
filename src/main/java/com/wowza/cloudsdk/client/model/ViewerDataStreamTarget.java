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
import com.wowza.cloudsdk.client.model.UsageViewerDataCountries;
import com.wowza.cloudsdk.client.model.UsageViewerDataProtocols;
import com.wowza.cloudsdk.client.model.UsageViewerDataRenditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
public class ViewerDataStreamTarget {
  @SerializedName("countries")
  private UsageViewerDataCountries countries = null;

  @SerializedName("country_list")
  private List<String> countryList = null;

  @SerializedName("percentage_viewers")
  private Integer percentageViewers = null;

  @SerializedName("percentage_viewing_time")
  private Integer percentageViewingTime = null;

  @SerializedName("protocols")
  private UsageViewerDataProtocols protocols = null;

  @SerializedName("rendition_list")
  private List<String> renditionList = null;

  @SerializedName("renditions")
  private UsageViewerDataRenditions renditions = null;

  @SerializedName("seconds_avg_viewing_time")
  private Integer secondsAvgViewingTime = null;

  @SerializedName("seconds_total_viewing_time")
  private Integer secondsTotalViewingTime = null;

  @SerializedName("total_unique_viewers")
  private Integer totalUniqueViewers = null;

  public ViewerDataStreamTarget countries(UsageViewerDataCountries countries) {
    this.countries = countries;
    return this;
  }

   /**
   * An array of the countries where the stream was requested. Includes breakdown by protocol.
   * @return countries
  **/
  @ApiModelProperty(value = "An array of the countries where the stream was requested. Includes breakdown by protocol.")
  public UsageViewerDataCountries getCountries() {
    return countries;
  }

  public void setCountries(UsageViewerDataCountries countries) {
    this.countries = countries;
  }

  public ViewerDataStreamTarget countryList(List<String> countryList) {
    this.countryList = countryList;
    return this;
  }

  public ViewerDataStreamTarget addCountryListItem(String countryListItem) {
    if (this.countryList == null) {
      this.countryList = new ArrayList<String>();
    }
    this.countryList.add(countryListItem);
    return this;
  }

   /**
   * A comma-separated list of all country codes that requested the stream.
   * @return countryList
  **/
  @ApiModelProperty(example = "\"\"", value = "A comma-separated list of all country codes that requested the stream.")
  public List<String> getCountryList() {
    return countryList;
  }

  public void setCountryList(List<String> countryList) {
    this.countryList = countryList;
  }

  public ViewerDataStreamTarget percentageViewers(Integer percentageViewers) {
    this.percentageViewers = percentageViewers;
    return this;
  }

   /**
   * Total percentage of requests to play content (&lt;strong&gt;100&lt;/strong&gt;).
   * @return percentageViewers
  **/
  @ApiModelProperty(example = "", value = "Total percentage of requests to play content (<strong>100</strong>).")
  public Integer getPercentageViewers() {
    return percentageViewers;
  }

  public void setPercentageViewers(Integer percentageViewers) {
    this.percentageViewers = percentageViewers;
  }

  public ViewerDataStreamTarget percentageViewingTime(Integer percentageViewingTime) {
    this.percentageViewingTime = percentageViewingTime;
    return this;
  }

   /**
   * The percentage of total time that the protocol or rendition was played. Always &lt;strong&gt;100&lt;/strong&gt; for &lt;em&gt;stream_target&lt;/em&gt;.
   * @return percentageViewingTime
  **/
  @ApiModelProperty(example = "", value = "The percentage of total time that the protocol or rendition was played. Always <strong>100</strong> for <em>stream_target</em>.")
  public Integer getPercentageViewingTime() {
    return percentageViewingTime;
  }

  public void setPercentageViewingTime(Integer percentageViewingTime) {
    this.percentageViewingTime = percentageViewingTime;
  }

  public ViewerDataStreamTarget protocols(UsageViewerDataProtocols protocols) {
    this.protocols = protocols;
    return this;
  }

   /**
   * An array of the protocols that were requested.
   * @return protocols
  **/
  @ApiModelProperty(value = "An array of the protocols that were requested.")
  public UsageViewerDataProtocols getProtocols() {
    return protocols;
  }

  public void setProtocols(UsageViewerDataProtocols protocols) {
    this.protocols = protocols;
  }

  public ViewerDataStreamTarget renditionList(List<String> renditionList) {
    this.renditionList = renditionList;
    return this;
  }

  public ViewerDataStreamTarget addRenditionListItem(String renditionListItem) {
    if (this.renditionList == null) {
      this.renditionList = new ArrayList<String>();
    }
    this.renditionList.add(renditionListItem);
    return this;
  }

   /**
   * A comma-separated list of all requested renditions.
   * @return renditionList
  **/
  @ApiModelProperty(example = "\"\"", value = "A comma-separated list of all requested renditions.")
  public List<String> getRenditionList() {
    return renditionList;
  }

  public void setRenditionList(List<String> renditionList) {
    this.renditionList = renditionList;
  }

  public ViewerDataStreamTarget renditions(UsageViewerDataRenditions renditions) {
    this.renditions = renditions;
    return this;
  }

   /**
   * An array of the renditions that were requested. Includes breakdown by protocol.
   * @return renditions
  **/
  @ApiModelProperty(value = "An array of the renditions that were requested. Includes breakdown by protocol.")
  public UsageViewerDataRenditions getRenditions() {
    return renditions;
  }

  public void setRenditions(UsageViewerDataRenditions renditions) {
    this.renditions = renditions;
  }

  public ViewerDataStreamTarget secondsAvgViewingTime(Integer secondsAvgViewingTime) {
    this.secondsAvgViewingTime = secondsAvgViewingTime;
    return this;
  }

   /**
   * The average length of time, in seconds, that the stream was played at the target.
   * @return secondsAvgViewingTime
  **/
  @ApiModelProperty(example = "", value = "The average length of time, in seconds, that the stream was played at the target.")
  public Integer getSecondsAvgViewingTime() {
    return secondsAvgViewingTime;
  }

  public void setSecondsAvgViewingTime(Integer secondsAvgViewingTime) {
    this.secondsAvgViewingTime = secondsAvgViewingTime;
  }

  public ViewerDataStreamTarget secondsTotalViewingTime(Integer secondsTotalViewingTime) {
    this.secondsTotalViewingTime = secondsTotalViewingTime;
    return this;
  }

   /**
   * The total length of time, in seconds, that the stream was played at the target. May be longer than the duration of the stream.
   * @return secondsTotalViewingTime
  **/
  @ApiModelProperty(example = "", value = "The total length of time, in seconds, that the stream was played at the target. May be longer than the duration of the stream.")
  public Integer getSecondsTotalViewingTime() {
    return secondsTotalViewingTime;
  }

  public void setSecondsTotalViewingTime(Integer secondsTotalViewingTime) {
    this.secondsTotalViewingTime = secondsTotalViewingTime;
  }

  public ViewerDataStreamTarget totalUniqueViewers(Integer totalUniqueViewers) {
    this.totalUniqueViewers = totalUniqueViewers;
    return this;
  }

   /**
   * The total number of requests to download at least one chunk of the stream at the target (for HTTP streams) or requests to connect to and play the stream (for ultra low latency streams). A unique viewer is a single IP address; multiple users that share the same IP address are counted once.
   * @return totalUniqueViewers
  **/
  @ApiModelProperty(example = "", value = "The total number of requests to download at least one chunk of the stream at the target (for HTTP streams) or requests to connect to and play the stream (for ultra low latency streams). A unique viewer is a single IP address; multiple users that share the same IP address are counted once.")
  public Integer getTotalUniqueViewers() {
    return totalUniqueViewers;
  }

  public void setTotalUniqueViewers(Integer totalUniqueViewers) {
    this.totalUniqueViewers = totalUniqueViewers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewerDataStreamTarget streamTarget7 = (ViewerDataStreamTarget) o;
    return Objects.equals(this.countries, streamTarget7.countries) &&
        Objects.equals(this.countryList, streamTarget7.countryList) &&
        Objects.equals(this.percentageViewers, streamTarget7.percentageViewers) &&
        Objects.equals(this.percentageViewingTime, streamTarget7.percentageViewingTime) &&
        Objects.equals(this.protocols, streamTarget7.protocols) &&
        Objects.equals(this.renditionList, streamTarget7.renditionList) &&
        Objects.equals(this.renditions, streamTarget7.renditions) &&
        Objects.equals(this.secondsAvgViewingTime, streamTarget7.secondsAvgViewingTime) &&
        Objects.equals(this.secondsTotalViewingTime, streamTarget7.secondsTotalViewingTime) &&
        Objects.equals(this.totalUniqueViewers, streamTarget7.totalUniqueViewers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries, countryList, percentageViewers, percentageViewingTime, protocols, renditionList, renditions, secondsAvgViewingTime, secondsTotalViewingTime, totalUniqueViewers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewerDataStreamTarget {\n");
    
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    countryList: ").append(toIndentedString(countryList)).append("\n");
    sb.append("    percentageViewers: ").append(toIndentedString(percentageViewers)).append("\n");
    sb.append("    percentageViewingTime: ").append(toIndentedString(percentageViewingTime)).append("\n");
    sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
    sb.append("    renditionList: ").append(toIndentedString(renditionList)).append("\n");
    sb.append("    renditions: ").append(toIndentedString(renditions)).append("\n");
    sb.append("    secondsAvgViewingTime: ").append(toIndentedString(secondsAvgViewingTime)).append("\n");
    sb.append("    secondsTotalViewingTime: ").append(toIndentedString(secondsTotalViewingTime)).append("\n");
    sb.append("    totalUniqueViewers: ").append(toIndentedString(totalUniqueViewers)).append("\n");
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

