package com.liuhaiming.demo1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.RadioGroup;

/**
 * @author Created by liuhaiming on 16/6/28.
 */
public class Radio extends ActionBarActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.radioButton1:
                Log.i("tag", "男被选中！");
                break;
            case R.id.radioButton2:
                Log.i("tag", "女被选中！");
                break;
            default:
                Log.i("tag", "no !!!");
                break;
        }
    }
}
