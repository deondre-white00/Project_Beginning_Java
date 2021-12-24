package program3;

public class EmployeeTest {
	

	public static void main(String[] args) {	
		
		double yearly_salary;
		double raise;
		double new_salary;
		
		Employee employ1 = new Employee("John","Doe", 2875.00);
		Employee employ2 = new Employee("Jane", "Doe", 3150.75);
		
		System.out.printf("First Name: %s%nLast Name: %s%nMonthly Salary $%.2f%n", employ1.getFirst(), employ1.getLast(), employ1.getMonth());
		yearly_salary = employ1.getMonth() * 12;
		raise = yearly_salary * 15/100;
		new_salary = yearly_salary + raise;
		System.out.printf("Yearly salary: $%.2f%n", yearly_salary);
		System.out.printf("Raise total: $%.2f%n", raise);
		System.out.printf("New salary: $%.2f%n%n", new_salary);
		
		System.out.printf("First Name: %s%nLast Name: %s%nMonthly Salary $%.2f%n", employ2.getFirst(), employ2.getLast(), employ2.getMonth());
		yearly_salary = employ2.getMonth() * 12;
		raise = yearly_salary * 15/100;
		new_salary = yearly_salary + raise;
		System.out.printf("Yearly salary: $%.2f%n", yearly_salary);
		System.out.printf("Raise total: $%.2f%n", raise);
		System.out.printf("New salary: $%.2f%n%n", new_salary);
		

	}

}
