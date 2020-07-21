package com.atmasphere.exploreborneo.Model;
import com.google.gson.annotations.SerializedName;
public class PostPutDelWisata {



 /*
   NIM         : 10117124
   Nama        : Iqbal Atma Muliawan
   Kelas       : IF4
   Matakuliah  : Aplikasi Komputasi Bergerak

   16 Juli 2020    : Membuat PostPutDelWisata untuk dapat melakukan insert maupun delete
   */

        @SerializedName("status")
        String status;
        @SerializedName("data")
        Wisata mWisata;
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
        public Wisata getWisata() {
            return mWisata;
        }
        public void setKontak(Wisata Wisata) {
            mWisata = Wisata;
        }

    }
