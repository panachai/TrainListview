package com.example.killercon.trainlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter  {//จำนวน Array ที่ใช้กำหนดเป็นข้อมูล
    Context mContext;
    String[] strName;
    int[] resId;

    public CustomAdapter(Context context, String[] strName, int[] resId) {
        this.mContext= context;
        this.strName = strName;
        this.resId = resId;
    }

    public int getCount() {
        return strName.length;
    }

    public Object getItem(int position) {//ไว้ดึง Object  ใดๆแล้วแต่กำหนด เช่น listview
        return null;
    }

    public long getItemId(int position) {//get ผ่าน id
        return 0;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater mInflater =
                (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null)
            view = mInflater.inflate(R.layout.listview_row, parent, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        textView.setText(strName[position]);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageView1);
        imageView.setBackgroundResource(resId[position]);

        return view;
    }

}
