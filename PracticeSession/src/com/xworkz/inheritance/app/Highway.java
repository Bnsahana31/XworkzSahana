package com.xworkz.inheritance.app;

public class Highway extends Road implements RoadType, RoadCondition {
	public Highway(String name) {
		super(name);
	}

	public void displayRoadType() {
		System.out.println("Road Type: Highway");
	}

	public void displayRoadCondition() {
		System.out.println("Road Condition: Good");
	}
}