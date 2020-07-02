package com.example.exploreborneo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentHome extends Fragment {
    /*
        NIM         : 10117124
        Nama        : Iqbal Atma Muliawan
        Kelas       : IF4
        Matakuliah  : Aplikasi Komputasi Bergerak

        2 Juli 2020    : Membuat fragment home
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }
}