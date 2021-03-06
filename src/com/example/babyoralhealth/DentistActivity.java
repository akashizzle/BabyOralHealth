package com.example.babyoralhealth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
/*
 * 0 = No
 * 1 = Yes
 */
public class DentistActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dentist);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dentist, menu);
		return true;
	}
	
	public void goBack(View view){
		onBackPressed();
	}
	
	public void nextPage(View view){
		Intent nextIntent;
		int value = 1;
		
		RadioButton rad0 = (RadioButton) findViewById(R.id.radio0);
		
		if (rad0.isChecked()){
			value = 1;
			nextIntent = new Intent(this, LastVisitActivity.class);
		}
		else{
			value = 0;
			nextIntent = new Intent(this, TraitsActivity.class);
			nextIntent.putExtra("babyLastVisit", value);
		}
		
		int babyAge = (Integer) getIntent().getSerializableExtra("babyAge");
		int babyTeeth = (Integer) getIntent().getSerializableExtra("babyTeeth");
		nextIntent.putExtra("babyDentist", value);
		nextIntent.putExtra("babyTeeth", babyTeeth);
		nextIntent.putExtra("babyAge", babyAge);
		startActivity(nextIntent);
	}
}
