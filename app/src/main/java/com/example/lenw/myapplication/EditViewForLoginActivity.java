package com.example.lenw.myapplication;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class EditViewForLoginActivity extends BaseActivity {
    private RadioGroup rg;
    private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_view_for_login);
        rg= (RadioGroup) this.findViewById(R.id.rg);
        show= (TextView) this.findViewById(R.id.show);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String tip=checkedId==R.id.male?"你选择的性别是男人":"你选择的性别是女人";
                show.setText(tip);
            }
        });
    }
}
