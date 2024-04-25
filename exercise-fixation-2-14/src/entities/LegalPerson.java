package entities;

public class LegalPerson extends Taxpayer{
	
	private int numberOfEmployees;

	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, double annualIncome, int numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double calculateTax() {
		double baseTax = 0.0;
		
		if (getNumberOfEmployees() <= 10) {
			baseTax = getAnnualIncome() * (16.0 / 100.0);
		} else {
			baseTax = getAnnualIncome() * (14.0 / 100.0);
		}
		
		Taxpayer.addToTotalTaxes(baseTax);
		return baseTax;
	}

}
