package edu.vt.cs5744;

import java.util.ArrayList;
import java.util.List;

public class ResultsCpsc 
{
	private String organization;
	private String recall_number;
	private String recall_date;
	private String recall_url;
	private List<String> manufacturers;
	private List<String> product_types;
	private List<String> descriptions;
	private List<String> upcs;
	private List<String> hazards;
	private List<String> countries;	
	
	ResultsCpsc(String organization, String recall_number, String recall_date, String recall_url)
	{
		this.organization = organization;
		this.recall_number = recall_number;
		this.recall_date = recall_date;
		this.recall_url = recall_url;
		this.manufacturers = new ArrayList<String>();
		this.product_types = new ArrayList<String>();
		this.descriptions = new ArrayList<String>();
		this.upcs = new ArrayList<String>();
		this.hazards = new ArrayList<String>();
		this.countries = new ArrayList<String>();
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
	
	public String getRecallUrl() 
	{
		return this.recall_url;
	}

	public List<String> getManufacturers() 
	{
		if(this.manufacturers.isEmpty())
		{
			this.manufacturers.add("null");
			return this.manufacturers;
		}
		else
		{
			return this.manufacturers;
		}	
	}

	public List<String> getProductTypes() 
	{
		if(this.product_types.isEmpty())
		{
			this.product_types.add("null");
			return this.product_types;
		}
		else
		{
			return this.product_types;
		}	
	}
	
	public List<String> getDescriptions()
	{
		if(this.descriptions.isEmpty())
		{
			this.descriptions.add("null");
			return this.descriptions;
		}
		else
		{
			return this.descriptions;
		}
	}

	public List<String> getUpcs() 
	{
		if(this.upcs.get(0) == null)
		{
			this.upcs.add("null");
			return this.upcs;
		}
		else
		{
			return this.upcs;
		}
	}

	public List<String> getHazards() 
	{
		if(this.hazards.isEmpty())
		{
			this.hazards.add("null");
			return this.hazards;
		}
		else
		{
			return this.hazards;
		}
	}

	public List<String> getCountries() 
	{
		if(this.countries.isEmpty())
		{
			this.countries.add("null");
			return this.countries;
		}
		else
		{
			return this.countries;
		}
	}

	public String manufacturersToString()
	{
		return new StringBuffer("").append(this.manufacturers).toString();
	}
	public String typeToString()
	{
		return new StringBuffer("").append(this.product_types).toString();
	}
	
	public String descriptionsToString()
	{
		return new StringBuffer("").append(this.descriptions).toString();
	}
	
	public String upcsToString()
	{
		return new StringBuffer("").append(this.upcs).toString();
	}
	
	public String hazardsToString()
	{
		return new StringBuffer("").append(this.hazards).toString();
	}
	
	public String countriesToString()
	{
		return new StringBuffer("").append(this.countries).toString();
	}
	
	public String toString() 
	{
		return new StringBuffer("Organization: ").append(this.organization).append("\nRecall number: ")
				.append(this.recall_number).append("\nRecall Date: ").append(this.recall_date)
				.append("\nRecall URL: ").append(this.recall_url).append("\nManufacturers: ")
				.append(this.manufacturers).append("\nProduct Types: ").append(this.product_types)
				.append("\nDescription: ").append(this.descriptions).append("\nUPCS: ").append(this.upcs)
				.append("\nHazards: ").append(this.hazards).append("\nCountries: ").append(this.countries).toString();
    }
}
