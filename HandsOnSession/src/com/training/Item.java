package com.training;

public abstract class Item {

	protected long serialNumber;
	protected double rentRate;
	protected String company;
	protected String itemType;
	
	public Item(long serialNumber, String itemType, String fanCompany, double rentRate) {
		// TODO Auto-generated constructor stub
		this.serialNumber = serialNumber;
		this.itemType = itemType;
		this.rentRate = rentRate;
		this.company = fanCompany;
	}
	public abstract void getDetails();
	public abstract long calculateRent(int quantity);
	
	public long getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}
	public double getRentRate() {
		return rentRate;
	}
	public void setRentRate(double rentRate) {
		this.rentRate = rentRate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	
	
}
