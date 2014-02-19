package com.example.babyoralhealth;
//android:background="?android:attr/selectableItemBackground"
//Toast.makeText(getApplicationContext(), Integer.toString(w), Toast.LENGTH_LONG).show();
import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	File babyFile = new File(this.getApplicationContext().getFilesDir(), "baby");
    	Manager.readData(babyFile);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void nextPage(View view){
    	if (Manager.getBabyList().isEmpty()) {
	    	Intent agePageIntent = new Intent(this, AgeActivity.class);
	    	startActivity(agePageIntent);
    	}
    	else{
    		
    	}
    }
    
}
