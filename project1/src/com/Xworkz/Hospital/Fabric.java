package com.Xworkz.Hospital;

public class Fabric {
	static String fabricType;
	String color;

	static void methodStatic()
	{
		fabricType="Cotton";
	}
	Fabric(String color)
	{
		this.color=color;
		
	}
	void display() {
	        System.out.println("Static Variable: " + fabricType);
	        System.out.println("Instance Variable: " + color);
	    }
	}


	







