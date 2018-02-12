package com.pitipong.pitipong1997.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtInput = (EditText) findViewById(R.id.edtInput);
        Button cmdCheck1 = (Button) findViewById(R.id.cmdCheck1);
        Button cmdCheck2 = (Button)findViewById(R.id.cmdCheck2);


        cmdCheck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtInput.getText().toString().trim().equals("")) {
                    edtInput.setError("กรุณาคีย์ตัวเลขก่อนจ๊ะ!!");
                }
                 else{
                        Double tempValue = Double.parseDouble(edtInput.getText().toString().trim());
                        Double tempResult;
                        tempResult = ((tempValue*9)/5)+32;
                        Intent i = new Intent(getApplicationContext(),ResultActivity.class);
                        i.putExtra("RESULT",String.valueOf(tempResult));
                        startActivity(i);
                }
            }
        });
        cmdCheck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtInput.getText().toString().trim().equals("")) {
                    edtInput.setError("กรุณาคีย์ตัวเลขก่อนจ๊ะ!!");
                }
                else{
                    Double tempValue = Double.parseDouble(edtInput.getText().toString().trim());
                    Double tempResult;
                    tempResult = ((tempValue-32)*5)/9;
                    Intent i = new Intent(getApplicationContext(),ResultActivity.class);
                    i.putExtra("RESULT",String.valueOf(tempResult));
                    startActivity(i);
                }
            }
        });
    }
}
