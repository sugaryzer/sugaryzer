package com.sugaryzer.sugaryzer.data.response

import com.google.gson.annotations.SerializedName

data class HistoryResponse(

	@field:SerializedName("result")
	val result: ResultHistory? = null,

	@field:SerializedName("error")
	val error: Boolean? = null,

	@field:SerializedName("message")
	val message: String? = null
)

data class ProductHistory(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("amountOfSugar")
	val amountOfSugar: Int? = null,

	@field:SerializedName("code")
	val code: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("category")
	val category: String? = null
)

data class DataItemHistory(

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("product")
	val product: ProductHistory? = null,

	@field:SerializedName("productId")
	val productId: Int? = null,

	@field:SerializedName("sugarConsume")
	val sugarConsume: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("userId")
	val userId: String? = null
)

data class ResultHistory(

	@field:SerializedName("data")
	val data: List<DataItemHistory>? = null,

	@field:SerializedName("paging")
	val paging: PagingHistory? = null
)

data class PagingHistory(

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("total_page")
	val totalPage: Int? = null,

	@field:SerializedName("current_page")
	val currentPage: Int? = null
)
