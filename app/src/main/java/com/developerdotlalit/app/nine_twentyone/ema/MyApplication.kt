package com.developerdotlalit.app.nine_twentyone.ema

import android.app.Application
import com.developerdotlalit.app.nine_twentyone.ema.core.utils.CustomLogger

internal class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CustomLogger.e("Application Has Started to work")
    }
}