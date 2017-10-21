package com.example.dell.mylistdivderecycler.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.example.dell.mylistdivderecycler.R;

public class Main3Activity extends AppCompatActivity {

    private WebView mWbContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initView();
        loadData();
    }

    private void loadData() {
        String customHtml = "<html>\n" +
                "\n" +
                "\t<head>\n" +
                "\t\t<meta charset=\"utf-8\" />\n" +
                "\t\t<title>测试数据</title></head>" +
                "\t<body bgcolor=\"beige\">\n" +
                "\t\t<p align=\"center\">测试是标题</p>\n" +
                "\t\t<hr />\n" +
                "\t\t<label> 发布单位:</label>\n" +
                "\t\t<span id=\"span1\">贵州省</span>\n" +
                "\t\t<div style=\"float: right;\">\n" +
                "\t\t\t<label>发布时间:</label>\n" +
                "\t\t\t<span id=\"span1\">2017-10-10</span>\n" +
                "\t\t</div>\n" +
                "\t\t<br />\n" +
                "\n" +
                "\t\t<br />\n" +
                "\t\t<span>\n" +
                "\t\t\t测试内容看看看那卡看你那看哪那可能看\n" +
                "\t\t</span>\n" +
                "\t</body>\n" +
                "\n" +
                "</html>";
        mWbContent.loadData(customHtml, "text/html", "UTF-8");
    }

    private void initView() {
        mWbContent = (WebView) findViewById(R.id.wb_content);
    }
}
