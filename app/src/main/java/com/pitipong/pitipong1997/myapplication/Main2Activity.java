package com.pitipong.pitipong1997.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.pitipong.pitipong1997.myapplication.adapter.adt_rv_cardview;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RecyclerView rv =(RecyclerView)findViewById(R.id.recyclerview);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        RecyclerView.Adapter adt = new adt_rv_cardview();
        rv.setAdapter(adt);
    }
}
