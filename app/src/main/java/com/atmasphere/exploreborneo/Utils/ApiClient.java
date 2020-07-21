package com.atmasphere.exploreborneo.Utils;



import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    /*
  NIM         : 10117124
  Nama        : Iqbal Atma Muliawan
  Kelas       : IF4
  Matakuliah  : Aplikasi Komputasi Bergerak

  16 Juli 2020    : Membuat ApiClient untuk menyimpan link utama dari api
  */
    public static final String BASE_URL = "https://exploreborneo.xyz/";
    private static Retrofit retrofit = null;
    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}