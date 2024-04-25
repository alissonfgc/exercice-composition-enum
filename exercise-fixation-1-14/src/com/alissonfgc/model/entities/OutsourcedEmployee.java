package com.alissonfgc.model.entities;

public class OutsourcedEmployee extends Employee {
	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	@Override
	public final Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

}
