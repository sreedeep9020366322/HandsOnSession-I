package com.training;

import java.util.Scanner;

public class TaxApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double purchase;
		
		System.out.println("Enter the purchase amount. ");
		Scanner sc = new Scanner(System.in);
		purchase = sc.nextDouble();
		
		TaxWhiz taxWhiz1 = new TaxWhiz(0.020);
		
		System.out.println(" Tax for the purchase = " + taxWhiz1.calcTax(purchase));
		
		sc.close();
	}

}
