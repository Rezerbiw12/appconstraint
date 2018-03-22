package com.pitipong.pitipong1997.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle result =getIntent().getExtras();
        String txtResultValue = result.getString("RESULT");

        TextView txtResult =(TextView)findViewById(R.id.textView3);
        txtResult.setText(txtResultValue );
    }
}
