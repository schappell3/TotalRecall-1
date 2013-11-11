package edu.vt.cs5744;

public class ReturnApi 
{
	private String organization;
	private RecallsCpsc cpsc;
	private RecallsNhtsa nhtsa;
	private RecallsFdaUsda fdausda;
	
	ReturnApi(String organization)
	{
		this.organization = organization;
	}
	
	public void setCpsc(RecallsCpsc cpsc)
	{
		this.cpsc = cpsc;
	}
	
	public void setNhtsa(RecallsNhtsa nhtsa)
	{
		this.nhtsa = nhtsa;
	}
	
	public void setFdausda(RecallsFdaUsda fdausda)
	{
		this.fdausda = fdausda;
	}
	
	public String getOrganization()
	{
		return organization;
	}
	
	public RecallsCpsc getCpsc()
	{
		return cpsc;
	}
	
	public RecallsNhtsa getNhtsa()
	{
		return nhtsa;
	}
	
	public RecallsFdaUsda getFdausda()
	{
		return fdausda;
	}
	
	
	
}
