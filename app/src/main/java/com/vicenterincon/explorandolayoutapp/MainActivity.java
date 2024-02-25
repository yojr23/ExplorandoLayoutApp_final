package com.vicenterincon.explorandolayoutapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtén una referencia al botón
        Button btnConst = findViewById(R.id.btn_const);

        // Configura un OnClickListener para el botón
        btnConst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define la lógica para navegar a la pantalla ConstraintActivity
                Intent intent = new Intent(MainActivity.this, ConstraintActivity.class);
                startActivity(intent);
            }

        });
        // Obtén una referencia al botón
        Button btnTable = findViewById(R.id.btn_table);

        // Configura un OnClickListener para el botón
        btnTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define la lógica para navegar a la pantalla ActivityTable
                Intent intent = new Intent(MainActivity.this, TableActivity.class);
                startActivity(intent);
            }
        });
    }
}