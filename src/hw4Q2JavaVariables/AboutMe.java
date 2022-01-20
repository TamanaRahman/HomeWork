package hw4Q2JavaVariables;

public class AboutMe {
	
	// Declaration variables
	public String name;
	public byte age;
	public short myYearlyHouseRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;

	public AboutMe() { // Declare default construction 
		
		System.out.println("This is all about me:");
	}
	
    //public static void main (String[] arg)
	
	public void aboutMe() { // Method implemented
		
		System.out.println("My Name is: " + name + "\nMy Age: " + age + "\nMy Yearly HouseRent: " + myYearlyHouseRent
				+ "\nMy Yearly Salary: " + myYearlySalary + "\nMy Bank Balance" + myBankBalance + "\nMy Height: "
				+ myHeight + "\nMy Grade: " + myGrade + "\nMy Sex: " + sex + "\nMy Citizenship Status: " + usCitizen);

	}
}


