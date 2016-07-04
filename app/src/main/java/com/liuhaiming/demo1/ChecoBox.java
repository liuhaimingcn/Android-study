package com.liuhaiming.demo1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;

/**
 * @author Created by liuhaiming on 16/6/28.
 */
public class ChecoBox extends ActionBarActivity {

    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        checkBox = (CheckBox) findViewById(R.id.box1);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Log.i("abd", buttonView.getText().toString());
                } else {
                    Log.i("bb", isChecked + "");
                }
            }
        });
    }
}
