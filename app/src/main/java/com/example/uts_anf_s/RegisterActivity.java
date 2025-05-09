package com.example.uts_anf_s;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    EditText edtName;
    Button btnRegister;
    ImageView imgIcon;
    TextView txtTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtName = findViewById(R.id.edtName);
        btnRegister = findViewById(R.id.btnRegister);
        imgIcon = findViewById(R.id.imgIcon);
        txtTitle = findViewById(R.id.txtTitle);

        btnRegister.setOnClickListener(v -> {
            String name = edtName.getText().toString();
            Log.d("RegisterActivity", "Register clicked: " + name);
            Toast.makeText(this, "Registrasi Berhasil, " + name, Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, ChatListActivity.class);
            startActivity(intent);
        });
    }
}
