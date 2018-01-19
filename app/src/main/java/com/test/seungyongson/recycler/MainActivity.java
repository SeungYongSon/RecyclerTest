package com.test.seungyongson.recycler;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.test.seungyongson.recycler.recycler.Adapter;
import com.test.seungyongson.recycler.recycler.Student;

public class MainActivity extends AppCompatActivity {

    Adapter mAdapter;
    RecyclerView mRecylerView;
    LinearLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        mAdapter = new Adapter();
        mRecylerView = (RecyclerView) findViewById(R.id.recyler);
        mRecylerView.setHasFixedSize(true);
        mRecylerView.setAdapter(mAdapter);
        mLayoutManager = new LinearLayoutManager(this);
        mRecylerView.setLayoutManager(mLayoutManager);
        mRecylerView.setItemAnimator(new DefaultItemAnimator());

        addData();
    }

    public void addData(){
        for(int i = 0; i < 50; i++){
            Student s1 = new Student();
            s1.setName("Name: " + i);
            s1.setScore("Score : " + i);
            mAdapter.add(s1);
        }
    }
}
