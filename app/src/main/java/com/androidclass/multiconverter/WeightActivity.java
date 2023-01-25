package com.androidclass.multiconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class WeightActivity extends AppCompatActivity {
    EditText editText;
    Button convert, clear;
    RadioButton ktomt, mttok, ktop, ptok, ktoon, ontok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        convert = findViewById(R.id.convert);
        clear = findViewById(R.id.clear);
        editText = findViewById(R.id.editText);
        ktomt = findViewById(R.id.ktomt);
        mttok = findViewById(R.id.mttok);
        ktop = findViewById(R.id.ktop);
        ptok = findViewById(R.id.ptok);
        ktoon = findViewById(R.id.ktoon);
        ontok = findViewById(R.id.ontok);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double input = new Double(editText.getText().toString());

                if (ktomt.isChecked()) {
                    Double result = kgToMton(input);
                    editText.setText(new Double(result).toString());
                }
                if (mttok.isChecked()) {
                    Double result = mtonToKg(input);
                    editText.setText(new Double(result).toString());
                }
                if (ktop.isChecked()) {
                    Double result = kgToPnd(input);
                    editText.setText(new Double(result).toString());
                }
                if (ptok.isChecked()) {
                    Double result = pndToKg(input);
                    editText.setText(new Double(result).toString());
                }
                if (ktoon.isChecked()) {
                    Double result = kgToOnc(input);
                    editText.setText(new Double(result).toString());
                }
                if (ontok.isChecked()) {
                    Double result = oncToKg(input);
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

    public static double kgToMton(double kg) {
        return kg * 0.001;
    }
    public static double mtonToKg(double kg) {
        return kg * 1000;
    }
    public static double kgToPnd(double kg) {
        return kg * 2.2046244202;
    }
    public static double pndToKg(double kg) {
        return kg * 0.453592;
    }
    public static double kgToOnc(double kg) {
        return kg * 35.273990723;
    }
    public static double oncToKg(double kg) {
        return kg / 35.273990723;
    }

}