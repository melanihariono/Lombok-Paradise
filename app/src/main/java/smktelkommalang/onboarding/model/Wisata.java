package smktelkommalang.onboarding.model;

import java.io.Serializable;


public class Wisata implements Serializable {
    public String judul;
    public String deskripsi;
    public String detail;
    public String lokasi;
    public String foto;
    public String harga;

    public Wisata(String judul, String deskripsi, String detail, String lokasi, String foto, String harga) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
        this.harga = harga;
    }
}