package com.yunuseker.qrcodeexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.zxing.integration.android.IntentIntegrator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.scan).setOnClickListener {
            startActivity(Intent(this,ScanQrAct::class.java))
        }
        findViewById<Button>(R.id.generate).setOnClickListener {
            startActivity(Intent(this,GenerateQrAct::class.java))
        }

    }

}
