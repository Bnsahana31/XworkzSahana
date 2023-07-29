package com.xworkz.inheritance.app;

public class Concrete extends BuildingMaterial {
	String grade;

	public Concrete(String name, String grade) {
		super(name);
		this.grade = grade;
	}

	public void displayConcreteInfo() {
	
		System.out.println("Concrete Grade: " + grade);
	}
}
