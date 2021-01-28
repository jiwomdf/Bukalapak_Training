package com.katilijiwo.latihan2.data.remote.exception

import java.io.IOException

const val USER_FORBIDDEN = "User Forbidden"
class ForbiddenException : IOException() {
    override val message: String
        get() = USER_FORBIDDEN
}
