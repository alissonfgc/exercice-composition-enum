package br.com.app;

import br.com.entities.*;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		
		acc.createACC("Alisson Fernandes", 0, 12345);
		
		System.out.println(acc.printDataACC());
		
		System.out.print("Deposito: ");
		acc.deposit(sc.nextDouble());
		
		
		System.out.println(acc.printDataACC());		
		
		System.out.print("Sacar: ");
		acc.withdraw(sc.nextDouble());
		
		System.out.println(acc.printDataACC());
		
		sc.close();
	}

}
