package hw10Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
	super(); 
    super.father();
    super.fatherInfo("Abdul",80,'M',true);
    super.familyName ="Rahman Family";
        
    System.out.println("FamilyName: " + familyName);
    System.out.println("This is default constructor from Daughter class");
	}
    public Daughter(String birthMonth, int age) {
    this.birthMonth = birthMonth;
	this.age = age;
	System.out.println("Daughter's birthMonth: " + birthMonth + ", Age: " + age);
	}
    public void daughter() {
	System.out.println("This is a void type method from daughter class");
	}
    public void daughterInfo(String birthMonth, int age) {
    super.father();
    super.fatherInfo("Abdul",80,'M', true);
    super.familyName ="Rahman";
	this.birthMonth = birthMonth;
	this.age = age;
	System.out.println("Daughter's birthMonth: " + birthMonth + ", \nAge: " + age);
	System.out.println("FamilyName: " + familyName);
	}   
}