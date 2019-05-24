package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoApertado (View view){
        System.out.println("O botão foi apertado");
        TextView respostaTextView = findViewById(R.id.texto_resposta_id);
        EditText pesoDigitado = findViewById(R.id.peso_digitado_id);
        EditText alturaDigitada = findViewById(R.id.altura_digitada_id);
        Float peso =  Float.parseFloat(pesoDigitado.getText().toString());
        Float altura = Float.parseFloat(alturaDigitada.getText().toString());
        Float imc = peso / (altura * altura);
        respostaTextView.setText("Seu imc é " + imc);
        Toast.makeText(this, "Eu sou um toast!", Toast.LENGTH_LONG).show();
    }
}
