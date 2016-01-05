package com.qiqeapps.mediapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MenuDoctorPaciente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_doctor_paciente);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    //region BOTONES PRINCIPALES

    public void btnPatologico(View v){
        Intent i = new Intent(this, atender_patologicos.class);
        startActivity(i);
    }

    public void btnNoPatologico(View v){
        Intent i = new Intent(this, atender_nopatologicos.class);
        startActivity(i);
    }

    public void btnFamiliares(View v){
        Intent i = new Intent(this, RegistroNuevoAntecedentesFamiliares.class);
        startActivity(i);
    }

    public void btnGineco(View v){
        Intent i = new Intent(this, RegistroNuevoGinecoObstetricos.class);
        startActivity(i);
    }

    public void btnFisica(View v){
        Intent i = new Intent(this, Atender_SelectBTDev.class);
        startActivity(i);
    }

    public void btnConsultas(View v){
        Intent i = new Intent(this, RegistroNuevoPacientes.class);
        startActivity(i);
    }

    public void btnClinicos(View v){
        Intent i = new Intent(this, RegistroNuevoPacientes.class);
        startActivity(i);
    }

    public void btnRecetas(View v){
        Intent i = new Intent(this, RegistroNuevoPacientes.class);
        startActivity(i);
    }

    //endregion

}
