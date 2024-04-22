package com.alissonfgc.entities;

import java.util.ArrayList;
import java.util.List;

import com.alissonfgc.entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//associations
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public Double income(int year, int month){
		Double sum = baseSalary;
		//LocalDate d = LocalDate.of(year, month, 1);
		for (HourContract c : contracts) {
			int lc_year = c.getDate().getYear();
			int lc_month = c.getDate().getMonthValue();								
			
			//int c_month = 1 + cal.get(Calendar.MONTH);
			
			if ((year == lc_year) && (month == lc_month)) {
				sum += c.totalValue();
			}
		}
		return sum;
	}

}
