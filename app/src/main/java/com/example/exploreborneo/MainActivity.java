package com.example.exploreborneo;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    /*
    NIM         : 10117124
    Nama        : Iqbal Atma Muliawan
    Kelas       : IF4
    Matakuliah  : Aplikasi Komputasi Bergerak

    24 Juni 2020    : Membuat main activity yang akan dijalankan ketika slider selesai
    2 Juli 2020     : Membuat buttom navigation
 */

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // kita set default nya Home Fragment
        loadFragment(new FragmentHome());
        // inisialisasi BottomNavigaionView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);









    }


    // method untuk load fragment yang sesuai
    private boolean loadFragment (Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }



    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.home_menu:
                fragment = new FragmentHome();
                break;
            case R.id.search_menu:
                fragment = new FragmentSearch();
                break;
        }
        return loadFragment(fragment);
    }
}