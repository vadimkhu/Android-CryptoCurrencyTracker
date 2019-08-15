package com.example.cracker

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DataDTO(

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("symbol")
	val symbol: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null,

	@field:SerializedName("cmc_rank")
	val cmcRank: Int? = null,

	@field:SerializedName("num_market_pairs")
	val numMarketPairs: Int? = null,

	@field:SerializedName("circulating_supply")
	val circulatingSupply: Double? = null,

	@field:SerializedName("total_supply")
	val totalSupply: Double? = null,

	@field:SerializedName("max_supply")
	val maxSupply: Double? = null,

	@field:SerializedName("last_updated")
	val lastUpdated: String? = null,

	@field:SerializedName("date_added")
	val dateAdded: String? = null,

	@field:SerializedName("tags")
	val tags: List<String?>? = null,

	@field:SerializedName("platform")
	val platform: Any? = null,

	@field:SerializedName("quote")
	val quote: QuoteDTO? = null
)