package com.Xworkz.Hospital;

public class Cylinder {
	static String name;
	int price;

	static void methodStatic()
	{
		name="LPG";
	}
	Cylinder(int price)
	{
		this.price=price;
	}
	void display() {
	        System.out.println("Static Variable: " + name);
	        System.out.println("Instance Variable: " + price);
	    }


}


