package com.android.msu2u;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainMenu extends Activity implements OnClickListener{
	
	// Variables 
	private Button btnCampusMap; 
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Boolean customTitleSupported = requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_main);
		
		 if (customTitleSupported) {
	            getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.custom_title);
	            TextView tv = (TextView) findViewById(R.id.tv);
	            tv.setText("MSU2U Home");
	             
	            //ProgressBar titleProgressBar = (ProgressBar) findViewById(R.id.PB);
	            //titleProgressBar.setVisibility(ProgressBar.GONE);
	        }
		 
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
