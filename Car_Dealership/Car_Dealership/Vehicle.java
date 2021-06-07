package Car_Dealership;

public class Vehicle {
	private String company;
	
	private String Model;;

	private double price;

	

	public Vehicle(String company, String model, double price) {
		super();
		this.company = company;
		this.Model = model;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
}
