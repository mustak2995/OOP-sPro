package shape;

public class Triangle extends Square{
	
	float side1,side2,side3;
	
	public Triangle()
	{
		
	}
	
	public void area()
	{
		System.out.println("Enter  Side first of Traingle");
		side1=sc.nextFloat();
		
		System.out.println("Enter Side Second of Traingle");
		side2=sc.nextFloat();
		
		System.out.println("Enter Side Third of Traingle");
		side3=sc.nextFloat();
		
		float area= side1*side2*side3;
		
		System.out.println("The Area of Traingle is : "+area);
		
	}
}