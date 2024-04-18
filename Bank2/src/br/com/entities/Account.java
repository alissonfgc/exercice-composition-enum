package br.com.entities;

public class Account {
	private String nameHolder;
	private double balaceACC;
	private double limitACC;
	private int numberACC;
	
	//Methods getters and setters
	public String getNameHolder() {
		return nameHolder;
	}
	
	private void setNameHolder(String nameHolder) {
		this.nameHolder = nameHolder;
	}
	
	public double getBalaceACC() {
		return balaceACC;
	}
	
	private void setBalaceACC(double balaceACC) {
		this.balaceACC = balaceACC;
	}
	
	public double getLimitACC() {
		return limitACC;
	}
	
	private void setLimitACC(double limitACC) {
		this.limitACC = limitACC;
	}
	
	public int getNumberACC() {
		return numberACC;
	}
	
	private void setNumberACC(int numberACC) {
		this.numberACC = numberACC;
	}
	
	//Others methods of account
	public void createACC(String name, double limit, int number) {
		Account.this.setNameHolder(name);
		Account.this.setLimitACC(limit);
		Account.this.setNumberACC(number);
		Account.this.setBalaceACC(0.0);
	}
	
	public boolean deposit(double value) {
		if (this.getBalaceACC() >= 0.0) {
			this.setBalaceACC(value + this.getBalaceACC());
			System.out.println("Deposito efetuado com sucesso!");
			return true;
		} else {
			System.out.println("O valor deve ser maior que R$: 00,00");
			return false;
		}
	}
	
	public boolean withdraw(double value) {
		if (this.getBalaceACC() >= 0.0) {
			this.setBalaceACC(this.getBalaceACC() - value);
			System.out.println("Saque efetuado com sucesso!");
			return true;
		} else {
			System.out.println("Saldo insuficiente!");
			return false;
		}
	}
	
	public String printDataACC() {
		return "Nome: " + Account.this.getNameHolder() + "\nNúmero: " + Account.this.getNumberACC() + "\nSaldo: " + Account.this.getBalaceACC() + "\nLimite: " + Account.this.getLimitACC();
	}
	
	
}
