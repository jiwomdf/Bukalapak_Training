package com.katilijiwo.latihan2.data.remote.json


import com.google.gson.annotations.SerializedName

data class FlashBannersResponse(
    @SerializedName("banners")
    val banners: List<Banner>,
    @SerializedName("message")
    val message: Any,
    @SerializedName("status")
    val status: String
)