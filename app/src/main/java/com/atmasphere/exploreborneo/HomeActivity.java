package com.atmasphere.exploreborneo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    /*
    NIM         : 10117124
    Nama        : Iqbal Atma Muliawan
    Kelas       : IF4
    Matakuliah  : Aplikasi Komputasi Bergerak

    20 Juli 2020 : Membuat Home Activity sebagai landing page yang menyediakan 2 menu
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }



    public void pindahMain(View view) {
        startActivity(new Intent(HomeActivity.this, MainActivity.class));
    }

    public void pindahAbout(View view) {
        startActivity(new Intent(HomeActivity.this, AboutActivity.class));
    }
}