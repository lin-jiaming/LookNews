package com.example.looknews.retrofit;

import android.database.Observable;

import com.example.looknews.bean.NewsGson;
import com.example.looknews.entity.News;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by linjiaming on 2018/1/9.
 */

public interface ApiService {
    @GET("{type}/")
    rx.Observable<NewsGson> getNewsData(@Path("type") String type, @Query("key") String key, @Query("num") String num, @Query("page") int page);

}