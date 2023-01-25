package com.androidclass.multiconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button temperature, currency, weight, unit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temperature = findViewById(R.id.tempr);
        currency = findViewById(R.id.crnc);
        weight = findViewById(R.id.weight);
        unit = findViewById(R.id.unit);

        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openTempActivity();
            }
        });

        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCurrenActivity();
            }
        });

        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWeightActivity();
            }
        });

        unit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUnitActivity();
            }
        });
    }

     public void openTempActivity() {
        Intent intent = new Intent(this, TemperatureActivity.class);
        startActivity(intent);
    }

     public void openCurrenActivity() {
        Intent intent = new Intent(this, CurrencyActivity.class);
         startActivity(intent);
     }

     public void openWeightActivity() {
        Intent intent = new Intent(this, WeightActivity.class);
         startActivity(intent);
     }

     public void openUnitActivity() {
        Intent intent = new Intent(this, UnitActivity.class);
         startActivity(intent);
     }

}