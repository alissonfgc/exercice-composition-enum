package application;

import entities.LegalPerson;

public class Program {

	public static void main(String[] args) {
		LegalPerson tp1 = new LegalPerson("Jão", 2000000, 5);
		LegalPerson tp2 = new LegalPerson("Maria", 4000000, 5);
		
		System.out.println(tp1.calculateTax());
		System.out.println(tp2.calculateTax());
		
		System.out.println(LegalPerson.getTotalTaxes());		

	}

}
