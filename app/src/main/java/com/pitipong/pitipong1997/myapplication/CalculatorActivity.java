package com.pitipong.pitipong1997.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class CalculatorActivity extends AppCompatActivity {


    float result_num,num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        final EditText edtInput1 = (EditText) findViewById(R.id.edtInput1);
        final EditText edtInput2 = (EditText) findViewById(R.id.edtInput2);
        FloatingTextButton add  = (FloatingTextButton)findViewById(R.id.bt1);
        FloatingTextButton subtract = (FloatingTextButton)findViewById(R.id.bt2);
        FloatingTextButton divide = (FloatingTextButton)findViewById(R.id.bt3);
        FloatingTextButton multiply = (FloatingTextButton)findViewById(R.id.bt4);
        final TextView TextResult  = (TextView)findViewById(R.id.TextResult);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(edtInput1.getText().toString());
                num2 = Integer.parseInt(edtInput2.getText().toString());
                result_num = num1+num2;
                TextResult.setText(String.valueOf(result_num));

            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(edtInput1.getText().toString());
                num2 = Integer.parseInt(edtInput2.getText().toString());
                result_num = num1-num2;
                TextResult.setText(String.valueOf(result_num));

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(edtInput1.getText().toString());
                num2 = Integer.parseInt(edtInput2.getText().toString());
                result_num = num1*num2;
                TextResult.setText(String.valueOf(result_num));

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(edtInput1.getText().toString());
                num2 = Integer.parseInt(edtInput2.getText().toString());
                result_num = num1/num2;
                TextResult.setText(String.valueOf(result_num));

            }
        });
    }
}
