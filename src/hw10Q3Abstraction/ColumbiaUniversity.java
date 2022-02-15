package hw10Q3Abstraction;
    
public class ColumbiaUniversity extends MedicalSchool implements University,VocationalSchool{
	//public abstract void chemistry(); so in regular class you cannot declared method
	public void biology() {
	System.out.println("This is from biology non abstract method ");	
	}
	public ColumbiaUniversity() {
    }
	/*One extends keyword used for the inheritance in java for a regular class
	 *A regular class can inherits only one regular class or one abstract class
	 by extends keyword but a regular class cannot inherits interface by extends
	 keyword but by used implement keyword can inheritance interface.
	 *only one inheritance is possible by extends keyword */
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
	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}
	 
	
}