package com.xworkz.overloading;

public class PaniPuri {
	private int puris;
	private double price;
	private String fillings;

	public PaniPuri(int puris, double price) {
		this.puris = puris;
		this.price = price;
	}

	public PaniPuri(int puris, double price, String fillings) {
		this.puris = puris;
		this.price = price;
		this.fillings = fillings;

	}

	void display() {
		System.out.println("Number of puris :" + puris);
		System.out.println("Price :" + price);
		System.out.println("Filling items :" + fillings);
	}

	public static void main(String[] args) {
		System.out.println("Running in main method PaniPuri");
		PaniPuri paniPuri1 = new PaniPuri(12, 30);
		PaniPuri paniPuri2 = new PaniPuri(12, 30, "Potato, Chickpeas, Tamarind Chutney, Spicy Water");

		paniPuri1.display();
		System.out.println("*******************");
		paniPuri2.display();

	}

}
