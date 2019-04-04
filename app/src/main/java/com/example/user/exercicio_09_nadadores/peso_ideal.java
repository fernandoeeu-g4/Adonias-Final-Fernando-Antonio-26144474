package com.example.user.exercicio_09_nadadores;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class peso_ideal extends AppCompatActivity {

    private TextInputEditText input_sexo;
    private TextInputEditText input_altura;
    private TextView output_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_ideal);

        input_sexo = findViewById(R.id.input_sexo);
        input_altura = findViewById(R.id.input_altura);
        output_result = findViewById(R.id.output_result);
    }

    public void pesoIdeal (View view) {
        DecimalFormat df = new DecimalFormat("##.##");
        String sexo = input_sexo.getText().toString();
        double altura = Double.parseDouble(input_altura.getText().toString());
        double peso_ideal = 0;

        if (sexo.equals("m") || sexo.equals("M")) {
            peso_ideal = (72.7 * altura) - 58;
            output_result.setText("Seu peso ideal é " + df.format(peso_ideal)+ " kg.");
        } else if (sexo.equals("f") || sexo.equals("F")) {
            peso_ideal = (62.1 * altura) - 44.7;
            output_result.setText("Seu peso ideal é " + df.format(peso_ideal) + " kg.");
        } else {
            output_result.setText("Entre com M ou F!!!");
        }


    }
}
