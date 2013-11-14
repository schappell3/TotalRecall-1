package edu.vt.cs5744;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;

import android.os.AsyncTask;
import android.util.Log;

public class AccessDataGov extends AsyncTask<Void, Void, Recalls>
{
	protected Recalls doInBackground(Void...voids)
    {
        try
        {
        	String url = "http://api.usa.gov/recalls/search.json?sort=date&per_page=50";
            URL dataGov = new URL(url);
            BufferedReader in = new BufferedReader(new InputStreamReader(dataGov.openStream())); 
            
            Recalls response = new Gson().fromJson(in.readLine(), Recalls.class);
            
            in.close();
            
            return response;
        }
        catch(Exception e)
        {
            Log.e("Error_Message", "Problem connecting" + e.toString());
            return null;
        } 
         
    }
}
