package hw8Q3Abstraction;

public abstract class MedicalSchool {
    public abstract void anatomyLap();
    public void biochemistryLab() {
    	System.out.println("This is from biochemistryLab non abstract method");
    } public MedicalSchool() { //yes, and this default constructor.
    }  
}