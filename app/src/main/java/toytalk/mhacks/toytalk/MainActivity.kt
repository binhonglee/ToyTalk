package toytalk.mhacks.toytalk

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.widget.Switch

class MainActivity : AppCompatActivity() {

    var lightOne : Switch? = null

    @RequiresApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lightOne = findViewById(R.id.LightOneBtn) as Switch
        lightOne!!.setOnClickListener {

        }
    }
}
