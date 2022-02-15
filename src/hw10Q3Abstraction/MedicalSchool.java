/*3-1) i) Total how many keywords are used for the inheritance in Interface, answer by Java comments? Can an interface inherit other Interfaces, or a regular class or abstract class by extends or implements keyword? How many inheritance is possible? Use the Interface -- "University" to answer my questions (University extends College, Hospital) (by multiple line comments). ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and NursingSchool. how many keywords are used for the inheritance in Java for Abstract Class? Can an Abstract Class inherit other Abstract Class or a regular class or interface by extends or implements keyword? How many inheritances is possible by an Abstract Class? Use one of above Abstract Class (MedicalSchool extends NursingSchool implements LawSchool) and use the keywords to answer my questions. iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity, RockefellerUniversity. how many keywords are used for the inheritance in Java for a regular Class? Can a regular Class inherit other Abstract Class or a regular class or interface by extends or implements keyword? How many inheritances is possible by a regular Class? Use one of above regular Classes (ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool) and use the keywords to answer my questions. You don't need to execute anything as the main method is absent.
 * 
 */
package hw10Q3Abstraction;
    /*an abstract class used one keyword extends regular and abstract 
    class and implements more then one interface and here abstact class implements lawschool*/
    public abstract class MedicalSchool extends NursingSchool implements LawSchool {
    public abstract void anatomyLap();
    public void biochemistryLab() {
    	System.out.println("This is from biochemistryLab non abstract method");
    	}
    public MedicalSchool() {
    }
    /*In abstract class one extends keyword used for the inheritance
     an abstarct class can inherit other abstract class or a regular class or interface by implement keyword.
     an abstarct class can inheritance only one abstarct class or regular class*/
}   