package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.chuckerteam.chucker.api.ChuckerInterceptor
import dev.kiki.core.UpdateManagerFactory

class MainActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ChuckerInterceptor.Builder(this).build()
        val updateManager = UpdateManagerFactory.create(this)
        findViewById<Button>(R.id.button).setOnClickListener {
            Toast.makeText(this,"Heelo",Toast.LENGTH_LONG).show()
            updateManager.startUpdateFlow(this)
        }

    }
}