package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Id: ");
			int id = input.nextInt();
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Salary: ");
			double salary = input.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int idSalary = input.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!\r\n");
		} else {
			System.out.print("\nEnter the percentage: ");
			double percent = input.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println("\nList of Employees:");
		for (Employee x : list) {
			System.out.println(x);
		}

		input.close();
	}

}
