package com.xworkz.items;

public class Vechicle {
	private String make;
	private String model;
	private int year;
	private String color;
	private int mileage;

	public Vechicle(String make, String model, int year, String color, int mileage) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "make :" + this.make + "\n" + "model :" + this.model + "\n" + "year :" + this.year + "\n" + "color :"
				+ this.color + "\n" + "mileage :" + this.mileage;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("checking object -not null");

			if (obj instanceof Vechicle) {
				System.out.println("matched ");

				Vechicle casted = (Vechicle) obj;
				if (this.make == casted.make && this.model == casted.model && this.year == casted.year
						&& this.color == casted.color && this.mileage == casted.mileage) {
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
