package com.example.bimcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class activity_main extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView result = findViewById(R.id.result);
        EditText weight = findViewById(R.id.weight);
        EditText heightft = findViewById(R.id.heightft);
        EditText heightin = findViewById(R.id.heightin);
        Button calculate = findViewById(R.id.calculate);
        calculate.setOnClickListener(view -> {
            double w = Double.parseDouble(weight.getText().toString());
            double hft = Double.parseDouble(heightft.getText().toString());
            double hin = Double.parseDouble(heightin.getText().toString());
            double totalIn = hft * 12 + hin;
            double totalCm = totalIn * 2.53;
            double totalM = totalCm / 100;
            double bmi = w / (totalM * totalM);
            if (bmi > 25) {
                result.setText("Overweight");
                result.setTextColor(getResources().getColor(R.color.red));
            } else if (bmi < 18.5) {
                result.setText("Underweight");
                result.setTextColor(getResources().getColor(R.color.blue));
            } else {
                result.setText("Normal");
                result.setTextColor(getResources().getColor(R.color.green));
            }

        });




    }
}
