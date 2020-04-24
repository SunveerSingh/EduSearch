package com.devzeta.edusearch

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_resultsactivity.*


class resultsactivity : AppCompatActivity() {

    private lateinit var mPagerViewAdapter: PagerViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultsactivity)
        getMyData()



        val overlay: View = findViewById(R.id.resultactivity)



        overlay.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    or View.SYSTEM_UI_FLAG_FULLSCREEN
        )


        mPagerViewAdapter = PagerViewAdapter(supportFragmentManager)
        viewpager.adapter = mPagerViewAdapter
        tablayout.setupWithViewPager(viewpager)


    }
    fun getMyData(): String? {
        val searchtxt = intent.getStringExtra("keyword")
        //println(searchtxt)
        return searchtxt
    }
}
