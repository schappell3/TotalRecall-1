package edu.vt.cs5744;

import android.content.Context;
import android.util.Log;

public class RecallReceiver 
{
	private ReturnApi mApi;
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
    
    public ReturnApi getReturnApi() 
    {
        return mApi;
    }
    
    public ResultsCpsc getResultsCpsc(String number) 
    {
        for (ResultsCpsc a : mApi.getCpsc().getSuccess().getResults()) 
        {
            if (a.getRecallNumber().equals(number))
            {
            	return a;
            }      
        }
        return null;
    }
    
    public ResultsNhtsa getResultsNhtsa(String number) 
    {
        for (ResultsNhtsa a : mApi.getNhtsa().getSuccess().getResults()) 
        {
            if (a.getRecallNumber().equals(number))
            {
            	return a;
            }      
        }
        return null;
    }
    
    public ResultsFdaUsda getResultsFdaUsda(String number) 
    {
        for (ResultsFdaUsda a : mApi.getFdausda().getSuccess().getResults()) 
        {
            if (a.getRecallNumber().equals(number))
            {
            	return a;
            }      
        }
        return null;
    }
}
