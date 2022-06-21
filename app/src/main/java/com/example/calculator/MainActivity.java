package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirstValue , etSecondValue;
    TextView tvAns;
    Button add, subtraction, multiply ,divison;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Calling the views through id
        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        subtraction = findViewById(R.id.btnSub);
        multiply = findViewById(R.id.btnMul);
        divison= findViewById(R.id.btnDiv);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second , ans;
                first = Integer.parseInt(etFirstValue.getText().toString());
                second = Integer.parseInt(etSecondValue.getText().toString());

                ans = first + second;
                tvAns.setText(ans);
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second , ans;
                first = Integer.parseInt(etFirstValue.getText().toString());
                second = Integer.parseInt(etSecondValue.getText().toString());

                ans = first - second;
                tvAns.setText(ans);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second , ans;
                first = Integer.parseInt(etFirstValue.getText().toString());
                second = Integer.parseInt(etSecondValue.getText().toString());

                ans = first * second;
                tvAns.setText(ans);
            }
        });

        divison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second , ans;
                first = Integer.parseInt(etFirstValue.getText().toString());
                second = Integer.parseInt(etSecondValue.getText().toString());

                ans = first / second;
                tvAns.setText(ans);
            }
        });
    }
}