package com.katilijiwo.latihan2.base

import androidx.lifecycle.ViewModel
import com.katilijiwo.latihan2.data.remote.json.banner.Banner

abstract class BaseViewModel: ViewModel() {
    sealed class Event<out T> {
        class Success<out T>(val data: List<T>): Event<T>()
        class Error(val msg: String): Event<Nothing>()
        object Loading: Event<Nothing>()
    }
}