package com.xworkz.inheritance.app;

public class Brick extends BuildingMaterial {
	String type;

	public Brick(String name, String type) {
		super(name);
		this.type = type;
	}

	public void displayBrickInfo() {
	
		System.out.println("Brick Type: " + type);
	}

}
