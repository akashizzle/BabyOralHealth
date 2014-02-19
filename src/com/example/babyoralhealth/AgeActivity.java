package com.example.babyoralhealth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Spinner;
/*
 * 0 = I'm expecting
 * 1 = < 6 months
 * 2 = 6 - 12 months
 * 3 = 1 - 2 years
 * 4 = 3 - 4 years
 * 5 = 5 - 6 years
 * 6 = 7 - 10 years
 * 7 = Over 10 years
 */
public class AgeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_age);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.age, menu);
		return true;
	}
	
	public void goBack(View view){
		onBackPressed();
	}
	
	public void nextPage(View view){
		Spinner spinnerAge =(Spinner) findViewById(R.id.spinner1);
		int value = 0;
		if (spinnerAge.getSelectedItem().toString().compareTo("I'm expecting") == 0){
			value = 0;
		}
		else if (spinnerAge.getSelectedItem().toString().compareTo("< 6 months") == 0){
			value = 1;
		}
		else if (spinnerAge.getSelectedItem().toString().compareTo("6 - 12 months") == 0){
			value = 2;
		}
		else if (spinnerAge.getSelectedItem().toString().compareTo("1 - 2 years") == 0){
			value = 3;
		}
		else if (spinnerAge.getSelectedItem().toString().compareTo("3 - 4 years") == 0){
			value = 4;
		}
		else if (spinnerAge.getSelectedItem().toString().compareTo("5 - 6 years") == 0){
			value = 5;
		}
		else if (spinnerAge.getSelectedItem().toString().compareTo("7 - 10 years") == 0){
			value = 6;
		}
		else if (spinnerAge.getSelectedItem().toString().compareTo("Over 10 years") == 0){
			value = 7;
		}
		Intent nextIntent = new Intent(this, TeethActivity.class);
		nextIntent.putExtra("babyAge", value);
		startActivity(nextIntent);
	}

}
