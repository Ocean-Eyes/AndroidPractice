package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_test = findViewById(R.id.lv_test);

        List<String> data = new ArrayList<>();
        ArrayAdapter<String> aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
        lv_test.setAdapter(aa);

        data.add("리스트뷰");
        data.add("테스트");
        data.add("완료");

        aa.notifyDataSetChanged();
    }
}