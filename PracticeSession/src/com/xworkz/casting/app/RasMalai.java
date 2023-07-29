package com.xworkz.casting.app;

public class RasMalai extends Sweet {
	private int numberOfPieces;
	private String flavor;

	public RasMalai(String color, double price, double weight, int numberOfPieces, String flavor) {
		super(color, price, weight);
		this.numberOfPieces = numberOfPieces;
		this.flavor = flavor;
	}

	public void displayInfo() {
		System.out.println("Number of Pieces : " + numberOfPieces);
		System.out.println("Flavor : " + flavor);
		displayInfoSweet();

	}

}
