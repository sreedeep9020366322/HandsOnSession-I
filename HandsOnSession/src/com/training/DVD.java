package com.training;

public class DVD extends Media {
	
	private double runningTime;

	public DVD(String title, String subject, double rating, long lendingLength) {
		super(title, subject, rating, lendingLength);
		// TODO Auto-generated constructor stub
	}

	public double getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(double runningTime) {
		this.runningTime = runningTime;
	}
	
	public void show(){
		super.show();
		System.out.println("\nRunning Time: " + runningTime);
	}
	

}
