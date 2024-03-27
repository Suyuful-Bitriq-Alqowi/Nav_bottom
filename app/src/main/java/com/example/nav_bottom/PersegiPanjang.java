package com.example.nav_bottom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjang extends AppCompatActivity {

    EditText editTextPanjang, editTextLebar;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        editTextPanjang = findViewById(R.id.editTextPanjang);
        editTextLebar = findViewById(R.id.editTextLebar);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegiPanjang();
            }
        });
    }

    private void hitungLuasPersegiPanjang() {
        String panjangString = editTextPanjang.getText().toString().trim();
        String lebarString = editTextLebar.getText().toString().trim();

        if (panjangString.isEmpty()) {
            editTextPanjang.setError("Masukkan panjang persegi panjang");
            return;
        }

        if (lebarString.isEmpty()) {
            editTextLebar.setError("Masukkan lebar persegi panjang");
            return;
        }

        double panjang = Double.parseDouble(panjangString);
        double lebar = Double.parseDouble(lebarString);

        double luas = panjang * lebar;

        textViewHasil.setText("Luas Persegi Panjang: " + luas);
    }
}
