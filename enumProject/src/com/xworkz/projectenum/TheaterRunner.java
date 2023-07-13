package com.xworkz.projectenum;

public class TheaterRunner {

	public static void main(String[] args) {
		
		System.out.println("running main ");
		
		Theater ref=new Theater(200);
		ref.sethasImax(true);
		ref.location=TheaterLocation.CityCenter;
		ref.display();
		Theater ref1=new Theater(150);
		ref1.sethasImax(false);
		ref1.location=TheaterLocation.Downtown;
		ref1.display();

	}

}
