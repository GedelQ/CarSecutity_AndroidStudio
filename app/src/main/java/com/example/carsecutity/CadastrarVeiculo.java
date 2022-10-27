package com.example.carsecutity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadastrarVeiculo extends AppCompatActivity {

    private Button bt_continuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_veiculo);
        getSupportActionBar().hide();


        IniciarComponents();

        bt_continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CadastrarVeiculo.this, AssinarPlano.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponents() {
        bt_continuar = findViewById(R.id.bt_continuar);
    }

}