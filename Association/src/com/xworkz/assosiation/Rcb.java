package com.xworkz.assosiation;

public class Rcb {
	String teamName;
	int noOfPlayers;
	String captainName="Faf du Plessis";
	
	Rcb(String teamName,int noOfPlayers)
	{
		this.teamName=teamName;
		this.noOfPlayers=noOfPlayers;
	}
	void printInfo()
	{
		System.out.println("team Name : "+teamName);
		System.out.println("No Of Players : "+noOfPlayers);
		System.out.println("captain : "+ captainName);
	}

}
