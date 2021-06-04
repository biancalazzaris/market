package com.example.market;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CarrinhoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);
        Intent intencao = getIntent();
        String texto = intencao.getStringExtra(PedidosActivity.MENSAGEM);
        TextView textview = (TextView) findViewById(R.id.mensagem);
        textview.setText(texto);
        String nome = intencao.getStringExtra(PedidosActivity.NOME);
        TextView nomeTextview = (TextView) findViewById(R.id.nome_text_view);
        nomeTextview.setText(nome);
    }
    public void abrirContato(View novaview)  {
        Intent intencao = new Intent(this, ContatoActivity.class);
        startActivity(intencao);
    }
}