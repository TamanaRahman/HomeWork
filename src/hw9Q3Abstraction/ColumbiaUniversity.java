package hw9Q3Abstraction;
    // only one extends keyword used for the inheritance in java for a regular class
public class ColumbiaUniversity extends MedicalSchool {
	//public abstract void chemistry(); so in regular class you cannot declared method
	public void biology() {
	System.out.println("This is from biology non abstract method ");	
	}
	public ColumbiaUniversity() {
    }// a regular class can inherits by two extends keyword
	/* a regular class can inherits only one regular class or one abstract class
	 by extends keyword but a regular class cannot inherits interface by extends keyword*/
	/*only one inheritance is possible by extends keyword but by implements a regular class inherit 
	  more then one interface*/
	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void anatomyLap() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}
	 
	
}