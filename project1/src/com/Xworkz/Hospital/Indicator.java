package com.Xworkz.Hospital;

public class Indicator {
	static  String type;
     boolean isActive;


	static void methodStatic()
	{
		type="LED";
	}
	Indicator(boolean isActive)
	{
		this.isActive=isActive;
		
	}
	void display() {
	        System.out.println("Static Variable: " + type);
	        System.out.println("Instance Variable: " + isActive);
	}

}
