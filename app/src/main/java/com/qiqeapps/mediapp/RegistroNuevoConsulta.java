package com.qiqeapps.mediapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RegistroNuevoConsulta extends AppCompatActivity {

    EditText txtFechaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_nuevo_consulta);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        long date = System.currentTimeMillis();


        txtFechaC = (EditText) findViewById(R.id.txtConsultaFecha);

        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm a");
        String dateString = sdf.format(date);
        txtFechaC.setText(dateString);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
