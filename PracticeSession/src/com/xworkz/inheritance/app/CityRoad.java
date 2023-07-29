package com.xworkz.inheritance.app;

public class CityRoad extends Road implements RoadType {
	public CityRoad(String name) {
		super(name);
	}

	public void displayRoadType() {
		System.out.println("Road Type: City Road");
	}
}
