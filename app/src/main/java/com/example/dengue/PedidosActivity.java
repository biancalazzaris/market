package com.example.dengue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PedidosActivity extends AppCompatActivity {
public static final String MENSAGEM = "com.mobile.dengue.MENSAGEM";
public static final String NOME = "com.mobile.dengue.NOME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);
    }
    public void abrirCarrinho(View novaview)  {
        EditText mensagem = (EditText) findViewById(R.id.mensagem_input);
        String texto = mensagem.getText().toString();
        EditText nome_input = (EditText) findViewById(R.id.nome_input);
        String texto_nome = nome_input.getText().toString();
        Intent intencao = new Intent(this, CarrinhoActivity.class);
        intencao.putExtra(MENSAGEM, texto);
        intencao.putExtra(NOME, texto_nome);
        startActivity(intencao);
    }
}