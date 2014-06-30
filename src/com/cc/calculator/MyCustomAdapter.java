package com.cc.calculator;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter{
	private static final String TAG = MyCustomAdapter.class.getSimpleName();
	private String[] strings;
	private Context context;
	
	public MyCustomAdapter(String[] strings, Context context){
		this.strings = strings;
		this.context = context;
	}

	@Override
	public int getCount() {
		return strings.length;
	}

	@Override
	public Object getItem(int position) {
		return strings[position];
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		Log.d(TAG, "in getView");
		View vew = inflater.inflate(R.layout.listitem, null);
		TextView textview = (TextView )vew.findViewById(R.id.textView1);
		textview.setText(strings[position]);
		return vew;
	}

	public MyCustomAdapter() {
		// TODO Auto-generated constructor stub
	}

}
