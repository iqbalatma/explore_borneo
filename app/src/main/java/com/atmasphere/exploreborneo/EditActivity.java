package com.atmasphere.exploreborneo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.content.Intent;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.atmasphere.exploreborneo.Utils.ApiClient;
import com.atmasphere.exploreborneo.Utils.ApiInterface;

public class EditActivity extends AppCompatActivity {

    /*
    NIM         : 10117124
    Nama        : Iqbal Atma Muliawan
    Kelas       : IF4
    Matakuliah  : Aplikasi Komputasi Bergerak

    16 Juli 2020 : Membuat edit acitivy untuk menampilkan detail dari aplikasi yang dibuat
 */
//    EditText edtId, edtNama, edtNomor;
    TextView namaTempat, namaProvinsi, namaKabupaten, namaJenis, htm, konten;
    Button btUpdate, btDelete, btBack;
    ApiInterface mApiInterface;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        img = findViewById(R.id.imageView);

        namaTempat = findViewById(R.id.nama_tempat);
        namaProvinsi = findViewById(R.id.provinsi);
        namaKabupaten = findViewById(R.id.kabupaten);
        htm = findViewById(R.id.htm);
        konten = findViewById(R.id.konten);
        namaJenis = findViewById(R.id.jenis);


        Intent mIntent = getIntent();

        Glide.with(EditActivity.this)
                // LOAD URL DARI INTERNET
                .load(mIntent.getStringExtra("image"))
                // LOAD GAMBAR AWAL SEBELUM GAMBAR UTAMA MUNCUL, BISA DARI LOKAL DAN INTERNET
                .placeholder(R.drawable.base_icon)
                //. LOAD GAMBAR SAAT TERJADI KESALAHAN MEMUAT GMBR UTAMA
                .error(R.drawable.animal)
                .into(img);


        namaTempat.setText(mIntent.getStringExtra("nama_tempat"));
        namaProvinsi.setText(mIntent.getStringExtra("provinsi"));
        namaKabupaten.setText(mIntent.getStringExtra("kabupaten"));
        namaJenis.setText(mIntent.getStringExtra("jenis"));
        konten.setText(mIntent.getStringExtra("konten"));
        htm.setText(mIntent.getStringExtra("htm"));

        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
//        btUpdate = (Button) findViewById(R.id.btUpdate2);
//        btUpdate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Call<PostPutDelWisata> updateKontakCall = mApiInterface.putKontak(
//                        edtId.getText().toString(),
//                        edtNama.getText().toString(),
//                        edtNomor.getText().toString());
//                updateKontakCall.enqueue(new Callback<PostPutDelWisata>() {
//                    @Override
//                    public void onResponse(Call<PostPutDelWisata> call, Response<PostPutDelWisata> response) {
//                        MainActivity.ma.refresh();
//                        finish();
//                    }
//
//                    @Override
//                    public void onFailure(Call<PostPutDelWisata> call, Throwable t) {
//                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
//                    }
//                });
//            }
//        });
//        btDelete = (Button) findViewById(R.id.btDelete2);
//        btDelete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (edtId.getText().toString().trim().isEmpty()==false){
//                    Call<PostPutDelWisata> deleteKontak = mApiInterface.deleteKontak(edtId.getText().toString());
//                    deleteKontak.enqueue(new Callback<PostPutDelWisata>() {
//                        @Override
//                        public void onResponse(Call<PostPutDelWisata> call, Response<PostPutDelWisata> response) {
//                            MainActivity.ma.refresh();
//                            finish();
//                        }
//
//                        @Override
//                        public void onFailure(Call<PostPutDelWisata> call, Throwable t) {
//                            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
//                        }
//                    });
//                }else{
//                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//        btBack = (Button) findViewById(R.id.btBackGo);
//        btBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                MainActivity.ma.refresh();
//                finish();
//            }
//        });
    }
}