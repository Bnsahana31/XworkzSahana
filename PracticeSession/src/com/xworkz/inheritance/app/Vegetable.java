package com.xworkz.inheritance.app;

public class Vegetable {
	String name;
	String color;

	public Vegetable(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void displayVegetableInfo() {
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
	}
}
