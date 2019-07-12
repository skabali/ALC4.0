package com.ufind.shafique.alc40;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class About_Activity extends AppCompatActivity {
    WebView webview;

    private class MyWebViewClient extends WebViewClient {
        private MyWebViewClient() {
        }

        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (Uri.parse(url).getHost().equals("https://andela.com/alc/")) {
                return false;
            }
            About_Activity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
            return true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.webview = (WebView) findViewById(R.id.webview);
        webView();
    }

    private void webView() {
        this.webview.getSettings().setJavaScriptEnabled(true);
        this.webview.setWebViewClient(new MyWebViewClient());
        this.webview.setWebViewClient(new WebViewClient());
        this.webview.loadUrl("https://andela.com/alc/");
    }

    public void onBackPressed() {
        if (this.webview.canGoBack()) {
            this.webview.goBack();
        } else {
            super.onBackPressed();
        }
    }
}