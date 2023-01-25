package com.androidclass.multiconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class TemperatureActivity extends AppCompatActivity {

    Button convert, clear;
    EditText editText;
    RadioButton ctof, ftoc, ctok, ktoc, ftok, ktof;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        convert = findViewById(R.id.convert);
        clear = findViewById(R.id.clear);
        editText = findViewById(R.id.editText);
        ctof = findViewById(R.id.ctof);
        ftoc = findViewById(R.id.ftoc);
        ctok = findViewById(R.id.ctok);
        ktoc = findViewById(R.id.ktoc);
        ftok = findViewById(R.id.ftok);
        ktof = findViewById(R.id.ktof);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double input = new Double(editText.getText().toString());

                if(ctof.isChecked()) {
                    Double result = celToFar(input);
                    editText.setText(new Double(result).toString());
                }
                if(ftoc.isChecked()) {
                    Double result = farToCel(input);
                    editText.setText(new Double(result).toString());
                }
                if(ctok.isChecked()) {
                    Double result = celToKel(input);
                    editText.setText(new Double(result).toString());
                }
                if(ktoc.isChecked()) {
                    Double result = kelToCel(input);
                    editText.setText(new Double(result).toString());
                }
                if (ftok.isChecked()) {
                    Double result = farToKel(input);
                    editText.setText(new Double(result).toString());
                }
                if (ktof.isChecked()) {
                    Double result = kelToFar(input);
                    editText.setText(new Double(result).toString());
                }
               
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(null);
            }
        });

    }

    public static double celToFar(double cel) {
        return (cel * 9 / 5) + 32;
    }
    public static double farToCel(double far) {
        return (far - 32) * 5 / 9;
    }
    public  static double celToKel(double cel) {
        return cel + 273.15;
    }
    public static double kelToCel(double kel) {
        return kel - 273.15;
    }
    public static double farToKel(double far) {
        return ((far - 32) * 5 / 9) + 273;
    }
    public static double kelToFar(double kel)
    {
        return ((kel - 273) * 9 / 5) + 32;
    }
}