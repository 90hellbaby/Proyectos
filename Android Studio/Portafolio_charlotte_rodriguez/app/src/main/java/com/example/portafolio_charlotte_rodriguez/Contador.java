package com.example.portafolio_charlotte_rodriguez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Contador extends AppCompatActivity {
    TextView numero;
    Button radioAumenta, radioReincia;
    int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contador = 0;
        setContentView(R.layout.activity_contador);
        numero = findViewById(R.id.id_incremental);
        radioAumenta = findViewById(R.id.id_contador);
        radioReincia = findViewById(R.id.id_reinciador);
    }

    public void contador(View view) {
        if (radioAumenta.isSelected()) {
            for (int i = 0; i < 1; i++) {
                contador++;
            }
        }
        else if (radioReincia.isSelected()) {
            contador = 0;
        } else {
            return;
        }
        numero.setText(String.valueOf(contador));
    }
}