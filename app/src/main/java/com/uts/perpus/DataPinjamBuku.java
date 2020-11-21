package com.uts.perpus;

import android.os.Parcel;
import android.os.Parcelable;

public class DataPinjamBuku implements Parcelable {
    private String namaLengkap;
    private String noHp;
    private String npm;
    private String jenisBuku;
    private String hargaSewa;
    private String lamaSewa;
    private String judulBuku;

    protected DataPinjamBuku(Parcel in) {
        namaLengkap = in.readString();
        noHp = in.readString();
        npm = in.readString();
        jenisBuku = in.readString();
        hargaSewa = in.readString();
        lamaSewa = in.readString();
        judulBuku = in.readString();
    }

    public static final Creator<DataPinjamBuku> CREATOR = new Creator<DataPinjamBuku>() {
        @Override
        public DataPinjamBuku createFromParcel(Parcel in) {
            return new DataPinjamBuku(in);
        }

        @Override
        public DataPinjamBuku[] newArray(int size) {
            return new DataPinjamBuku[size];
        }
    };

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getJenisBuku() {
        return jenisBuku;
    }

    public void setJenisBuku(String jenisBuku) {
        this.jenisBuku = jenisBuku;
    }

    public String getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(String hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public String getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(String lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public DataPinjamBuku(String namaLengkap, String noHp, String npm, String jenisBuku, String hargaSewa, String lamaSewa, String judulBuku) {
        this.namaLengkap = namaLengkap;
        this.noHp = noHp;
        this.npm = npm;
        this.jenisBuku = jenisBuku;
        this.hargaSewa = hargaSewa;
        this.lamaSewa = lamaSewa;
        this.judulBuku = judulBuku;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(namaLengkap);
        parcel.writeString(noHp);
        parcel.writeString(npm);
        parcel.writeString(jenisBuku);
        parcel.writeString(hargaSewa);
        parcel.writeString(lamaSewa);
        parcel.writeString(judulBuku);
    }
}