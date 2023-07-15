package com.xworkz.assosiation;

public class Ipl {
	String name;
	int year=2023;
	int noOfTeams;
	String location;
	
	Rcb rcb=new Rcb("Royal Challengers Bangalore",18);
	Ipl(int noOfTeams,String location)
	{
		this.noOfTeams=noOfTeams;
		this.location=location;
	}
	void setName(String name)
    {
    	this.name=name;
	}
	void display()
	{
		System.out.println("name :" + name);
		System.out.println("year :"+ year);
		System.out.println("No Of teams :"+ noOfTeams);
		System.out.println("location :"+ location);
		this.rcb.printInfo();
	}

}
