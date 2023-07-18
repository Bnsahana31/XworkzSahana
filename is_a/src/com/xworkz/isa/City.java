package com.xworkz.isa;

public class City {
	 String name;
     int population;
     String country;
     boolean isCapital;

    public City(String name, int population, String country, boolean isCapital) {
        this.name = name;
        this.population = population;
        this.country = country;
        this.isCapital = isCapital;
        System.out.println("invoking arg const in City ");
    }
	
	public static void main(String[]args) {

		System.out.println("Runnig in main ");
		
		Bangalore bengaluru1= new Bangalore("Bengaluru", 12442373, "India", true, "Kannada", true, "IST", true);
		bengaluru1.printInfo();
		System.out.println("--------------------------------------------");

		Bangalore bengaluru2 = new Bangalore("Bengaluru", 12442373, "India", true, "Kannada", true, "IST", true);
		bengaluru2.printInfo();
	}
}
