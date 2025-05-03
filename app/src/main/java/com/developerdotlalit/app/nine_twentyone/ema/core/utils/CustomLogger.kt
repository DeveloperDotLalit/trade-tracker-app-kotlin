package com.developerdotlalit.app.nine_twentyone.ema.core.utils

import android.util.Log

internal object CustomLogger {
    private val LogTag = "<<<9-21 app>>>"
    private var isDebugBuild: Boolean = false

    init {
        isDebugBuild = true /* TODO: write buildconfig logic BuildConfig.DEBUG*/
    }

    internal fun e(msg: String, throwable: Throwable? = null) {
        if (isDebugBuild) {
            Log.e(LogTag, msg, throwable)
        }
    }

    internal fun d(msg: String) {
        if (isDebugBuild) {
            Log.d(LogTag, msg)
        }
    }

    internal fun i(msg: String) {
        if (isDebugBuild) {
            Log.i(LogTag, msg)
        }
    }

    internal fun v(msg: String) {
        if (isDebugBuild) {
            Log.v(LogTag, msg)
        }
    }
}