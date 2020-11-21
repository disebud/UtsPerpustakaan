package com.uts.perpus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SummaryPinjam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_pinjam);


        final TextView namaMhsHasil = (TextView) findViewById(R.id.tv_namaLengkap);
        final TextView noHpHasil = (TextView) findViewById(R.id.tv_nomorHp);
        final TextView npmHasil = (TextView) findViewById(R.id.tvv_Npm);
        final TextView jenisBukuHasil = (TextView) findViewById(R.id.tv_jenisBuku);
        final TextView hargaSewaHasil = (TextView) findViewById(R.id.tvv_harga);
        final TextView lamaSewaHasil = (TextView) findViewById(R.id.tvv_lamaSewa);
        final TextView judulBukuHasil = (TextView) findViewById(R.id.tvv_judulBuku);

        Intent intent = getIntent();
        DataPinjamBuku bukuNew = intent.getParcelableExtra("Data");

        namaMhsHasil.setText(bukuNew.getNamaLengkap());
        noHpHasil.setText(bukuNew.getNoHp());
        npmHasil.setText(bukuNew.getNpm());
        jenisBukuHasil.setText(bukuNew.getJenisBuku());
        hargaSewaHasil.setText(bukuNew.getHargaSewa());
        lamaSewaHasil.setText(bukuNew.getLamaSewa());
        judulBukuHasil.setText(bukuNew.getJudulBuku());


    }

    public void Home(View view) {
        Intent intent = new Intent(SummaryPinjam.this, MainActivity.class);
        startActivity(intent);
    }
}