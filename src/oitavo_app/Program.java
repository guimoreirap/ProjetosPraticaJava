package oitavo_app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> lista = new ArrayList<>();
		int employeesQuantity;
		
		System.out.print("Enter the number of employees: ");
		employeesQuantity = sc.nextInt();
		
		
		for (int i = 0; i  < employeesQuantity; i++) {
			String name = "";
			Integer hours = 0;
			Double valuePerHour = 0.0;
			String outsourced;
			Double additionalCharge = 0.0;
			
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.println("Outsourced (y/n)?");
			outsourced = sc.next();
			
			System.out.println("Name:");
			name = sc.next();
			
			System.out.println("Hours:");
			hours = sc.nextInt();
			
			System.out.println("Value per hour:");
			valuePerHour = sc.nextDouble();
			
			if(outsourced.equalsIgnoreCase("y")) {
				System.out.println("Additional charge:");
				additionalCharge = sc.nextDouble();
				
				lista.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				lista.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		sc.close();
		
		System.out.println("PAYMENTS: ");
		for (Employee employee : lista) {
			System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
		}
	}

}
