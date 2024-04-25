package com.alissonfgc.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.alissonfgc.model.entities.Employee;
import com.alissonfgc.model.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int qntEmployees = sc.nextInt();
		int i;

		List<Employee> employees = new ArrayList<>();

		for (i = 1; i <= qntEmployees; i++) {
			System.out.println("Employee #" + i + " data:");

			boolean valid = false;
			
			String out = "";
			
			while (!valid) {
				System.out.print("Outsourced (y/n)? ");
				out = sc.next();
				
				if (out.equals("n") || out.equals("y")) {
					valid = true;
				} else {
					System.out.println("Invalid Option");
				}
				
			}
			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();

			if (out.equals("y")) {
				System.out.print("Aditional charge: ");
				Double additionalCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));

			} else if (out.equals("n")) {
				employees.add(new Employee(name, hours, valuePerHour));
			}

		}

		sc.close();

		System.out.println("PAYMENTS:");

		for (Employee e : employees) {
			StringBuilder sb = new StringBuilder();
			sb.append(e.getName() + " - $ " + String.format("%.2f", e.payment()));
			System.out.println(sb.toString());
		}

	}

}
