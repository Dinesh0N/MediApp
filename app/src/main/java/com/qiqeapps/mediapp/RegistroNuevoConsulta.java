package com.qiqeapps.mediapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

import java.text.SimpleDateFormat;

public class RegistroNuevoConsulta extends AppCompatActivity {

    EditText txtFechaHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_nuevo_consulta);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        long date = System.currentTimeMillis();


        txtFechaHora = (EditText) findViewById(R.id.txtConsultaFechaHora);

        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm a");
        String dateString = sdf.format(date);
        txtFechaHora.setText(dateString);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
