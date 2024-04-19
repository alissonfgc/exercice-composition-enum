package br.com.bmi.controller;

import br.com.bmi.entities.Person;

//- O usuário deverá ter a opção de calcular o IMC quantas vezes desejar, 
//e deverá ter a opção de Fechar o programa.

public class PersonController {

	public String init(String name, Double weight, Double height) {
		Person usr = new Person(name, weight, height);
		return usr.calculateBMI();

	}

}
