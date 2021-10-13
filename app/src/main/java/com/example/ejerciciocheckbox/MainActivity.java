package com.example.ejerciciocheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

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

        TextView gustosSeleccionados = (TextView) findViewById(R.id.tvGustosSeleccionados);


        List<CheckBox> checkBoxes = new ArrayList<>();
        checkBoxes.add(cbBelleza);
        checkBoxes.add(cbFamilia);
        checkBoxes.add(cbLibros);
        checkBoxes.add(cbComidaYBebida);
        checkBoxes.add(cbCarreras);
        checkBoxes.add(cbVideojuegos);
        checkBoxes.add(cbEducacion);
        checkBoxes.add(cbDeportes);
        checkBoxes.add(cbEventos);

        StringBuilder gustos = new StringBuilder("Mis gustos son: \n");

        for (CheckBox checkBox : checkBoxes) {
            if (checkBox.isChecked()) {
                gustos.append(checkBox.getText().toString()).append("\n");
            }
        }
        if (cbOtros.isChecked()) {
            gustosSeleccionados.setText(gustos.append(etOtrosGustos.getText()).toString());
        } else {
            gustosSeleccionados.setText(gustos.toString());
        }


    }

    public void otrosGustos(View v) {

        if (cbOtros.isChecked()) {
            tvOtros.setVisibility(View.VISIBLE);
            etOtrosGustos.setVisibility(View.VISIBLE);
        } else {
            tvOtros.setVisibility(View.GONE);
            etOtrosGustos.setVisibility(View.GONE);
        }
    }
}