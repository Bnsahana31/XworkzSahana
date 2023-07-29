package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.app.Cucumber;

public class SinglelInheritance {
	public static void main(String[] args) {
		System.out.println("Running in main");
		Cucumber cucumber = new Cucumber(" Cucumber", "Green", true);
		cucumber.displayCucumberInfo();
	}

}
