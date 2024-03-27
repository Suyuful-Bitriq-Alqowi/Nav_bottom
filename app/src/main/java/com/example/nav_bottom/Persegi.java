package com.example.nav_bottom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Persegi extends AppCompatActivity {

    EditText editTextPanjang;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        editTextPanjang = findViewById(R.id.editTextPanjang);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegi();
            }
        });
    }

    private void hitungLuasPersegi() {
        String panjangString = editTextPanjang.getText().toString().trim();

        if (panjangString.isEmpty()) {
            editTextPanjang.setError("Masukkan panjang persegi");
            return;
        }

        double panjang = Double.parseDouble(panjangString);

        double luas = panjang * panjang;

        textViewHasil.setText("Luas Persegi: " + luas);
    }
}
