package com.xworkz.isa;

public class Building {
	String name;
	String address;
	int height;  
	int capacity;
	
	Building(String name,String address,int height,int capacity)
	{
		this.name=name;
		this.address=address;
		this.height=height;
		this.capacity=capacity;
		System.out.println("invoking arg const in building ");
	}

}
