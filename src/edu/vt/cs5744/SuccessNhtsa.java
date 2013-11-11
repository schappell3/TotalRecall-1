package edu.vt.cs5744;

import java.util.ArrayList;

public class SuccessNhtsa 
{
	private Integer total;
	private ArrayList<ResultsNhtsa> results;
	
	
	SuccessNhtsa(Integer t)
	{
		total = t;
		results = new ArrayList<ResultsNhtsa>();	
	}
	
	Integer getTotal()
	{
		return total;
	}
	
	ArrayList<ResultsNhtsa> getResults()
	{
		return results;
	}
	
	public String toString() 
	{
		return new StringBuffer("Total: ").append(total).append("\nResults:\n").append(results).toString();
    }
}
