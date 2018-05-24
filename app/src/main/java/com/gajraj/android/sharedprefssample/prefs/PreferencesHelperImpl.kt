package com.gajraj.android.sharedprefssample.prefs

import android.content.Context
import com.gajraj.android.sharedprefssample.model.AccessToken
import com.gajraj.android.sharedprefssample.model.LoginResponseVO

import javax.inject.Inject

/**
 * Created by Gajraj
 */
class PreferencesHelperImpl @Inject constructor(private val context: Context) : PreferencesHelper {

    private val PREFS_FILENAME: String? = "com.gajraj.android.sharedprefssample"

    override fun saveUserDetails(response: LoginResponseVO) {
        val sharedPref = context.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)
        with(sharedPref.edit()) {
            putString("accessToken", response.token)
            putString("tokenExpiry", response.tokenExpiry.toString())
            putString("refreshToken", response.refreshToken)
            putString("userName", response.username)
            putString("userId", response.userId.toString())
            commit()
        }
    }


    override fun setAccessToken(accessToken: AccessToken) {
        val sharedPref = context.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)
        with(sharedPref.edit()) {
            putString("token", accessToken.token)
            putString("tokenExpiry", accessToken.tokenExpiry)
            putString("refreshToken", accessToken.refreshToken)
            commit()
        }
    }

    override fun setRefreshToken(refreshToken: String?) {
        val sharedPref = context.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)
        with(sharedPref.edit()) {
            putString("refreshToken", refreshToken)
            commit()
        }
    }

    override fun setUserDetails(userId: String?, userName: String?) {
        val sharedPref = context.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)
        with(sharedPref.edit()) {
            putString("userName", userName)
            putString("userId", userId)
            commit()
        }
    }

    fun getUserId(): String? {
        val sharedPref = context.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)
        return sharedPref.getString("userId", null)
    }

    override fun getAccessToken(): AccessToken {
        val sharedPref = context.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)
        val accessToken: AccessToken = AccessToken(
                sharedPref.getString("token", null),
                sharedPref.getString("tokenExpiry", null),
                sharedPref.getString("refreshToken", null))
        return accessToken
    }
}