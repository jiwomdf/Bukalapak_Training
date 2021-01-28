package com.katilijiwo.latihan2.data.remote.exception

const val SOME_UNKNOWN_ERROR_OCCURRED = "Some unknown error occurred"
class UnKnownException: Exception() {
    override val message: String
        get() = SOME_UNKNOWN_ERROR_OCCURRED
}
