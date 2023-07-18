package com.xworkz.isa;

public class Home extends Building {
	String homeAddress;
	int numberOfRooms;
	double homeArea;
	String homeOwner; 
	
	Home(String name,String address,int height,int capacity,String homeAddress,
			int numberOfRooms,double homeArea,String homeOwner)
	{
		super(name,address,height,capacity);
		this.homeAddress=homeAddress;
		this.numberOfRooms=numberOfRooms;
		this.homeArea=homeArea;
		this.homeOwner=homeOwner;
		System.out.println("invoking arg const Home ");
	}
	void printInfo()
	{
		System.out.println(name);
		System.out.println(address);
		System.out.println(height);
		System.out.println(capacity);
		System.out.println(homeAddress);
		System.out.println(numberOfRooms);
		System.out.println(homeArea);
		System.out.println(homeOwner);
	}
	
}
