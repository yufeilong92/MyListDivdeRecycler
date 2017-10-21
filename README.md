#MyListDivdeRecycler

*设置内容去除html标签

        textView.setText(Html.fromHtml(content.getTitle()).toString());

*设置自定义官方recyclerview 中分割线

      //使用官方默认的
       mRecyclerviewone.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
       //修改默认颜色
       <style name="listdiverline" parent="Theme.AppCompat.Light.DarkActionBar">
           <!-- Customize your theme here. -->
           <item name="colorPrimary">@color/colorPrimary</item>
           <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
           <item name="colorAccent">@color/colorAccent</item>
           <item name="android:listDivider">@drawable/line</item>
       </style>

*设置tablayout

     //穿件tabhos布局
    <TabHost
         android:id="@+id/tabhost"
         android:layout_width="match_parent"
         android:layout_height="match_parent">

         <LinearLayout
             android:layout_width="match_parent"
             android:layout_height="match_parent"
             android:orientation="vertical">

             <TabWidget
                 android:id="@android:id/tabs"
                 android:layout_width="match_parent"
                 android:layout_height="wrap_content" />

             <FrameLayout
                 android:id="@android:id/tabcontent"
                 android:layout_width="match_parent"
                 android:layout_height="match_parent">

                 <LinearLayout
                     android:id="@+id/one"
                     android:layout_width="match_parent"
                     android:layout_height="match_parent"
                     android:orientation="vertical">
                     <TextView
                         android:text="ssssss"
                         android:layout_width="match_parent"
                         android:layout_height="wrap_content" />
                 </LinearLayout>

                 <LinearLayout
                     android:id="@+id/two"
                     android:layout_width="match_parent"
                     android:layout_height="match_parent"
                     android:orientation="vertical">
                     <TextView
                         android:text="ssssss"
                         android:layout_width="match_parent"
                         android:layout_height="wrap_content" />
                 </LinearLayout>

                 <LinearLayout
                     android:id="@+id/three"
                     android:layout_width="match_parent"
                     android:layout_height="match_parent"
                     android:orientation="vertical">
                    <TextView
                        android:text="2222"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content" />
                 </LinearLayout>
             </FrameLayout>
         </LinearLayout>
     </TabHost>
     //在activity中创建tabhos容器
      TabHost  mTabhost = (TabHost) findViewById(R.id.tabhost);
             mTabhost.setup();
      //在设置其名字，id,图标，背景
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

*Recylview中使每个item 滑动一半时可以自动局屏幕中间

    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerview.setLayoutManager(linearLayoutManager);
        //重点在设置SnapHelper
         LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        linearSnapHelper.attachToRecyclerView(mRecyclerview);
        mRecyclerview.setAdapter(adapter);