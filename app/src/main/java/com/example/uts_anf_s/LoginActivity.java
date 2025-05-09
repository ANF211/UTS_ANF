package com.example.uts_anf_s;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText edtUsername;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edtUsername);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            String name = edtUsername.getText().toString();
            if (!name.isEmpty()) {
                Toast.makeText(this, "Login sebagai " + name, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, RegisterActivity.class);
                intent.putExtra("username", name);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Masukkan nama terlebih dahulu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
