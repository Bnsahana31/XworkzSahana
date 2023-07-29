package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.app.Brick;
import com.xworkz.inheritance.app.Concrete;
import com.xworkz.inheritance.app.Iron;

public class HierarchyInheritance {

	public static void main(String[] args) {
		Brick brick = new Brick("Red Brick", "Clay");

		Concrete concrete = new Concrete("Reinforced Concrete", "M25");
		Iron iron = new Iron("Cast Iron", "HardIron");
		
		brick.displayBuildingMaterialInfo();
		brick.displayBrickInfo();
		System.out.println("**************************");
		
		concrete.displayBuildingMaterialInfo();
		concrete.displayConcreteInfo();
		System.out.println("**************************");

		
		iron.displayBuildingMaterialInfo();
		iron.displayIronInfo();
	}

}
