package com.Xworkz.Hospital;

public class Vaccum {
	static boolean isOn;
	int batteryLevel;

	static void methodStatic()
	{
		isOn=false;
	}
	Vaccum(int  batteryLevel)
	{
		this.batteryLevel=batteryLevel;
		
	}
	void display() {
	        System.out.println("Static Variable: " + isOn);
	        System.out.println("Instance Variable: " + batteryLevel);
	}
}


