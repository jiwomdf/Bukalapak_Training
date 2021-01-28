package com.katilijiwo.latihan2.data

import com.katilijiwo.latihan2.base.BaseRepository
import com.katilijiwo.latihan2.data.remote.json.FlashBannersResponse
import com.katilijiwo.latihan2.data.remote.services.BukalapakServices
import com.katilijiwo.latihan2.util.Resource
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val bukalapakServices: BukalapakServices
): BaseRepository(), Repository {

    override suspend fun fetchFlashBanners(): FlashBannersResponse {
        return when(val response = createCall { bukalapakServices.fetchFlashBanners() }){
            is Resource.Success -> response.data
            is Resource.Error -> throw response.exception
        }
    }
}