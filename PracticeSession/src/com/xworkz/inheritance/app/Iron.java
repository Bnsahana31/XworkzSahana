package com.xworkz.inheritance.app;

public class Iron extends BuildingMaterial {
	private String type;

	public Iron(String name, String type) {
		super(name);
		this.type = type;
	}

	public void displayIronInfo() {

		System.out.println("Iron Type: " + type);
	}
}