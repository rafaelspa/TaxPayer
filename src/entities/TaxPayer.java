package entities;

public class TaxPayer {
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;
	
	public TaxPayer() {
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
		if (getSalaryIncome() / 12 < 3000.0) {
			return 0;
		} else if (getSalaryIncome() / 12 < 5000.0) {
			return getSalaryIncome() * 0.1;
		} else {
			return getSalaryIncome() * 0.2;
		}
	}
	
	public double servicesTax() {
		return getServicesIncome() * 0.15;
	}
	
	public double capitalTax() {
		return getCapitalIncome() * 0.2;
	}
	
	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	
	public double taxRebate() {
		if (grossTax() * 0.3 <= getHealthSpending() + getEducationSpending()) {
			return grossTax() * 0.3;
		} else {
			return getHealthSpending() + getEducationSpending();
		}
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}
	
	
}
