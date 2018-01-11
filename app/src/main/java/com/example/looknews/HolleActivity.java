package com.example.looknews;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HolleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holle);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(HolleActivity.this,MainActivity.class);
                startActivity(intent);  //开始跳转
                finish();
            }
        };
        Handler handler = new Handler();
        handler.postDelayed(runnable,1500);//等待2秒后跳转到微信主页
    }
}
