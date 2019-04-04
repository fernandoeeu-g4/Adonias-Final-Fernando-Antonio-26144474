package com.example.user.exercicio_09_nadadores;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class notas extends AppCompatActivity {

    private TextInputEditText input_nome;
    private TextInputEditText input_av1;
    private TextInputEditText input_av2;
    private TextView output_media;
    private double media;
    private String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        input_nome = findViewById(R.id.input_nome);
        input_av1 = findViewById(R.id.input_1av);
        input_av2 = findViewById(R.id.input_2av);
        output_media = findViewById(R.id.output_media);
    }

    public void calcularMedia(View view) {
        double av1 = Double.parseDouble(input_av1.getText().toString());
        double av2 = Double.parseDouble(input_av2.getText().toString());
        String nome = input_nome.getText().toString();

        media = (av1 + av2) / 2;
        if (av1 > 10 || av1 < 0 || av2 > 10 || av2 < 0) {
            msg = "Insira valores válidos para as notas...";
        } else if (media < 4) {
            msg = nome + " foi reprovado... :(";
        } else if (media < 7) {
            msg = nome + " está na prova final.";
        } else {
            msg = nome + " foi aprovado(a), parabéns!!!";
        }
        output_media.setText(msg);
    }
}
