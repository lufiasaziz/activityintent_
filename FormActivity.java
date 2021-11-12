package com.example.activityandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.activityandintent.R;

public class FormActivity extends AppCompatActivity {
    // Deklarasi variabel
    Button btnSimpan, btnHapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        // Menampilkan toast saat button Simpan diklik
        btnSimpan = findViewById(R.id.btnSimpan);
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FormActivity.this, "Data Simpan", Toast.LENGTH_SHORT).show();
            }
        });

        // Menampilkan alert dialog saat button Hapus diklik
        btnHapus = findViewById(R.id.btnHapus);
        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(FormActivity.this);
                // Membuat judul alert dialog
                alertDialogBuilder.setTitle("Peringatan!");
                // Membuat pesan alert dialog
                alertDialogBuilder.setMessage("Apakah Anda yakin akan menghapus Data?")
                        .setIcon(R.drawable.ic_launcher_background)
                        .setCancelable(false)
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "Data Dihapus", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                // Membuat Dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                //Menampilkan Dialog
                alertDialog.show();
            }
        });
    }
}