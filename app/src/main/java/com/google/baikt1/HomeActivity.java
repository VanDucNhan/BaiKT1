package com.google.baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ListView listView;
    CaSiAdapter adapter;
    ArrayList<CaSi> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listView = findViewById(R.id.listcasi);
        arrayList = new ArrayList<>();
        arrayList.add(new CaSi("Nguyễn Thanh Tùng","Việt Nam","(Sơn Tùng MTP)","5",R.drawable.sontung));
        arrayList.add(new CaSi("Nguyễn Đức Phúc","Việt Nam","(không có)","5",R.drawable.ducphuc));
        arrayList.add(new CaSi("Trịnh Trần Phương Tuấn","Việt Nam","(jack 5 củ)","1",R.drawable.jack));
        arrayList.add(new CaSi("Reynard Silva","Mỹ","(không có)","4",R.drawable.reynardsilva));
        arrayList.add(new CaSi("Aurora","Mỹ","(không có)","3",R.drawable.aurora));
        arrayList.add(new CaSi("Mesto","Mỹ","(không có)","4.5",R.drawable.mesto));
        arrayList.add(new CaSi("Slander","Mỹ","(không có)","2.5",R.drawable.slander));


        adapter = new CaSiAdapter(HomeActivity.this,R.layout.activity_item,arrayList);
        listView.setAdapter(adapter);
    }
}