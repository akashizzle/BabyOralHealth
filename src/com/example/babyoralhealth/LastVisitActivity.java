package com.example.babyoralhealth;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class LastVisitActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lastvisit);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lastvisit, menu);
		return true;
	}
	
	public void goBack(View view){
		onBackPressed();
	}

}