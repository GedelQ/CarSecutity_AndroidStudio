package com.example.carsecutity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormCadastroCliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro_cliente);
        getSupportActionBar().hide();
    }
}

