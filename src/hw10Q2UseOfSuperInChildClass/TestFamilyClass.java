package hw10Q2UseOfSuperInChildClass;

public class TestFamilyClass {
	public static void main(String[] args) {
		
		System.out.println("default Constructor initialized from Father class\n");
		Father father = new Father();
		
		System.out.println("parameterized constructor initialized from Father class\n");
		Father fatherInfo = new Father("Abdul",80,'M',true);
		
		System.out.println("void type method initialized from Father class\n");
		father.father();
		
		System.out.println("parameterized type method initialized from Father class\n");
		father.fatherInfo("Abdul",80,'M',true);
		
		System.out.println("default Constructor initialized from Daughter class\n");
		Daughter daughter = new Daughter();
		
		System.out.println("parameterized constructor initialized from Daughter class\n");
        Daughter daughterInfo = new Daughter("June", 24);
        
        System.out.println("void type method initialized from Daughter class\n");
		daughter.daughter();
		
		System.out.println("parameterized type method initialized from Dughter class\n");
		daughter.daughterInfo("june", 24);
		}
}