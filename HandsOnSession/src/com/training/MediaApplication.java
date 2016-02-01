package com.training;

import java.util.Scanner;

public class MediaApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Media media1 = new Books("Life is What You Make It", " Novel", 7.3, 2);
		Media media2 = new Periodicals("Magazine 1", " History ", 6.3, 4);
		Media media3 = new DVD("ABC", "Thriller", 8.2, 3);
		Media media4 = new Books("Second book", " Novel ", 7.3, 4);
		
		
		Media[] mediaArray = new Media[4];
		mediaArray[0] = media1;
		mediaArray[1] = media2;
		mediaArray[2] = media3;
	    mediaArray[3] = media4;
	    
		Scanner sc = new Scanner(System.in);
		int key;
		DisplayClass displayClass = new DisplayClass();
		
		//For printing all objects inside the array
		displayClass.show(mediaArray);
		
		while(true){
			
			System.out.println("Enter: \n 1 for Books \n 2 for Periodicals \n 3 for DVD \n 4 for Exit");
			key = sc.nextInt();
			
			switch(key){
			
			case 1:
				displayClass.showUserChoice(mediaArray, Books.class);
				break;
			case 2:
				displayClass.showUserChoice(mediaArray, Periodicals.class);
				break;
			case 3:
				displayClass.showUserChoice(mediaArray, DVD.class);
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid option.");
			}
		}
		
	}
	
}
