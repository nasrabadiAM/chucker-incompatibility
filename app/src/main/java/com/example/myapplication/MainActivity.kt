package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chuckerteam.chucker.api.ChuckerInterceptor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val chucker = ChuckerInterceptor.Builder(this).build()
        chucker.redactHeader("name")
    }
}