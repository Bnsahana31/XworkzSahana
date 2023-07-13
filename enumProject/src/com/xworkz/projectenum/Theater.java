package com.xworkz.projectenum;

public class Theater {
	String theaterName="Cineplex";
    int seatingCapacity;
    TheaterLocation location;
    boolean hasImax;
    
    Theater(int seatingCapacity)
	{
		this.seatingCapacity=seatingCapacity;
	}
	void sethasImax(boolean hasImax)
	{
		this.hasImax=hasImax;
	}
	void display()
	{
		System.out.println("Theater name :" + theaterName);
		System.out.println("Capacity os seat :" + seatingCapacity);
		System.out.println("Location of the theater :" + location);
		System.out.println("has IMAX : " + hasImax);
	}
}
