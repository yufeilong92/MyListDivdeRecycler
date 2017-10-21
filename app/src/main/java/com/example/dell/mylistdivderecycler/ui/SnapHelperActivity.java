package com.example.dell.mylistdivderecycler.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;

import com.example.dell.mylistdivderecycler.R;
import com.example.dell.mylistdivderecycler.adapter.SnapHelperAdapter;

import java.util.ArrayList;

public class SnapHelperActivity extends AppCompatActivity {

    private RecyclerView mRecyclerview;
    private ArrayList stringName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        initView();
        bindViewData();
    }

    private void bindViewData() {
        ArrayList list = getStringName();
        SnapHelperAdapter adapter = new SnapHelperAdapter(list,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerview.setLayoutManager(linearLayoutManager);
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        linearSnapHelper.attachToRecyclerView(mRecyclerview);
        mRecyclerview.setAdapter(adapter);
    }

    private void initView() {
        mRecyclerview = (RecyclerView) findViewById(R.id.recyclerview);
    }

    public ArrayList getStringName() {
        if (stringName == null) {
            stringName = new ArrayList();
        } else {
            stringName.clear();
        }
        int namesize=20;
        for (int i = 0; i < namesize; i++) {
            stringName.add("美女"+i);
        }
        return stringName;
    }
}
