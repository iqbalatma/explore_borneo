package com.atmasphere.exploreborneo.Model;



import com.google.gson.annotations.SerializedName;

import java.util.List;



public class GetWisata {

    /*
  NIM         : 10117124
  Nama        : Iqbal Atma Muliawan
  Kelas       : IF4
  Matakuliah  : Aplikasi Komputasi Bergerak

  16 Juli 2020    : Membuat kelas untuk mengambil data pada api
  */
    @SerializedName("status")
    String status;
    @SerializedName("data")
    List<Wisata> listDataWisata;
    @SerializedName("message")
    String message;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public List<Wisata> getListDataWisata() {
        return listDataWisata;
    }
    public void setListDataWisata(List<Wisata> listDataWisata) {
        this.listDataWisata = listDataWisata;
    }
}