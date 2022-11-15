package com.google.baikt1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class CaSiAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<CaSi> arraylist;

    public CaSiAdapter(Context context, int layout, List<CaSi> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }


    @Override
    public int getCount() {
        return arraylist.size();
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
        LayoutInflater inflaler = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflaler.inflate(layout, null);
        CaSi caSi = arraylist.get(position);
        TextView textV2 = convertView.findViewById(R.id.tencasi);
        TextView textv3 = convertView.findViewById(R.id.nghedanh);
        TextView textv4 = convertView.findViewById(R.id.tenquocgia);
        TextView textv5 = convertView.findViewById(R.id.sosao);
        ImageView imageV = convertView.findViewById(R.id.imageHinh);

        textV2.setText(caSi.getTentacgia());
        textv3.setText(caSi.getNghedanh());
        textv4.setText(caSi.getTenquocgia());
        textv5.setText(caSi.getSosao());
        imageV.setImageResource(caSi.getHinh());

        return convertView;
    }
}
