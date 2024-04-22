package com.alissonfgc.model;

public class BusinessAccountEntitie extends AccountEntitie{
	private Double loanLimit;

	public BusinessAccountEntitie(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public void loanLimit(Double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
}
