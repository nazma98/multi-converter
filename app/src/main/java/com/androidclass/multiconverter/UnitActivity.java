package com.androidclass.multiconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class UnitActivity extends AppCompatActivity {

    EditText editText;
    Button convert, clear;
    RadioButton kmtoml, mltokm, mtoin, intom, fttoin, intoft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);

        convert = findViewById(R.id.convert);
        clear = findViewById(R.id.clear);
        editText = findViewById(R.id.editText);
        kmtoml = findViewById(R.id.kmtoml);
        mltokm = findViewById(R.id.mltokm);
        mtoin = findViewById(R.id.mtoin);
        intom = findViewById(R.id.intom);
        fttoin = findViewById(R.id.fttoin);
        intoft = findViewById(R.id.intoft);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double input = new Double(editText.getText().toString());

                if (kmtoml.isChecked()) {
                    Double result = kmToMl(input);
                    editText.setText(new Double(result).toString());
                }
                if (mltokm.isChecked()) {
                    Double result = mlToKm(input);
                    editText.setText(new Double(result).toString());
                }
                if (mtoin.isChecked()) {
                    Double result = mToIn(input);
                    editText.setText(new Double(result).toString());
                }
                if (intom.isChecked()) {
                    Double result = inToM(input);
                    editText.setText(new Double(result).toString());
                }
                if (fttoin.isChecked()) {
                    Double result = ftToIn(input);
                    editText.setText(new Double(result).toString());
                }
                if (intoft.isChecked()) {
                    Double result = inToFt(input);
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

    public static double kmToMl(double km) {
        return km * 0.6213688756;
    }
    public static double mlToKm(double km) {
        return km / 0.6213688756;
    }
    public static double mToIn(double m) {
        return m * 39.37007874;
    }
    public static double inToM(double km) {
        return km / 39.37007874;
    }
    public static double ftToIn(double km) {
        return km * 12;
    }
    public static double inToFt(double km) {
        return km / 12;
    }

}