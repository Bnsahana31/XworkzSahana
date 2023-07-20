package com.xwork.Super_time;

public class BoilerChicken extends Chicken {
	boolean alive;
	double weight;
	
	public BoilerChicken(int price, String location, boolean alive, double weight) {
		super(price, location);
		this.alive = alive;
		this.weight = weight;
	}
	
	
   void printInfo() {
		super.printInfo();
		System.out.println("It is alive" + alive);
		System.out.println("the weightof chicken is "+ weight);
		
	}


}
