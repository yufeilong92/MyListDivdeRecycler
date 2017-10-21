package com.example.dell.mylistdivderecycler.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.dell.mylistdivderecycler.R;
import com.example.dell.mylistdivderecycler.adapter.ReccyclerAdapter;

import java.util.ArrayList;

public class RecyclerNoLineActivity extends AppCompatActivity {

    private RecyclerView mRecyclerview;
    private ArrayList mDatalist;
    private ReccyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void startintent(View view){
         startActivity(new Intent(RecyclerNoLineActivity.this,RecyclerWithLineActivity.class));
    }
    private void initView() {
        mDatalist= getListData();
        mRecyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new ReccyclerAdapter(mDatalist, this);
        mRecyclerview.setAdapter(adapter);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));


    }

    private ArrayList getListData() {
        int b = 30;
        mDatalist = new ArrayList();
        for (int i = 0; i < b; i++) {
            mDatalist.add("小明" + i);
        }
        return mDatalist;
    }
}
