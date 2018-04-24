package com.pitipong.pitipong1997.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.app.AlertDialog;
import android.widget.CheckBox;
import android.widget.Button;

public class Formula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula);
        final AlertDialog.Builder adb = new AlertDialog.Builder(this);
        final CheckBox chkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        final Button btn1 = (Button)findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog ad = adb.create();

                if(chkBox1.isChecked() == true)

                {
                    ad.setMessage("ทำการส่งข้อมูลยืนยันการสั่งไปยังลูกค้า");
                    ad.show();
                }
                else
                {
                    ad.setMessage("กรุณาอ่านข้อมูลให้ครบถ้วนแล้วติ๊กยอมรับด้วย!!");
                    ad.show();

                }
            }

        });

    }
}
