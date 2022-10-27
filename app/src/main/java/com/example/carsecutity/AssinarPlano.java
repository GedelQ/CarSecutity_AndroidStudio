package com.example.carsecutity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AssinarPlano extends AppCompatActivity {

    private Button bt_proximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assinar_plano);
        getSupportActionBar().hide();


        IniciarComponents();

        bt_proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AssinarPlano.this, Pagamento.class);
                startActivity(intent);
            }
        });
    }
    private void IniciarComponents() {
        bt_proximo = findViewById(R.id.bt_proximo);
    }
}