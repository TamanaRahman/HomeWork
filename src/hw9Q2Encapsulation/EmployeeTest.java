package hw9Q2Encapsulation;

public class EmployeeTest {

		public static void main(String[] args) {
			Employee employee = new Employee();
			employee.setName("Tamanna");
			employee.setAge(24);
			employee.setSex('F');
			employee.setUsCitizen(true);
			System.out.println("Name: " + employee.getName() + "\nAge: " + employee.getAge() + 
			"\nSex: "+ employee.getSex() + " \nUsCitizen: " + employee.isUsCitizen());
		}
	}