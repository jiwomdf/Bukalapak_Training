package com.katilijiwo.latihan2.util

sealed class Resource<out T: Any> {
    data class Success<out T: Any>(val data: T): Resource<T>()
    data class Error(val exception: Exception): Resource<Nothing>()
}
