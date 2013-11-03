package edu.vt.cs5744.android.totalrecall;

import java.util.ArrayList;
import java.util.List;

public class ResultsCPSC 
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
	
	
	ResultsCPSC(String org, String number, String date, String url)
	{
		organization = org;
		recall_number = number;
		recall_date = date;
		recall_url = url;
		manufacturers = new ArrayList<String>();
		product_types = new ArrayList<String>();
		descriptions = new ArrayList<String>();
		upcs = new ArrayList<String>();
		hazards = new ArrayList<String>();
		countries = new ArrayList<String>();
	}
	
	String getOrganization()
	{
		return organization;
	}
	
	public String getRecallNumber()
	{
		return recall_number;
	}
	
	public String toString() 
	{
		return new StringBuffer("Organization: ").append(organization).append("\nRecall number: ")
				.append(recall_number).append("\nRecall Date: ").append(recall_date).append("\nRecall URL: ")
				.append(recall_url).append("\nManufacturers: ").append(manufacturers).append("\nProduct Types: ")
				.append(product_types).append("\nDescription: ").append(descriptions).append("\nUPCS: ")
				.append(upcs).append("\nHazards: ").append(hazards).append("\nCountries: ").append(countries).toString();
    }
}