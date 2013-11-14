package edu.vt.cs5744;

public class Records 
{
	private String component_description;
	private String make;
	private String manufacturer;
	private String manufacturing_begin_date;
	private String manufacturing_end_date;
	private String model;
	private String recalled_component_id;
	private String year;
	
	public String toString() 
	{
		return new StringBuffer("Component Description: ").append(this.component_description)
				.append("\nMake: ").append(this.make).append("\nManufacturer: ")
				.append(this.manufacturer).append("\nManufacturing Begin Date: ")
				.append(this.manufacturing_begin_date).append("\nManufacturing End Date: ")
				.append(this.manufacturing_end_date).append("\nModel: ").append(this.model)
				.append("\nRecalled Component ID: ").append(this.recalled_component_id)
				.append("\nYear: ").append(this.year).toString();
    
	}
}