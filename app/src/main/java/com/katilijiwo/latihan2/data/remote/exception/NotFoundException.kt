package com.katilijiwo.latihan2.data.remote.exception

import java.io.IOException

const val NOT_FOUND = "Not Found"
class NotFoundException: IOException() {
    override val message: String
        get() = NOT_FOUND
}
