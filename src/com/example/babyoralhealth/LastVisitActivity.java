package com.example.babyoralhealth;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
/*
 * 0 = Never seen dentist
 * 1 = Under 6 months
 * 2 = Under 1 year
 * 3 = Under 2 years
 * 4 = Over 2 years
 */
public class LastVisitActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_last_visit);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.last_visit, menu);
		return true;
	}
	
	public void goBack(View view){
		onBackPressed();
	}
	
	public void nextPage(View view){
		
		int value = 1;
		
		RadioButton rad0 = (RadioButton) findViewById(R.id.radio0);
		RadioButton rad1 = (RadioButton) findViewById(R.id.radio1);
		RadioButton rad2 = (RadioButton) findViewById(R.id.radio2);
		RadioButton rad3 = (RadioButton) findViewById(R.id.radio3);
		
		if (rad0.isChecked()){
			value = 1;
		}
		else if (rad1.isChecked()){
			value = 2;
		}
		else if (rad2.isChecked()){
			value = 3;
		}
		else if (rad3.isChecked()){
			value = 4;
		}
		Intent nextIntent = new Intent(this, TraitsActivity.class);
		int babyAge = (Integer) getIntent().getSerializableExtra("babyAge");
		int babyTeeth = (Integer) getIntent().getSerializableExtra("babyTeeth");
		int babyDentist = (Integer) getIntent().getSerializableExtra("babyDentist");
		nextIntent.putExtra("babyLastVisit", value);
		nextIntent.putExtra("babyDentist", babyDentist);
		nextIntent.putExtra("babyTeeth", babyTeeth);
		nextIntent.putExtra("babyAge", babyAge);
		startActivity(nextIntent);
	}
}
