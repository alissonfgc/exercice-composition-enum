package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private List<Installment> installments = new ArrayList<>();

	public Contract(Integer number, String date, Double totalValue) {
		this.number = number;
		this.date = LocalDate.parse(date, fmt);
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public void addInstallment(Installment installments) {
		this.installments.add(installments);
	}

	public List<Installment> getInstallments() {
		return installments;
	}

}
