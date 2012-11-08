package com.android.msu2u;

import com.actionbarsherlock.app.SherlockActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainMenu extends SherlockActivity implements OnClickListener{
	
	// Variables 
	private Button btnCampusMap; 
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//TextView tv = (TextView) findViewById(R.id.tv);
	    //tv.setText("MSU2U");
		 
		 // Set up button Listener 
		 btnCampusMap = (Button) findViewById(R.id.btn_campusmap);
		 btnCampusMap.setOnClickListener(this);
	}
	
	// On Click Event Handler - Responds to Button Press Events 
    // ================================================================
    public void onClick(View v) {
        // If "Hit Me" Button is Pressed
        if(v.getId() == R.id.btn_campusmap){   
        	Toast.makeText(getApplicationContext(), "Not Ready Yet", Toast.LENGTH_SHORT).show();
        }
    }

}
