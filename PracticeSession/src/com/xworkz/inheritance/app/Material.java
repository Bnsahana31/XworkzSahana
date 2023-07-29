package com.xworkz.inheritance.app;

public class Material {

	String name;

	public Material(String name) {
		this.name = name;
	}

	public void displayMaterialInfo() {
		System.out.println("Material: " + name);
	}
}
