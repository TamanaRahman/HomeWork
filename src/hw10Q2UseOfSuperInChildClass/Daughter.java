package hw10Q2UseOfSuperInChildClass;
/*02) Create a package name "hw10Q2UseOfSuperInChildClass" in the HW project. Inside the package, a) Create a class name Father. declare 5 variable like Name, age, sex, usCitizen, FamilyName. Declare default (declare a sysout inside it) and parameterized constructor (declare a sysout inside it) from the first 4 variables. Create a regular void type method name father() which is implemented, declare a sysout inside it. Create a parameterized method fatherInfo() which also contain it's 4 variables, declare a sysout (you can copy from parameterized constructor if you want) b) Create a class name 'Daughter', declare variable birthMonth, age. Declare default (declare a sysout inside it) and parameterized constructor (declare a sysout inside it), and implement a regular method daughter() and declare a sysout. Create a parameterized method daughterInfo() which contains 2 of its variables as local variable. declare a sysout (you can copy from parameterized constructor) . Now, Daughter extends Father (super class). Use super method, super keyword and show all of their use in child class.me' variable (from parent class) to initialize by super keyword in child class (Use one constructor and one method to implement them). and initialize in a TestFamily Class. Paste GitHub link below.*/
public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super(); 
        //super("Abdul",80,'M', true); we can call only one constructor 
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
        //super(); we cannot call constructor from parents call
    	super.father();
    	super.fatherInfo("Abdul",80,'M', true);
    	super.familyName ="Rahman";
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Daughter's birthMonth: " + birthMonth + ", \nAge: " + age);
		System.out.println("FamilyName: " + familyName);
	}   
}