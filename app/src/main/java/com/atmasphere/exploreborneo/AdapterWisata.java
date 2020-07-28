package com.atmasphere.exploreborneo;



import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.atmasphere.exploreborneo.Model.Wisata;
import com.bumptech.glide.Glide;


import java.net.URI;
import java.util.List;




public class AdapterWisata extends RecyclerView.Adapter<AdapterWisata.MyViewHolder>{
    /*
    NIM         : 10117124
    Nama        : Iqbal Atma Muliawan
    Kelas       : IF4
    Matakuliah  : Aplikasi Komputasi Bergerak

    16 Juli 2020    : Membuat adapter wisata untuk mengolah data yang diambil kemudian ditampilkan
    */


    List<Wisata> mKontakList;


    public AdapterWisata(List <Wisata> KontakList) {
        mKontakList = KontakList;
    }

    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup parent,int viewType){
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.wisata_list, parent, false);
        MyViewHolder mViewHolder = new MyViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder (MyViewHolder holder,final int position){



        Integer idJenis = Integer.parseInt(mKontakList.get(position).getIdJenis());
        String jenis = null;
        switch (idJenis){
            case 1:
                jenis = "Pantai";
                break;
            case 2:
                jenis = "Gunung";
                break;
            case 3:
                jenis = "Air Terjun";
                break;
            case 4:
                jenis = "Cafe";
                break;
            case 5:
                jenis = "Rumah Makan";
                break;
            case 6:
                jenis = "Danau";
                break;
            default:
                System.out.println("nilai a tidak di katahui");
        }
//        ImageView img = ((MyViewHolder) holder).img;
        holder.mTextViewNamaTempat.setText("Nama Tempat " + mKontakList.get(position).getNama());
        holder.mTextviewJenis.setText("Jenis Tempat " + jenis);
        holder.mTextViewKabupatenKota.setText("Nama Kabupaten " + mKontakList.get(position).getKabupatenKota());
        holder.mTextViewHTM.setText("Harga Tiket Masuk Rp " + mKontakList.get(position).getHtm());
        Glide.with(holder.itemView.getContext())
                // LOAD URL DARI INTERNET
                .load(mKontakList.get(position).getImage())
                // LOAD GAMBAR AWAL SEBELUM GAMBAR UTAMA MUNCUL, BISA DARI LOKAL DAN INTERNET
                .placeholder(R.drawable.base_icon)
                //. LOAD GAMBAR SAAT TERJADI KESALAHAN MEMUAT GMBR UTAMA
                .error(R.drawable.animal)
                .into(holder.img);
//        holder.img.setImageResource(Integer.parseInt(mKontakList.get(position).getImage()));

//        holder.img.setImageURI(mKontakList.get(position).getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(view.getContext(), EditActivity.class);

                Integer idJenis = Integer.parseInt(mKontakList.get(position).getIdJenis());
                String jenis = null;
                switch (idJenis){
                    case 1:
                        jenis = "Pantai";
                        break;
                    case 2:
                        jenis = "Gunung";
                        break;
                    case 3:
                        jenis = "Air Terjun";
                        break;
                    case 4:
                        jenis = "Cafe";
                        break;
                    case 5:
                        jenis = "Rumah Makan";
                        break;
                    case 6:
                        jenis = "Danau";
                        break;
                    default:
                        System.out.println("nilai a tidak di katahui");
                }


                String konten =  mKontakList.get(position).getKonten();

                String sub = "<p>";
                String sub2 = "</p>";
                konten = konten.replaceAll(sub, "");
                konten = konten.replaceAll(sub2, "");
                mIntent.putExtra("nama_tempat", mKontakList.get(position).getNama());
                mIntent.putExtra("provinsi", mKontakList.get(position).getProvinsi());
                mIntent.putExtra("kabupaten", mKontakList.get(position).getKabupatenKota());
                mIntent.putExtra("htm", mKontakList.get(position).getHtm());
                mIntent.putExtra("konten", konten);
                mIntent.putExtra("image", mKontakList.get(position).getImage());
                mIntent.putExtra("jenis", jenis);
                view.getContext().startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount () {
        return mKontakList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewNamaTempat, mTextViewKabupatenKota, mTextViewHTM, mTextviewJenis;
        public ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTextViewNamaTempat = (TextView) itemView.findViewById(R.id.nama_tempat);
            mTextViewKabupatenKota = (TextView) itemView.findViewById(R.id.kabupaten_kota);
            mTextViewHTM = (TextView) itemView.findViewById(R.id.htm);
            mTextviewJenis = (TextView) itemView.findViewById(R.id.jenis);
            img = itemView.findViewById(R.id.imageView5);
        }
    }
}
