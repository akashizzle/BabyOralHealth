package com.example.babyoralhealth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
/*
 * 0 = None 
 * 1 = 1 - 5
 * 2 = 6 - 10
 * 3 = > 10
 */
public class TeethActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_teeth);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.teeth, menu);
		return true;
	}
	
	public void goBack(View view){
		onBackPressed();
	}
	
	public void nextPage(View view){
		int value = 0;
		RadioButton rad0 = (RadioButton) findViewById(R.id.radio0);
		RadioButton rad1 = (RadioButton) findViewById(R.id.radio1);
		RadioButton rad2 = (RadioButton) findViewById(R.id.radio2);
		RadioButton rad3 = (RadioButton) findViewById(R.id.radio3);
		if (rad0.isChecked()){
			value = 0;
		}
		else if (rad1.isChecked()){
			value = 1;
		}
		else if (rad2.isChecked()){
			value = 2;
		}
		else if (rad3.isChecked()){
			value = 3;
		}
		
		int babyAge = (Integer) getIntent().getSerializableExtra("babyAge");
		Intent nextIntent = new Intent(this, DentistActivity.class);
		nextIntent.putExtra("babyTeeth", value);
		nextIntent.putExtra("babyAge", babyAge);
		startActivity(nextIntent);
	}
}
