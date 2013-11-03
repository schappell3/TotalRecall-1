package edu.vt.cs5744.android.totalrecall;

import java.util.ArrayList;
import java.util.List;

public class Success 
{
	private String total;
	private List<ResultsCPSC> results;
	
	
	Success(String t)
	{
		total = t;
		results = new ArrayList<ResultsCPSC>();	
	}
	
	String getTotal()
	{
		return total;
	}
	
	List<ResultsCPSC> getGovData()
	{
		return results;
	}
	
	public String toString() 
	{
		return new StringBuffer("Total: ").append(total).append("\nResults:\n").append(results).toString();
    }
}