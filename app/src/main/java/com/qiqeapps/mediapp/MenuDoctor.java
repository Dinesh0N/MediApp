package com.qiqeapps.mediapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MenuDoctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_doctor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    //region BOTONES PRINCIPALES
    public void btnBuscarPaciente(View v){
        Intent i = new Intent(this, Patologico.class);
        startActivity(i);
    }

    public void btnPatologico(View v){
        Intent i = new Intent(this, Patologico.class);
        startActivity(i);
    }

    public void btnNoPatologico(View v){
        Intent i = new Intent(this, No_Patologicos.class);
        startActivity(i);
    }

    public void btnFamiliares(View v){
        Intent i = new Intent(this, AntecedentesFamiliares.class);
        startActivity(i);
    }

    public void btnGineco(View v){
        Intent i = new Intent(this, GinecoObstetricos.class);
        startActivity(i);
    }

    public void btnFisica(View v){
        Intent i = new Intent(this, SelectBTDev.class);
        startActivity(i);
    }

    public void btnConsultas(View v){
        Intent i = new Intent(this, RegistroPacientes.class);
        startActivity(i);
    }

    public void btnClinicos(View v){
        Intent i = new Intent(this, RegistroPacientes.class);
        startActivity(i);
    }

    public void btnRecetas(View v){
        Intent i = new Intent(this, RegistroPacientes.class);
        startActivity(i);
    }

    public void btnRegistro(View v){
        Intent i = new Intent(this, RegistroPacientes.class);
        startActivity(i);
    }

    //endregion

}
