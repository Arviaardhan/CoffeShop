package com.example.coffeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btnpesan;
    Button btnpesan1;
    Button btnpesan2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnpesan = findViewById(R.id.btnpesanan);
        btnpesan1 = findViewById(R.id.btnpesanan1);
        btnpesan2 = findViewById(R.id.btnpesanan2);

        btnpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Minuman telah disiapkan,tunggu sebentar", Toast.LENGTH_SHORT).show();
            }
        });
        btnpesan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Minuman telah disiapkan,tunggu sebentar", Toast.LENGTH_SHORT).show();
            }
        });
        btnpesan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Minuman telah disiapkan,tunggu sebentar", Toast.LENGTH_SHORT).show();
            }
        });
    }
}