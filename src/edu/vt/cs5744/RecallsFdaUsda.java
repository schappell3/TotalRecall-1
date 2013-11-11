package edu.vt.cs5744;

public class RecallsFdaUsda 
{
private SuccessFdaUsda success;
	
	RecallsFdaUsda(SuccessFdaUsda obj)
	{
		success = obj;
	}
	
	SuccessFdaUsda getSuccess()
	{
		return success;
	}
	
	public String toString() 
	{
		return new StringBuffer("Success:\n").append(success).toString();
    }
}
