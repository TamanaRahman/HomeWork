package hw9Q3Abstraction;
    /*an abstract class used keyword extends regular and abstract 
    class only and implements more then one interface*/
public abstract class MedicalSchool extends NursingSchool implements Hospital,College{
    public abstract void anatomyLap();
    public void biochemistryLab() {
    	System.out.println("This is from biochemistryLab non abstract method");
    } public MedicalSchool() {
    } 
    //two keyword are used for the inheritance in java for abstract class
    /*an abstract class can inherit by extends
    keyword regular and abstract class but not possible for interface */
    /*an abstract class can inherit only one regular class or one abstract
     class by extends keyword*/
    //implements keyword an abstract class can inherits interface more then one 
}