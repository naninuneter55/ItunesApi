/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.itunes_api.beans;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *
 * @author ono
 */
@Data
public class SearchResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("resultCount")
	private Integer resultCount;
	@SerializedName("results")
	private List<Result> results;

	@Data
	public class Result {

		@SerializedName("wrapperType")
		private String wrapperType;

		@SerializedName("kind")
		private String kind;

		@SerializedName("artistId")
		private String artistId;

		@SerializedName("collectionId")
		private String collectionId;

		@SerializedName("trackId")
		private String trackId;

		@SerializedName("artistName")
		private String artistName;

		@SerializedName("collectionName")
		private String collectionName;

		@SerializedName("trackName")
		private String trackName;

		@SerializedName("collectionCensoredName")
		private String collectionCensoredName;

		@SerializedName("trackCensoredName")
		private String trackCensoredName;

		@SerializedName("artistViewUrl")
		private String artistViewUrl;

		@SerializedName("collectionViewUrl")
		private String collectionViewUrl;

		@SerializedName("trackViewUrl")
		private String trackViewUrl;

		@SerializedName("previewUrl")
		private String previewUrl;

		@SerializedName("artworkUrl60")
		private String artworkUrl60;

		@SerializedName("artworkUrl100")
		private String artworkUrl100;

		@SerializedName("collectionPrice")
		private String collectionPrice;

		@SerializedName("trackPrice")
		private String trackPrice;

		@SerializedName("collectionExplicitness")
		private String collectionExplicitness;

		@SerializedName("trackExplicitness")
		private String trackExplicitness;

		@SerializedName("discCount")
		private String discCount;

		@SerializedName("discNumber")
		private String discNumber;

		@SerializedName("trackCount")
		private String trackCount;

		@SerializedName("trackNumber")
		private String trackNumber;

		@SerializedName("trackTimeMillis")
		private String trackTimeMillis;

		@SerializedName("country")
		private String country;

		@SerializedName("currency")
		private String currency;

		@SerializedName("primaryGenreName")
		private String primaryGenreName;
	}
}
