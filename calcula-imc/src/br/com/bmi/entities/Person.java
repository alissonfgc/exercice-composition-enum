package br.com.bmi.entities;

public class Person {
	private String name;
	private Double weight;
	private Double height;
	
	public Person(String name, Double weight, Double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public String calculateBMI() {
		Double bMI = this.weight/(this.height * this.height);
		return new BMIClassification(bMI).returnClassification();
		
	}
	
}
