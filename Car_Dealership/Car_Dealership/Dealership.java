package Car_Dealership;

public class Dealership {
	
	public static void main(String[] args) {
		
		/*Customer customer1  = new Customer();
		customer1.setName("Raj");
		customer1.setAddress("Pune dehugoan");
        customer1.setcashOnHand(5000000);
        
        Vehicle vehicle = new Vehicle("Honda", "Acord",5000000);
		*//*         We can do this with creating an constructor also
		 * vehicle.setPrice(490000);
		 *  vehicle.setModel("Q7 Xe");
		 * vehicle.setCompany("Audi");
		 *//*
        
        
        Employee Emp = new Employee();
        
        customer1.purchaseCar(vehicle , Emp , false);
        
       Customer customer2 = new Customer();
       customer2.setName("Alan");
		customer2.setAddress("New york city ,uS");
       customer2.setcashOnHand(60000000);
       
       customer2.purchaseCar(vehicle,Emp, false);*/

       Vehicle vh = new Vehicle("Lamborghini","urus",35000000);
       Customer c1 = new Customer();
       c1.setName("jori");
       c1.setAddress("washington dc");
       c1.setcashOnHand(6000000);

       Employee e1 = new Employee();
       c1.purchaseCar(vh,e1,true);
		
		
	}

}
