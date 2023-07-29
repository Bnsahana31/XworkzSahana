package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.app.CityRoad;
import com.xworkz.inheritance.app.Highway;

public class HybridInheritance {
	public static void main(String[] args) {

		CityRoad cityRoad = new CityRoad("Main Street");
		Highway highway = new Highway("Expressway");

		cityRoad.displayRoadInfo();
		cityRoad.displayRoadType();

		System.out.println();

		highway.displayRoadInfo();
		highway.displayRoadType();
		highway.displayRoadCondition();
	}
}
