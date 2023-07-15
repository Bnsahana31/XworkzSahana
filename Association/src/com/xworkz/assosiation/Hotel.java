package com.xworkz.assosiation;

public class Hotel {
	String hotelName;
	String location;
	int noOfFloors=3;
	String type;
	
	Owner owner=new Owner("Raj","BTM");
	
	Hotel(String hotelName,String location)
	{
		this.hotelName=hotelName;
		this.location=location;
	}
	void setType(String type)
	{
		this.type=type;
	}
	void displayInfo()
	{
		System.out.println("hotelName : "+ hotelName);
		System.out.println("location : "+location);
		System.out.println("noOfFloors :"+ noOfFloors);
		System.out.println("type : "+type);
		this.owner.printInfo();
	}
	

}
