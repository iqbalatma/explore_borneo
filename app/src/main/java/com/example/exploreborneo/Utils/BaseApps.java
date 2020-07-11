package com.example.exploreborneo.Utils;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class BaseApps extends Application {

    public static ApiService service;

    @Override
    public void onCreate() {
        super.onCreate();
        service = getRetrofit().create(ApiService.class);
    }

    private Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://exploreborneo.xyz/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
