package com.example.exploreborneo.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by user on 5/7/18.
 */
//
public class Images {


    @SerializedName("message")
    @Expose
    private List<String> image;


    public List<String> getMessage(){
        return image;
    }


}

//public class Images {
//
//
//    @SerializedName("nama_tempat")
//    @Expose
//    private String nama_tempat;
//    @SerializedName("image")
//    @Expose
//    private String image = null;
//
//
//    public Images (String nama_tempat, String image){
//        this.image = image;
//        this.nama_tempat = nama_tempat;
//    }
//
//    public String getNama_tempat() {
//        return nama_tempat;
//    }
//
//
//    public String getImage() {
//        return image;
//    }
//
//}
