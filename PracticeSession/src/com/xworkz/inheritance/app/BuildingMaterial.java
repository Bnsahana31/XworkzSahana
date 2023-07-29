package com.xworkz.inheritance.app;

public class BuildingMaterial {

	String name;

	public BuildingMaterial(String name) {
		this.name = name;
	}

	public void displayBuildingMaterialInfo() {
		System.out.println("Building Material: " + name);
	}
}
