package com.xworkz.isa;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Runnig in main ");
		
		Home home1 = new Home("ABC Tower","23 Main Street",500,600,"Cityville",3,2000,"john Doe" );
		home1.printInfo();
		System.out.println("--------------------------------------------");

		Home home2 = new Home("DEF tower","13 Main Street",800,400,"BTM",4,3000,"Raj");
		home2.printInfo();
	}
}
