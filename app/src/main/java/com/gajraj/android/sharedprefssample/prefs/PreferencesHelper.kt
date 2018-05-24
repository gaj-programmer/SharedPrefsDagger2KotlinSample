package com.gajraj.android.sharedprefssample.prefs

import com.gajraj.android.sharedprefssample.model.AccessToken
import com.gajraj.android.sharedprefssample.model.LoginResponseVO

/**
 * Created by Gajraj
 */
interface PreferencesHelper {
    fun setAccessToken(accessToken: AccessToken)
    fun setUserDetails(userId: String?, userName: String?)
    fun getAccessToken(): AccessToken
    fun saveUserDetails(response: LoginResponseVO)
    fun setRefreshToken(refreshToken: String?)
}
