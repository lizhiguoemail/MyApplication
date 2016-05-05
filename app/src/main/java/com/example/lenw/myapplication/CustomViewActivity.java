package com.example.lenw.myapplication;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lenw.myapplication.ui.DrawView;

import java.util.Timer;
import java.util.TimerTask;

public class CustomViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);
// 这是用代码的方式把自定义该布局加入到LinnearLayout中；现在 改为XML布局，直接在XML中使用DrawView
// 获取布局文件中的LinearLayout 容器
//        LinearLayout root= (LinearLayout) findViewById(R.id.root);
//        //创建DrawView组件
//        DrawView dv=new DrawView(this);
//        //设置自定义组件的最小宽度和高度
//        dv.setMinimumHeight(500);
//        dv.setMinimumWidth(300);
//        dv.setElevation(50);//3D效果，小球上看不出来
//        dv.setTranslationZ(100);
//        root.addView(dv);

    }
}
