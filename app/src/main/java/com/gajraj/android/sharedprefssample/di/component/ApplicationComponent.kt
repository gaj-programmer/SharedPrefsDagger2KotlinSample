package com.smit.android.realestate.di.component

import android.content.Context
import com.gajraj.android.sharedprefssample.MainActivity
import com.smit.android.realestate.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Gajraj on 4/25/2018.
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
    fun context(): Context
}