package com.xworkz.inheritance.app;

public class Wood extends Material {
	String type;

	public Wood(String name, String type) {
		super(name);
		this.type = type;
	}

	public void displayWoodInfo() {
		System.out.println("Wood Type: " + type);
	}
}
