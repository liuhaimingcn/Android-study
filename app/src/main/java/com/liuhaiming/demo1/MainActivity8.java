package com.liuhaiming.demo1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ToggleButton;

/**
 * @author Created by liuhaiming on 16/6/28.
 */
public class MainActivity8 extends ActionBarActivity implements CompoundButton.OnCheckedChangeListener {

    private ToggleButton toggleButton;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        toggleButton = (ToggleButton) findViewById(R.id.toggle);
        imageButton = (ImageButton) findViewById(R.id.image);

        toggleButton.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        int id = buttonView.getId();
        if(toggleButton.getId() == id) {
            System.out.println("id:" + id);
        }
        imageButton.setBackgroundResource(isChecked ? R.drawable.on : R.drawable.off);
    }
}
