package abstractsDemo;

abstract public class AbsDemo {
	
	AbsDemo()
	{
		System.out.println("Abstract  class cons calling");
	}
	
	           void display()
	            {
	            	System.out.println("concrete method/normal method/non abstract");
	            }
	            
	            
	            abstract void show();
	            
//	            abstract void getDetails();
//	            
//	            abstract void showDetails();
//	            
	          
//abstract method-- no implementation
}