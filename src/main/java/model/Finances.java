package model;

public class Finances {
	private String name;
	private double income;
	private int dependents;

	//no-arg constructor
    public Finances () {
    	
    }
    
    public Finances (String nameIn, double incomeIn, int dependentsIn) {
        setName(nameIn);
        setIncome(incomeIn);
        setDependents(dependentsIn);
     }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public int getDependents() {
		return dependents;
	}

	public void setDependents(int dependents) {
		this.dependents = dependents;
	}
}
