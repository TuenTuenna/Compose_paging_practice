package com.example.randomuserlist

import android.app.Application
import com.example.randomuserlist.di.networkModule
import com.example.randomuserlist.di.repositoryModule
import com.example.randomuserlist.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application(){
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(listOf(networkModule, repositoryModule, viewModelModule))
        }
    }
}
