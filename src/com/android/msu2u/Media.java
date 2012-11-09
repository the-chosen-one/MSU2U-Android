package com.android.msu2u;

import com.actionbarsherlock.app.SherlockActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Media extends SherlockActivity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_campusmap);
        
        TextView txtProduct = (TextView) findViewById(R.id.textView1);
        
        Intent i = getIntent();
        // getting attached intent data
        String menu = i.getStringExtra("button");
        // displaying selected button name
        txtProduct.setText(menu);
	}
}