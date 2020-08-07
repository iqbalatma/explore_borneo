package com.atmasphere.exploreborneo.Utils;


import com.atmasphere.exploreborneo.Model.GetWisata;
import com.atmasphere.exploreborneo.Model.PostPutDelWisata;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {

     /*
   NIM         : 10117124
   Nama        : Iqbal Atma Muliawan
   Kelas       : IF4
   Matakuliah  : Aplikasi Komputasi Bergerak
A
   16 Juli 2020    : Membuat apiinterface untuk mengambil bagian api yang dibutuhkan
   */

    @GET("api")
    Call<GetWisata> getWisata();
    @FormUrlEncoded
    @POST("kontak")
    Call<PostPutDelWisata> postKontak(@Field("nama") String nama,
                                      @Field("nomor") String nomor);
    @FormUrlEncoded
    @PUT("kontak")
    Call<PostPutDelWisata> putKontak(@Field("id") String id,
                                     @Field("nama") String nama,
                                     @Field("nomor") String nomor);
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "kontak", hasBody = true)
    Call<PostPutDelWisata> deleteKontak(@Field("id") String id);
}