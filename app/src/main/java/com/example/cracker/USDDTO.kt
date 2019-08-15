package com.example.cracker

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class USDDTO(

	@field:SerializedName("price")
	val price: Double? = null,

	@field:SerializedName("volume_24h")
	val volume24h: Double? = null,

	@field:SerializedName("percent_change_1h")
	val percentChange1h: Double? = null,

	@field:SerializedName("percent_change_24h")
	val percentChange24h: Double? = null,

	@field:SerializedName("percent_change_7d")
	val percentChange7d: Double? = null,

	@field:SerializedName("market_cap")
	val marketCap: Double? = null,

	@field:SerializedName("last_updated")
	val lastUpdated: String? = null
)