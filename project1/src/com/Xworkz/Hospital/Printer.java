package com.Xworkz.Hospital;

public class Printer {
	static String manufacturer;
    int paperCapacity;
	

	static void methodStatic()
	{
		manufacturer="XYZ Printers Inc";
	}
	Printer(int  paperCapacity)
	{
		this.paperCapacity=paperCapacity;
		
	}
	void display() {
	        System.out.println("Static Variable: " + manufacturer);
	        System.out.println("Instance Variable: " + paperCapacity);
	}

}
