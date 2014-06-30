package com.cc.calculator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_ayout);
		
		 Bundle bn = new Bundle();
         bn = getIntent().getExtras().getBundle("resObj");
         Result res = new Result();
      
         Log.v("1", bn + "");
		 res = (Result)bn.getSerializable("bundleobj");
		 Log.v("Passed object result is - ", res.input1 + "" );
		 Log.v("Passed object result is - ", res.input2 + "" );
		 
		Button button = (Button)findViewById(R.id.button1);
		
	    button.setOnClickListener(new OnClickListener()
	    {
	      public void onClick(View v)
	      { 
	    	  new RequestTask().execute("http://stackoverflow.comt");
	  
	    	 // finish ();
//	    	  TextView tv = (TextView) findViewById(R.id.textView1);
//	    	  tv.setText(R.string.Rajeev);
	      }
	    });
		
	}

	
}
