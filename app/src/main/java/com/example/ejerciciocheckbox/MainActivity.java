package com.example.ejerciciocheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbOtros;
    private TextView tvOtros;
    private EditText etOtrosGustos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbOtros = (CheckBox) findViewById(R.id.cbOtros);
        tvOtros = (TextView) findViewById(R.id.tvOtros);
        etOtrosGustos = (EditText) findViewById(R.id.etOtrosGustos);

        cbOtros.setChecked(false);
        tvOtros.setVisibility(View.GONE);
        etOtrosGustos.setVisibility(View.GONE);

    }

    public void cargar(View v) {

        CheckBox cbBelleza = (CheckBox) findViewById(R.id.cbBelleza);
        CheckBox cbFamilia = (CheckBox) findViewById(R.id.cbFamilia);
        CheckBox cbLibros = (CheckBox) findViewById(R.id.cbLibros);
        CheckBox cbComidaYBebida = (CheckBox) findViewById(R.id.cbComidaBebida);
        CheckBox cbCarreras = (CheckBox) findViewById(R.id.cbCarreras);
        CheckBox cbVideojuegos = (CheckBox) findViewById(R.id.cbVideojuegos);
        CheckBox cbEducacion = (CheckBox) findViewById(R.id.cbEducacion);
        CheckBox cbDeportes = (CheckBox) findViewById(R.id.cbDeportes);
        CheckBox cbEventos = (CheckBox) findViewById(R.id.cbEventos);



    }

    public void otrosGustos(View v) {

        if (cbOtros.isChecked()) {
            tvOtros.setVisibility(View.VISIBLE);
            etOtrosGustos.setVisibility(View.VISIBLE);
        }else {
            tvOtros.setVisibility(View.GONE);
            etOtrosGustos.setVisibility(View.GONE);
        }
    }
}