package com.pitipong.pitipong1997.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.Button;

public class question extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        final RadioButton bt1 =(RadioButton)findViewById(R.id.radioButton);
        final RadioButton bt2 =(RadioButton)findViewById(R.id.radioButton2);
        final RadioButton bt3 =(RadioButton)findViewById(R.id.radioButton3);
        final RadioButton bt4 =(RadioButton)findViewById(R.id.radioButton4);
        Button btq =(Button)findViewById(R.id.button55);

        btq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(question.this,

                        "ข้อที่ 1 : " + bt1.isChecked() + "\n"+
                        "ข้อที่ 2 : " + bt2.isChecked() + "\n" +
                        "ข้อที่ 3 : " + bt3.isChecked()+ "\n"+
                        "ข้อที่ 4 : " + bt4.isChecked(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
