package com.vicenterincon.explorandolayoutapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        // Obtén una referencia al botón Regresar
        Button btnBack = findViewById(R.id.btn_back);

        // Configura un OnClickListener para el botón
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para ir a MainActivity
                Intent intent = new Intent(TableActivity.this, MainActivity.class);
                // Inicia la actividad MainActivity
                startActivity(intent);
            }
        });
    }
}