package vehicle;

public class Bike extends Vehicle {
	
	int discountRate;

	public Bike()
	{
		
	}
	
	public void discount()
	{
		discountRate=vprice-((vprice/100)*5);
		System.out.println(" Discount of Bike price : "+discountRate);

	}
	
	public void display()
	{
		input();
		
		System.out.println("Name of Bike : "+vname);

		System.out.println("Bike Model number is : "+vmodelno);

		System.out.println("Service Station of Bike : "+vservicename);

		System.out.println("Bike Price is : "+vprice);
		

		

	}
}
