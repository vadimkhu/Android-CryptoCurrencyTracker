package com.example.cracker

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class QuoteDTO(

	@field:SerializedName("USD")
	val uSD: USDDTO? = null,

	@field:SerializedName("BTC")
	val bTC: BTCDTO? = null
)