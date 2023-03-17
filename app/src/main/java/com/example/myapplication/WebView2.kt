package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebView2 : AppCompatActivity() {
    val webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view2)

        title = "This is a webview"

        val  webview = findViewById<WebView>(R.id.webv)

        webview.webViewClient = WebViewClient()

        webview.loadUrl("https://google.com")
        val webSettings = webview.settings
        webSettings.javaScriptEnabled = true



    }

    override fun onBackPressed() {
        if(webView?.canGoBack() == true) {
            webView?.goBack()
        }
        super.onBackPressed()
    }

}