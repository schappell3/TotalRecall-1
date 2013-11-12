package edu.vt.cs5744;

import java.util.ArrayList;


public class Results 
{
	private String organization;
	private String recall_number;
	private String recall_date;
	private String recall_url;
	
	private ArrayList<String> manufacturers;
	private ArrayList<String> product_types;
	private ArrayList<String> descriptions;
	private ArrayList<String> upcs;
	private ArrayList<String> hazards;
	private ArrayList<String> countries;	
	
	private String description;
	private String summary;
	
	private ArrayList<Records> records;
	private String manufacturer_campaign_number;
	private String component_description;
	private String manufacturer;
	private String code;
	private String potential_units_affected;
	private String initiator;
	private String report_date;
	private String defect_summary;
	private String consequence_summary;
	private String corrective_summary;
	private String notes;
	private String recall_subject;
	
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

	public ArrayList<String> getManufacturers() 
	{
		return this.manufacturers;	
	}

	public ArrayList<String> getProductTypes() 
	{
		return this.product_types;	
	}
	
	public ArrayList<String> getDescriptions()
	{
		return this.descriptions;
	}

	public ArrayList<String> getUpcs() 
	{
		return this.upcs;
	}

	public ArrayList<String> getHazards() 
	{
		return this.hazards;
	}

	public ArrayList<String> getCountries() 
	{
		return this.countries;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public String getSummary()
	{
		return this.summary;
	}

	public String getComponentDescription()
	{
		return this.component_description;
	}
	
	public ArrayList<Records> getRecords() 
	{
		return this.records;
	}

	public String getManufacturerCampaignNumber() 
	{
		return this.manufacturer_campaign_number;
	}

	public String getManufacturer() 
	{
		return this.manufacturer;
	}
	
	public String getCode() 
	{
		return this.code;
	}

	public String getPotentialUnitsAffected() 
	{
		return this.potential_units_affected;
	}

	public String getInitiator() 
	{
		return this.initiator;
	}

	public String getReportDate() 
	{
		return this.report_date;
	}

	public String getDefectSummary() 
	{
		return this.defect_summary;
	}

	public String getConsequenceSummary() 
	{
		return this.consequence_summary;
	}

	public String getCorrectiveSummary() 
	{
		return this.corrective_summary;
	}

	public String getNotes() {
		return this.notes;
	}

	public String getRecallSubject() 
	{
		return this.recall_subject;
	}
	
	public String recordsToString()
	{
		return new StringBuffer("").append(this.records).toString();
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
}
