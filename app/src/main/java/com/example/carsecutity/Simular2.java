package com.example.carsecutity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Simular2 extends AppCompatActivity {

    private Button bt_aderir;
    private Button bt_encerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simular2);
        getSupportActionBar().hide();


        IniciarComponents();

        bt_aderir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Simular2.this, Pagamento.class);
                startActivity(intent);
            }
        });

        bt_encerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Simular2.this, TelaPrincipal.class);
                startActivity(intent);
            }
        });


    }

    private void IniciarComponents() {

        bt_aderir = findViewById(R.id.bt_aderir);
        bt_encerrar = findViewById(R.id.bt_encerrar);
    }


}