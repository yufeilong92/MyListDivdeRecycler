package com.example.dell.mylistdivderecycler.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.Toast;

import com.example.dell.mylistdivderecycler.R;

public class Main4Activity extends AppCompatActivity {

    private TabWidget mTabs;
    private LinearLayout mTab1;
    private LinearLayout mTab2;
    private LinearLayout mTab3;
    private FrameLayout mTabcontent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        initView();
        TabHost  mTabhost = (TabHost) findViewById(R.id.tabhost);
        mTabhost.setup();
        mTabhost.addTab(mTabhost.newTabSpec("测试tab1")
                .setIndicator("测试tab1",getResources().getDrawable(R.drawable.line))
                .setContent(R.id.two));
        mTabhost.addTab(mTabhost.newTabSpec("测试tab2")
                .setIndicator("测试tab2",getResources().getDrawable(R.drawable.line))
                .setContent(R.id.two));
        mTabhost.addTab(mTabhost.newTabSpec("测试tab3")
                .setIndicator("测试tab3",getResources().getDrawable(R.drawable.line))
                .setContent(R.id.three));
        mTabhost.setBackgroundColor(Color.GREEN);
        mTabhost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String s) {
                Toast.makeText(Main4Activity .this,""+s,Toast.LENGTH_SHORT).show();
            }
        });
//
//        TabHost th=(TabHost)findViewById(R.id.tabhost);
//        th.setup();            //初始化TabHost容器
//
//        //在TabHost创建标签，然后设置：标题／图标／标签页布局
//        th.addTab(th.newTabSpec("tab1").setIndicator("标签1",getResources().getDrawable(R.drawable.line)).setContent(R.id.tab1));
//        th.addTab(th.newTabSpec("tab2").setIndicator("标签2",null).setContent(R.id.tab2));
//        th.addTab(th.newTabSpec("tab3").setIndicator("标签3",null).setContent(R.id.tab3));

    }

    private void initView() {
        mTabs = (TabWidget) findViewById(android.R.id.tabs);
        mTabcontent = (FrameLayout) findViewById(android.R.id.tabcontent);

    }
}
