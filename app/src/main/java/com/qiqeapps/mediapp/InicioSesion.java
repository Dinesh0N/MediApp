package com.qiqeapps.mediapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InicioSesion extends AppCompatActivity {
    Button btnInicioSesion;
    EditText txtUsuario;
    EditText txtContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        btnInicioSesion = (Button) findViewById(R.id.btnIniciaSesion);
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtContrasena = (EditText) findViewById(R.id.txtContrasena);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void iniciarSesion(View v) {
        Intent i;
        if (txtUsuario.getText().toString().equals("doc") && txtContrasena.getText().toString().equals("doc")){
            i = new Intent(this, MenuDoctor.class);
            startActivity(i);
            finish();
        }
        else if (txtUsuario.getText().toString().equals("paciente") && txtContrasena.getText().toString().equals("paciente")){
            i = new Intent(this, MenuDoctor.class);
            startActivity(i);
            finish();
        }
    }
}
