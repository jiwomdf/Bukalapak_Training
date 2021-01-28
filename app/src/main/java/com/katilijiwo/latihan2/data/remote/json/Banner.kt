package com.katilijiwo.latihan2.data.remote.json


import com.google.gson.annotations.SerializedName

data class Banner(
    @SerializedName("description")
    val description: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("info")
    val info: Info,
    @SerializedName("open_new_window")
    val openNewWindow: Boolean,
    @SerializedName("order")
    val order: Int
)