package toytalk.mhacks.toytalk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

class MainActivity : AppCompatActivity() {

    var lightOne : Switch? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lightOne = findViewById(R.id.LightOneBtn) as Switch
        lightOne!!.setOnClickListener {

        }
    }
}
