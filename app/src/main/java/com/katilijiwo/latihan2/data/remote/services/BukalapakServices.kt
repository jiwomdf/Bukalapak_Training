package com.katilijiwo.latihan2.data.remote.services

import com.katilijiwo.latihan2.data.remote.json.FlashBannersResponse
import retrofit2.Response
import retrofit2.http.GET

interface BukalapakServices {

    @GET("flash_banners.json")
    suspend fun fetchFlashBanners(): Response<FlashBannersResponse>
}