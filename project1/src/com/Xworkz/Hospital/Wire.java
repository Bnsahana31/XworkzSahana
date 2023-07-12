package com.Xworkz.Hospital;

public class Wire {
	static String material;
     int length;

	static void methodStatic()
	{
		material="Copper";
	}
	Wire(int length)
	{
		this.length=length;
		
	}
	void display() {
	        System.out.println("Static Variable: " + material);
	        System.out.println("Instance Variable: " + length);
	}

}
