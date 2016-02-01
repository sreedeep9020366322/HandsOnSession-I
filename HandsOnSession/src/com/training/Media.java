package com.training;

public class Media {

	private String title;
	private String subject;
	private double rating;
	private long lendingLength;
	
	public Media(String title, String subject, double rating, long lendingLength) {
		super();
		this.title = title;
		this.subject = subject;
		this.rating = rating;
		this.lendingLength = lendingLength;
	}
	
	public Media() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public long getLendingLength() {
		return lendingLength;
	}
	public void setLendingLength(long lendingLength) {
		this.lendingLength = lendingLength;
	}
	
	public void show(){
		System.out.println("=====================");
		System.out.println("Title: " + title + "\nSubject: " + subject + "\nRating: " + rating + "\nLending Length: " + lendingLength);
	}
	
}
