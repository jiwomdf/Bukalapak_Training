package com.katilijiwo.latihan2.base

import androidx.lifecycle.ViewModel
import com.katilijiwo.latihan2.data.remote.json.Banner

abstract class BaseViewModel: ViewModel() {
    sealed class Event(){
        class Success(val data: List<Banner>): Event()
        class Error(val msg: String): Event()
        object Loading: Event()
    }
}