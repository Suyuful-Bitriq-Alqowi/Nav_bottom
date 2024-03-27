package com.example.nav_bottom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tabung extends AppCompatActivity {

    EditText editTextJariJari, editTextTinggi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeTabung();
            }
        });
    }

    private void hitungVolumeTabung() {
        String jariJariString = editTextJariJari.getText().toString().trim();
        String tinggiString = editTextTinggi.getText().toString().trim();

        if (jariJariString.isEmpty()) {
            editTextJariJari.setError("Masukkan jari-jari tabung");
            return;
        }

        if (tinggiString.isEmpty()) {
            editTextTinggi.setError("Masukkan tinggi tabung");
            return;
        }

        double jariJari = Double.parseDouble(jariJariString);
        double tinggi = Double.parseDouble(tinggiString);

        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;

        textViewHasil.setText("Volume Tabung: " + volume);
    }
}
