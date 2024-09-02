package interview;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import entity.Employee;
import repo.EmployeeRepo;

public class Test {
	public static void main(String[] args) {
		List<Employee> empList = EmployeeRepo.getEmployList();
		/*
		 * // Get employee with highest salary in each dept Map<String,
		 * Optional<Employee>> deptWithMaxSal =
		 * empList.stream().collect(Collectors.groupingBy(Employee::getDept,
		 * Collectors.maxBy((e1, e2) -> e1.getSalary().compareTo(e2.getSalary()))));
		 * System.out.println(deptWithMaxSal);
		 * 
		 * // Get female employee with highest salary in each dept Map
		 * deptWithMaxSalFemale = empList.stream().filter(emp ->
		 * emp.getGender().equalsIgnoreCase("Female"))
		 * .collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy((e1, e2)
		 * -> e1.getSalary().compareTo(e2.getSalary()))));
		 * System.out.println(deptWithMaxSalFemale);
		 * 
		 */
		/*
		 * Map<String, Employee> map = empList.stream().collect(Collectors.groupingBy(e
		 * -> e.getDept(), Collectors .collectingAndThen(Collectors.maxBy((e1, e2) ->
		 * e1.getSalary().compareTo(e2.getSalary())), Optional::get)));
		 * System.out.println(map);
		 */

		Map<String, Employee> emp = empList.stream().collect(Collectors.groupingBy(Employee::getDept,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));
		System.out.println(emp);
	}

}
