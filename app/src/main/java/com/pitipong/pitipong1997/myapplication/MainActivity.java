package com.pitipong.pitipong1997.myapplication;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout ;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final EditText edtInput = (EditText) findViewById(R.id.edtInput);
        FloatingTextButton button1 = (FloatingTextButton) findViewById(R.id.button1);
        FloatingTextButton button2 = (FloatingTextButton)findViewById(R.id.button2);
        FloatingTextButton button3 = (FloatingTextButton)findViewById(R.id.button3);
        Button ques = (Button)findViewById(R.id.ques);
        Button sevenday = (Button)findViewById(R.id.sevenday);
        Button btn_show_notification = (Button)findViewById(R.id.btn_show_notification) ;

        button1.setOnClickListener(new View.OnClickListener() {
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
        button2.setOnClickListener(new View.OnClickListener() {
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
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Formula.class);
                startActivity(i);
            }
        });
        ques.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),question.class);
                startActivity(i);
            }
        });
        sevenday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);
            }
        });

        btn_show_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNotification();
            }
        });

    }
    public void showNotification() {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/profile.php?id=100008357447266&ref=bookmarks"));
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        Notification notification =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("RezerBiw12")
                        .setContentText("ทกสอบ Android Notification :)")
                        .setAutoCancel(true)
                        .setContentIntent(pendingIntent)
                        .build();

        NotificationManager notificationManager =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(1000, notification);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
