package com.xworkz.items;

public class DryFruit {
	private String name;
	private int weightGrams;
	private double price;
	private String origin;

	public DryFruit(String name, int weightGrams, double price, String origin) {
		super();
		this.name = name;
		this.weightGrams = weightGrams;
		this.price = price;
		this.origin = origin;
	}

	@Override
	public String toString() {

		return "name :" + this.name + "\n" + "weightGrams :" + this.weightGrams + "\n " + "price :" + this.price + "\n"
				+ "origin :" + this.origin;
	}

	public String getName() {
		return name;
	}

	public int getWeightGrams() {
		return weightGrams;
	}

	public double getPrice() {
		return price;
	}

	public String getOrigin() {
		return origin;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeightGrams(int weightGrams) {
		this.weightGrams = weightGrams;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("checking object -not null");

			if (obj instanceof DryFruit) {
				System.out.println("matched ");

				DryFruit casted = (DryFruit) obj;
				if (this.name == casted.name && this.weightGrams == casted.weightGrams && this.price == casted.price
						&& this.origin == casted.origin) {
					System.out.println("Both objects are matched");
					return true;
				} else {
					System.err.println("Both objects are not same");
				}
			} else {

				System.err.println(" mis-matched");
			}
		} else {

			System.err.println("Object is null ");
		}
		return false;
	}

}
