package edu.vt.cs5744;

public class RecordsNhtsa 
{
	private String component_description;
	private String make;
	private String manufacturer;
	private String manufacturing_begin_date;
	private String manufacturing_end_date;
	private String model;
	private String recalled_component_id;
	private String year;
	
	RecordsNhtsa(String component_description, String make, String manufacturer, 
			String manufacturing_begin_date, String manufacturing_end_date, 
			String model, String recalled_component_id, String year)
	{
		this.component_description = component_description;
		this.make = make;
		this.manufacturer = manufacturer;
		this.manufacturing_begin_date = manufacturing_begin_date;
		this.manufacturing_end_date = manufacturing_end_date;
		this.model = model;
		this.recalled_component_id = recalled_component_id;
		this.year = year;
	}
	
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
