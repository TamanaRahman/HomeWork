package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
	
		//create object from computer class 
		Computer object = new Computer ();
		
		System.out.println("_________________________________________________________________");
		
		//Default constructor initialized here.
	    new ComputerTest();
	
	   //parameterized constructor initialized here.
	    Computer object2 = new Computer ("Apple", "MacBook Air","MacOs Mojava", 800 , false ,'A');
	    
	    System.out.println("____________________________________________________________");
	    
	    
	    Computer object3 = new Computer ("Dell", "XPS" , "Windows", 600 , true, 'B');
	    
	    System.out.println("____________________________________________________________");
		
	}

}
