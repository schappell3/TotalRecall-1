package edu.vt.cs5744.android.totalrecall;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import com.google.gson.Gson;

import android.os.AsyncTask;
import android.util.Log;

public class AccessDataGov extends AsyncTask<Void, Void, RecallAPI>
{
	protected RecallAPI doInBackground(Void...voids)
    {
        try
        {
            URL dataGov = new URL("http://api.usa.gov/recalls/search.json?sort=date&organization=cpsc");
            BufferedReader in = new BufferedReader(new InputStreamReader(dataGov.openStream()));
            
            RecallAPI response = new Gson().fromJson(in.readLine(), RecallAPI.class);
            
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