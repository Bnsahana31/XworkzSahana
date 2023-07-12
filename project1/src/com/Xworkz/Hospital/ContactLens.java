package com.Xworkz.Hospital;

public class ContactLens {
	static String  brand;
	String  color;

	static void methodStatic()
	{
		brand="Acuvue";
	}
	ContactLens(String  color)
	{
		this.color=color;
		
	}
	void display() {
	        System.out.println("Static Variable: " + brand);
	        System.out.println("Instance Variable: " + color);
	}

}
