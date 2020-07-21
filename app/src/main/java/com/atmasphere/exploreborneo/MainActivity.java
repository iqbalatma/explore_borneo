package com.atmasphere.exploreborneo;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.atmasphere.exploreborneo.Model.GetWisata;
import com.atmasphere.exploreborneo.Model.Wisata;
import com.atmasphere.exploreborneo.Utils.ApiClient;
import com.atmasphere.exploreborneo.Utils.ApiInterface;


import android.util.Log;
import android.widget.Button;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    /*
   NIM         : 10117124
   Nama        : Iqbal Atma Muliawan
   Kelas       : IF4
   Matakuliah  : Aplikasi Komputasi Bergerak

   16 Juli 2020    : Membuat main activity untuk menampilkan data yang diambil dari api
   */
    Button btIns;
    ApiInterface mApiInterface;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public static MainActivity ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        btIns = (Button) findViewById(R.id.btIns);
//        btIns.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, InsertActivity.class));
//            }
//        });
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        ma=this;
        refresh();
    }

    public void refresh() {
        Call<GetWisata> wisataCall = mApiInterface.getWisata();
        wisataCall.enqueue(new Callback<GetWisata>() {
            @Override
            public void onResponse(Call<GetWisata> call, Response<GetWisata>
                    response) {
                List<Wisata> WisataList = response.body().getListDataWisata();
                Log.d("Retrofit Get", "Jumlah data Kontak: " +
                        String.valueOf(WisataList.size()));
                mAdapter = new AdapterWisata(WisataList);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<GetWisata> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }
}
