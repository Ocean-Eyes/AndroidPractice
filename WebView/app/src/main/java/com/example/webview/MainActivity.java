package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView wv_naver;
    private String url = "https://www.naver.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv_naver = (WebView)findViewById(R.id.wv_naver);
        wv_naver.getSettings().setJavaScriptEnabled(true);
        wv_naver.loadUrl(url);
        wv_naver.setWebChromeClient(new WebChromeClient());
        wv_naver.setWebViewClient(new WebViewClientClass());

    }

    // If 'back' button will be pushed, then, go back.
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && wv_naver.canGoBack()) {
            wv_naver.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    // Load a new page
    private class WebViewClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}