package com.cc.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends Activity implements OnItemClickListener {

	ListView listvw;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third_layout);
		
		listvw = (ListView) findViewById(R.id.listView1);
		String[] sports = getResources().getStringArray(R.array.sports_array);		
		
		
		// Code for plain simple loading
//		listvw.setAdapter(new ArrayAdapter<String>(this, R.layout.listitem, sports));
//		listvw.setOnItemClickListener(this);
		
		// Code for custom loading
		listvw.setAdapter(new MyCustomAdapter(sports, this));
		listvw.setOnItemClickListener(this);
		
		RequestTask task = new RequestTask();
		task.execute("http://yelloday-staging.herokuapp.com/api/v1/companies/get");
		
	}
		
		@Override
	    public void onItemClick(AdapterView<?> adapter, View view, 
	                int position, long id) {
	    Toast.makeText(getApplicationContext(), ((TextView) view.findViewById(R.id.textView1)).getText(),
	                      Toast.LENGTH_SHORT).show();
	}
}
