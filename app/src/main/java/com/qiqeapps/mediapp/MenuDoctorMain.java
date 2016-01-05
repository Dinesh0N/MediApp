package com.qiqeapps.mediapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MenuDoctorMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_doctor_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    //region METODOS PARA IR A LAS VISTAS
    public void btnNuevosRegistros(View v){
        Intent i = new Intent(this, MenuNvosRegistros.class);
        startActivity(i);
    }

    public void btnAtenderPaciente(View v){
        Intent i = new Intent(this, AtenderPaciente_BuscaRegistro.class);
        startActivity(i);
    }

    public void btnEliminaPaciente(View v){
        Intent i = new Intent(this, MainEliminaRegistro.class);
        startActivity(i);
    }

    public void btnActualizaStatusPaciente(View v){
        Intent i = new Intent(this, MainModificaStatusPaciente.class);
        startActivity(i);
    }

    public void btnVisualizaInfoPaciente(View v){
        Intent i = new Intent(this, VisualizarPacienteBuscaRegistro.class);
        startActivity(i);
    }
    //endregion

}
