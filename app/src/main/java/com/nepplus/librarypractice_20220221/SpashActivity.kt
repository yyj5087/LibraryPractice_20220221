package com.nepplus.librarypractice_20220221

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SpashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spash)

        val myHandler = Handler(Looper.getMainLooper())
        myHandler.postDelayed({

//      shift + tab => 들여쓰기를 바깥으로
                              val myIntent = Intent(this,MainActivity::class.java)
            startActivity(myIntent)

            finish()

        },2500)

    }
}