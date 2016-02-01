package com.training;

public class Books extends Media {
	
	private long isbn_Number;
	private String author;
	private double volumeNumber;
	
	public Books(String title, String subject, double rating, long lendingLength) {
		super(title, subject, rating, lendingLength);
		// TODO Auto-generated constructor stub
	}
	
	public long getIsbn_Number() {
		return isbn_Number;
	}
	public void setIsbn_Number(long isbn_Number) {
		this.isbn_Number = isbn_Number;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getVolumeNumber() {
		return volumeNumber;
	}
	public void setVolumeNumber(double volumeNumber) {
		this.volumeNumber = volumeNumber;
	}
	
	public void show(){
		
		super.show();
		System.out.println("ISBN number: " + isbn_Number + "\nAuthor: " + author + "\nvolumeNumber: " + volumeNumber);
	}
	
	
}
