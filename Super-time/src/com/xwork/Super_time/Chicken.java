package com.xwork.Super_time;

public class Chicken {
	int price;
	String location;
	
	Chicken(int price,String location)
	{
		this.price=price;
		this.location=location;
	}
	void printInfo() {
		System.out.println("The price of the chicken " + price);
		System.out.println("the location chicken  where we get "+ location);
	}
}
