package com.example.myapplication

import android.annotation.TargetApi
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dev.utils.app.ADBUtils
import dev.utils.app.AccessibilityUtils
import dev.utils.app.camera1.CameraAssist
import dev.utils.app.logger.DevLogger
import dev.utils.app.logger.DevLoggerUtils
import dev.utils.app.toast.ToastTintUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initEvent()
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    fun initEvent() {
        DevLoggerUtils.init(this)
        btn_one.setOnClickListener {
            DevLogger.e("222", "22222")
            ToastTintUtils.custom(this@MainActivity,ToastTintUtils.getWarningStyle(), "2222",R.mipmap.ic_launcher)
        }
        btn_two.setOnClickListener {
          val set=CameraAssist()
            set.startPreview()
        }
        btn_three.setOnClickListener {
        }
        btn_four.setOnClickListener {

        }
        btn_five.setOnClickListener {

        }
        btn_six.setOnClickListener {

        }

    }
}
