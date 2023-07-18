package com.xworkz.isa;

public class Bangalore extends City {
	 String language;
     boolean isTechHub;
     String timezone;
     boolean isGardenCity;

    public Bangalore(String name, int population, String country, boolean isCapital, String language, boolean isTechHub, String timezone, boolean isGardenCity) {
        super(name, population, country, isCapital);
        this.language = language;
        this.isTechHub = isTechHub;
        this.timezone = timezone;
        this.isGardenCity = isGardenCity;
    
    }
	void printInfo()
	{
		System.out.println(name);
		System.out.println(population);
		System.out.println(country);
		System.out.println(isCapital);
		System.out.println(isTechHub);
		System.out.println(language);
		System.out.println(timezone);
		System.out.println(isGardenCity);
		
		
	}
}
