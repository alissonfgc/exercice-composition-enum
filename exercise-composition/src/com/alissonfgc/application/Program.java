package com.alissonfgc.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import com.alissonfgc.entities.Department;
import com.alissonfgc.entities.HourContract;
import com.alissonfgc.entities.Worker;
import com.alissonfgc.entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//Department data
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary: ");
		Double salary = sc.nextDouble();
		Worker usr = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(department));
		
		System.out.print("How many contracts to this worker? ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int i = 0;
		
		while (num > i) {
			System.out.println("Enter contract #" + i + 1 + " data:");
			System.out.print("Date (DD/MM/YYY): ");
			LocalDate dt =  LocalDate.parse(sc.nextLine(), fmt);
			System.out.print("Value per hour: ");
			Double val = sc.nextDouble();
			System.out.print("Duration: ");
			int qnth = sc.nextInt();
			sc.nextLine();

			usr.addContract(new HourContract(dt, val, qnth));
			i++;
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		LocalDate dt2 = LocalDate.parse("01/" + sc.nextLine(), fmt);
		
		System.out.println("Name: " + usr.getName());
		System.out.println("Departament: " + usr.getDepartment());
		System.out.println("Income for " + dt2.getMonthValue() + "/" + dt2.getYear() + ": " + usr.income(dt2.getYear(), dt2.getMonthValue()));
		
		sc.close();
	}

}
