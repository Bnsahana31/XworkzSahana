package com.xworkz.casting.app;

public class Sweet {
	protected String color;
	protected double price;
	protected double weight;

	public Sweet(String color, double price, double weight) {
		super();
		this.color = color;
		this.price = price;
		this.weight = weight;
	}

	 void displayInfoSweet() {
		System.out.println("Color of the sweet :" + color);
		System.out.println("Price of the sweet :" + price);
		System.out.println("Weight of the sweet :" + weight);

	}

}
