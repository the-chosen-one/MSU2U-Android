/***************************************************
 **				MSU2U Copyright (c) 2012		  **	
 **		Property of Midwerstern State University  **
 **				Computer Science Dept. 			  **
 ** ************************************************/ 

// This class is the main start up activity.
// Loads the Splash Screen for 2 seconds, launches the MainMenu Activity 

package com.android.msu2u;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		Thread splashTimer = new Thread(){
			public void run(){
					try{ // Show Splash Screen for 2 secs
						int splashTimer = 0;
						while(splashTimer < 2000){
							sleep(100);
							splashTimer+=100;
						}
						startActivity(new Intent("com.android.msu2u.CLEARSCREEN"));
					}
					catch(InterruptedException e){
						//TODO Auto-generated catch block
						e.printStackTrace();
					}
					finally{
						finish(); // Will Finish this Class (MainActivity)
					}
				}
			};
			splashTimer.start();
		}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

    
	
	/*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
*/
} // end MainActivity Class
