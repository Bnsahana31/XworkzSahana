package com.xworkz.assosiation;

public class Director {
	String name;
	int birthYear;
	String films;
	String awards;
	
	Director(String name,int birthYear,String films,String awards)
	{
		this.name=name;
		this.films=films;
		this.birthYear=birthYear;
		this.awards=awards;
	}
	void printInfo()
	{
		System.out.println("name of the director " + name);
		System.out.println("films name " + films);
		System.out.println("awards " + awards);
		System.out.println("birth year " + birthYear);
	}
	

}
