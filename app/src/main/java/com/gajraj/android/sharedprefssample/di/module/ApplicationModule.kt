package com.smit.android.realestate.di.module

import android.content.Context
import com.gajraj.android.sharedprefssample.MyApplication
import com.gajraj.android.sharedprefssample.prefs.PreferencesHelperImpl

import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/**
 * Created by Gajraj on 4/25/2018.
 */

@Module
class ApplicationModule(private val application: MyApplication) {

    @Provides
    @Singleton
    fun application(): MyApplication {
        return application
    }

    @Provides
    @Singleton
    fun provideApplicationContext(): Context {
        return application
    }

    @Provides
    @Singleton
    fun providePreferencesHelper(context: Context): PreferencesHelperImpl {
        return PreferencesHelperImpl(context)
    }
}