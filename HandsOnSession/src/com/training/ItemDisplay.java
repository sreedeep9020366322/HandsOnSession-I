package com.training;

public class ItemDisplay {

	public void getDetails(Item[] itemArray,long serialNumber,int quantity, int days){
		
		boolean flag = true;
		
		for(Item item: itemArray){
			
			if(item.serialNumber == serialNumber){
				item.getDetails();
				System.out.println("Total rent: " + (item.calculateRent(quantity) * days) );
				flag = false;
			}
		}
		
		if (flag == true)
			System.out.println("Item with the entered serial number not exists.");
	}
	
	public void printItems(Item[] itemArray){
		
		for(Item item: itemArray){
			item.getDetails();
		}
	}
}
