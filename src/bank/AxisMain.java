package bank;

public class AxisMain {

	public static void main(String[] args) {
		
       AxisB object = new AxisB();
       object.rateOfInterest();
       object.policy();
//      
//        
        Bank.display();//calling static method of interface
//        
          SBI obb = new SBI();
          obb.rateOfInterest();
//        
		
		TestingInterface ob = new TestingInterface();
	 	ob.display();
		ob.show();
        
        
	}

}
