package com.sachin.mynotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class PrivacyPolicyActivity extends AppCompatActivity {

    WebView webView;
    ImageView backToActivity;
    TextView activity_name1;
    public  String fileName="privacy.html";
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        webView=findViewById(R.id.privacypolicy);
        backToActivity = (ImageView) findViewById(R.id.finish_activity);
        activity_name1=findViewById(R.id.activity_name);

        activity_name1.setText("Privacy Policy");
        backToActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/" + fileName);
    }
}