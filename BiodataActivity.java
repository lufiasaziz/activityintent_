package com.example.activityandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.activityandintent.R;

public class BiodataActivity extends AppCompatActivity {

    // Deklarasi variabel
    TextView tvAlamatValue, tvNoHpValue, tvEmailValue, tvJenisKelaminValue, tvKelasValue, tvUKMValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        // Inisialisasi variabel
        tvAlamatValue = findViewById(R.id.tvAlamatValue);
        tvNoHpValue = findViewById(R.id.tvNoHpValue);
        tvEmailValue = findViewById(R.id.tvEmailValue);
        tvJenisKelaminValue = findViewById(R.id.tvGenderValue);
        tvKelasValue = findViewById(R.id.tvKelasValue);
        tvUKMValue = findViewById(R.id.tvUKM);

        //Ambil dari Bundle
        Bundle bundle = getIntent().getExtras();
        tvAlamatValue.setText(bundle.getString("keyAlamat"));
        tvNoHpValue.setText(bundle.getString("keyNoHp"));
        tvEmailValue.setText(bundle.getString("keyEmail"));
        tvJenisKelaminValue.setText(bundle.getString("keyJenisKelamin"));
        tvKelasValue.setText(bundle.getString("keyKelas"));
        tvUKMValue.setText(bundle.getString("keyUKM"));
    }
}