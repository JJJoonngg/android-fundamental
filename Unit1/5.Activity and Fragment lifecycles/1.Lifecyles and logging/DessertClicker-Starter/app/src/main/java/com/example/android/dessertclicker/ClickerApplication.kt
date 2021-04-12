package com.example.android.dessertclicker

import android.app.Application
import timber.log.Timber

/*
* Created by JJJoonngg
*/

class ClickerApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }

}