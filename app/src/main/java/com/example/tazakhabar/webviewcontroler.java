package com.example.tazakhabar;


import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webviewcontroler extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
