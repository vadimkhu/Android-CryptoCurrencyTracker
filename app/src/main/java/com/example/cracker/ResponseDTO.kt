package com.example.cracker

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ResponseDTO(

	@field:SerializedName("data")
	val data: List<DataDTO?>? = null,

	@field:SerializedName("status")
	val status: StatusDTO? = null
)