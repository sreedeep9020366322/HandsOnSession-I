package com.training;

public class TaxWhiz {
	
	private double currTaxRate;

	public TaxWhiz() {
		super();
	}

	public TaxWhiz(double currTaxRate) {
		super();
		this.currTaxRate = currTaxRate;
	}
	
	public double calcTax(double purchase){
		
		return (purchase * currTaxRate);
	}

}
