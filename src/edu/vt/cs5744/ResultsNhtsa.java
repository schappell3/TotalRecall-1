package edu.vt.cs5744;

import java.util.ArrayList;
import java.util.List;

public class ResultsNhtsa 
{
	private String organization;
	private String recall_number;
	private String recall_date;
	private String recall_url;
	private List<RecordsNhtsa> records;
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
	
	ResultsNhtsa(String organization, String recall_number, String recall_date, String recall_url, 
			String manufacturer_campaign_number, String component_description,String manufacturer, 
			String code, String potential_units_affected, String initiator, String report_date, 
			String defect_summary, String consequence_summary, String corrective_summary, 
			String notes, String recall_subject)
	{
		this.organization = organization;
		this.recall_number = recall_number;
		this.recall_date = recall_date;
		this.recall_url = recall_url;
		this.records = new ArrayList<RecordsNhtsa>();
		this.manufacturer_campaign_number = manufacturer_campaign_number;
		this.component_description = component_description;
		this.manufacturer = manufacturer;
		this.code = code;
		this.potential_units_affected = potential_units_affected;
		this.initiator = initiator;
		this.report_date = report_date;
		this.defect_summary = defect_summary;
		this.consequence_summary = consequence_summary;
		this.corrective_summary = corrective_summary;
		this.notes = notes;
		this.recall_subject = recall_subject;	
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
	
	public String getComponentDescription()
	{
		return this.component_description;
	}
	
	public List<RecordsNhtsa> getRecords() 
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
	
	public String toString() 
	{
		return new StringBuffer("Organization: ").append(this.organization).append("\nRecall number: ")
				.append(this.recall_number).append("\nRecall Date: ").append(this.recall_date)
				.append("\nRecall URL: ").append(this.recall_url).append("\nRecords: ").append(records)
				.append("\nManufacturer Campaign Number: ").append(this.manufacturer_campaign_number)
				.append("\nComponent Description: ").append(this.component_description).append("\nManufacturer: ")
				.append(this.manufacturer).append("\nCode: ").append(this.code).append("\nPotential Units Affected: ")
				.append(this.potential_units_affected).append("\nInitiator: ").append(this.initiator)
				.append("\nReport Date: ").append(this.report_date).append("\nDefect Summary: ")
				.append(this.defect_summary).append("\nConsequence Summary: ").append(this.consequence_summary)
				.append("\nCorrective Summary: ").append(this.corrective_summary).append("\nNotes: ")
				.append(this.notes).append("\nRecall Subject: ").append(this.recall_subject).toString();
    }
}
