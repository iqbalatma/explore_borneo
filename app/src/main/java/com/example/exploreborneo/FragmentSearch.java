package com.example.exploreborneo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exploreborneo.entity.LocalImages;

import java.util.ArrayList;

public class FragmentSearch extends Fragment {
    /*
        NIM         : 10117124
        Nama        : Iqbal Atma Muliawan
        Kelas       : IF4
        Matakuliah  : Aplikasi Komputasi Bergerak

        2 Juli 2020    : Membuat fragment search
     */

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        setupRecyclerView(view);
        return view;
    }

    private void setupRecyclerView(View view) {
        ArrayList<LocalImages> data = new ArrayList<>();

        data.add(new LocalImages(R.drawable.jawabanfour));
        data.add(new LocalImages(R.drawable.jawabanone));
        data.add(new LocalImages(R.drawable.jawabanthree));
        data.add(new LocalImages(R.drawable.jawabantwo));

        RecyclerView rvFavorite = view.findViewById(R.id.rv_favorite);
        LocalImageAdapter adapter = new LocalImageAdapter(data, getContext());
        rvFavorite.setHasFixedSize(true);
        rvFavorite.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        rvFavorite.setLayoutManager(new GridLayoutManager(getContext(), 2));
    }
}



