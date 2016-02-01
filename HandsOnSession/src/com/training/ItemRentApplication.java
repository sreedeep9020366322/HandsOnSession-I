package com.training;

import java.util.Scanner;

public class ItemRentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item item1 = new Fans(1,"Fan","Fan company",100);
		Item item2 = new Furniture(2,"Funiture", "Furniture Company", 50.4);
		Item item3 = new AirConditioner(3,"Air Conditioner", "Air Conditioner Company", 120.5);
		Item item4 = new Vessels(4,"Vessel", "vessel Company", 35.6);
		
		Item[] itemArray = new Item[4];
		itemArray[0] = item1;
		itemArray[1] = item2;
		itemArray[2] = item3;
		itemArray[3] = item4;
		
		Scanner sc = new Scanner(System.in);
		long serialNumber;
		int quantity, days;
		
		ItemDisplay itemDisplay = new ItemDisplay();
		System.out.println("---The list of items in Chennai Rentals.....");
		itemDisplay.printItems(itemArray);
		
		System.out.println("Enter the serial number to get the details of the items.");
		
		serialNumber = sc.nextLong();
		
		System.out.println("Enter the quantity");
		quantity = sc.nextInt();
		
		System.out.println("Enter number of days for rent: ");
		days = sc.nextInt();
	
		itemDisplay.getDetails(itemArray,serialNumber,quantity,days);
		
		
		
		sc.close();
	}

}
