package com.gajraj.android.sharedprefssample

import android.app.Application
import com.smit.android.realestate.di.component.ApplicationComponent
import com.smit.android.realestate.di.component.DaggerApplicationComponent
import com.smit.android.realestate.di.module.ApplicationModule

/**
 * Created by Gajraj on 5/24/2018.
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        component = buildComponent()
    }


    protected fun buildComponent(): ApplicationComponent {
        return DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    companion object {
        private lateinit var component: ApplicationComponent
        fun getComponent(): ApplicationComponent {
            return component
        }
    }
}