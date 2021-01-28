package com.katilijiwo.latihan2.data

import com.katilijiwo.latihan2.data.remote.json.banner.FlashBannersResponse
import com.katilijiwo.latihan2.data.remote.json.categories.CategoriesResponse

interface Repository {
    suspend fun fetchFlashBanners(): FlashBannersResponse
    suspend fun fetchCategories(): CategoriesResponse
}