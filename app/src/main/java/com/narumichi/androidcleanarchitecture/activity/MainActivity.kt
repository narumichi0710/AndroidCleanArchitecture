package com.narumichi.androidcleanarchitecture.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.narumichi.androidcleanarchitecture.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}