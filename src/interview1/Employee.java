package interview1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee {
	Integer id;
	String name;
	String department;
	double salary;

	public Employee(Integer id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		int [] arr = {1, 2, 3,3,3,3,3, 4, 4, 3,2,1};
		
		Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Employee emp1 = new Employee(1, "E1", "sales", 123400);
		Employee emp2 = new Employee(2, "E2", "sales", 1234);
		Employee emp3 = new Employee(3, "E3", "research", 45000);
		Employee emp4 = new Employee(4, "E4", "research", 1234);
		Employee emp5 = new Employee(5, "E5", "hr", 60000);
		Employee emp6 = new Employee(6, "E6", "hr", 1234);
		Employee emp7 = new Employee(7, "E7", "sales", 40000);
		Employee emp8 = new Employee(8, "E8", "research", 1234);
		List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8);
		
		Map<String, Optional<Employee>>map1 = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		map.entrySet().forEach(e -> {
			System.out.println(e.getKey() + "-"+e.getValue());
		});
	}
}