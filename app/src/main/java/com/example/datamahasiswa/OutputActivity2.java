package com.example.datamahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class OutputActivity2 extends AppCompatActivity {

    public TextView tvNama, tvNim, tvNilai;
    String tampil_nama, tampil_nim, tampil_nilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output2);

        tvNama = findViewById(R.id.tv_nama);
        tvNim = findViewById(R.id.tv_nim);
        tvNilai = findViewById(R.id.tv_nilai);

        Bundle b = getIntent().getExtras();
        tampil_nama = b.getString("parse_nama");
        tampil_nim = b.getString("parse_nim");
        tampil_nilai = b.getString("parse_nilai");

        tvNama.setText(""+ tampil_nama);
        tvNim.setText(""+tampil_nim);
        tvNilai.setText(""+tampil_nilai);

    }

}