package com.Xworkz.Hospital;

public class MotherBoard {
	static  String manufacturer;
     String model;

	static void methodStatic()
	{
		manufacturer="XYZ Company";
	}
	MotherBoard(String model)
	{
		this.model=model;
		
	}
	void display() {
	        System.out.println("Static Variable: " + manufacturer);
	        System.out.println("Instance Variable: " + model);
	}

}
