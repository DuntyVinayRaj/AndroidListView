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

import android.os.AsyncTask;
import android.util.Log;

public class RequestTask extends AsyncTask<String, String, String> {

	  @Override
	    protected String doInBackground(String... uri) {
		  
		  Log.v("2", "Coming in background thread...");
	        HttpClient httpclient = new DefaultHttpClient();
	        HttpResponse response;
	        String responseString = null;
	        try {
	        	
	        	Log.v("123", uri[0] + "");
	        	
	        //	response = httpclient.execute(new HttpGet("http://yelloday-staging.herokuapp.com/api/v1/companies/get"));
	        	
	            response = httpclient.execute(new HttpGet(uri[0]));
	            
	            Log.v("3", response + "");
	            
	            StatusLine statusLine = response.getStatusLine();
	            if(statusLine.getStatusCode() == HttpStatus.SC_OK){
	                ByteArrayOutputStream out = new ByteArrayOutputStream();
	                response.getEntity().writeTo(out);
	                out.close();
	                responseString = out.toString();
	            } else{
	                //Closes the connection.
	                response.getEntity().getContent().close();
	                throw new IOException(statusLine.getReasonPhrase());
	            }
	        } catch (ClientProtocolException e) {
	        	Log.v("234", e + "");
	            //TODO Handle problems..
	        } catch (IOException e) {
	            //TODO Handle problems..
	        	Log.v("456", e + "");
	        }
	        
	        Log.v("1", responseString + "");
	        return responseString;
	    }

	    @Override
	    protected void onPostExecute(String result) {
	        super.onPostExecute(result);
	        //Do anything with response..
	    }
	
}
