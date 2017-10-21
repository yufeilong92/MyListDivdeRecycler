package com.example.dell.mylistdivderecycler.ui;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.dell.mylistdivderecycler.R;
import com.example.dell.mylistdivderecycler.adapter.ReccyclerAdapter;

import java.util.ArrayList;

public class RecyclerWithLineActivity extends AppCompatActivity {

    private RecyclerView mRecyclerviewone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        mRecyclerviewone = (RecyclerView) findViewById(R.id.recyclerviewone);
        final ArrayList dataList = getDataList();
        ReccyclerAdapter adapter = new ReccyclerAdapter(dataList, this);
        mRecyclerviewone.setAdapter(adapter);
        mRecyclerviewone.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                int itemCount = state.getItemCount();
                if (itemCount == dataList.size())
                    return;
            }
        });
        mRecyclerviewone.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mRecyclerviewone.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    private ArrayList getDataList() {
        int a = 30;
        ArrayList aa = new ArrayList();
        for (int i = 0; i < a; i++) {
            aa.add("小龙" + i);
        }
        return aa;
    }

    ;
}
