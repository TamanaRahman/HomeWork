package hw5Q2Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;

	public Computer() {
		System.out.println("This is from default constructor of computer class");
	}

	public Computer(String Brand, String Model, String OperatingSystem, int price, boolean madeInUSA, char grade) {
		this.brand = Brand;
		this.model = Model;
		this.operatingSystem = OperatingSystem;
		this.price = price;
		this.madeInUSA = madeInUSA;
		this.grade = grade;
		System.out.println("My brand: " + brand + ", Model: " + model + ", Operating System: " + operatingSystem
				+ ", Price is: " + price + ", Grade is: " + grade + " and Made in USA? Ans: " + madeInUSA);
	}
}