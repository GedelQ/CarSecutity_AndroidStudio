package com.example.carsecutity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Simular extends AppCompatActivity {

    private Button bt_continuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simular);
        getSupportActionBar().hide();

        IniciarComponents();


        bt_continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Simular.this, Simular2.class);
                startActivity(intent);
            }
        });


    }

    private void IniciarComponents() {

        bt_continuar = findViewById(R.id.bt_continuar);
    }
}