package com.gajraj.android.sharedprefssample.model

data class LoginResponseVO(
        var refreshToken: String? = null,
        var userId: Int? = null,
        var tokenExpiry: Int? = null,
        var username: String? = null,
        var token: String? = null
)
