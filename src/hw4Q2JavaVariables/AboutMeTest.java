package hw4Q2JavaVariables;

public class AboutMeTest {
	
	public static void main(String[] args) {

		// Instantiate AboutMe class under main method

		AboutMe me = new AboutMe();

		// Initialize variables and call the method by object.

		me.name = "Tamanna";
		me.age = 24;
		me.myYearlyHouseRent = 2400;
		me.myYearlySalary = 60000;
		me.myBankBalance = 6584748888666l;
		me.myHeight = 5.3f;
		me.myGrade = 3.7985678;
		me.sex = 'F';
		me.usCitizen = true;

		me.aboutMe();
		System.out.println("____________________________________________________________");

		// another for your best friend Alex
		AboutMe Alex = new AboutMe();

		Alex.name = "Alex";
		Alex.age = 28;
		Alex.myYearlyHouseRent = 3000;
		Alex.myYearlySalary = 10000;
		Alex.myBankBalance = 478907888884489l;
		Alex.myHeight = 5.8f;
		Alex.myGrade = 4.899778;
		Alex.sex = 'M';
		Alex.usCitizen = false;

		Alex.aboutMe();
		System.out.println("____________________________________________________________");

	}

}

