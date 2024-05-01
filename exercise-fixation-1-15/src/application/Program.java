package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalace = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, initialBalace, withdrawLimit);
			
			System.out.println();
			
			System.out.print("Enter amount for withdraw: ");
			acc.whitdraw(sc.nextDouble());
			
			System.out.println("New balance: " + acc.getBalance());
			
		} catch (DomainException e) {
			System.out.println("Error: " + e.getMessage());
		}
					
		sc.close();

	}

}
