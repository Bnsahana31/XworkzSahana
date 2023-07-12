package com.Xworkz.Hospital;

public class Robot {
	static  String manufacturer;
     int batteryLevel;

	static void methodStatic()
	{
		manufacturer="XYZ Robotics";
	}
	Robot(int batteryLevel)
	{
		this.batteryLevel=batteryLevel;
		
	}
	void display() {
	        System.out.println("Static Variable: " + manufacturer);
	        System.out.println("Instance Variable: " + batteryLevel);
	}

}
