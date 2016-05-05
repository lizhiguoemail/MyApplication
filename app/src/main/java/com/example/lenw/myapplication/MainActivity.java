package com.example.lenw.myapplication;

import android.app.ActionBar;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
    private LinearLayout main;
    int[] images=new int[]{
            R.drawable.java,
            R.drawable.javaee,
            R.drawable.swift,
            R.drawable.ajax,
            R.drawable.html   };
    int currentImg=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       main= (LinearLayout) this.findViewById(R.id.main);
       final ImageView iv=new ImageView(this);
        main.addView(iv);
        iv.setImageResource(images[0]);
//        iv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setImageResource(images[++currentImg % images.length]);

            }
        });
    }
}
