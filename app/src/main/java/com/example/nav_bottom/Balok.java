package com.example.nav_bottom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Balok extends AppCompatActivity {

    EditText editTextPanjang, editTextLebar, editTextTinggi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        editTextPanjang = findViewById(R.id.editTextPanjang);
        editTextLebar = findViewById(R.id.editTextLebar);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeBalok();
            }
        });
    }

    private void hitungVolumeBalok() {
        String panjangString = editTextPanjang.getText().toString().trim();
        String lebarString = editTextLebar.getText().toString().trim();
        String tinggiString = editTextTinggi.getText().toString().trim();

        if (panjangString.isEmpty()) {
            editTextPanjang.setError("Masukkan panjang balok");
            return;
        }

        if (lebarString.isEmpty()) {
            editTextLebar.setError("Masukkan lebar balok");
            return;
        }

        if (tinggiString.isEmpty()) {
            editTextTinggi.setError("Masukkan tinggi balok");
            return;
        }

        double panjang = Double.parseDouble(panjangString);
        double lebar = Double.parseDouble(lebarString);
        double tinggi = Double.parseDouble(tinggiString);

        double volume = panjang * lebar * tinggi;

        textViewHasil.setText("Volume Balok: " + volume);
    }
}
