package com.pitipong.pitipong1997.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pitipong.pitipong1997.myapplication.R;
import com.pitipong.pitipong1997.myapplication.model.DaysInWeek;

import java.util.ArrayList;
import java.util.List;

public class adt_rv_cardview extends RecyclerView.Adapter<adt_rv_cardview.ViewHolder>{
    List<DaysInWeek> lst;

    public adt_rv_cardview(){
        lst = new ArrayList<DaysInWeek>();

        DaysInWeek d = new DaysInWeek();
        d.setNameInThai("วันจันทร์");
        d.setNameInEng("Monday");
        d.setDaysColor(R.mipmap.monday);
        lst.add(d);

        d = new DaysInWeek();
        d.setNameInThai("วันอังคาร");
        d.setNameInEng("Tuesday");
        d.setDaysColor(R.mipmap.tuesday);
        lst.add(d);

        d = new DaysInWeek();
        d.setNameInThai("วันพุธ");
        d.setNameInEng("Wednesday");
        d.setDaysColor(R.mipmap.wednesday);
        lst.add(d);

        d = new DaysInWeek();
        d.setNameInThai("วันพฤหัสบดี");
        d.setNameInEng("Thursday");
        d.setDaysColor(R.mipmap.thursday);
        lst.add(d);

        d = new DaysInWeek();
        d.setNameInThai("วันศุกร์");
        d.setNameInEng("Friday");
        d.setDaysColor(R.mipmap.friday);
        lst.add(d);

        d = new DaysInWeek();
        d.setNameInThai("วันเสาร์");
        d.setNameInEng("Saturday");
        d.setDaysColor(R.mipmap.saturday);
        lst.add(d);

        d = new DaysInWeek();
        d.setNameInThai("วันอาทิตย์");
        d.setNameInEng("Sunday");
        d.setDaysColor(R.mipmap.sunday);
        lst.add(d);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v =LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.rv_card,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        DaysInWeek d = lst.get(i);
        viewHolder.imgDaysColor.setImageResource(d.getDaysColor());
        viewHolder.tvNameInThai.setText(d.getNameInThai());
        viewHolder.tvNameInEng.setText(d.getNameInEng());
    }
    @Override
    public int getItemCount(){
        return lst.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgDaysColor;
        public TextView tvNameInThai;
        public TextView tvNameInEng;

        public ViewHolder(View v){
            super(v);
            imgDaysColor = (ImageView)
                    v.findViewById(R.id.imgDaysColor);
            tvNameInThai = (TextView)v.findViewById(R.id.tvNameInThai);
            tvNameInEng = (TextView)v.findViewById(R.id.tvNameInEng);
        }
    }
}
