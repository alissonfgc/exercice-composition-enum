package entities;

public abstract class Taxpayer {
	
	private String name;
	private double annualIncome;
	private static double totalTaxes;

	public Taxpayer() {
	}

	public Taxpayer(String name, double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	protected static void addToTotalTaxes(double value) {
		Taxpayer.totalTaxes += value;
	}

	public static double getTotalTaxes() {
		return totalTaxes;
	}

	public abstract double calculateTax();

}
