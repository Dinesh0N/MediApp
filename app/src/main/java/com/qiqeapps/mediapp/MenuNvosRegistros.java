package com.qiqeapps.mediapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MenuNvosRegistros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_nvos_registros);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    //region Metodos para las vistas de nuevos registros en un paciente
    public void btnRegistroNuevoInfoGral(View v){
        Intent i = new Intent(this, RegistroNuevoPacientes.class);
        startActivity(i);
    }

    public void btnRegistroNvoPatologico(View v){
        Intent i = new Intent(this, RegistroNuevoPatologico.class);
        startActivity(i);
    }

    public void btnRegistroNuevoNoPatologico(View v){
        Intent i = new Intent(this, RegistroNuevoNOPatologico.class);
        startActivity(i);
    }

    public void btnRegistroNuevoFamiliares(View v){
        Intent i = new Intent(this, RegistroNuevoAntecedentesFamiliares.class);
        startActivity(i);
    }

    public void btnRegistroNuevoGineco(View v){
        Intent i = new Intent(this, RegistroNuevoGinecoObstetricos.class);
        startActivity(i);
    }

    public void btnRegistroNuevoExpFisica(View v){
        Intent i = new Intent(this, SelectBTDev.class);
        startActivity(i);
    }

    public void btnRegistroNuevaConsulta(View v){
        Intent i = new Intent(this, RegistroNuevoConsulta.class);
        startActivity(i);
    }

    public void btnRegistroNuevoClinicos(View v){
        Intent i = new Intent(this, RegistroNuevoPacientes.class);
        startActivity(i);
    }

    //endregion

}
