package com.xworkz.superChaining;

public class Dosa {
	private String type;
	private double price;
	private String location;

	public Dosa(String type, double price, String location) {
		super();
		this.type = type;
		this.price = price;
		this.location = location;

	}

	protected void display() {
		System.out.println("Type of Dosa : " + type);
		System.out.println("Price of 1 Dosa :" + price);
		System.out.println("location :" + location);
	}

}
