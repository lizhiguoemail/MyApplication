 package com.example.lenw.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

 public class ButtonActivity extends AppCompatActivity {
    private ToggleButton toggle;
     private Switch sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        toggle= (ToggleButton) findViewById(R.id.tb);
        sw= (Switch) findViewById(R.id.swtest);
       final LinearLayout lltest= (LinearLayout) findViewById(R.id.lltest);
        CompoundButton.OnCheckedChangeListener listener=new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    lltest.setOrientation(1);
                    toggle.setChecked(true);
                    sw.setChecked(true);
                }else{
                    lltest.setOrientation(0);
                    toggle.setChecked(false);
                    sw.setChecked(false);
                }
            }
        };
        toggle.setOnCheckedChangeListener(listener);
        sw.setOnCheckedChangeListener(listener);
    }
}
