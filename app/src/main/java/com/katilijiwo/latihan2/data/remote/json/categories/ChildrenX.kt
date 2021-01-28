package com.katilijiwo.latihan2.data.remote.json.categories


import com.google.gson.annotations.SerializedName

data class ChildrenX(
    @SerializedName("children")
    val children: Any,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("revamped")
    val revamped: Boolean,
    @SerializedName("url")
    val url: String
)