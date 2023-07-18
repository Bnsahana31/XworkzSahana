package com.xworkz.isa;

public class Strength {
	 String type;
     int level;
     String description;
     boolean isActive;

    public Strength(String type, int level, String description, boolean isActive) {
        this.type = type;
        this.level = level;
        this.description = description;
        this.isActive = isActive;
		
		System.out.println("invoking arg const in Strength ");
	}
	public static void main(String[]args) {

			System.out.println("Runnig in main ");
			
			Money money1 = new Money("Financial", 5, "High financial status", true, "USD", 1000.50);
			money1.printInfo();
			System.out.println("--------------------------------------------");

			Money money2 = new Money("Wealth", 8, "Vast amount of riches", true, "EUR", 50000.75);
			money2.printInfo();
	}

}
