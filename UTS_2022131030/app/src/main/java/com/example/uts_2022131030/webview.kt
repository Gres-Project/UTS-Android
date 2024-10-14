package com.example.uts_2022131030

import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class webview : AppCompatActivity() {

    private lateinit var webuvers: WebView

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        webuvers = findViewById(R.id.webViews)
        webViewsetup()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewsetup(){
        webuvers.webViewClient = WebViewClient()
        webuvers.apply {
            loadUrl("https://uvers.ac.id")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }

    }

}