package com.xworkz.isa;

public class Monkey extends Animal {
	 String name;
	 String favoriteFood;
	 String habitat;
	
	public Monkey(String species,int age,String sound, String name,String favoriteFood,String habitat) {
		
		super(species,age,sound);
		
		this.name=name;
		this.favoriteFood=favoriteFood;
		this.habitat=habitat;
		System.out.println("invoking arg const monkey ");
	}
	void printInfo()
	{
		System.out.println(species);
		System.out.println(age);
		System.out.println(sound);
		System.out.println(name);
		System.out.println(favoriteFood);
		System.out.println(habitat);
	}
	
}
