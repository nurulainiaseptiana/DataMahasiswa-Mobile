package com.example.datamahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Button btnSubmit;
    public EditText etNama, etNim, etNilai;
    String Isinama,  Isinim, Isinilai, nilai_huruf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.btn_submit);
        etNama = findViewById(R.id.et_nama);
        etNim = findViewById(R.id.et_nim);
        etNilai = findViewById(R.id.et_nilai);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Isinama = etNama.getText().toString();
                Isinim = etNim.getText().toString();
                Isinilai = etNilai.getText().toString();

                double nilai_angka = Double.parseDouble(Isinilai);
                if(nilai_angka <= 4 && nilai_angka > 3.66)
                {
                    nilai_huruf = "A";
                }
                else if(nilai_angka <= 3.66 && nilai_angka > 3.33)
                {
                    nilai_huruf = "A-";
                }
                else if(nilai_angka <= 3.33 && nilai_angka > 3)
                {
                    nilai_huruf = "B+";
                }
                else if(nilai_angka <= 3 && nilai_angka > 2.66)
                {
                    nilai_huruf = "B";
                }
                else if(nilai_angka <= 2.66 && nilai_angka > 2.33)
                {
                    nilai_huruf = "B-";
                }
                else if(nilai_angka <= 2.33 && nilai_angka > 2)
                {
                    nilai_huruf = "C+";
                }
                else if(nilai_angka <= 2 && nilai_angka > 1.66)
                {
                    nilai_huruf = "C";
                }
                else if(nilai_angka <= 1.66 && nilai_angka > 1.33)
                {
                    nilai_huruf = "C-";
                }
                else if(nilai_angka <= 1.33 && nilai_angka > 1)
                {
                    nilai_huruf = "D+";
                }
                else if (nilai_angka == 1)
                {
                    nilai_huruf = "D";
                }

                Intent i = null;
                i = new Intent(MainActivity.this, OutputActivity2.class);
                Bundle b = new Bundle();
                b.putString("parse_nama", Isinama);
                b.putString("parse_nim", Isinim);
                b.putString("parse_nilai", nilai_huruf);

                i.putExtras(b);
                startActivity(i);
            }
        });

    }
}