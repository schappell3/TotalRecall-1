package edu.vt.cs5744;

public class ResultsFdaUsda 
{
	private String organization;
	private String recall_number;
	private String recall_date;
	private String recall_url;
	private String description;
	private String summary;
	
	ResultsFdaUsda(String organization, String recall_number, String recall_date, 
			String recall_url, String description, String summary)
	{
		this.organization = organization;
		this.recall_number = recall_number;
		this.recall_date = recall_date;
		this.recall_url = recall_url;
		this.description = description;
		this.summary = summary;
	}
	
	public String getOrganization()
	{
		return this.organization;
	}
	
	public String getRecallNumber()
	{
		return this.recall_number;
	}
	
	public String getRecallDate()
	{
		return this.recall_date;
	}
	
	public String getUrl()
	{
		return this.recall_url;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public String getSummary()
	{
		return this.summary;
	}
	
	public String toString() 
	{
		return new StringBuffer("Organization: ").append(this.organization).append("\nRecall number: ")
				.append(this.recall_number).append("\nRecall Date: ").append(this.recall_date)
				.append("\nRecall URL: ").append(this.recall_url).append("\nDescription: ")
				.append(this.description).append("\nSummary: ").append(this.summary).toString();
    }
}
