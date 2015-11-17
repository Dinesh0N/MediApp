package com.qiqeapps.mediapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

public class GinecoObstetricos extends AppCompatActivity {
    Spinner spinnerMenarquia, spinnerRitmo, spinnerEmbarazos, spinnerAbortos, spinerPartos, spinnerCesareas;

    //Requerido para la fecha de nacimiento
    EditText txtGinecoFechaMenstruacion;
    int year_x, month_x, day_x;
    static final int DIALOG_ID = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gineco_obstetricos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Fecha de ultima menstruacion
        final Calendar cal = Calendar.getInstance();
        year_x = cal.get(Calendar.YEAR);
        month_x = cal.get(Calendar.MONTH);
        day_x = cal.get(Calendar.DAY_OF_MONTH);
        txtGinecoFechaMenstruacion = (EditText) findViewById(R.id.txtGinecoUltimaMenstru);
        showDialogOnEditTextClick();

        //region CREACION SPINNERS
        //Spinner para menarquia
        spinnerMenarquia = (Spinner) findViewById(R.id.spinnerGinecoMenarquia);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.edad_menarquia, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerMenarquia.setAdapter(adapter);

        //Spinner para menarquia
        spinnerRitmo = (Spinner) findViewById(R.id.spinnerGinecoRitmo);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.ritmo_menstrual, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerRitmo.setAdapter(adapter2);

        //Spinner para embarazos
        spinnerEmbarazos = (Spinner) findViewById(R.id.spinnerGinecoEmbarazos);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.embarazos, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmbarazos.setAdapter(adapter3);

        //Spinner para abortos
        spinnerAbortos = (Spinner) findViewById(R.id.spinnerGinecoAbortos);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.abortos, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerAbortos.setAdapter(adapter4);

        //Spinner para partos
        spinerPartos = (Spinner) findViewById(R.id.spinnerGinecoPartos);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
                R.array.partos, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinerPartos.setAdapter(adapter5);

        //Spinner para cesareas
        spinnerCesareas = (Spinner) findViewById(R.id.spinnerGinecoCesareas);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,
                R.array.cesareas, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerCesareas.setAdapter(adapter6);
        //endregion


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //region FECHA DE NACIMIENTO
    public void showDialogOnEditTextClick(){


        txtGinecoFechaMenstruacion.setOnClickListener(
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
            txtGinecoFechaMenstruacion.setText(day_x + "-" + month_x + "-" + year_x);
        }
    };

    //endregion

}
