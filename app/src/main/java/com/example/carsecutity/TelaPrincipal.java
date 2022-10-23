package com.example.carsecutity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipal extends AppCompatActivity {

    private Button bt_sair;
    private Button bt_edit_perfil;
    private Button bt_contatar;
    private Button bt_gps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_princial);
        getSupportActionBar().hide();

        IniciarComponents();

        bt_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPrincipal.this, FormLogin.class);
                startActivity(intent);
            }
        });

        bt_edit_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPrincipal.this, EditarPerfil.class);
                startActivity(intent);
            }
        });

        bt_contatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPrincipal.this, SolicitarSuporte.class);
                startActivity(intent);
            }
        });

        bt_gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPrincipal.this, GPS.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarComponents() {
        bt_sair = findViewById(R.id.bt_sair);
        bt_edit_perfil = findViewById(R.id.bt_edit_perfil);
        bt_contatar = findViewById(R.id.bt_contatar);
        bt_gps = findViewById(R.id.bt_gps);
    }
}