package com.example.looknews.ui.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/10/24.
 */

public  class BaseFragent extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("LookNews","ArrayListFragment onCreate...");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("LookNews","ArrayListFragment onDestroy...");
    }
}
