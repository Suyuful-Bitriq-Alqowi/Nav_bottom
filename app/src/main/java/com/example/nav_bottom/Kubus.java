package com.example.nav_bottom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kubus extends AppCompatActivity {

    EditText editTextSisi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        editTextSisi = findViewById(R.id.editTextSisi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeKubus();
            }
        });
    }

    private void hitungVolumeKubus() {
        String sisiString = editTextSisi.getText().toString().trim();

        if (sisiString.isEmpty()) {
            editTextSisi.setError("Masukkan panjang sisi kubus");
            return;
        }

        double sisi = Double.parseDouble(sisiString);

        double volume = sisi * sisi * sisi;

        textViewHasil.setText("Volume Kubus: " + volume);
    }
}
