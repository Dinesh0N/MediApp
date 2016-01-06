package com.qiqeapps.mediapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MenuVisualizarInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_visualizar_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void visualizarInfoGral(View v){
        Intent i = new Intent(this, VisualizarInfoGral.class);
        startActivity(i);
    }

    public void visualizarPatoglogicos(View v){
        Intent i = new Intent(this, VisualizarPatologicos.class);
        startActivity(i);
    }

    public void visualizarNOPatoglogicos(View v){
        Intent i = new Intent(this, VisualizatNoPatologicos.class);
        startActivity(i);
    }

    public void visualizarFamiliares(View v){
        Intent i = new Intent(this, VisualizarFamiliares.class);
        startActivity(i);
    }

    public void visualizarGineco(View v){
        Intent i = new Intent(this, VisualizaGinecos.class);
        startActivity(i);
    }

    public void visualizarFisica(View v){
        Intent i = new Intent(this, VisualizarFisica.class);
        startActivity(i);
    }

    public void visualizarConsultas(View v){
        Intent i = new Intent(this, VisualizarConsultas.class);
        startActivity(i);
    }

}
