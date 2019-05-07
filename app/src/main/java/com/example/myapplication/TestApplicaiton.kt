package com.example.myapplication

import android.app.Application
import dev.DevUtils
import dev.utils.app.logger.DevLogger
import dev.utils.app.logger.LogConfig
import dev.utils.app.logger.LogLevel

class TestApplicaiton:Application(){
    // 日志 TAG
    private val LOG_TAG = TestApplicaiton::class.java!!.simpleName
    override fun onCreate() {
        super.onCreate()
        DevUtils.init(applicationContext)
        val logConfig=LogConfig()
        logConfig.logLevel=LogLevel.DEBUG
        logConfig.tag=LOG_TAG
        logConfig.sortLog=true
        DevLogger.init(logConfig)
        DevUtils.openDebug()
        DevUtils.openLog()

    }
}