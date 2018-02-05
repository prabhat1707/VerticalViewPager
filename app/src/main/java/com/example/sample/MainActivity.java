package com.example.sample;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.prabhat1707.verticalpager.VerticalViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private VerticalViewPager viewPager;
    private Context context;
    private List<String> stringList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        viewPager = findViewById(R.id.viewPager);
        addData();
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager(), context, stringList));
    }

    private void addData() {
        for (int i = 0; i < 8; i++) {
            stringList.add(String.valueOf(i));
        }
    }
}
