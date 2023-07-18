package com.xworkz.isa;

public class LivingThing {
	 String name;
     int age;
     String habitat;
     boolean isAlive;

    public LivingThing(String name, int age, String habitat, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
        this.isAlive = isAlive;
        System.out.println("invoking arg const in LivingThing ");
	
    }
    public static void main(String[]args) {

		System.out.println("Runnig in main ");
		
		Plant plant1 = new Plant("Rose", 2, "Garden", true, "Perennial", "Red", true, true);
		plant1.printInfo();
		System.out.println("--------------------------------------------");

		Plant plant2 = new Plant("Fern", 1, "Rainforest", true, "Fern", "Green", false, true);
		plant2.printInfo();
}

}
