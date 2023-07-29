package com.xworkz.inheritance.app;

public class Furniture extends Wood {
	String style;

	public Furniture(String name, String type, String style) {
		super(name, type);
		this.style = style;
	}

	public void displayFurnitureInfo() {
		System.out.println("Furniture Information:");
		displayMaterialInfo();
		displayWoodInfo();
		System.out.println("Style: " + style);
	}
}
