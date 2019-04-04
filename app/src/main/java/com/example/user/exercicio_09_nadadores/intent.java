package com.example.user.exercicio_09_nadadores;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.text.DecimalFormat;

public class intent extends AppCompatActivity {

    private TextInputEditText input_modelo_veiculo;
    private TextInputEditText input_distancia;
    private TextInputEditText input_potencia_motor;
    private TextInputEditText input_valor_gasolina;
    private String modeloVeiculo;
    private double distancia;
    private double potenciaMotor;
    private double valorGasolina;
    private double gastoPorLitro;
    private double consumo;
    private String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        input_modelo_veiculo = findViewById(R.id.input_modelo_veiculo);
        input_distancia = findViewById(R.id.input_distancia);
        input_potencia_motor = findViewById(R.id.input_potencia_motor);
        input_valor_gasolina = findViewById(R.id.input_valor_gasolina);


    }

    public void calculaConsumo(View view) {
        modeloVeiculo = input_modelo_veiculo.getText().toString();
        distancia = Double.parseDouble(input_distancia.getText().toString());
        potenciaMotor = Double.parseDouble(input_potencia_motor.getText().toString());
        valorGasolina = Double.parseDouble(input_valor_gasolina.getText().toString());
        DecimalFormat df = new DecimalFormat("##.##");

        if (potenciaMotor > 1.9) {
            gastoPorLitro = 7.75;
        } else if (potenciaMotor > 1.4) {
            gastoPorLitro = 9.5;
        } else if (potenciaMotor > 1.0) {
            gastoPorLitro = 11;
        } else  {
            gastoPorLitro = 13;
        }
        consumo = (distancia / gastoPorLitro) * valorGasolina;
        msg = modeloVeiculo + " " + potenciaMotor + " gasta R$ " + df.format(consumo) + " para percorrer " + distancia + " km com a gasolina a R$ " + valorGasolina + " por litro";
        Intent i = new Intent(this, intent_parte_2.class);
        i.putExtra("msg", msg);
        startActivity(i);
    }
}
