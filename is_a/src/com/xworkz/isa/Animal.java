package com.xworkz.isa;

public class Animal {
	String species;
     int age;
     String sound;
	
	public Animal(String species,int age,String sound) {
		
		this.species=species;
		this.age=age;
		this.sound=sound;
		
		System.out.println("invoking arg const in Animal ");
	}
	public static void main(String[]args) {

			System.out.println("Runnig in main ");
			
			Monkey monkey1 = new Monkey("Capuchin Monkey", 5, "Ooh ooh aah aah!", "Charlie", "bananas", "tropical rainforests");
			monkey1.printInfo();
			System.out.println("--------------------------------------------");

			Monkey monkey2 = new Monkey("Monkey",3,"Ooh ooh aah aah!","Charlie","apple","forest");
			monkey2.printInfo();
	}
}


