package com.example.hp.techagree;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hp on 11/22/2019.
 */
public class CustomeAdapter extends BaseAdapter {

    Context context;
    String[] str;
    int[]img;
    LayoutInflater inflater;

    CustomeAdapter(Context context,String[] str,int[]img)
    {
        this.context =context;
        this.str = str;
        this.img = img;
        inflater = (LayoutInflater.from(context));
    }
    @Override
    public int getCount() {
        return str.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       convertView = inflater.inflate(R.layout.rowlayout,null);
        TextView textView = convertView.findViewById(R.id.summer_txt);
        textView.setText(str[position]);
        ImageView imageView = convertView.findViewById(R.id.summer_icon);
        imageView.setImageResource(img[position]);
        return convertView;
    }
}
