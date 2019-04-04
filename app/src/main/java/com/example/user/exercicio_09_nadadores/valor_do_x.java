package com.example.user.exercicio_09_nadadores;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class valor_do_x extends AppCompatActivity {

    private TextInputEditText valor_do_x;
    private TextView output_valor_do_y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valor_do_x);

        valor_do_x = findViewById(R.id.input_valor_x);
        output_valor_do_y = findViewById(R.id.output_valor_y);
    }

    public void calculaValorDoX (View view) {
        DecimalFormat df = new DecimalFormat("##.#");
        double valorDoX = Double.parseDouble(valor_do_x.getText().toString());
        double valorDoY = 8 / (2 - valorDoX);
        output_valor_do_y.setText("O valor do Y é "+ df.format(valorDoY));
    }
}
