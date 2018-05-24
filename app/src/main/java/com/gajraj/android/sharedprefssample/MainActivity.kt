package com.gajraj.android.sharedprefssample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.gajraj.android.sharedprefssample.prefs.PreferencesHelperImpl
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var preferencesHelperImpl: PreferencesHelperImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inject()
        prefsTest()
    }

    private fun prefsTest() {
        preferencesHelperImpl.setUserDetails("1001", "gajraj")
        val userId: String? = preferencesHelperImpl.getUserId()
        Log.i("SampleApp", "userId:" + userId)
    }

    fun inject() {
        MyApplication.getComponent().inject(this)
    }
}
