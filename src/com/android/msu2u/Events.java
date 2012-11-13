/***************************************************
 **				MSU2U Copyright (c) 2012		  **	
 **		Property of Midwerstern State University  **
 **				Computer Science Dept. 			  **
 ** ************************************************/ 

// This class manages the events activity/screen 
package com.android.msu2u;

import com.actionbarsherlock.app.SherlockActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Events extends SherlockActivity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_events);
        
        TextView txtProduct = (TextView) findViewById(R.id.textView1);
        
        Intent i = getIntent();
        // getting attached intent data
        String menu = i.getStringExtra("button");
        // displaying selected button name
        txtProduct.setText(menu);
	} // end OnCreate	
} // end Events Class