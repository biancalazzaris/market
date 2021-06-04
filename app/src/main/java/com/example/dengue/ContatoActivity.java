package com.example.dengue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);
    }
    public void abrirMain(View novaview) {
        Intent intencao = new Intent(this, MainActivity.class);
        startActivity(intencao);
    }
}