package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private double balance;
	private double withdrawLimit;

	public Account(Integer number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		if (0 >= amount) {
			throw new DomainException("On deposit - The amount must be bigger than 0");
		}
		this.balance += amount;
	}

	public void whitdraw(double amount) {
		if (balance < amount) {
			throw new DomainException("On withdraw - Not enough balance");
		}
		if(withdrawLimit < amount) {
			throw new DomainException("On withdraw - The amount exceeds withdraw limit");
		}
		this.balance -= amount;
	}

}
