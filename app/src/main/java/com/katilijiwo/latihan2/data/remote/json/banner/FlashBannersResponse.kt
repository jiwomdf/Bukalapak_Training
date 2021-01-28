package com.katilijiwo.latihan2.data.remote.json.banner


import com.google.gson.annotations.SerializedName
import com.katilijiwo.latihan2.data.remote.json.banner.Banner

data class FlashBannersResponse(
    @SerializedName("banners")
    val banners: List<Banner>,
    @SerializedName("message")
    val message: Any,
    @SerializedName("status")
    val status: String
)