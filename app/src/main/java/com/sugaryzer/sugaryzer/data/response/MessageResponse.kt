package com.sugaryzer.sugaryzer.data.response

import com.google.gson.annotations.SerializedName

data class MessageResponse(

	@field:SerializedName("error")
	val error: Boolean? = null,

	@field:SerializedName("message")
	val message: String? = null
)
