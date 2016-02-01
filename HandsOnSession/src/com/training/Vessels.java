package com.training;

public class Vessels extends Item {

	public Vessels(long serialNumber,String type,String vesselCompany, double rentRate) {
		super(serialNumber,type,vesselCompany,rentRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("=====================");
		System.out.println(" Serial Number = " + serialNumber + "\n Type : " + itemType + "\n Company: " + company + "\n RentRate: " + rentRate );
		System.out.println("=====================");
	}

	@Override
	public long calculateRent(int quantity) {
		// TODO Auto-generated method stub
		return (long) (quantity * rentRate);
	}
	

}
