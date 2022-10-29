package com.example.carsecutity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SolicitarSuporte extends AppCompatActivity {

     RadioGroup radioGroup;
     RadioButton radioButton;
     TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitar_suporte);
        getSupportActionBar().hide();

        radioGroup = findViewById(R.id.rario_group);


    }

    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

    }
}