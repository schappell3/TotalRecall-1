package edu.vt.cs5744;

public class RecallsCpsc
{
	private SuccessCpsc success;
	
	RecallsCpsc(SuccessCpsc obj)
	{
		success = obj;
	}
	
	SuccessCpsc getSuccess()
	{
		return success;
	}
	
	public String toString() 
	{
		return new StringBuffer("Success:\n").append(success).toString();
    }
}
