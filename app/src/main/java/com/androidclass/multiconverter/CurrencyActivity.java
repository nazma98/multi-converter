package com.androidclass.multiconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class CurrencyActivity extends AppCompatActivity {

    Button convert, clear;
    EditText editText;
    RadioButton btou, utob, btoi, itob, btoe, etob, btoj, jtob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        convert = findViewById(R.id.convert);
        clear = findViewById(R.id.clear);
        editText = findViewById(R.id.editText);
        btou = findViewById(R.id.btou);
        utob = findViewById(R.id.utob);
        btoi = findViewById(R.id.btoi);
        itob = findViewById(R.id.itob);
        btoe = findViewById(R.id.btoe);
        etob = findViewById(R.id.etob);
        btoj = findViewById(R.id.btoj);
        jtob = findViewById(R.id.jtob);


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double input = new Double(editText.getText().toString());

                if(utob.isChecked()) {
                    Double result = usdToBdt(input);
                    editText.setText(new Double(result).toString());
                }
                if(btou.isChecked()) {
                    Double result = bdtToUsd(input);
                    editText.setText(new Double(result).toString());
                }
                if(btoi.isChecked()) {
                    Double result = bdtToInr(input);
                    editText.setText(new Double(result).toString());
                }
                if(itob.isChecked()) {
                    Double result = inrToBdt(input);
                    editText.setText(new Double(result).toString());
                }
                if(btoe.isChecked()) {
                    Double result = bdtToEur(input);
                    editText.setText(new Double(result).toString());
                }
                if(etob.isChecked()) {
                    Double result = eurToBdt(input);
                    editText.setText(new Double(result).toString());
                }
                if(jtob.isChecked()) {
                    Double result = jpyToBdt(input);
                    editText.setText(new Double(result).toString());
                }
                if(btoj.isChecked()) {
                    Double result = bdtToJpy(input);
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

    public static double usdToBdt(Double usd) {
        return usd * 84.77;
    }
    public static double inrToBdt(Double inr) {
        return inr * 1.17;
    }
    public static double eurToBdt(Double eur) {
        return  eur * 100.98;
    }
    public static double jpyToBdt(Double jpy) {
        return jpy * 0.78;
    }
    public static double bdtToUsd(Double bdt) {
        return bdt / 84.5;
    }
    public static double bdtToInr(Double bdt) {
        return bdt / 1.17;
    }
    public static double bdtToEur(Double bdt) {
        return bdt / 100.98;
    }
    public static double bdtToJpy(Double bdt) {
        return bdt / 0.78;
    }

}