package com.example.looknews;


import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.looknews.ui.base.BaseActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class NewsDetailsActivity extends BaseActivity {
    @BindView(R.id.progressbar)
    ProgressBar progressbar;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbar;
    @BindView(R.id.web_text)
    WebView webText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
        ButterKnife.bind(this);
        //设置标题
        toolbar.setTitle("新闻详情");
        setSupportActionBar(toolbar);
//        设置返回箭头
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        //新页面接收数据
        Bundle bundle = this.getIntent().getExtras();
        //接收name值
        final ArrayList<String> data = bundle.getStringArrayList("data");
        Log.e("url", data.get(1));
        //webView配置
        WebSettings webSettings = webText.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        //webText容器加载页面内容
        webText.loadUrl(data.get(1));
        webText.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (newProgress >=85) {
                    progressbar.setVisibility(GONE);
                } else {
                    if (progressbar.getVisibility() == GONE)
                        progressbar.setVisibility(VISIBLE);
                    progressbar.setProgress(newProgress);
                }
                super.onProgressChanged(webText, newProgress);
            }
        });

        webText.setWebViewClient(new WebViewClient() {
            //加载网页新闻
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }
        });
    }
}
