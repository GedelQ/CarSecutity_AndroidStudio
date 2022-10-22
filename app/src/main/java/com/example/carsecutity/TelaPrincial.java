package com.example.carsecutity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincial extends AppCompatActivity {

    private Button bt_sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_princial);
        getSupportActionBar().hide();

        IniciarComponents();

        bt_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(TelaPrincial.this,FormLogin.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarComponents() {
        bt_sair = findViewById(R.id.bt_sair);
    }
}