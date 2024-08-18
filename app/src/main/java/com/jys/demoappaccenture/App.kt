package com.jys.demoappaccenture

import android.app.Application
import com.jys.paging3.di.pagingModule
import org.koin.core.context.startKoin

class App :Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(pagingModule)
        }
    }
}