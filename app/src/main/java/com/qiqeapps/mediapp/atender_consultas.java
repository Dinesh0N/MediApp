package com.qiqeapps.mediapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import java.text.SimpleDateFormat;

public class atender_consultas extends AppCompatActivity {

    EditText txtFechaHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atender_consultas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        long date = System.currentTimeMillis();


        txtFechaHora = (EditText) findViewById(R.id.txtAtender_ConsultaFechaHora);

        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm a");
        String dateString = sdf.format(date);
        txtFechaHora.setText(dateString);
    }

}
