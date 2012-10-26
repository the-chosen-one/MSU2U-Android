package com.android.msu2u;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		Thread splashTimer = new Thread(){
			public void run(){
					try{ // Show Splash Screen for 5 secs
						int splashTimer = 0;
						while(splashTimer < 5000){
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
    
}
