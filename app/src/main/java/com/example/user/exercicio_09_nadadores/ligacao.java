package com.example.user.exercicio_09_nadadores;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ligacao extends AppCompatActivity {

    private RadioButton radio_op1;
    private RadioButton radio_op2;
    private RadioButton radio_op3;
    private TextInputEditText input_minutos;
    private TextView output_ligacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligacao);

        radio_op1 = findViewById(R.id.radio_op1);
        radio_op2 = findViewById(R.id.radio_op2);
        radio_op3 = findViewById(R.id.radio_op3);
        input_minutos = findViewById(R.id.input_minutos);
        output_ligacao = findViewById(R.id.output_ligacao);
    }

    public void valorLigacao (View v) {
        DecimalFormat df = new DecimalFormat("##.##");
        double valor_segundo;
        double resultado;
        double minutos = Double.parseDouble(input_minutos.getText().toString());
        double segundos = (minutos * 60) - 5;
        if (radio_op1.isChecked()) {
            valor_segundo = 0.02;
            resultado = segundos * valor_segundo;
            output_ligacao.setText("A ligação custou R$ " + df.format(resultado));
        } else if (radio_op2.isChecked()) {
            valor_segundo = 0.025;
            resultado = segundos * valor_segundo;
            output_ligacao.setText("A ligação custou R$ " + df.format(resultado));
        } else if (radio_op3.isChecked()) {
            valor_segundo = 0.019;
            resultado = segundos * valor_segundo;
            output_ligacao.setText("A ligação custou R$ " + df.format(resultado));
        } else {
            valor_segundo = 0;
            output_ligacao.setText("Escolha uma operadora...");
        }






    }
}
