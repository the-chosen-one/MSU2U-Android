package com.android.msu2u;

import com.actionbarsherlock.app.SherlockActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainMenu extends SherlockActivity{ //implements OnClickListener
	
	// Variables 
	//private Button btnCampusMap; 
	 private ListView listView;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 
		ButtonList buttonList_data[] = new ButtonList[]{
				new ButtonList(R.drawable.map,"Campus Map", "Find your way around campus"),
				new ButtonList(R.drawable.contact,"Directory", "Contact Faculty and Staff"),
				new ButtonList(R.drawable.calender,"Events", "View and Add MSU events to your calender"),
				new ButtonList(R.drawable.facebook,"Media", "News social media and images")
		};
		
		ButtonListAdapter adapter = new ButtonListAdapter(this,R.layout.list_row, buttonList_data);
		listView = (ListView)findViewById(R.id.listView);
		listView.setAdapter(adapter);
		
		
		// Set up button Listener 
		 //btnCampusMap = (Button) findViewById(R.id.btn_campusmap);
		 //btnCampusMap.setOnClickListener(this);
	}
	
	// On Click Event Handler - Responds to Button Press Events 
    // ================================================================
    /*public void onClick(View v) {
        // If "Hit Me" Button is Pressed
        if(v.getId() == R.id.btn_campusmap){   
        	Toast.makeText(getApplicationContext(), "Not Ready Yet", Toast.LENGTH_SHORT).show();
        }
    } */

}
