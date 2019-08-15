package com.example.cracker

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class StatusDTO(

	@field:SerializedName("timestamp")
	val timestamp: String? = null,

	@field:SerializedName("error_code")
	val errorCode: Int? = null,

	@field:SerializedName("error_message")
	val errorMessage: String? = null,

	@field:SerializedName("elapsed")
	val elapsed: Int? = null,

	@field:SerializedName("credit_count")
	val creditCount: Int? = null
)