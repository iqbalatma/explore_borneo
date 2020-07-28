package com.atmasphere.exploreborneo.Model;


import android.net.Uri;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 2/3/17.
 */

public class Wisata {

     /*
   NIM         : 10117124
   Nama        : Iqbal Atma Muliawan
   Kelas       : IF4
   Matakuliah  : Aplikasi Komputasi Bergerak

   16 Juli 2020    : Membuat kelas wisata tempat dimana mengambil entitas pada api
   */

    @SerializedName("id_tempat")
    private String id;
    @SerializedName("nama_tempat")
    private String nama;
    @SerializedName("slug_tempat")
    private String slug_tempat;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSlugTempat() {
        return slug_tempat;
    }

    public void setNomor(String slug_tempat) {
        this.slug_tempat = slug_tempat;
    }


    @SerializedName("konten")
    @Expose
    private String konten;
    @SerializedName("provinsi")
    @Expose
    private String provinsi;
    @SerializedName("kabupaten_kota")
    @Expose
    private String kabupatenKota;
    @SerializedName("htm")
    @Expose
    private String htm;
    @SerializedName("gmaps")
    @Expose
    private String gmaps;
    @SerializedName("kelebihan")
    @Expose
    private String kelebihan;
    @SerializedName("kekurangan")
    @Expose
    private String kekurangan;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;
    @SerializedName("id_jenis")
    @Expose
    private String idJenis;
    @SerializedName("foto_tempat")
    @Expose
    private String fotoTempat;
    @SerializedName("image")
    @Expose
    private String image;

//    public String getIdTempat() {
//        return idTempat;
//    }
//
//    public void setIdTempat(String idTempat) {
//        this.idTempat = idTempat;
//    }
//
//    public String getNamaTempat() {
//        return namaTempat;
//    }
//
//    public void setNamaTempat(String namaTempat) {
//        this.namaTempat = namaTempat;
//    }
//
//    public String getSlugTempat() {
//        return slugTempat;
//    }
//
//    public void setSlugTempat(String slugTempat) {
//        this.slugTempat = slugTempat;
//    }

    public String getKonten() {
        return konten;
    }

    public void setKonten(String konten) {
        this.konten = konten;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKabupatenKota() {
        return kabupatenKota;
    }

    public void setKabupatenKota(String kabupatenKota) {
        this.kabupatenKota = kabupatenKota;
    }

    public String getHtm() {
        return htm;
    }

    public void setHtm(String htm) {
        this.htm = htm;
    }

    public String getGmaps() {
        return gmaps;
    }

    public void setGmaps(String gmaps) {
        this.gmaps = gmaps;
    }

    public String getKelebihan() {
        return kelebihan;
    }

    public void setKelebihan(String kelebihan) {
        this.kelebihan = kelebihan;
    }

    public String getKekurangan() {
        return kekurangan;
    }

    public void setKekurangan(String kekurangan) {
        this.kekurangan = kekurangan;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getIdJenis() {
        return idJenis;
    }

    public void setIdJenis(String idJenis) {
        this.idJenis = idJenis;
    }

    public String getFotoTempat() {
        return fotoTempat;
    }

    public void setFotoTempat(String fotoTempat) {
        this.fotoTempat = fotoTempat;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}