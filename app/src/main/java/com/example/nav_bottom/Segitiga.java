package com.example.nav_bottom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    EditText editTextAlas, editTextTinggi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasSegitiga();
            }
        });
    }

    private void hitungLuasSegitiga() {
        String alasString = editTextAlas.getText().toString().trim();
        String tinggiString = editTextTinggi.getText().toString().trim();

        if (alasString.isEmpty()) {
            editTextAlas.setError("Masukkan alas segitiga");
            return;
        }

        if (tinggiString.isEmpty()) {
            editTextTinggi.setError("Masukkan tinggi segitiga");
            return;
        }

        double alas = Double.parseDouble(alasString);
        double tinggi = Double.parseDouble(tinggiString);

        double luas = 0.5 * alas * tinggi;

        textViewHasil.setText("Luas Segitiga: " + luas);
    }
}
