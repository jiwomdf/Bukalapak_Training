package com.katilijiwo.latihan2.data.remote.json.categories


import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("children")
    val children: List<Children>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("revamped")
    val revamped: Boolean,
    @SerializedName("url")
    val url: String
)