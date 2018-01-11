package com.example.looknews;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.example.looknews.ui.news.fragment.NewsFragment;
import com.example.looknews.ui.base.TabPagerAdapter;
import com.example.looknews.widget.NoScrollViewPage;
import static com.example.looknews.R.id.viewPager;

public class MainActivity extends AppCompatActivity{
    private NoScrollViewPage mViewPager;
    private String[] mTitles;
    private Fragment[] fragments;
    private TabPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置选项栏的标题
        mTitles = getResources().getStringArray(R.array.main_titles);
        //禁止Viewpager左右滑动功能
        mViewPager = (NoScrollViewPage) findViewById(viewPager);
        fragments = new Fragment[1];
        fragments[0] =  NewsFragment.newInstance();
        mAdapter = new TabPagerAdapter(getSupportFragmentManager(), fragments);
        mAdapter.setTabTitles(mTitles);
        mViewPager.setAdapter(mAdapter);
        //动态加载片段
        mViewPager.setCurrentItem(0);
    }

}
