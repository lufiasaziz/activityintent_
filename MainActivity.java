package com.example.activityandintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.activityandintent.R;

public class MainActivity extends AppCompatActivity {

    // Deklarasi variabel
    TextView tvNama, tvNim, etProdi;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi variabel
        tvNama = findViewById(R.id.tvNama);
        tvNim = findViewById(R.id.tvNim);
        etProdi = findViewById(R.id.etProdi);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String nama = tvNama.getText().toString();
                    String nim = tvNim.getText().toString();
                    String prodi = etProdi.getText().toString();

                    //Pengecekan prodi harus diisi
                    if (prodi.isEmpty()) {
                        Toast.makeText(getApplication(), "Program Studi haris diisi", Toast.LENGTH_SHORT).show();
                    } else {
                        // Passing data via Bundle
                        Bundle bundle = new Bundle();
                        bundle.putString("keyNama", nama);
                        bundle.putString("keyNim", nim);
                        bundle.putString("keyProdi", prodi);
                        Intent i = new Intent(MainActivity.this, com.example.activityandintent.BiodataActivity.class);
                        i.putExtras(bundle);
                        startActivity(i);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN!", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}