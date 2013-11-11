package edu.vt.cs5744;

import java.util.ArrayList;

public class SuccessFdaUsda 
{
	private Integer total;
	private ArrayList<ResultsFdaUsda> results;
	
	
	SuccessFdaUsda(Integer t)
	{
		total = t;
		results = new ArrayList<ResultsFdaUsda>();	
	}
	
	Integer getTotal()
	{
		return total;
	}
	
	ArrayList<ResultsFdaUsda> getResults()
	{
		return results;
	}
	
	public String toString() 
	{
		return new StringBuffer("Total: ").append(total).append("\nResults:\n").append(results).toString();
    }
}
