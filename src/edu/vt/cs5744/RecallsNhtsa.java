package edu.vt.cs5744;

public class RecallsNhtsa 
{
	private SuccessNhtsa success;
	
	RecallsNhtsa(SuccessNhtsa obj)
	{
		success = obj;
	}
	
	SuccessNhtsa getSuccess()
	{
		return success;
	}
	
	public String toString() 
	{
		return new StringBuffer("Success:\n").append(success).toString();
    }
}
