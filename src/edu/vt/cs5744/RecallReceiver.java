package edu.vt.cs5744;

import android.content.Context;
import android.util.Log;

public class RecallReceiver 
{
	private Recalls mApi;
	private static RecallReceiver sRecallReceiver;
    private Context mAppContext;

    private RecallReceiver(Context appContext) 
    {
        mAppContext = appContext;
        try
        {
        	mApi = new AccessDataGov().execute().get();
        }
        catch(Exception e)
        {
        	
        	Log.e("Error_Message", "Problem connecting" + e.toString());
        }   
    }

    public static RecallReceiver get(Context c) 
    {
        if (sRecallReceiver == null) 
        {
        	sRecallReceiver = new RecallReceiver(c.getApplicationContext());
        }
        return sRecallReceiver;
    }
    
    public Recalls getReturnApi() 
    {
        return mApi;
    }
    
    public Results getResults(String number) 
    {
        for (Results a : mApi.getSuccess().getResults()) 
        {
            if (a.getRecallNumber().equals(number))
            {
            	return a;
            }      
        }
        return null;
    }
}
