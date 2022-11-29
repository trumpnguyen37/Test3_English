package com.example.test3_english;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EnglishActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    int pos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        final ArrayList<StaticRvModel> item = new ArrayList<>();




        item.add(new StaticRvModel(R.drawable.logarit, "Hiện tại đơn", 0));
        item.add(new StaticRvModel(R.drawable.luythua, "Hiện tại tiếp diễn", 0));
        item.add(new StaticRvModel(R.drawable.factorial, "Hiện tại hoàn thành", 0));
        item.add(new StaticRvModel(R.drawable.logarit, "Qúa khứ đơn",0));
        item.add(new StaticRvModel(R.drawable.luythua, "Qúa khứ tiếp diễn",0));
        item.add(new StaticRvModel(R.drawable.factorial, "Qúa khứ hoàn thành",0));

        recyclerView = findViewById(R.id.rv_1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        StaticRvAdapter staticRvAdapter = new StaticRvAdapter(this,item);
        recyclerView.setAdapter(staticRvAdapter);

    }

}