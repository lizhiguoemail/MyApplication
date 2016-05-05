package com.example.lenw.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;

public class GridLayoutActivity extends Activity {
    String[] chars=new String[]{
      "7","8","9","÷",
      "4","5","6","×",
      "1","2","3","-",
      ".","0","=","+"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
        GridLayout gl= (GridLayout) findViewById(R.id.root);
        for (int i=0;i<chars.length;i++){
            System.out.println("i="+i);
            Button b=new Button(this);
            b.setText(chars[i]);
            b.setTextSize(40);
            b.setPadding(5,35,5,35);

            //该组件所在的行
            System.out.println("该组件所在的行:"+i+"/4 +2="+(i/4 +2));
            GridLayout.Spec rowSpec=GridLayout.spec(i/4 +2);
            //该组件所在的列
            System.out.println("该组件所在的列:"+i+"%4="+(i%4));
            GridLayout.Spec columnSpec=GridLayout.spec(i%4);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec,columnSpec);
            b.setLayoutParams(params );
            gl.addView(b);
        }
    }
}
