package com.vicenterincon.explorandolayoutapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CalendarView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ConstraintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);

        // Obtén una referencia al CalendarView desde el layout
        CalendarView calendarView = findViewById(R.id.calendarView);

        // Configura la fecha actual en el CalendarView
        calendarView.setDate(System.currentTimeMillis());

        // Configura un listener para manejar cambios de fecha
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                // Aquí puedes manejar el cambio de fecha si es necesario
            }
        });

        // Configura un OnClickListener para el botón
        findViewById(R.id.btn_back).setOnClickListener(view -> {
            // Crea un Intent para ir a MainActivity
            Intent intent = new Intent(ConstraintActivity.this, MainActivity.class);
            // Inicia la actividad MainActivity
            startActivity(intent);
            // Cierra la actividad actual (ConstraintActivity)
            finish();
        });
    }
}