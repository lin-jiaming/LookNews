package com.example.looknews.ui.news.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.example.looknews.bean.NewsGson;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import java.util.List;

public class NewsAdapter extends RecyclerArrayAdapter<NewsGson.NewslistBean> {
    public NewsAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {

        return new NewsViewHolder(parent);
    }
}
