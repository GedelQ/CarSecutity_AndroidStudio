package com.example.carsecutity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormCadastroCliente extends AppCompatActivity {

    private Button bt_cadastrar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro_cliente);
        getSupportActionBar().hide();

        IniciarComponents();

        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(FormCadastroCliente.this, TelaPrincipal.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarComponents(){
            bt_cadastrar = findViewById(R.id.bt_cadastrar);
    }

}


