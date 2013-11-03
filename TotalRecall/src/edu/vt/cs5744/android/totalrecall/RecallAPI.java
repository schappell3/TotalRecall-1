package edu.vt.cs5744.android.totalrecall;

public class RecallAPI 
{
	private Success success;
	
	RecallAPI(Success obj)
	{
		success = obj;
	}
	
	Success getSuccess()
	{
		return success;
	}
	
	public String toString() 
	{
		return new StringBuffer("Success:\n").append(success).toString();
    }
}