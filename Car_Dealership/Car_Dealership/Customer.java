package Car_Dealership;

public class Customer {
	
	private String name;
	private String address;
	private double cashOnHand;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String Address) {
		this.address = Address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setcashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	
	public double getcashOnHand() {
		return cashOnHand;
	} 
	
	synchronized public void purchaseCar(Vehicle vehicle , Employee employee , boolean finance) {
		
		employee.handleCustomer(this ,finance , vehicle);  //this represents all the things in the customer
	}
}
