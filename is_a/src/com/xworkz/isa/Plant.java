package com.xworkz.isa;

public class Plant extends LivingThing {
	 String type;
     String color;
     boolean hasFlowers;
     boolean requiresSunlight;

    public Plant(String name, int age, String habitat, boolean isAlive, String type, String color, boolean hasFlowers, boolean requiresSunlight) {
        super(name, age, habitat, isAlive);
        this.type = type;
        this.color = color;
        this.hasFlowers = hasFlowers;
        this.requiresSunlight = requiresSunlight;
        System.out.println("invoking arg const Plant ");
    }
    void printInfo()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(habitat);
		System.out.println(isAlive);
		System.out.println(type);
		System.out.println(color);
		System.out.println(hasFlowers);
		System.out.println(requiresSunlight);
	}
		
    

}
