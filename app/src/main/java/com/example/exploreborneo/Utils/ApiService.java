package com.example.exploreborneo.Utils;


import com.example.exploreborneo.entity.Images;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;



public interface ApiService {
    @GET("api/getImage")
    Call<Images> getImages();


}
