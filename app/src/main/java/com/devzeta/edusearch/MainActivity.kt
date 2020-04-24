package com.devzeta.edusearch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val overlay: View = findViewById(R.id.splash)

        overlay.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    or View.SYSTEM_UI_FLAG_FULLSCREEN
        )

        object: CountDownTimer(1000, 7000){
            override fun onFinish() {
                val i = Intent(applicationContext, searchactivity::class.java)
                startActivity(i)
            }

            override fun onTick(millisUntilFinished: Long) {
            }

        }.start()
    }
}
