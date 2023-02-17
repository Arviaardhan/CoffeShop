package com.example.coffeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTxtEmail;
    EditText editTxtPw;
    Button btnLogin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // konekkan semua komponen dengan xml nya

        editTxtEmail = (EditText) findViewById(R.id.editTxtEmail);
        editTxtPw = (EditText) findViewById(R.id.editTxtPw);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String email = editTxtEmail.getText().toString();
                String password = editTxtPw.getText().toString();
                if (email.equalsIgnoreCase("admin") &&
                        password.equalsIgnoreCase("admin")){
                    startActivity(new Intent(MainActivity.this, MainActivity.class));
                }else{
                    Toast.makeText(getApplicationContext(), "Gagal Login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}