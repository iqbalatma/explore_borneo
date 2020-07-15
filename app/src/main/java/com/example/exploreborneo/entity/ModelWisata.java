package com.example.exploreborneo.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelWisata {


    @SerializedName("nama_tempat")
    @Expose
    private List<String> nama_tempat;
    public List<String> getNama_tempat(){
        return nama_tempat;
    }

    @SerializedName("image")
    @Expose
    private String image;
    public String getImage(){
        return image;
    }

}
