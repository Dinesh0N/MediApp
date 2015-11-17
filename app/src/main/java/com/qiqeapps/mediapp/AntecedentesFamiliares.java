package com.qiqeapps.mediapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.Calendar;

public class AntecedentesFamiliares extends AppCompatActivity {

    RadioGroup rdioFamiliares;
    //Requerido para la fecha de nacimiento
    EditText txt_FamiliarNacimiento, txtFamiliarNombre, txtFamiliarEnfermedades;
    int year_x, month_x, day_x;
    static final int DIALOG_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antecedentes_familiares);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rdioFamiliares = (RadioGroup) findViewById(R.id.rdioGroupFamiliares);
        txtFamiliarNombre = (EditText) findViewById(R.id.txtFamiliaresNombre);
        txtFamiliarEnfermedades = (EditText) findViewById(R.id.txtFamiliarEnfermedades);


        //Fecha de nacimiento
        final Calendar cal = Calendar.getInstance();
        year_x = cal.get(Calendar.YEAR);
        month_x = cal.get(Calendar.MONTH);
        day_x = cal.get(Calendar.DAY_OF_MONTH);
        txt_FamiliarNacimiento = (EditText) findViewById(R.id.txtFamiliaresFecNacimi);
        showDialogOnEditTextClick();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //region FECHA DE NACIMIENTO
    public void showDialogOnEditTextClick(){


        txt_FamiliarNacimiento.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showDialog(DIALOG_ID);
                    }
                }
        );
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_ID)
            return new DatePickerDialog(this, dPickerListener, year_x, month_x, day_x);
        return  null;
    }

    private DatePickerDialog.OnDateSetListener dPickerListener
            = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            year_x = year;
            month_x = monthOfYear + 1;
            day_x = dayOfMonth;
            txt_FamiliarNacimiento.setText(day_x + "-" + month_x + "-" + year_x);
        }
    };

    //endregion

    //region METODOS VARIOS
    public void limpiaCamposFamiliares(View v){
        rdioFamiliares.clearCheck();
        txtFamiliarNombre.setText("");
        txtFamiliarEnfermedades.setText("");
        txt_FamiliarNacimiento.setText("");
    }
    //endregion
}
