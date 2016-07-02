package com.liuhaiming.demo1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

/**
 * @author Created by liuhaiming on 16/6/28.
 */
public class MainActivity7 extends ActionBarActivity {

    private AutoCompleteTextView autoCompleteTextView;
    private MultiAutoCompleteTextView multiAutoCompleteTextView;

    private String[] data = {"beijing1", "beijing2", "beijing3", "shanghai1", "shanghai2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.auto);
        multiAutoCompleteTextView = (MultiAutoCompleteTextView) findViewById(R.id.multi);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        autoCompleteTextView.setAdapter(adapter);
        multiAutoCompleteTextView.setAdapter(adapter);

        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
