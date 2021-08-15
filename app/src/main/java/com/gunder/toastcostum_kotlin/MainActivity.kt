package com.gunder.toastcostum_kotlin

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.res.ResourcesCompat
import www.sanju.motiontoast.MotionToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnInfo: Button = findViewById(R.id.btniinfo)
        var btnWarning: Button = findViewById(R.id.btnwarning)
        var btnError: Button = findViewById(R.id.btnerror)
        var btnSuccess: Button = findViewById(R.id.btnsuccess)

//        set on click
        btnInfo.setOnClickListener {
            MotionToast.Companion.darkToast(this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToast.TOAST_INFO,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.SHORT_DURATION,
                ResourcesCompat.getFont(this,R.font.helvetica_regular))
        }

        btnWarning.setOnClickListener {
            MotionToast.Companion.darkToast(this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToast.TOAST_WARNING,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.SHORT_DURATION,
                ResourcesCompat.getFont(this,R.font.helvetica_regular))
        }

        btnError.setOnClickListener {
            MotionToast.Companion.darkToast(this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToast.TOAST_ERROR,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.SHORT_DURATION,
                ResourcesCompat.getFont(this,R.font.helvetica_regular))
        }

        btnSuccess.setOnClickListener {
            MotionToast.Companion.darkToast(this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToast.TOAST_SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.SHORT_DURATION,
                ResourcesCompat.getFont(this,R.font.helvetica_regular))
        }

    }
}