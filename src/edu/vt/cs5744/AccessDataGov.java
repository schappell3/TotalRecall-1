package edu.vt.cs5744;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;

import android.os.AsyncTask;
import android.util.Log;

public class AccessDataGov extends AsyncTask<Void, Void, ReturnApi>
{
	protected ReturnApi doInBackground(Void...voids)
    {
        try
        {
        	String url = "http://api.usa.gov/recalls/search.json?sort=date&organization=cpsc";
            URL dataGov = new URL(url);
            BufferedReader in = new BufferedReader(new InputStreamReader(dataGov.openStream())); 
            
            ReturnApi rc;
            
            if(url.contains("organization=cpsc"))
            {
            	RecallsCpsc response = new Gson().fromJson(in.readLine(), RecallsCpsc.class);
            	rc = new ReturnApi("CPSC");
            	rc.setCpsc(response);
            	in.close();  
                
                return rc; 
            }
            else if(url.contains("organization=nhtsa"))
            {
            	RecallsNhtsa response = new Gson().fromJson(in.readLine(), RecallsNhtsa.class);
            	rc = new ReturnApi("NHTSA");
            	rc.setNhtsa(response);
            	in.close();  
                
                return rc;  
            }
            else if(url.contains("organization=fda+usda"))
            {
            	RecallsFdaUsda response = new Gson().fromJson(in.readLine(), RecallsFdaUsda.class);
            	rc = new ReturnApi("FDAUSDA");
            	rc.setFdausda(response);
            	in.close();  
                
                return rc; 
            }
            else
            {
            	throw new Exception();
            }  
        }
        catch(Exception e)
        {
            Log.e("Error_Message", "Problem connecting" + e.toString());
            return null;
        } 
         
    }
}
