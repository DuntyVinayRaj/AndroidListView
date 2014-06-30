package com.cc.calculator;

import java.io.Serializable;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.*;
import android.view.ViewGroup;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity {
	EditText inputTxt1, inputTxt2;
  //  EditText inputTxt2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		
		 inputTxt1  = (EditText)findViewById(R.id.editText1);
		 inputTxt2 = (EditText)findViewById(R.id.editText2);
		 Button button = (Button)findViewById(R.id.button1);
		
	    button.setOnClickListener(new OnClickListener()
	    {
	      public void onClick(View v)
	      {
//	    	  Result res = new Result();
//	    	  res.input1 = Integer.parseInt(inputTxt1.getText().toString()) ;
//	    	  res.input2 = Integer.parseInt(inputTxt2.getText().toString());
	    	  
	    	  Intent myIntent = new Intent(MainActivity.this, ThirdActivity.class);
	    	  startActivity(myIntent);
//	    	  Bundle b = new Bundle();
//	          b.putSerializable("bundleobj", res);
//	    	  
//	          myIntent.putExtra("resObj", b); 
             
	      }
	    });
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		
		Log.v("Com.test", "On resume now !!");
		super.onResume();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
