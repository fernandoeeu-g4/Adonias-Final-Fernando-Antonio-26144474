package com.example.user.exercicio_09_nadadores;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class nadadores extends AppCompatActivity {

    private TextInputEditText input_idade;
    private TextView output_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nadadores);

        input_idade = findViewById(R.id.idade_atleta);
        output_result = findViewById(R.id.output_result);
    }

    public void calcula_categoria(View view) {
        double idade = Integer.parseInt(input_idade.getText().toString());
        String categoria;
        if (idade > 4 && idade < 8) {
            categoria = "Infantil A";
        } else if (idade > 7 && idade < 11) {
            categoria = "Infantil B";
        } else if (idade > 10 && idade < 14) {
            categoria = "Juvenil A";
        } else if (idade > 13 && idade < 18) {
            categoria = "Juvenil B";
        } else if (idade > 17) {
            categoria = "Sênior";
        } else {
            categoria = "Insira uma categoria válida";
        }
        output_result.setText(categoria);
    }
}
