package com.example.babyoralhealth;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
/*
 * 0 = Cavities
 * 1 = Experienced trauma to the teeth
 * 2 = Irregular adult teeth growth
 * 3 = Irregular baby teeth growth
 * 4 = Gum pain
 * 5 = Unaligned bite
 * 6 = Teeth discolourization
 */
public class TraitsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_traits);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.traits, menu);
		return true;
	}
	
	public void goBack(View view){
		onBackPressed();
	}
	
	public void nextPage(View view){
		ArrayList <String> value = new ArrayList<String>();
		
		CheckBox rad0 = (CheckBox) findViewById(R.id.checkBox0);
		CheckBox rad1 = (CheckBox) findViewById(R.id.checkBox1);
		CheckBox rad2 = (CheckBox) findViewById(R.id.checkBox2);
		CheckBox rad3 = (CheckBox) findViewById(R.id.checkBox3);
		CheckBox rad4 = (CheckBox) findViewById(R.id.checkBox4);
		CheckBox rad5 = (CheckBox) findViewById(R.id.checkBox5);
		CheckBox rad6 = (CheckBox) findViewById(R.id.checkBox6);
		
		if (rad0.isChecked()){
			value.add("0");
		}
		if (rad1.isChecked()){
			value.add("1");
		}
		if (rad2.isChecked()){
			value.add("2");
		}
		if (rad3.isChecked()){
			value.add("3");
		}
		if (rad4.isChecked()){
			value.add("4");
		}
		if (rad5.isChecked()){
			value.add("5");
		}
		if (rad6.isChecked()){
			value.add("6");
		}
		Intent nextIntent = new Intent(this, TraitsActivity.class);
		int babyAge = (Integer) getIntent().getSerializableExtra("babyAge");
		int babyTeeth = (Integer) getIntent().getSerializableExtra("babyTeeth");
		int babyDentist = (Integer) getIntent().getSerializableExtra("babyDentist");
		int babyLastVisit = (Integer) getIntent().getSerializableExtra("babyLastVisit");
		
		nextIntent.putStringArrayListExtra("babyTraits", value);
		nextIntent.putExtra("babyLastVisit", babyLastVisit);
		nextIntent.putExtra("babyDentist", babyDentist);
		nextIntent.putExtra("babyTeeth", babyTeeth);
		nextIntent.putExtra("babyAge", babyAge);
		startActivity(nextIntent);
	}
}
//ArrayList<String> test = data.getStringArrayListExtra("test");