package model;

public class TaxReturn {
	double credits;
	double taxRate;
	
	public double calculateTaxRate(Finances finances) {
		
		double income = finances.getIncome();
		if (income < 20000) {
			taxRate = 0.10;
		}
		else if (income < 40000) {
			taxRate = 0.13;
		}
		
		else if (income < 60000) {
			taxRate = 0.19;
		}
		
		else taxRate = 0.22;
		
		return taxRate;
	}
	
	public double calculateDeductions (Finances finances) {
		int dependents = finances.getDependents();
		credits = dependents * 1500;
		return credits;
	}
	
	public double CalculateTaxReturn (Finances finances) {
		double refund;
		int dependents = finances.getDependents();
		credits = dependents * 1500;
		refund = credits * 0.5;
		return refund;
	}
}
