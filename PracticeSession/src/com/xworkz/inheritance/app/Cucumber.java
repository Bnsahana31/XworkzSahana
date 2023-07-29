package com.xworkz.inheritance.app;

public class Cucumber extends Vegetable {
	boolean isOrganic;

	public Cucumber(String name, String color, boolean isOrganic) {
		super(name, color);
		this.isOrganic = isOrganic;
	}

	public void displayCucumberInfo() {
		System.out.println("Cucumber Information:");
		displayVegetableInfo();
		System.out.println("Is Organic: " + isOrganic);
	}

}
