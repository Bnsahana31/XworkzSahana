package com.Xworkz.Hospital;

public class SimCard {
	static String provider;
	String phoneNumber;

	static void methodStatic()
	{
		provider="ABC Telecom";
	}
	SimCard(String  phoneNumber)
	{
		this.phoneNumber=phoneNumber;
		
	}
	void display() {
	        System.out.println("Static Variable: " + provider);
	        System.out.println("Instance Variable: " + phoneNumber);
	}

}
