package com.example.kic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MedconActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.medcon)
        findViewById<Button>(R.id.btn_update).setOnClickListener{ view->
            Toast.makeText(this,"Updated!", Toast.LENGTH_LONG).show()
        }
        findViewById<ImageView>(R.id.btnback).setOnClickListener{view->
            onBackPressed()
        }

    }
}