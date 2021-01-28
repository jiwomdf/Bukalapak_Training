package com.katilijiwo.latihan2.data

import com.katilijiwo.latihan2.data.remote.json.FlashBannersResponse

interface Repository {
    suspend fun fetchFlashBanners(): FlashBannersResponse
}