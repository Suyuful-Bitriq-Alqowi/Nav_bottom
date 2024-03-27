package com.example.nav_bottom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kerucut extends AppCompatActivity {

    EditText editTextJariJari, editTextTinggi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeKerucut();
            }
        });
    }

    private void hitungVolumeKerucut() {
        String jariJariString = editTextJariJari.getText().toString().trim();
        String tinggiString = editTextTinggi.getText().toString().trim();

        if (jariJariString.isEmpty()) {
            editTextJariJari.setError("Masukkan jari-jari kerucut");
            return;
        }

        if (tinggiString.isEmpty()) {
            editTextTinggi.setError("Masukkan tinggi kerucut");
            return;
        }

        double jariJari = Double.parseDouble(jariJariString);
        double tinggi = Double.parseDouble(tinggiString);

        double volume = (1.0/3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;

        textViewHasil.setText("Volume Kerucut: " + volume);
    }
}
