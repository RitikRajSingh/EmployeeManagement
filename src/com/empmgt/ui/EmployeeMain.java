package com.empmgt.ui;
import com.empmgt.entities.*;

public class EmployeeMain {
	
	public static void main(String[] args) {
		EmployeeMain app = new EmployeeMain();
		app.run();
	}
	
	private void run() {
		Employee employees[] = new Employee[4];
		Department department1 = new Department("D1", "Development");
		Department department2 = new Department("D2", "Testing");
		Developer developer1 = new Developer(1,"Ritik", department1, "Mern");
		Developer developer2 = new Developer(2,"Aman", department1, "Java");
		Tester tester1 = new Tester(3, "Prateek", department2, "Jenkins");
		Tester tester2 = new Tester(4, "Devansh", department2, "Selenium");
		employees[0] = developer1;
		employees[1] = developer2;
		employees[2] = tester1;
		employees[3] = tester2;

		for(int i=0; i<employees.length; i++) {
			if(employees[i] instanceof Developer) {
				Developer developer = (Developer) employees[i];
				displayEmployee(developer);
			}
			else {
				Tester tester = (Tester) employees[i];
				displayEmployee(tester);
			}
		}

	}
	
	private void displayBaseEmployee(Employee employee) {
		
		System.out.println("Employee id is "+ employee.getId());
		System.out.println("Employee name is "+ employee.getName());
		Department department = employee.getDepartment();
		System.out.println("Employee department is "+ department.getDeptId());
		System.out.println("Employee department name is "+ department.getDeptName());
	}
	
	private void displayEmployee(Developer employee) {
		displayBaseEmployee(employee);
		System.out.println("Language used by developer is "+ employee.getLanguage());
	}
	
	private void displayEmployee(Tester employee) {
		displayBaseEmployee(employee);
		System.out.println("Tool used by tester is "+ employee.getTools());
	}
}
