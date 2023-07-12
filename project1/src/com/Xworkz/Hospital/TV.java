package com.Xworkz.Hospital;

public class TV {
	static  String brand;
     int screenSize;


	static void methodStatic()
	{
		brand="Samsung";
	}
	TV(int screenSize)
	{
		this.screenSize=screenSize;
		
	}
	void display() {
	        System.out.println("Static Variable: " + brand);
	        System.out.println("Instance Variable: " + screenSize);
	}

}
