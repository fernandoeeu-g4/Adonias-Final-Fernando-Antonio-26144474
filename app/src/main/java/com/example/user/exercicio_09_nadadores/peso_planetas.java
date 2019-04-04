package com.example.user.exercicio_09_nadadores;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class peso_planetas extends AppCompatActivity {

    private RadioButton mercurio;
    private RadioButton venus;
    private RadioButton marte;
    private RadioButton jupiter;
    private RadioButton saturno;
    private RadioButton urano;
    private TextInputEditText pesoNaTerra;
    private TextView outputResult;
    private double gravidadeRelativa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_planetas);

        mercurio = findViewById(R.id.radioMercurio);
        venus = findViewById(R.id.radioVenus);
        marte = findViewById(R.id.radioMarte);
        jupiter = findViewById(R.id.radioJupiter);
        saturno = findViewById(R.id.radioSaturno);
        urano = findViewById(R.id.radioUrano);
        pesoNaTerra = findViewById(R.id.pesoNaTerra);
        outputResult = findViewById(R.id.outputResult);
    }

    public void calculaPesoPlaneta(View view) {
        DecimalFormat df = new DecimalFormat("##.#");
        double pesoPlaneta;
        double pesoTerra = Double.parseDouble(pesoNaTerra.getText().toString());
//        if (TextUtils.isEmpty(pesoNaTerra.getText().toString())) {
//            outputResult.setText("Entre com seu peso!");
//        }
        if (mercurio.isChecked()) {
            this.gravidadeRelativa = 0.37;
        } else if (venus.isChecked()) {
            this.gravidadeRelativa = 0.88;
        } else if (marte.isChecked()) {
            this.gravidadeRelativa = 0.38;
        } else if (jupiter.isChecked()) {
            this.gravidadeRelativa = 2.64;
        } else if (saturno.isChecked()) {
            this.gravidadeRelativa = 1.15;
        } else if (urano.isChecked()) {
            this.gravidadeRelativa = 1.17;
        } else {
            //gravidadeRelativa = 1;
        }
        pesoPlaneta = (10 * pesoTerra * gravidadeRelativa) / 10;
        outputResult.setText("Seu peso no planeta selecionado é " + df.format(pesoPlaneta) + "kg");

    }
}
