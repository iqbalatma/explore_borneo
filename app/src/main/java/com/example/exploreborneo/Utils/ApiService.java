package com.example.exploreborneo.Utils;


import com.example.exploreborneo.entity.Images;

import retrofit2.Call;
import retrofit2.http.GET;



public interface ApiService {
    @GET("api/breed/boxer/images")
    Call<Images> getImages();

    
}
