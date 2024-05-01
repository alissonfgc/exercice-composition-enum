package entities;

public class FisicalPerson extends Taxpayer{
	
	private double healthcareExpenses;

	public FisicalPerson() {
		super();
	}

	public FisicalPerson(String name, double annualIncome, double healthcareExpenses) {
		super(name, annualIncome);
		this.healthcareExpenses = healthcareExpenses;
	}
	
	public double getHealthcareExpenses() {
		return healthcareExpenses;
	}

	public void setHealthcareExpenses(double healthcareExpenses) {
		this.healthcareExpenses = healthcareExpenses;
	}
	
	@Override
	public String toString() {
		return getName() + ": $ " + String.format("%.2f", calculateTax());
	}

	@Override
	public double calculateTax() {
		double baseTax = 0.0;
		if (getAnnualIncome() < 20000.00) {
			baseTax = getAnnualIncome() * (15.0 / 100.0);
		} else {
			baseTax = getAnnualIncome() * (25.0 / 100.0);
		}
		
		if (getHealthcareExpenses() != 0.0) {
			double taxWithDiscounts = 0.0;			
			taxWithDiscounts = baseTax - (getHealthcareExpenses() * (50.0 / 100.0));
			Taxpayer.addToTotalTaxes(taxWithDiscounts);
			return taxWithDiscounts;
		} else {
			Taxpayer.addToTotalTaxes(baseTax);
			return baseTax;
		}

	}
	
}
