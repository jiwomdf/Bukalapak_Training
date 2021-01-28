package com.katilijiwo.latihan2.data.remote.json.categories


import com.google.gson.annotations.SerializedName

data class CategoriesResponse(
    @SerializedName("categories")
    val categories: List<Category>,
    @SerializedName("message")
    val message: Any,
    @SerializedName("status")
    val status: String
)