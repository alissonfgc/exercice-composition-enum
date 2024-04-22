package com.alissonfgc.entities;

import java.time.LocalDate;

public class HourContract {
	private LocalDate date;
	private Double valuePerHour;
	private Integer hour;

	public HourContract(LocalDate date, Double valuePerHour, int hour) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hour = hour;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public Integer getHour() {
		return hour;
	}

	public Double totalValue() {
		return hour * valuePerHour;
	}
}
