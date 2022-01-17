package hw3Q2JavaVariables;

public class AboutMe {
	public String name = "Tamanna Rahman";
	public byte age = 24;
	public short myYearlyHouseRent = 2400;
	public int myYearlySalary = 60000;
	public long myBankBalance = 6584748888666l; // you have to use l at the end of long type
	public float myHeight = 5.3f; // you have to use f at the end of float type
	public double myGrade = 3.7985678;
	public char sex = 'F';
	public boolean usCitizen = false;

	public static void main(String[] args) {
		
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.name);
		System.out.println(aboutMe.sex);
		System.out.println(aboutMe.myYearlySalary + aboutMe.myYearlyHouseRent);
		System.out.println(aboutMe.age + aboutMe.myHeight);
		System.out.println("My Name:" + aboutMe.name + ",My Age:" + aboutMe.age);

	}

}
