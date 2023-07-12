package com.Xworkz.Hospital;

public class Submarine {
	static  String manufacturer;
     int maxDepth;



	static void methodStatic()
	{
		manufacturer="XYZ Company";
	}
	Submarine(int maxDepth)
	{
		this.maxDepth=maxDepth;
		
	}
	void display() {
	        System.out.println("Static Variable: " + manufacturer);
	        System.out.println("Instance Variable: " + maxDepth);
	}


}
