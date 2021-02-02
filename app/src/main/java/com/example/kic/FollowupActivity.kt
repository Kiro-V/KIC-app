package com.example.kic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FollowupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.followup)

        findViewById<ImageView>(R.id.btnback).setOnClickListener{ view->
            onBackPressed()
        }
    }
}