package com.jayanth.sample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private float salary;

	public Employee() {
	}

	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}


public class EmployeeDemo {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "ravi", 12000f));
		employees.add(new Employee(2, "kumar", 6000f));
		employees.add(new Employee(3, "rajesh", 42000f));
		employees.add(new Employee(4, "ram", 22000f));
		
//		System.out.println(employees);
		
//		employees.stream().forEach(employee -> System.out.println(employee.getName().length()));
		
//		employees.stream()
//			.filter(employee -> employee.getName().length()>4)
//			.forEach(employee -> System.out.println(employee));
		
		
		List<Integer> numbers = new ArrayList<>();
		for(int i=10;i>0;i--)
			numbers.add(i);
		
		List<Integer> sortedList = numbers.stream()	
				.sorted()
				.collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Integer> reversedList = sortedList.stream()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
		System.out.println(reversedList);
		
		List<Employee> sortedEmployees = employees.stream()
		.sorted(Comparator.comparing(Employee::getName))
		.collect(Collectors.toList());
		System.out.println(sortedEmployees);
		
		List<Employee> revSortedEmployees = employees.stream()
		.sorted(Comparator.comparing(Employee::getName).reversed())
		.collect(Collectors.toList());
		System.out.println(sortedEmployees);
		

	}

}

}
