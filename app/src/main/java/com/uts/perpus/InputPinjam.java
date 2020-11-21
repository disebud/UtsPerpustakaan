package com.uts.perpus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class InputPinjam extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_pinjam);

    }

    public void simpanData(View view) {

        final EditText namaLengkap = (EditText) findViewById(R.id.et_namaLengkap);
        final EditText nomorHp = (EditText) findViewById(R.id.et_nomorHp);
        final EditText npm = (EditText) findViewById(R.id.et_Npm);
        final EditText hargaSewa = (EditText) findViewById(R.id.et_harga);
        final EditText judulBuku = (EditText) findViewById(R.id.et_judulBuku);
        final Spinner jenisBuku = (Spinner) findViewById(R.id.spinner_jenisBuku);
        final Spinner lamaSewa = (Spinner) findViewById(R.id.spinner_lamaSewa);


        final String namaLengkaoNew = namaLengkap.getText().toString();
        final String nomorHpNew = nomorHp.getText().toString();
        final String npmNew = npm.getText().toString();
        final String hargaSewaNew = hargaSewa.getText().toString();
        final String judulBukuNew = judulBuku.getText().toString();
        String pilihLamaSewa = String.valueOf(lamaSewa.getSelectedItem());
        String pilihJenisBuku = String.valueOf(jenisBuku.getSelectedItem());


        DataPinjamBuku buku = new DataPinjamBuku(namaLengkaoNew,nomorHpNew,npmNew,
                pilihJenisBuku,hargaSewaNew,pilihLamaSewa,judulBukuNew);

        Intent intent = new Intent(InputPinjam.this, SummaryPinjam.class);
        intent.putExtra("Data", buku);
        startActivity(intent);

    }
}