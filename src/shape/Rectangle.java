package shape;

public class Rectangle extends Square {
	
	float length, breadth;
	
	 public Rectangle()
	 {
		 
	 }
	 
	 public void area()
	 {
		 System.out.println("Enter  Length of Rectangle  : ");
		 length=sc.nextFloat();
		 
		 System.out.println("Enter the Breadth of Rectangle  : ");
		 breadth=sc.nextFloat();
	
		 float area=length*breadth;
		 System.out.println(" Rectangle area  is : "+area);
	 }
}
