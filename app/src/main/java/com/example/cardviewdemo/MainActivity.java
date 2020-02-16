package com.example.cardviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Msg> datas = new ArrayList<>();
        List<Msg> list = MsgLab.generateData();
        datas.addAll(list);
        datas.addAll(list);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(new MsgAdapter(this, datas));
    }
}
