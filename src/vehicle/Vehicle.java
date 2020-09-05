package vehicle;

import java.util.Scanner;

public class Vehicle {
	
	String vname, vmodelno, vservicename;
	int vprice;
	Scanner sc=new Scanner(System.in);
	
	public Vehicle()
	{

		
	}
	
	public void input()
	{
		System.out.println("Enter The Name of Vehicle  : ");
		vname=sc.next();
		
		System.out.println("Enter The Model Number of Vehicle  : ");
		vmodelno=sc.next();
		
		System.out.println("Enter The Service Station Name of Vehicle  : ");
		vservicename=sc.next();
		
		System.out.println("Enter The Price of Vehicle  : ");
		vprice=sc.nextInt();
	}
	public void display()
	{
		input();
		System.out.println("The Name of Vehicle : "+vname);

		System.out.println("The Model Number of Vehicle : "+vmodelno);

		System.out.println("The Service Station of Vehicle : "+vservicename);

		System.out.println("The Price of Vehicle : "+vprice);

	}
	

}
