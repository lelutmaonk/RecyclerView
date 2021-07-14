package com.example.recyclerview;

public class Wisata {

    private String nama_wisata;
    private String alamat_wisata;
    private String nohp_wisata;

    public Wisata(String nama_wisata, String alamat_wisata, String nohp_wisata) {
        this.nama_wisata = nama_wisata;
        this.alamat_wisata = alamat_wisata;
        this.nohp_wisata = nohp_wisata;
    }

    public String getNama_wisata() {
        return nama_wisata;
    }

    public void setNama_wisata(String nama_wisata) {
        this.nama_wisata = nama_wisata;
    }

    public String getAlamat_wisata() {
        return alamat_wisata;
    }

    public void setAlamat_wisata(String alamat_wisata) {
        this.alamat_wisata = alamat_wisata;
    }

    public String getNohp_wisata() {
        return nohp_wisata;
    }

    public void setNohp_wisata(String nohp_wisata) {
        this.nohp_wisata = nohp_wisata;
    }
}
