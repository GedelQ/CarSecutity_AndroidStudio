package com.example.carsecutity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AssinarPlano extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assinar_plano);
        getSupportActionBar().hide();
    }
}