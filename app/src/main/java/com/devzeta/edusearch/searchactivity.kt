package com.devzeta.edusearch

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_searchactivity.*


class searchactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchactivity)
        val overlay: View = findViewById(R.id.searchactivity)

        overlay.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    or View.SYSTEM_UI_FLAG_FULLSCREEN
        )

        searchbutton.setOnClickListener {
            movetoresults()
        }

    }

    private fun movetoresults(){
        val searchk = findViewById<EditText>(R.id.maintext)
        val searchtext = searchk.text.toString()

        if (searchtext.isEmpty()){
            Toast.makeText(applicationContext, "Please Enter A Keyword.", Toast.LENGTH_LONG).show()
        }
        else{
            val i = Intent(applicationContext, resultsactivity::class.java)
            i.putExtra("keyword", searchtext)
        startActivity(i)
        }
    }

    override fun onBackPressed() {
        val a = Intent(Intent.ACTION_MAIN)
        a.addCategory(Intent.CATEGORY_HOME)
        a.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(a)
    }
}
