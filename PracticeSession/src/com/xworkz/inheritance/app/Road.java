package com.xworkz.inheritance.app;

public class Road {

	private String name;

	public Road(String name) {
		this.name = name;
	}

	public void displayRoadInfo() {
		System.out.println("Road Name: " + name);
	}
}
