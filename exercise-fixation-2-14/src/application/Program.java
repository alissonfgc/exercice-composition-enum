package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.FisicalPerson;
import entities.LegalPerson;
import entities.Taxpayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Taxpayer> taxpayers = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int qntTP = sc.nextInt();
		int i;

		for (i = 1; i <= qntTP; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			String TypeOfTaxPayer = sc.next();
			System.out.print("Name: ");
			String nameOfTaxPayer = sc.next();
			System.out.print("Anual Income: ");
			double anualIncomeOfTaxPayer = sc.nextDouble();
			if (TypeOfTaxPayer.equals("i")) {
				System.out.print("health expenditures: ");
				double healthcareExpensesOfTaxPayer = sc.nextDouble();
				taxpayers.add(new FisicalPerson(nameOfTaxPayer, anualIncomeOfTaxPayer, healthcareExpensesOfTaxPayer));

			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployeesOfTaxPayer = sc.nextInt();
				taxpayers.add(new LegalPerson(nameOfTaxPayer, anualIncomeOfTaxPayer, numberOfEmployeesOfTaxPayer));

			}

		}
		
		sc.close();

		System.out.println("TAXES PAID");
		
		for(Taxpayer taxPayer : taxpayers) {
			System.out.println(taxPayer.toString());
		}

		System.out.println("TOTAL TAXES: $ " + Taxpayer.getTotalTaxes());

	}

}
