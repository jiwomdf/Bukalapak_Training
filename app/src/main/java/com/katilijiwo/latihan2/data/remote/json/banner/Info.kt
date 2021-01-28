package com.katilijiwo.latihan2.data.remote.json.banner


import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName("id")
    val id: Int,
    @SerializedName("promo_due")
    val promoDue: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)