package com.xworkz.assosiation;

public class Owner {
	String ownerName;
	long pNumber=9987674535L;
	String ownerLocation;
	
	Owner(String ownerName,String ownerLocation)
	{
		this.ownerName=ownerName;
		this.ownerLocation=ownerLocation;
		
	}
	void printInfo()
	{
		System.out.println("ownerName : "+ ownerName);
		System.out.println("pNumber : +"+ pNumber);
		System.out.println("ownerLocation :"+ownerLocation);
	}
	

}
