package Car_Dealership;
import java.util.Scanner;

class Employee {
	
	public void handleCustomer(Customer customer1 , boolean finance , Vehicle vehicle) {
		
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - customer1.getcashOnHand();
			System.out.println("Sir your loan amount is : "+Math.abs(loanAmount));
			
			runCreditHistory(customer1 , loanAmount);
			/*
			 * System.out.println("We have 3 plans for paying loan amount \n *5 years you have to pay "
			 * +loanAmount/60+" every month")
			 * System.out.println("3 years you have to pay "+loanAmount/36+" every month");
			 * System.out.println("1 year you have to pay "+loanAmount/12+" every month");
			 */
			
		}
		else if(finance == false &&  vehicle.getPrice() <= customer1.getcashOnHand() ) {
			transactionProcessing(customer1, vehicle);
			
		}
		else {
			System.out.println("customer will need more money to purchase vehicle : "+vehicle.getCompany()+" "+vehicle.getModel());
		}
			
		
}
	
	public void runCreditHistory(Customer customer, double loanAmount) {
	       
		System.out.println("Running credit history for the customer.....");
		System.out.println("customer has been approved to purchase the vehicle !!");
		
	}
	
	public void transactionProcessing(Customer customer, Vehicle vehicle) {
		System.out.println(customer.getName()+" had purchased the "+vehicle.getCompany()+" "+vehicle.getModel());
	}
}
  


