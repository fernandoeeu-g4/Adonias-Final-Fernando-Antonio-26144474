package com.example.user.exercicio_09_nadadores;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class restaurante extends AppCompatActivity {

    private TextInputEditText input_nome;
    private TextInputEditText input_valor;
    private TextView output_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);

        input_nome = findViewById(R.id.input_nome);
        input_valor = findViewById(R.id.input_conta);
        output_result = findViewById(R.id.output_result);
    }

    public void calcula_conta(View v) {
        String nome = input_nome.getText().toString();
        double valor_conta = Double.parseDouble(input_valor.getText().toString());
        String primeira_letra = String.valueOf(nome.charAt(0));
        String msg;
        DecimalFormat df = new DecimalFormat("00.00");
        if (primeira_letra.equals("a") || primeira_letra.equals("i") || primeira_letra.equals("u") || primeira_letra.equals("e") || primeira_letra.equals("o") || primeira_letra.equals("A") || primeira_letra.equals("I") || primeira_letra.equals("U") || primeira_letra.equals("E") || primeira_letra.equals("O")) {
            valor_conta = valor_conta * 0.7;
            msg = "Valor da conta com desconto é R$ " + df.format(valor_conta);
        } else {
            msg = "Que pena! Nesta semana o desconto não é para seu nome, mas continue nos prestigiando que sua vez chegará. O valor da conta deu: R$ "  + df.format(valor_conta);
        }
        output_result.setText(msg);
    }
}
