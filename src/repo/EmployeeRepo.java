package repo;

import java.util.ArrayList;
import java.util.List;

import entity.Employee;

public class EmployeeRepo {
	
	private static List<Employee> empList = new ArrayList<>();
	
	static {
		//HR
		//male
		empList.add(new Employee(1, "Anil", "Male", "HR", 51000d));
		empList.add(new Employee(2, "Praveen", "Male", "HR", 47000d));
		//female
		empList.add(new Employee(3, "Priya", "Female", "HR", 48000d));
		empList.add(new Employee(4, "Pallavi", "Female", "HR", 45000d));
		
		//FIN
		//male
		empList.add(new Employee(5, "Sameer", "Male", "FIN", 76000d));
		empList.add(new Employee(6, "Sunil", "Male", "FIN", 68000d));
		//female
		empList.add(new Employee(7, "Sruti", "Female", "FIN", 75000d));
		empList.add(new Employee(8, "Sunil", "Female", "FIN", 72000d));
		
	}

	public static List<Employee> getEmployList() {
		return empList;
	}

}
