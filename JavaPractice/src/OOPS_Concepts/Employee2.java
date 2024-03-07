package OOPS_Concepts;

public class Employee2 {

	public static void main(String[] args) {

		Employee1 e1 = new Employee1("Bhargav", 238, "Manager", 80000);
		Employee1 e2 = new Employee1("Sruthi", 205, "Senior Engineer", 64000);
		System.out.println("Employee Salary before Hike\n");

		e1.EmployeeInfo();
		e2.EmployeeInfo();
		
		System.out.println("\nEmployee Salary after Hike\n");
		e1.Salary_Hike(7);
		e1.EmployeeInfo();
		
		e2.Salary_Hike(6.4);
		e2.EmployeeInfo();
	}
}
