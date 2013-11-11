package edu.vt.cs5744;

import java.util.ArrayList;

public class SuccessCpsc 
{
	private Integer total;
	private ArrayList<ResultsCpsc> results;
	
	
	SuccessCpsc(Integer t)
	{
		total = t;
		results = new ArrayList<ResultsCpsc>();	
	}
	
	Integer getTotal()
	{
		return total;
	}
	
	ArrayList<ResultsCpsc> getResults()
	{
		return results;
	}
	
	public String toString() 
	{
		return new StringBuffer("Total: ").append(total).append("\nResults:\n").append(results).toString();
    }
}
