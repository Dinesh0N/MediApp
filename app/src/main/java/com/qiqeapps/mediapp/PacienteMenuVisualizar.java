package com.qiqeapps.mediapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class PacienteMenuVisualizar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente_menu_visualizar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void PacientevisualizarInfoGral(View v){
        Intent i = new Intent(this, paciente_info_gral.class);
        startActivity(i);
    }

    public void PacientevisualizarPatoglogicos(View v){
        Intent i = new Intent(this, PacientePatologicos.class);
        startActivity(i);
    }

    public void PacientevisualizarNOPatoglogicos(View v){
        Intent i = new Intent(this, paciente_no_patologicos.class);
        startActivity(i);
    }

    public void PacientevisualizarFamiliares(View v){
        Intent i = new Intent(this, pacient_familiares.class);
        startActivity(i);
    }

    public void PacientevisualizarGineco(View v){
        Intent i = new Intent(this, paciente_gineco.class);
        startActivity(i);
    }

    public void PacientevisualizarFisica(View v){
        Intent i = new Intent(this, paciente_fisica.class);
        startActivity(i);
    }

    public void PacientevisualizarConsultas(View v){
        Intent i = new Intent(this, paciente_consultas.class);
        startActivity(i);
    }

}
