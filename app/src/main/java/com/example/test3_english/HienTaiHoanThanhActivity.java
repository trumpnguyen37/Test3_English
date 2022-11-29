package com.example.test3_english;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class HienTaiHoanThanhActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    Button btnAdd;
    EditText editText;
    int pos;

    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hien_tai_hoan_thanh);

        Intent intent = getIntent();
        pos = intent.getIntExtra("pos", 0);

        final ArrayList<StaticRvModel> item = new ArrayList<>();

        listView = findViewById(R.id.listview);
        btnAdd = findViewById(R.id.btnThucHien);
        editText = findViewById(R.id.edittext);


        list = new ArrayList<String>();
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1, list);






        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();

                list.add(name);
                listView.setAdapter(arrayAdapter);
                arrayAdapter.notifyDataSetChanged();
            }
        });
    }
}