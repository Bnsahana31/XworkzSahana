package com.Xworkz.Hospital;

public class Rope {
	static String material;
     int length;

	static void methodStatic()
	{
		material="Nylon";
	}
	Rope ( int length)
	{
		this.length=length;
		
	}
	void display() {
	        System.out.println("Static Variable: " + material);
	        System.out.println("Instance Variable: " + length);
	}

}
