package com.example.uts_2022131030

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var scrollView:Button
    private lateinit var web:Button
    private lateinit var gaji:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scrollView = findViewById(R.id.scrollView)
        web = findViewById(R.id.webViews)
        gaji = findViewById(R.id.editText)

        scrollView.setOnClickListener {
            startActivity(Intent(this, Scrollview::class.java ))
        }
        web.setOnClickListener {
            startActivity(Intent(this, webview::class.java))
        }
        gaji.setOnClickListener {
            startActivity(Intent(this, Edittext::class.java))
        }


    }
}