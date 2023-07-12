package com.Xworkz.Hospital;

public class Coastal {
	static String country;
	int distance;

	static void methodStatic()
	{
		country="USA";
	}
	Coastal(int  distance)
	{
		this.distance=distance;
		
	}
	void display() {
	        System.out.println("Static Variable: " + country);
	        System.out.println("Instance Variable: " + distance);
	}

}
