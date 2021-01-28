package com.katilijiwo.latihan2.data.remote.exception

import java.io.IOException

const val USER_AUTHORIZED = "User Unauthorized"
class UnAuthorizedException: IOException() {
    override val message: String
        get() = USER_AUTHORIZED
}
