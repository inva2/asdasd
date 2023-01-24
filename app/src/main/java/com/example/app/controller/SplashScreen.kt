package com.example.app.controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app.R
import kotlinx.android.synthetic.main.activity_main.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dd = getSharedPreferences("data_base",0)
        if (dd.getString("firstTime","Error")!=="Error"){
            startActivity(Intent(this@SplashScreen,Auth_Activity::class.java))
        }
        val editor = dd.edit()
        button.setOnClickListener {
            editor.putString("firstTime","True")
            editor.apply()
            startActivity(Intent(this@SplashScreen,Auth_Activity::class.java))
        }
    }
    override fun on
}
