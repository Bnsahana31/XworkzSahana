package com.xworkz.casting.app;

public class ChampaKaly extends Sweet {
	private String name;
	private int quantity;

	public ChampaKaly(String name, int quantity, String color, double price, double weight) {
		super(color, price, weight);
		this.name = name;
		this.quantity = quantity;
	}

	public void displayInfo() {

		System.out.println("Name of the Sweet : " + name);
		System.out.println("quantity : " + quantity);
		displayInfoSweet();

	}

}
