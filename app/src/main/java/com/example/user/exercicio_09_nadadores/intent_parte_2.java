package com.example.user.exercicio_09_nadadores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class intent_parte_2 extends AppCompatActivity {

    private TextView output_msg_consumo;
    private String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_parte_2);

        Intent i = getIntent();
        msg = i.getStringExtra("msg");

        output_msg_consumo = findViewById(R.id.output_msg_consumo);

        output_msg_consumo.setText(msg);
    }

    public void compartilhar(View v) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT, "assunto");
        i.putExtra(Intent.EXTRA_TEXT, msg);
        startActivity(Intent.createChooser(i, "Compartilhar..."));
    }

    public void goto_tela_anterior(View v) {
        Intent i = new Intent( this, intent.class );
        startActivity( i );
    }
}
