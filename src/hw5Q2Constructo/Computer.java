/* Create a package name "hw5Q2Constructor" in your Home Work project. Inside the package, a) Create a class "Computer". Declare some variable -- brand, model, operating system, price, madeInUSA, grade (grade as char). Declare default constructor and one parameterized constructor. Use only one System.out.println() in each constructor. b) Create another class ComputerTest. Create object from Computer class, as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as -> This is from default Constructor of Computer class. Second outcome as-> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: A and Made in USA? Ans: false. I want the third outcome in console for your configuration. (Assume you are a Windows user even you are not). Organize your code. Push in the github. Paste your github link below.*/

package hw5Q2Constructo;

public class Computer {

	public String Brand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;

	public Computer() { // Declare default constructor
		System.out.println("This outcome is from default constructor");
	}

	// Parmeterized constructor
	public Computer(String Brand, String Model, String OperatingSystem, int price, boolean madeInUSA, char grade) { 
			this.Brand = Brand;
			this.Model = Model;
			this.OperatingSystem = OperatingSystem;
			this.price = price;
			this.madeInUSA = madeInUSA;
			this.grade = grade;
			
			System.out.println("This outcome is from parmeterized constructor"+"\n My Brand:" + Brand + "\nMy Model:" + Model + "");
			
			
			
			
			
			
		}
}
