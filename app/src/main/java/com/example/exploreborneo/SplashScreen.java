package com.example.exploreborneo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    /*
       NIM             : 10117124
       Nama            : Iqbal Atma Muliawan
       Kelas           : IF4
       Matakuliah      : Aplikasi Komputasi Bergerak


        */
    private int waktu_loading=2500;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent welcome=new Intent(SplashScreen.this, SliderActivity.class);
                startActivity(welcome);
                finish();

            }
        },waktu_loading);
    }
}