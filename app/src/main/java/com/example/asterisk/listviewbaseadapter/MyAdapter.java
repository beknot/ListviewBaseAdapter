package com.example.asterisk.listviewbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

class MyAdapter extends BaseAdapter {
    Context c;
    String[] myn,myadd,myph,mysy;
    public MyAdapter(MainActivity mainActivity, String[] name, String[] address, String[] phone, String[] symbolno) {
        c = mainActivity;
        myn = name;
        myadd = address;
        myph = phone;
        mysy = symbolno;
    }

    @Override
    public int getCount() {
        return myn.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    convertView = LayoutInflater.from(c).inflate(R.layout.newlayout,null);
        TextView name=convertView.findViewById(R.id.tv1);
        TextView address=convertView.findViewById(R.id.tv2);
        TextView phone=convertView.findViewById(R.id.tv3);
        TextView symbol=convertView.findViewById(R.id.tv4);
        name.setText(String.valueOf(myn[position]));
        address.setText(String.valueOf(myadd[position]));
        phone.setText(String.valueOf(myph[position]));
        symbol.setText(String.valueOf(mysy[position]));
        return convertView;
    }
}
